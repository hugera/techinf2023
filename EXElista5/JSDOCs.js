/**
 * "Função responsável pelo tratamento das quebras de linhas".
 * 
 * @param {string} texto - Texto sem o tratamento dos dados.                                             
 * @returns - Retorna o texto com as quebras de linhas.
 */


function  csvToLines (texto){
    return texto.split("\n")
}

/**
 * "Função Responsável por fazer a comparação entre os dois Array".
 * 
 * @param {Array} str1 - Lista com a entrada dos dados.
 * @param {Arry} str2 - Lista com a saída esperada.
 * @returns - Retorna "true , false" onde "true" confirma que está correto a saída esperada.
 */

function comparar (str1 , str2){
    return JSON.stringify(str1) == JSON.stringify(str2);
}


/**
 * "Função resposável por identificar as colunas de uma linha."
 * 
 * @param {Arry} linhas - Uma lista de strings, onde cada string representa uma linha.
 * @returns - Uma lista de listas, onde cada lista interna contém as colunas de uma linha.
 */

function linesToColumns(linhas) {
    return linhas.map(linha => linha.split(';'));     // Divide cada linha nas vírgulas/";" para obter as colunas
}


/**
 * "Funçao Resposável por extrair o cabeçalho da primeira linhas".
 * 
 * @param {String} tabela - Uma lista de listas de strings
 * @returns  - Uma lista contendo apenas o cabeçalho (primeira linha).
 */

function extractHeader(tabela) {
    return tabela.length > 0 ? tabela[0] : [];
}


/**
 * "Função responsável por extrair o conteudo de uma lista"
 *
 *  @param {String} tabela - Uma lista de listas de strings, onde cada lista interna representa colunas de uma linha.
 * @returns - Uma lista de listas, contendo todas as linhas exceto o cabeçalho.
 */

function extractContent(tabela) {
    return tabela.slice(1);
}

/**
 * Função responsável por alinhar o valor com a chave.
 * 
 * @param {Array} header - Duas listas de mesmo tamanho:
                           A primeira lista representa o cabeçalho da tabela.
                           A segunda lista representa uma única linha do conteúdo da tabela.
 * @param {Array} linha -  Um objeto JSON onde as chaves são os elementos do cabeçalho e os valores são os elementos
                           correspondentes da linha do conteúdo.
 * @returns - as chaves são os elementos do cabeçalho e os valores são as colunas.
 */

    function rowToJSON(header, linha){
    const obj = {}

    for (let i = 0; i < header.length; i++){
        let key = header[i];
        let value = linha[i];

        obj[key] = value;
    }
    return obj;
}

/**
 * Função responsável por alinhar o valor com a chave.
 * 
 * @param {Array} header - Uma lista de strings representando o cabeçalho e uma lista de listas representando o conteúdo.
 * @param {Arry} content - Uma lista de objetos JSON, onde as chaves são os elementos do cabeçalho e os valores são as colunas correspondentes.
 * @returns - Uma Lista de objetos Json
 */

function columnsToJSON(header, content) {
    return content.map(linha => {
        return rowToJSON(header, linha)
    

    });
}

/**
 * "Procedimento que trasnforma um arquivo CSV em uma tabela"
 * 
 * @param {String} texto - : Uma string contendo o conteúdo de um arquivo CSV
 * @returns -  Nenhuma. A função deve imprimir no console o objeto JSON convertido a partir do CSV, utilizando console.table().
 */

function printCSV(texto) {
    
    // 1. Dividir o CSV em linhas
    const linhas = csvToLines(texto);
    
    // 2. Transformar as linhas em colunas (usando a função linesToColumns)
    const tabela = linesToColumns(linhas);
    
    // 3. Extrair o cabeçalho e o conteúdo
    const cabecalho = extractHeader(tabela);  // Primeira linha é o cabeçalho
    const conteudo = extractContent(tabela);  // Restante são os dados
    
    // 4. Converter o conteúdo para JSON (usando a função columnsToJSON)
    const jsonData =  columnsToJSON(cabecalho, conteudo);
       
    
    // 5. Imprimir o objeto JSON usando console.table
    console.table(jsonData);
}

module.exports = { csvToLines, linesToColumns, comparar, extractHeader, extractContent, rowToJSON, columnsToJSON, printCSV};
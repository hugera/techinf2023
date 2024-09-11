// 1° Função

function  csvToLines (texto){
    return texto.split("\n")
}

// Função pra Comparar

function comparar (str1 , str2){
    return JSON.stringify(str1) == JSON.stringify(str2);
}


// 2° Função

function linesToColumns(linhas) {
    return linhas.map(linha => linha.split(';'));     // Divide cada linha nas vírgulas/";" para obter as colunas
}

// 3° Função

function extractHeader(tabela) {
    return tabela.length > 0 ? tabela[0] : [];
}

// 4° Função

function extractContent(tabela) {
    return tabela.slice(1);
}

// 5° Função

function rowToJSON(header, linha){
    const obj = {}

    for (let i = 0; i < header.length; i++){
        let key = header[i];
        let value = linha[i];

        obj[key] = value;
    }
    return obj;
}

// 6° Função

function columnsToJSON(header, content) {
    return content.map(linha => {
        return rowToJSON(header, linha)
    

    });
    
    
    
        //     let json = {};
    //     for (let i = 0; i < cabecalho.length; i++) {
    //         json[cabecalho[i]] = linha[i];
    //     }
    //     return json;
    // });
}

// // Procedimento

// function printCSV(csvString) {
    
//     // 1. Dividir o CSV em linhas
//     const linhas = csvString.split('\n');
    
//     // 2. Transformar as linhas em colunas (usando a função linesToColumns)
//     const tabela = linhas.map(linha => linha.split(';'));
    
//     // 3. Extrair o cabeçalho e o conteúdo
//     const cabecalho = tabela[0];  // Primeira linha é o cabeçalho
//     const conteudo = tabela.slice(1);  // Restante são os dados
    
//     // 4. Converter o conteúdo para JSON (usando a função columnsToJSON)
//     const jsonData = conteudo.map(linha => {
//         let json = {};
//         for (let i = 0; i < cabecalho.length; i++) {
//             json[cabecalho[i]] = linha[i];
//         }
//         return json;
//     });
    
//     // 5. Imprimir o objeto JSON usando console.table
//     console.table(jsonData);
// }

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
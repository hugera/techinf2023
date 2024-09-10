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

function rowToJSON(header, content){
    const obj = {}

    for (let i = 0; i < header.length; i++){
        let key = header[i];
        let value = content[i];

        obj[key] = value;
    }
    return obj;
}

// 6° Função

function columnsToJSON(cabecalho, conteudo) {
    return conteudo.map(linha => {
        let json = {};
        for (let i = 0; i < cabecalho.length; i++) {
            json[cabecalho[i]] = linha[i];
        }
        return json;
    });
}

module.exports = { csvToLines, linesToColumns, comparar, extractHeader, extractContent, rowToJSON, columnsToJSON};
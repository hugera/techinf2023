const {  csvToLines, linesToColumns, comparar, extractHeader, extractContent, rowToJSON, columnsToJSON, printCSV } = require("./funcao")

// 1° Função 

// 1. Entrada: "nome;idade\nJoão;28\nMaria;32"
// Saída esperada: ["nome;idade", "João;28", "Maria;32"]

console.log(csvToLines("\n","nome;idade\nJoão;28\nMaria;32"));


// 2. Entrada: "produto;preço\nArroz;5.00\nFeijão;7.50"
// Saída esperada: ["produto;preço", "Arroz;5.00", "Feijão;7.50"]

console.log(csvToLines("\n","produto;preço\nArroz;5.00\nFeijão;7.50"));


//. Entrada: "Filme;Diretor;Ano;Duração;Gênero;País de Origem;Receita Bruta\nParasita;Bong Joon-ho;2019;132;Drama;Coréia do Sul;258.8M\nGreen Book;Peter Farrelly;2018;130;Drama;EUA;321.8M"

// Saída esperada: : ["Filme;Diretor;Ano;Duração;Gênero;País de Origem;Receita Bruta", "Parasita;Bong Joon-ho;2019;132;Drama;Coréia do Sul;258.8M", "Green Book;Peter Farrelly;2018;130;Drama;EUA;321.8M"]

console.log(csvToLines("\n","Filme;Diretor;Ano;Duração;Gênero;País de Origem;Receita Bruta\nParasita;Bong Joon-ho;2019;132;Drama;Coréia do Sul;258.8M\nGreen Book;Peter Farrelly;2018;130;Drama;EUA;321.8M"));

//------------------------------------------------------------------------------------------------------------------------------------------------------------------//]

// 2° Função

let texto2 =  ["nome;idade", "João;28", "Maria;32"];
let esperado2 = [["nome", "idade"], ["João", "28"], ["Maria", "32"]];
let saida2 = linesToColumns(texto2);

console.log(linesToColumns(texto2));  // console.log(comparar(esperado2,saida2)); PRA VERIFICAR TRUE OU FALSE

let texto3 = ["produto;preço", "Arroz;5.00", "Feijão;7.50"];
let esperado3 = [["produto", "preço"], ["Arroz", "5.00"], ["Feijão", "7.50"]];
let saida3 = linesToColumns(texto3);

console.log(linesToColumns(texto3));

let texto4 = ["Filme;Diretor;Ano;Duração;Gênero;País de Origem;Receita Bruta","Parasita;Bong Joon-ho;2019;132;Drama;Coréia do Sul;258.8M", "Green Book;Peter Farrelly;2018;130;Drama;EUA;321.8M"];
let esperado4 = [["Filme", "Diretor", "Ano", "Duração", "Gênero", "País de Origem", "Receita Bruta"], ["Parasita", "Bong Joon-ho", "2019", "132", "Drama", "Coréia do Sul", "258.8M"], ["Green Book", "Peter Farrelly", "2018", "130", "Drama", "EUA", "321.8M"]];
let saida4 = linesToColumns(texto4);

console.log(comparar(esperado4, saida4));

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------//
// 3° Função

let texto5 = [["nome", "idade"], ["João", "28"], ["Maria", "32"]];
let esperado5 = ["nome", "idade"];
let saida5 = extractHeader(texto5);

console.log(extractHeader(texto5));

let texto6 =  [["produto", "preço"], ["Arroz", "5.00"], ["Feijão", "7.50"]];
let esperado6 =  ["produto", "preço"];
let saida6 = extractHeader(texto6);

console.log(extractHeader(texto6));


let texto7 = [["Filme", "Diretor", "Ano", "Duração", "Gênero", "País de Origem","Receita Bruta"], ["Parasita", "Bong Joon-ho", "2019", "132", "Drama", "Coréia do  Sul", "258.8M"], ["Green Book", "Peter Farrelly", "2018", "130", "Drama", "EUA", "321.8M"]];
let esperado7 = ["Filme", "Diretor", "Ano", "Duração", "Gênero", "País de Origem", "Receita Bruta"];
let saida7 = extractHeader(texto7);

console.log(extractHeader(texto7));

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

// 4° Função

let texto8 =  [["nome", "idade"], ["João", "28"], ["Maria", "32"]];
let esperado8 =  [["João", "28"], ["Maria", "32"]];
let saida8 = extractContent(texto8);

console.log(extractContent(texto8));

let texto9 =  [["produto", "preço"], ["Arroz", "5.00"], ["Feijão", "7.50"]];
let esperado9 =   [["Arroz", "5.00"], ["Feijão", "7.50"]];
let saida9 = extractContent(texto9);

console.log(extractContent(texto9));

let texto10 =   [["Filme", "Diretor", "Ano", "Duração", "Gênero", "País de Origem", "Receita Bruta"], ["Parasita", "Bong Joon-ho", "2019", "132", "Drama", "Coréia do  Sul", "258.8M"], ["Green Book", "Peter Farrelly", "2018", "130", "Drama", "EUA",  "321.8M"]];
let esperado10 =   [["Parasita", "Bong Joon-ho", "2019", "132", "Drama", "Coréia do Sul", "258.8M"], ["Green Book", "Peter Farrelly", "2018", "130", "Drama", "EUA", "321.8M"]] ;
let saida10 = extractContent(texto10);

console.log(extractContent(texto10));

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------//

// 5° Função

let cabecalho11 = ["nome", "idade"]
let linha11 =   ["João", "28"];
let esperado11 =  { nome: "João", idade: "28" };
let saida11 = rowToJSON(cabecalho11,linha11);

console.log(rowToJSON(cabecalho11,linha11));

let cabecalho12 =  ["produto", "preço"];
let linha12 =   ["Arroz", "5.00"];
let esperado12 = { produto: "Arroz", preço: "5.00" };
let saida12 = rowToJSON(cabecalho12,linha12);

console.log(rowToJSON(cabecalho12,linha12));

let cabecalho13 =  ["Filme", "Diretor", "Ano", "Duração", "Gênero", "País de Origem", "Receita Bruta"];
let linha13 =    ["Parasita", "Bong Joon-ho", "2019", "132", "Drama", "Coréia do Sul", "258.8M"];
let esperado13 = { Filme: "Parasita", Diretor: "Bong Joon-ho", Ano: "2019", Duração: "132", Gênero: "Drama", "País de Origem": "Coréia do Sul", "Receita Bruta": "258.8M" };
let saida13 = rowToJSON(cabecalho13,linha13);

console.log(rowToJSON(cabecalho13,linha13));

//--------------------------------------------------------------------------------------------------------------------------------------------------------//

// 6° Função

let cabecalho14 =  ["nome", "idade"] ;
let linha14 =    [["João", "28"], ["Maria", "32"]];
let esperado14 =  [ { nome: "João", idade: "28" }, { nome: "Maria", idade: "32" }];
let saida14 = columnsToJSON(cabecalho14,linha14);

console.log(columnsToJSON(cabecalho14,linha14));

let cabecalho15 =  ["produto", "preço"]  ;
let linha15 =     [["Arroz", "5.00"], ["Feijão", "7.50"]];
let esperado15 =  [ { produto: "Arroz", preço: "5.00" }, { produto: "Feijão",  preço: "7.50" } ];
let saida15 = columnsToJSON(cabecalho15,linha15);

console.log(columnsToJSON(cabecalho15,linha15));

let cabecalho16 =  ["Filme", "Diretor", "Ano", "Duração", "Gênero", "País de Origem", "Receita Bruta"]  ;
let linha16 =  [["Parasita", "Bong Joon-ho", "2019", "132", "Drama", "Coréia do Sul", "258.8M"], ["Green Book", "Peter Farrelly", "2018", "130", "Drama", "EUA", "321.8M"]]  ;
let esperado16 = [ { Filme: "Parasita", Diretor: "Bong Joon-ho", Ano: "2019", Duração: "132", Gênero: "Drama", "País de Origem": "Coréia do Sul", "Receita Bruta": "258.8M" }, { Filme: "Green Book", Diretor: "Peter Farrelly", Ano:  "2018", Duração: "130", Gênero: "Drama", "País de Origem": "EUA", "Receita  Bruta": "321.8M" } ];
let saida16 = columnsToJSON(cabecalho16,linha16);

console.log(columnsToJSON(cabecalho16,linha16));

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------//

// Procedimento


let stringcsv = `Filme;Diretor;Ano;Duração;Gênero;País de Origem;Principais Atores;Receita Bruta;Pontuação no Rotten Tomatoes
Parasite;Bong Joon-ho;2020;132;Drama, Thriller;South Korea;Song Kang-ho, Lee Sun-kyun, Cho Yeo-jeong;$258.7M;0,98
Green Book;Peter Farrelly;2019;130;Biography, Comedy, Drama;USA;Viggo Mortensen, Mahershala Ali, Linda Cardellini;$321.8M;0,77
The Shape of Water;Guillermo del Toro;2018;123;Adventure, Drama, Fantasy;USA;Sally Hawkins, Octavia Spencer, Michael Shannon;$195.2M;0,92`

printCSV(stringcsv);












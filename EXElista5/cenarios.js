const { SepararString } = require("./funcao")

// 1. Entrada: "nome;idade\nJoão;28\nMaria;32"
// Saída esperada: ["nome;idade", "João;28", "Maria;32"]

console.log(SepararString("\n","nome;idade\nJoão;28\nMaria;32"));


// 2. Entrada: "produto;preço\nArroz;5.00\nFeijão;7.50"
// Saída esperada: ["produto;preço", "Arroz;5.00", "Feijão;7.50"]

console.log(SepararString("\n","produto;preço\nArroz;5.00\nFeijão;7.50"));


//. Entrada: "Filme;Diretor;Ano;Duração;Gênero;País de Origem;Receita Bruta\nParasita;Bong Joon-ho;2019;132;Drama;Coréia do Sul;258.8M\nGreen Book;Peter Farrelly;2018;130;Drama;EUA;321.8M"

// Saída esperada: : ["Filme;Diretor;Ano;Duração;Gênero;País de Origem;Receita Bruta", "Parasita;Bong Joon-ho;2019;132;Drama;Coréia do Sul;258.8M", "Green Book;Peter Farrelly;2018;130;Drama;EUA;321.8M"]

console.log(SepararString("\n","Filme;Diretor;Ano;Duração;Gênero;País de Origem;Receita Bruta\nParasita;Bong Joon-ho;2019;132;Drama;Coréia do Sul;258.8M\nGreen Book;Peter Farrelly;2018;130;Drama;EUA;321.8M"));




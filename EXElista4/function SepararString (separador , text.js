const {comparar, SepararString} = require("./Compara")

let texto1 = "O rato roeu a roupa do rei de Roma";
let esperado1 = ["O", "rato", "roeu", "a", "roupa", "do", "rei", "de", "Roma"];
let saida1 = SepararString(" ", texto1);

console.log(comparar(esperado1, saida1));

let texto2 = "JavaScript é incrível";
let esperado2 = ["JavaScript", "é", "incrível"];
let saida2 = SepararString(" ", texto2);

console.log(comparar(esperado2, saida2));

let texto3 = "João,Maria,José";
let esperado3 =  ["João", "Maria", "José"];
let saida3 = SepararString(",", texto3);

console.log(comparar(esperado3, saida3));
console.table(esperado3);

let texto4 = "fulano@gmail.com;ciclano@yahoo.com;beltrano@outlook.com";
let esperado4 = ["fulano@gmail.com", "ciclano@yahoo.com", "beltrano@outlook.com"];
let saida4= SepararString(";", texto4);

console.log(comparar(esperado4, saida4));

let texto5 = "/usr/local/bin";
let esperado5 = ["", "usr", "local", "bin"];
let saida5= SepararString("/", texto5);

console.log(comparar(esperado5, saida5));

let texto6 = "JavaScript";
let esperado6 = ["J", "a", "v", "a", "S", "c", "r", "i", "p", "t"];
let saida6= SepararString("", texto6);

console.log(comparar(esperado6, saida6));

let texto7 = "O sol está brilhando. O céu está azul. É um ótimo dia!";
let esperado7 = ["O sol está brilhando", "O céu está azul", "É um ótimo dia!"];
let saida7= SepararString(". ", texto7);

console.log(comparar(esperado7, saida7));

let texto8 ="15/08/2024";
let esperado8 = ["15", "08", "2024"];
let saida8= SepararString("/", texto8);

console.log(comparar(esperado8, saida8));

let texto9 ="14:35:20";
let esperado9 = ["14", "35", "20"];
let saida9= SepararString(":", texto9);

console.log(comparar(esperado9, saida9));

// cenário 27

let texto10 ="Primeira linha\nSegunda linha\nTerceira linha";  
let esperado10 = ["Primeira linha", "Segunda linha", "Terceira linha"];
let saida10= SepararString("\n", texto10);

console.log(comparar(esperado10, saida10));

// cenário 28

let texto11 = "Lorem ipsum dolor sit amet,\nconsectetur adipiscing elit,\nsed do eiusmod tempor incididunt ut labore.";
let esperado11 = ["Lorem ipsum dolor sit amet,", "consectetur adipiscing elit,", "sed do eiusmod tempor incididunt ut labore."];
let saida11= SepararString("\n", texto11);

console.log(comparar(esperado11, saida11));

// cenário 29

let texto12 ="Linha única sem quebras";
let esperado12 = ["Linha única sem quebras"];
let saida12= SepararString("\0", texto12);

console.log(comparar(esperado12, saida12));

// cenário 30

let texto13 =`Primeira linha de um texto.
Segunda linha usando template strings.
Terceira linha com mais detalhes.`
;
let esperado13 = ["Primeira linha de um texto.", "Segunda linha usando template strings.", "Terceira linha com mais detalhes."];
let saida13= SepararString("\n", texto13);

console.log(comparar(esperado13, saida13));

// cenário 31

let texto14 =`
Lorem ipsum dolor sit amet,
consectetur adipiscing elit.
Ut enim ad minim veniam.`
;
let esperado14 = ["", "Lorem ipsum dolor sit amet,", "consectetur adipiscing elit.", "Ut enim ad minim veniam."];
let saida14= SepararString("\n", texto14);

console.log(comparar(esperado14, saida14));

// cenário 32

let texto15 =`
Texto com linhas múltiplas e
uso de templates strings
para separação.
`
;
let esperado15 = ["", "Texto com linhas múltiplas e", "uso de templates strings",  "para separação.", ""];
let saida15= SepararString("\n", texto15);

console.log(comparar(esperado15, saida15));












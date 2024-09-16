function converterparaJson(data){
    const obj = data.json();
    return obj;
}

function imprimirTabela(json){
    console.table(json.cards, ["code", "image", "value", "suit"]);
    console.log("restam", json.remaining, "cartas")
}

fetch(`https://deckofcardsapi.com/api/deck/dpizo53h8k8o/draw/?count=3`)
.then(converterparaJson)
.then(imprimirTabela);
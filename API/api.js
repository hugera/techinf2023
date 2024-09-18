function getJsonData(respostaAPI){
    const json = respostaAPI.json();
    return json;    
}

function atualizaInfo(jsonData){
    if (!jsonData.success)
    throw new Error("Erro ao acessar os dados da API");
    
    const deck_id = jsonData.deck_id;
    const remaining = jsonData.remaining;
    
    const info1 = document.getElementById("deck_id");
    const info2 = document.getElementById("remaining");   
    
    info1.innerText = deck_id;
    info2.innerText = remaining;

    return jsonData;
} 

function Reembaralhar(){
    fetch("https://deckofcardsapi.com/api/deck/8acrl9s6p501/shuffle/?remaining=false")
    .then(getJsonData)
    .then(function(jsonData){
        console.log = (jsonData);
        if(jsonData.success){
            alert("Baralho Reembaralhado")
        }      
    
    })
}         

function puxarCartas(jsonData){
        const cards = jsonData.cards;

        for(let i=0; i<3; i++){
        const id = `carta${i+1}`;
        
        const card = document.getElementById(id);
        let img = card.querySelector('img')
        
        if(img == null){
            img = document.createElement('img');      
        }
        img.setAttribute('src', cards[i].image);
        card.append(img);

        }

     }    

function olharCartas(){

    fetch("https://deckofcardsapi.com/api/deck/8acrl9s6p501/draw/?count=3")
    .then(getJsonData)
    .then(atualizaInfo)
    .then(puxarCartas)

} 
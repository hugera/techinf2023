let deckID = "6efwkrv87lp2";

const deck = new Deck(deckID);

     
     /* Métodos Públicos */


    function Deck(deckID){
        this.deckID =deckID;
        this.listofcards = "4C,7H,AS,7D,3C,3H,3S,3D,2C,2H,2S,2D,AC,AH,AD,KC,KH,KS,KD,QC,QH,QS,QD,JC,JH,JS,JD";
        
        
    this.olharCartas = function(){
        fetch(`https://deckofcardsapi.com/api/deck/${this.deckID}/draw/?count=3`)
        .then(getJsonData)
        .then(atualizaInfo)
        .then(puxarCartas)
    }

    this.Reembaralhar = function(){
        fetch(`https://deckofcardsapi.com/api/deck/${this.deckID}/shuffle/?remaining=false`)
        .then(getJsonData)
        .then(atualizaInfo)
        .then(function(jsonData){
            console.log = (jsonData);
            if(jsonData.success){
                alert("Baralho Reembaralhado")
            }      
        
        })

    }
    this.novoDeck = function(){
        fetch(`https://deckofcardsapi.com/api/deck/new/shuffle/?cards=${this.listofcards}`)
        .then(getJsonData)
        .then(atualizaInfo)
        .then(setDeckId)

    }
    
     /* Métodos Privados */

    const setDeckId = (jsonData) => {
        this.deckID = jsonData.deck_id
        return jsonData;
    }

    const  atualizaInfo = (jsonData) =>{
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

    const getJsonData = (respostaAPI) =>{
        const json = respostaAPI.json();
        return json;    
    }

    const  puxarCartas = (jsonData) => {
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

    }





     
    



   
   
    


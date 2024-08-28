function comparar (str1 , str2){
    return JSON.stringify(str1) == JSON.stringify(str2);
}

function SepararString (separador , texto){
    return texto.split(separador)
}

module.exports = { comparar , SepararString };
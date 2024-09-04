 
        function inserirNoInicio(array, elemento) {
            array.unshift(elemento);  /* Usa o método unshift para adicionar um novo elemento no início do array*/
            return array;
        }
        console.log(inserirNoInicio([1, 2, 3, 4, 5], 6));         
        console.log(inserirNoInicio(["a", "b", "c"], "d"));       
        console.log(inserirNoInicio([10], 20));                    
   
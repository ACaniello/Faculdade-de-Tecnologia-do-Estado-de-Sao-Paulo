//var a = 20 

//if (a <= 10){
//    console.log("A variavel é menor.")
//}else{
//    console.log("A variável é maior.")
//}


var http = require('http')
http.createServer(function(req, res){
    res.end("Mensagem direcionada")
    }).listen(8081)

console.log("Servidor está ativo")


let tabuada = require('./tabuada')
console.log(tabuada)

var soma = require('./soma')
console.log(soma (10,10))

var subtracao = require('./subtracao')
console.log(subtracao (10,16))

var multiplicacao = require('./multiplicacao')
console.log(multiplicacao (100,10))

var divisao = require('./divisao')
console.log(divisao (10,100))

//let signo = 'Leão';

//switch (signo) {
//  case 'Áries':
//    console.log("De 21 março a 20 abril");
//    break;
//	case 'Touro':
//    console.log("de 21 abril a 20 maio");
//    break;
//  case 'Gêmeos':
//    console.log("de 21 maio a 20 junho");
//    break;
//  case 'Câncer':
//   console.log("de 21 junho a 22 julho");
//    break;
//  case 'Leão':
//    console.log("de 23 julho a 22 agosto");
//    break;
//  case 'Virgem':
//    console.log("de 23 agosto a 22 setembro");
//    break;
//  default:
//  	console.log("Signo não registrado");
//   break;
//}



//let carro = {
//    marca: 'ford',
//    modelo: 'fiesta',
//    cor: 'prata',
//    }
    
//    for (propriedade in carro) {
//        console.log(propriedade);
//    }

//var a = 10
//var b = 20
//var total = 0

//adição
//total = a + b
//console.log(total)

//total = a - b
//console.log(total)

//total = a * b 
//console.log(total)

//total = a / b 


//console.log("Primeira aula de node")
//console.log(total)
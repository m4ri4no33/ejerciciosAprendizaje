//1. Escribir un algoritmo en el cual se consulte al usuario que ingrese ¿cómo está el día de
//hoy? (soleado, nublado, lloviendo). A continuación, mostrar por pantalla un mensaje que
//indique “El día de hoy está ...”, completando el mensaje con el dato que ingresó el usuario.

// var respuesta = prompt("Como esta el dia de hoy...(soleado/nublado/lloviendo");
// alert("El dia de hoy esta..." + respuesta);



//2. Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio
//de una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que
//para calcular el área y el perímetro se utilizan las siguientes fórmulas:
//area = PI * radio2
//perimetro = 2 * PI * radio

// var radio = prompt("Ingrese el valor en cm del radio");
// var area = Math.PI * (radio**2);
// var perimetro = 2 * Math.PI * radio;
// alert("Resultado Area: " + area + "\nResultado perimetro: " + perimetro);



/*3. Escriba un programa en donde se pida la edad del usuario. Si el usuario es mayor de
edad se debe mostrar un mensaje indicándolo.*/

// var edad = prompt("Ingresar su edad");
// if(edad >= 18){
//     alert("Usted es mayor de Edad")
// }else{
//     alert("Usted es menor de Edad")
// }



/*4. Realiza un programa que sólo permita introducir los caracteres ‘S’ y ‘N’. Si el usuario
ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.*/

// var respuesta = prompt("Solo debe ingresar S o N");
// if(respuesta == "S" || respuesta == "N"){
//     alert("CORRECTO")
// }else{
//     alert("INCORRECTO")
// }



/*5. Construir un programa que simule un menú de opciones para realizar las cuatro
operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
numéricos enteros. El usuario, además, debe especificar la operación con el primer
carácter de la operación que desea realizar: ‘S' o ‘s’ para la suma, ‘R’ o ‘r’ para la resta, ‘M’
o ‘m’ para la multiplicación y ‘D’ o ‘d’ para la división.*/

// var numero1 = Number (prompt("Ingrese un valor A"));
// var numero2 = Number (prompt("Ingrese un valor B"));
// var respuesta = prompt("Ingrese segun operacion a realizar" +
//     "\nS o s - Suma" +
//     "\nR o r - Resta" +
//     "\nM o m - Multiplicar" +
//     "\nD o d - Division");
// switch (respuesta.toUpperCase()) {
//     case "S":
//         console.log(numero1 + numero2)
//         break
//     case "R":
//         console.log(numero1 - numero2)
//         break
//     case "M":
//         console.log(numero1 * numero2)
//         break
//     case "D":
//         console.log(numero1 / numero2)
//         break
// }



/*6. Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
En caso de que el valor ingresado sea 0, se debe mostrar “el número no es par ni impar”.*/

// var numero = Number (prompt("Ingrese un numero"));
// if(numero == 0){
//     console.log("Este numero no es par ni impar")
// }else if(numero %2 == 0 ){
//     console.log("Este numero es Par")
// }else{
//     console.log("Este numero es impar")
// }



/*7. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.*/

/*
// Solicitar el valor límite positivo
const limite = parseInt(prompt("Ingresa un valor límite positivo:"));

if (isNaN(limite) || limite <= 0) {//validar que sea positivo o mayor a cero
  console.log("El valor ingresado no es válido.");
} else {
  let suma = 0;
  let contador = 0;

  // Solicitar números hasta que la suma supere el límite
  while (suma <= limite) {
    const numero = parseFloat(prompt(`Ingresa el número ${contador + 1}:`));
    
    if (isNaN(numero)) {
      console.log("¡Ingresa un número válido!");
      continue;
    }

    suma += numero;
    contador++;
  }

  console.log(`Se superó el límite de ${limite} con una suma total de ${suma}.`);
  console.log(`Se introdujeron ${contador} números.`);
}
*/


/*8. Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
todos ellos.*/
var numero=[];

document.getElementById('botonE8').addEventListener("click",function(){
    let numberImput = document.getElementById('numeroEntero');
    let numero = parseInt(numberImput.value);
    if (!isNaN(numero)){
        if (numero === 0) {
            calcularEstadistica();
            return;
        }else{
            numero.push
        }
    }
    if (numero === 0) {
        calcularEstadistica
    }
})

/*9. Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el
funcionamiento de la función Substring().*/
document.getElementById('botonE9').addEventListener("click",function () {
let fraseInput = document.getElementById('frase').value;
let fraseConEspacio = "";

for (let i = 0; i < fraseInput.length; i++) {
  if (i === fraseInput.length - 1) {
    fraseConEspacio += fraseInput[i];
  } else {
    fraseConEspacio += fraseInput[i] + " ";
  }
}

console.log("Frase con espacios:" + fraseConEspacio);
})


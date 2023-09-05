//ejercicio1
function estadoclima() {
    let resultado = document.getElementById('select').value;
    document.getElementById('Ejercicio1-resultado').innerHTML = `El día esta : ${resultado}.`;
}
//ejercicio 2
function calcularRadioPerimetro() {
    let radio = document.getElementById('Ejercicio2-radio').value;
    area = Math.PI * (Math.pow(radio, 2));
    perimetro = 2 * Math.PI * radio;
    document.getElementById('Area').innerHTML = `El Area el circulo ${area}`;
    document.getElementById('Perimetro').innerHTML = `El perimetro del circulo es ${perimetro} `;
}
//Ejercicio 3
function calcularMayoriaEdad() {
    let edad = document.getElementById('Ejercicio3-edad').value;
    let res = "mayor"
    if (edad < 18) {
        res = "menor";
    }
    document.getElementById('Edad').innerHTML = `Sos ${res} de edad.`

}
//Ejercicio 4
function esNoS() {
    let letras = document.getElementById('Char').value;
    let letra = "";
    letra = letras.toString();
    if (letra.toUpperCase() == "S" || letra.toUpperCase() == "N") {
        document.getElementById('CharSalida').innerHTML = `Correcto.`;
    } else {
        document.getElementById('CharSalida').innerHTML = `Incorrecto`;
    }
}

//Ejercicio 5
function Operacion(ope) {
    let num1 = document.getElementById('Numer1').value;
    let num2 = document.getElementById('Numer2').value;
    let resultad;
    switch (ope) {

        case 'suma': resultad = num1 + num2; break;

        case 'resta': resultad = num1 - num2; break;

        case 'division': resultad = (num1 / num2); break; break
            s
        case 'multiplicacion': resultad = (num1 * num2); break;

    }
    document.getElementById('resultado').innerHTML = `El resultado de la ${ope} es: ${resultad}`;
}
//Ejercicio 6
function ParOnoPar() {
    let numero = document.getElementById('ParOnoPar').value;
    let reult;
    if (numero == 0) {
        reult = `El numero es 0, no es par  ni impar`;
    } else if (numero % 2 == 0) {
        reult = `El numero es par`;
    } else { reult = `El numero  no es par`; }
    document.getElementById('resultado_Ejercicio6').innerHTML = reult;
}
//Ejercicio 7
function InstanciarLimite() {
    let numeroLimite = parseInt(document.getElementById('Ejercicio7-Numeros').value);
    document.getElementById('numeroLimite').textContent = numeroLimite;
    document.getElementById('Acumulado').textContent = "0".toString();
    document.getElementById('Ejercicio7-Numeros').value = "";
}

function Acumulado() {
    let numero = parseInt(document.getElementById('Ejercicio7-Numeros').value);
    let numeroAcumulado = parseInt(document.getElementById('Acumulado').textContent);
    console.log(numero, " ", numeroAcumulado);
    let resultadoSuma = numero + numeroAcumulado;
    document.getElementById('Acumulado').textContent = resultadoSuma.toString();
    verificar();
    document.getElementById('Ejercicio7-Numeros').value = "";
}

function verificar() {
    let numeroLimite = parseInt(document.getElementById('numeroLimite').textContent);
    let numeroAcumulado = parseInt(document.getElementById('Acumulado').textContent);
    if (numeroAcumulado >= numeroLimite) {
        confirm(`Superaste el número límite ${numeroLimite}, Acumulaste ${numeroAcumulado}`);
        document.getElementById('Acumulado').textContent = "";
        document.getElementById('numeroLimite').textContent = "";
    }
}
//Ejercicio 8
let numeros = [];
document.getElementById('btnAgregar').addEventListener("click", function () {
    let numberInput = document.getElementById('Ejercicio8_Numeros-Input');
    let numero = parseInt(numberInput.value);
    if (!isNaN(numero)) {
        if (numero === 0) {
            CalculoEstadistica();
            return;
        } else {
            numeros.push(numero);
            console.log(numeros);
        }
    }
    document.getElementById('Ejercicio8_Numeros-Input').value = "";
    });

function CalculoEstadistica() {
    let mayor = Math.max(...numeros);
    let menor = Math.min.apply(Math, numeros);
    const sum = numeros.reduce((total, num) => total + num, 0);
    let promedio = (sum / (numeros.length - 1)).toFixed(2);
    document.getElementById('numerosIngresados').innerHTML = `<p id="numerosIngresados"><p>
<p>Numero Menor ingresado ${menor}<p>
<p>Numero Mayor ingresado ${mayor}<p>
<p>Promedio de los numeros ${promedio}<p>
`
    numeros = [];
    console.log(`despues de calcular`);
    console.log(numeros);
}   

//Ejercicio 9

document.getElementById('Ejercicio9_Input').addEventListener("mouseover",function(){
let text ="";
text = document.getElementById('Ejercicio9_Input').value;
let text1 ="";
for (let index = 0; index < text.length; index++) {
    if(text.substring(index, index+1) == " "){
text1+="_";
    }else{
    text1 += text.substring(index, index+1);
    text1 += " ";
    } }
document.getElementById('Resultado').innerHTML = `${text1}`;
});
document.getElementById('Ejercicio9_Input').addEventListener("mouseleave",function(){
document.getElementById('Resultado').innerHTML ="";});


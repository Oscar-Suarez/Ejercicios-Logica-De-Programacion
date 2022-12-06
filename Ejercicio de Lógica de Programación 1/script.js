//Inicio de programa y petición de número/declaración de variables.
console.log("Bienvenido al programa para ordenar 3 números.");
let num1 = prompt("Introduce el primer número: ");
let num2 = prompt("Introduce el segundo número: ");
let num3 = prompt("Introduce el tercer número: ");



//Comparar num1 con los otros 2 números
if (num1 > num2 && num1 > num3) {

    //Operador ternario para ordenar números faltantes.
    num2 > num3 ? console.log("Mayor a menor: " + num1, num2, num3, "\n" + "Menor a mayor: " + num3, num2, num1 ) : console.log("Mayor a menor: " + num1, num3,  num2, "\n" + "Menor a mayor: " + num2, num3,  num1,);

    //Comparar num2 con num3.
} else if (num2 > num3) {

    //Operador ternario para ordenar números faltantes.
    num1 > num3 ? console.log("Mayor a menor: " + num2, num1, num3, "\n" + "Menor a mayor: " + num3, num1, num2) : console.log("Mayor a menor: " + num2,  num3, num1, "\n" + "Menor a mayor: " + num1,  num3, num2 );

    //Comparar num2 con los otros 2 números
} else if (num3 > num2 && num3 > num1) {

    //Operador ternario para ordenar números faltantes.
    num1 > num2 ? console.log("Mayor a menor: " +  num3, num1, num2,"\n" + "Menor a mayor: " + num2, num1, num3 ) : console.log("Mayor a menor: " + num3, num2, num1, "\n" + "Menor a mayor: " + num1, num2, num3);

    //Verificar si los números son iguales.
} else if (num1 == num2 && num2 == num3) {

    console.log("Los números son iguales.");

    //Verificar si se introdujo otro caracter.
} else {
    console.log("Introdujiste una o más opciones que no son números.");
}


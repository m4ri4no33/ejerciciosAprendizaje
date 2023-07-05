package Clases

class Yates(val matriculaBarco : String, val esloraBarco : Int, val anioFabricacionBarco: Fecha,potenciaCVBarco : Int, nroCamaroresBarco : Int) extends Barco(matriculaBarco, esloraBarco, anioFabricacionBarco){
  var potenciaCV = potenciaCVBarco
  var nroCamarotes = nroCamaroresBarco
}

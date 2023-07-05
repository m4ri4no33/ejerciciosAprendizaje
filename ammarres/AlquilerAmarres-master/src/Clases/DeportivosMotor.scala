package Clases

class DeportivosMotor(val matriculaBarco : String, val esloraBarco : Int, val anioFabricacionBarco: Fecha,potenciaCVBarco : Int) extends Barco(matriculaBarco, esloraBarco, anioFabricacionBarco){
  var potenciaCV = potenciaCVBarco
}

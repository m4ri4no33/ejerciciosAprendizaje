package Clases

class Barco(matriculaBarco :String, esloraBarco : Int, anioFabricacionBarco: Fecha)extends Serializable{
  var matricula = matriculaBarco
  var eslora = esloraBarco
  var anioFabricacion = anioFabricacionBarco


  override def toString = s"Barco($matricula, $eslora, $anioFabricacion)"
}



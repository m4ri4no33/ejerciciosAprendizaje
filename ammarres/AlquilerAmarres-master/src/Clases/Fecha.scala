package Clases

class Fecha(Dia : Int, Mes:Int, Anio: Int) extends Serializable{
  var dia = Dia
  var mes = Mes
  var anio = Anio
  
  override def toString = dia + "/" + mes + "/" + anio
}
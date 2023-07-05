package Clases

class Alquiler(clienteC : Cliente, duracionC : Int, posicionAmar : String, barcoC : Barco, total : Int)extends Serializable{

  var cliente = clienteC
  var duracion = duracionC
  var posicionAmarre = posicionAmar
  var barco = barcoC
  var montoTotal = total


  override def toString() : String ={
    var mensaje : String = ""
    mensaje+=cliente.ciCliente + "," + barco.matricula + ","
    if(barco.isInstanceOf[Veleros])
      mensaje+="VELERO" + ","
    else if(barco.isInstanceOf[DeportivosMotor])
      mensaje+="DEPORTIVO" + ","
    else if(barco.isInstanceOf[Yates])
      mensaje+="YATE" + ","
    else
      mensaje+="BARCO" + ","
    mensaje += duracion + " DIAS" + "," + posicionAmarre + "," + " $" +montoTotal
    
    return mensaje
  }
}
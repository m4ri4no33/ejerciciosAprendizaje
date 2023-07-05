package Clases

class Cliente(ci : String, nombreC : String, apellidoC :String, telefonoC : String) extends Serializable
{
  var ciCliente = ci
  var nombreCliente = nombreC
  var apellidoCliente = apellidoC
  var telefono = telefonoC

  override def toString = ciCliente + "," + nombreCliente + "," + apellidoCliente + "," + telefono
}

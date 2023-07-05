package Main

import scala.collection.mutable.ArrayBuffer
import Clases._
import Main._

class ManejoPuertoBarquero() extends Serializable{
  var listadoClientes = new ArrayBuffer[Cliente]
  var listadoBarcos = new ArrayBuffer[Barco]
  var listadoAlquiler = new ArrayBuffer[Alquiler]
  
  def AgregarCliente(cliente : Cliente) : Unit={
    listadoClientes+=cliente
    new Serializacion().guardarArchivo(this)
  }
  
  def AgregarBarco(barco:Barco){
    listadoBarcos+= barco
    new Serializacion().guardarArchivo(this)
  }
  
  def AgregarAlquiler(alquiler : Alquiler){
    listadoAlquiler+=alquiler
    new Serializacion().guardarArchivo(this)
  }
  
  def existeCliente(cedula : String) : Boolean ={
    var cliente : Boolean = false
    for (i <- listadoClientes ){
      if (i.ciCliente.equals(cedula)) {cliente = true;}
    }
    return cliente
  }
  
  def existeBarco(matricula : String) : Boolean ={
    var barco : Boolean = false
    for (i <- listadoBarcos) {
      if (i.matricula.equals(matricula)) {barco = true;}
    }
    return barco
  }
  
  def listaClientes() : String ={
    
    if(listadoClientes.size == 0) return null
    
    var listado : String = ""
    for (i<-listadoClientes) listado+=i.toString + "-"
    return listado
  }
  
  def listaAlquileres() : String = {
    if(listadoAlquiler.size == 0) return null
    
    var listado : String = ""
    for (i<-listadoAlquiler) listado+=i.toString + "-"
    return listado
  }
  
  def listarBarcosVeleros() : String={
    var listado : String = ""
    var nroBarcos : Int = 0;
    for (i<-listadoBarcos)
      if(i.isInstanceOf[Veleros]){
        listado+=i.matricula +  "," + i.eslora + "," + i.anioFabricacion.toString + "," + i.asInstanceOf[Veleros].nroMastiles + "-"
        nroBarcos+=1
      }
    if(nroBarcos==0)
      return null 
    
    return listado
  }
  
  def listarBarcosDeportivos() : String={
    var listado : String = ""
    var nroBarcos : Int = 0;
    for (i<-listadoBarcos)
      if(i.isInstanceOf[DeportivosMotor]){
        listado+=i.matricula +  "," + i.eslora + "," + i.anioFabricacion.toString + "," + i.asInstanceOf[DeportivosMotor].potenciaCV + "-"
        nroBarcos+=1
      }
    if(nroBarcos==0)
      return null 
    
    return listado
  }
  
  def listarBarcosYates() : String={
    var listado : String = ""
    var nroBarcos : Int = 0;
    for (i<-listadoBarcos)
      if(i.isInstanceOf[Yates]){
        listado+=i.matricula +  "," + i.eslora + "," + i.anioFabricacion.toString + "," + i.asInstanceOf[Yates].potenciaCV + "," + i.asInstanceOf[Yates].nroCamarotes + "-"
        nroBarcos+=1
      }
    if(nroBarcos==0)
      return null 
    
    return listado
  }
  
  def getBarco(matricula : String) : Barco ={
    for (i <- listadoBarcos) {
      if (i.matricula.equals(matricula)) return i
    }
    return null
  }
  
  def getCliente(cedula : String) : Cliente ={
    for (i <- listadoClientes ){
      if (i.ciCliente.equals(cedula)) return i
    }
    return null
  }
  
  def modificarCliente(cliente : Cliente) : Unit ={
    for (i <- listadoClientes ){
      if (i.ciCliente.equals(cliente.ciCliente)) {
        i.nombreCliente = cliente.nombreCliente
        i.apellidoCliente = cliente.apellidoCliente
        i.telefono = cliente.telefono
        
      }
    }
    new Serializacion().guardarArchivo(this)
  }
  
  def eliminarCliente(cedula : String) : Boolean ={
    
    if(listadoAlquiler.size!=0)
    for(i<-listadoAlquiler){
      if(i.cliente.ciCliente.equals(cedula)) return false
    }
    
    
    for(i<-listadoClientes){
      if(i.ciCliente.equals(cedula)){
        listadoClientes-=i
      }
    }
    new Serializacion().guardarArchivo(this)
    return true;
  }
  
  def modificaBarco(barco : Barco) : Unit ={
    for (i <- listadoBarcos ){
      if (i.matricula.equals(barco.matricula)) {
        i.eslora = barco.eslora
        i.anioFabricacion = barco.anioFabricacion
        if(barco.isInstanceOf[Veleros]){
          i.asInstanceOf[Veleros].nroMastiles = barco.asInstanceOf[Veleros].nroMastiles
        }
        else if(barco.isInstanceOf[DeportivosMotor]){
          i.asInstanceOf[DeportivosMotor].potenciaCV = barco.asInstanceOf[DeportivosMotor].potenciaCV
        }
        else if(barco.isInstanceOf[Yates]){
          i.asInstanceOf[Yates].potenciaCV = barco.asInstanceOf[Yates].potenciaCV
          i.asInstanceOf[Yates].nroCamarotes = barco.asInstanceOf[Yates].nroCamarotes
        }
      }
    }
    new Serializacion().guardarArchivo(this)
  }
  
  def eliminarBarco(matricula : String) : Boolean ={
    if(listadoAlquiler.size!=0)
    for(i<-listadoAlquiler){
      if(i.barco.matricula.equals(matricula)) return false
    }
    
    for(i<-listadoBarcos){
      if(i.matricula.equals(matricula)){
        listadoBarcos-=i
      }
    }
    new Serializacion().guardarArchivo(this)
    return true;
  }
  
}
package Main

import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

class Serializacion {

  def guardarArchivo(registros: ManejoPuertoBarquero): Unit ={
    val arch = new ObjectOutputStream(new FileOutputStream("ManejoAmarres.obj"))
    arch.writeObject(registros)
    arch.close
  }

  def cargarArchivo(): ManejoPuertoBarquero ={
    
    var registros : ManejoPuertoBarquero = null
    try{
      val arch = new ObjectInputStream(new FileInputStream("ManejoAmarres.obj"))
      registros = arch.readObject.asInstanceOf[ManejoPuertoBarquero]
      arch.close
    }
    catch{
      case ex : IOException =>{
        registros = new ManejoPuertoBarquero
      }
    }
    return registros
  }
  
}

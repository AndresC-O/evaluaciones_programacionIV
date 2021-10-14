package com.andres.segundolaboratorio_vehiculos

class VehiculoNuevo(val nombre:String, val modelo:String, val year:Int):Vehiculo{

    fun ListarVehiculo(){
        println("Bienvenido, usted acaba de adquirir un vehiculo Marca: $nombre, Modelo: $modelo y su año respectivo: $year")
        darSaludo()
    }

    override fun darSaludo(){
        println("Gracias por adquirir su nuevo vehiculo: $nombre")
    }

    private fun conducir(){
        println("Usted ha comenzado a conducir su vehiculo $nombre")
    }
}
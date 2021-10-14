package com.andres.segundolaboratorio_vehiculos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SegundoLaboratorio()
    }

    fun SegundoLaboratorio(){

        val carro1 = VehiculoNuevo("Toyota", "Hilux", 2021)
        carro1.ListarVehiculo()

        val carro2 = VehiculoNuevo("Nissan", "Altima", 2018)
        carro2.ListarVehiculo()

        val carro3 = VehiculoNuevo("Toyota", "Yaris", 2019)
        carro3.ListarVehiculo()
    }
}
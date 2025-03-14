class Reservas(ID_huesped :Int,Nombre_huesped: String,Email_huesped: String,var ID_reserva:Int,var Numero_habitacion: Int,
               val Tipo_habitacion:String, val Precio_noche: Double, val Cantidad_noches_reservadas: Int )
    :Huesped(ID_huesped, Nombre_huesped, Email_huesped){

    fun Calcular_Total_Pago():Double{
       return Precio_noche * Cantidad_noches_reservadas
    }
}
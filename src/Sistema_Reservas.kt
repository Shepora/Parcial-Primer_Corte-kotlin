class Sistema_Reservas {
    private val reservas = mutableListOf<Reservas>()

    fun Registrar_Reserva(reserva : Reservas): Boolean{
        if (reservas.any{it.Numero_habitacion == reserva.Numero_habitacion}){
            println("Error, la habitacion ${reserva.Numero_habitacion} ya se encuentra reservada.")
            return false
        }
            reservas.add(reserva)
            println("La reserva de la habitacion ${reserva.ID_reserva} fue exitosa")
            return true
        }
        fun Cancelar_Reserva(id_reserva : Int) : Boolean{
            val reserva = reservas.find { it.ID_reserva == id_reserva }
            return if (reserva != null){
                reservas.remove(reserva)
                println("La reserva $id_reserva fue cancelada con exito")
                true
            }else {
                println("Error, La reserva con el ID $id_reserva no existe")
                false
            }
        }
        fun mostrar_Reservas(){
            if (reservas.isEmpty()){
                println("No hay reservas activas")
                return
            }
                println("Reservas activas: ")
                reservas.forEach{
                    println("Id_reserva: ${it.ID_reserva},Huesped: ${it.Nombre_huesped},Numero Habitación: ${it.Numero_habitacion}, " + "Tipo Habitacion: ${it.Tipo_habitacion}, " + "Total a pagar: ${it.Calcular_Total_Pago()}")

                }
            }

        }


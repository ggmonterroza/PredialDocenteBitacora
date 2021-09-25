import java.time.LocalDate

class Personal(id_Personal: Int, nombre: String, curp: String, fecha_Ingreso:
    LocalDate, genero: String, gradoAcademico: GradoAcademico, clavePresupuestal: String) {

    val id_Personal = id_Personal
    val nombre = nombre
    var curp = curp
    val fecha_Ingreso = fecha_Ingreso
    val genero = String
    val clavePresupuestal = String
    val antiguedad = calcularAntigüedad()

    fun calcularAntigüedad(): Int {
        // print(fechaNacimiento)
        val fechaActual = LocalDate.now()
        //print(fechaActual)
        val antigüedad = fechaActual.getYear() - this.fecha_Ingreso.getYear()
        //print(antigüedad)
        return antigüedad
    }


}


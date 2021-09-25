import org.junit.Test
import java.time.LocalDate

class MainPredial {
    @Test
    fun main() {



        val propietario = Persona("Gustavo", fechaNacimiento = LocalDate.of(1995,3,17),madreSoltera = false)

        val impuesto = Impuesto(propietario, mes = LocalDate.of(2021,1,23))
        impuesto.agregarTerreno(Terreno(zonaResidencial(), extension = 800.0))
        impuesto.agregarTerreno(Terreno(zonaUrbana(), extension = 600.0))

        println("Total sin descuento:"+impuesto.calcularImpuestoTotal())
        println("Total :"+impuesto.calcularTotal())
    }
}






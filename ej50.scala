object ej50 {
    abstract class Empleado(
        val nombre: String,
        val salarioBase: Double
    ) {
        def salarioTotal: Double
    }

    class Desarrollador(nombre: String, salarioBase: Double, val bonoFijo: Double) extends Empleado(nombre, salarioBase) {
        def salarioTotal: Double = salarioBase + bonoFijo
    } 

    class Vendedor(nombre: String, salarioBase: Double, val ventas: Double) extends Empleado(nombre, salarioBase) {
        def salarioTotal: Double = salarioBase + ventas * 0.02
    }

    class Gerente(nombre: String, salarioBase: Double, val bonoPorcentual: Double) extends Empleado(nombre, salarioBase) {
        def salarioTotal: Double = salarioBase + salarioBase * bonoPorcentual
    }

    def mostrarSalario(empleado: Empleado): Double = {
        empleado.salarioTotal
    }

    def main(args: Array[String]): Unit = {
        val desarrollador: Empleado = new Desarrollador("Juan", 5000, 800)
        val vendedor: Empleado = new Vendedor("Pablo", 4000, 5000)
        val gerente: Empleado = new Gerente("Joaquin", 8000, 0.20)

        println(s"${desarrollador.nombre} ${mostrarSalario(desarrollador)}")
        println(s"${vendedor.nombre} ${mostrarSalario(vendedor)}")
        println(s"${gerente.nombre} ${mostrarSalario(gerente)}")
    }
}
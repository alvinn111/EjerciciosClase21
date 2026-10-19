object ej48 {
    trait Figura {
        def area: Double
    }

    class Rectangulo(val base: Double, val altura: Double) extends Figura {
        def area: Double = base * altura
    }

    class Circulo(val radio: Double, val pi: Double = 3.141592) extends Figura {
        def area: Double = radio * pi
    }

    class Triangulo(val base: Double, val altura: Double) extends Figura {
        def area: Double = (base * altura) / 2
    }

    def mostrarArea(figura: Figura): Double = {
        figura.area
    }

    def main(args: Array[String]): Unit = {
        val rectangulo: Figura = new Rectangulo(4,7)
        val circulo: Figura = new Circulo(6)
        val triangulo: Figura = new Triangulo(5,8)
        println(s"${mostrarArea(rectangulo)}")
        println(s"${mostrarArea(circulo)}")
        println(s"${mostrarArea(triangulo)}")
    }
}


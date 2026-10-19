object ej49 {
    abstract class Animal(
        val nombre: String
    ) {
        def sonido(): String
    }

    trait Volador {
        def volar(): String = "Estoy Volando"
    }

    trait Nadador {
        def nadar(): String = "Estoy Nadando"
    }

    class Perro(nombre: String) extends Animal(nombre) {
        def sonido(): String = "Guaf Guaf"
    }

    class Pato(nombre: String) extends Animal(nombre) with Nadador with Volador {
        def sonido(): String = "Cua Cua"
    }

    class Pez(nombre: String) extends Animal(nombre) with Nadador {
        def sonido(): String = "Glu Glu"
    }

    def escuchar(animal: Animal): String = {
        animal.sonido()
    }

    def main(args: Array[String]): Unit = {
        val perro = new Perro("Choco")
        val pato = new Pato("Sassy")
        val pez = new Pez("Cocoa")

        println(s"${perro.nombre}: ${escuchar(perro)}")
        println(s"${pato.nombre}: ${escuchar(pato)}")
        println(s"${pez.nombre}: ${escuchar(pez)}")

        println(escuchar(perro))
        println(escuchar(pato))
        println(escuchar(pez))
    }
}
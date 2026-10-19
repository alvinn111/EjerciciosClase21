object ej51 {
    trait Notificacion {
        def enviar(mensaje: String): String
    }

    class Email extends Notificacion {
        def enviar(mensaje: String): String = s"Enviando correo: $mensaje"
    }

    class SMS extends Notificacion {
        def enviar(mensaje: String): String = s"Enviando SMS: $mensaje"
    }

    class Push extends Notificacion {
        def enviar(mensaje: String): String = s"Enviando notificacion: $mensaje"
    }

    def procesarNotificacion(
        notificacion: Notificacion,
        mensaje: String
    ): String = {
        notificacion.enviar(mensaje)
    }

    def main(args: Array[String]): Unit = {
        println(procesarNotificacion(new Email(), "Hola"))
        println(procesarNotificacion(new SMS(), "Hola"))
        println(procesarNotificacion(new Push(), "Hola"))
    }
}
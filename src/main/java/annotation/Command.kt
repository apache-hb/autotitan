package annotation

@Target(AnnotationTarget.FUNCTION)
annotation class Command(
    val name: String = "",
    val group: String = "",
    val serverOnly: Boolean = false
)
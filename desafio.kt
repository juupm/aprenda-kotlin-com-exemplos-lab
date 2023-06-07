// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuario $usuario matriculado na formacao $nome.")
    }
}

fun main() {
    val usuario = Usuario()
    val conteudo1 = ConteudoEducacional("Introducao ao Kotlin")
    val conteudo2 = ConteudoEducacional("Programacao Orientada a Objetos", 120)

    val formacao = Formacao("Formacao Kotlin", listOf(conteudo1,conteudo2))

    formacao.matricular(usuario)
}

// DeathbatO

import java.util.Arrays

fun pasoCarrera(pista: Array<String>, atleta: Array<String>): Boolean {
    if (pista.size == atleta.size) {
        val res = Array(pista.size) { "" }
        for (i in pista.indices) {
            when {
                (pista[i] == "_" && atleta[i] == "run") || (pista[i] == "|" && atleta[i] == "jump") ->
                    res[i] = pista[i]
                (pista[i] == "_" && atleta[i] == "jump") -> res[i] = "x"
                (pista[i] == "|" && atleta[i] == "run") -> res[i] = "/"
            }
        }
        val resultado = Arrays.equals(res, pista)
        println(if (resultado) "Completo la carrera correctamente: " else "No completo la carrera correctamente: ")
        println(Arrays.toString(res))
        return resultado
    } else {
        return false
    }
}

fun main() {
    val p1 = arrayOf("_", "_", "|", "_", "_", "_", "|", "_")
    val a1 = arrayOf("run", "run", "jump", "run", "run", "run", "jump", "run")
    val p2 = arrayOf("_", "|", "_", "|", "_", "_", "|", "_")
    val a2 = arrayOf("run", "jump", "run", "jump", "jump", "run", "run", "jump")

    println("Primera pista y recorrido: ")
    println(p1.contentToString())
    println(a1.contentToString() + "\n")
    pasoCarrera(p1, a1)
    println("\n\nSegunda pista y recorrido: ")
    println(p2.contentToString())
    println(a2.contentToString() + "\n")
    pasoCarrera(p2, a2)
}
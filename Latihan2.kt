fun main() {
    val pangkat = {bil1: Int, bil2: Int -> Math.pow(bil1.toDouble(), bil2.toDouble())}
    println("4 pangkat 3 = ${pangkat(4, 3)}")
}


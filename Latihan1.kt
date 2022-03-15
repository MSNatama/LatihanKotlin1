fun main() {
    var x1 : Double
    var x2: Double
    var y1 : Double
    var y2 : Double


    println(hitungJarak(2.0, 3.0,8.0,7.0))
}

fun hitungJarak(
    x1 : Double,
    x2 : Double,
    y2 : Double,
    y1 : Double
): Double{
    val euclid = (x2-x1) * (x2-x1) + (y2-y1) * (y2-y1)
    return Math.sqrt(euclid)
}
class Barang(nama: String, harga: Int, jumlah: Int, diskon: Int){
    var nama: String = nama
    var harga: Int = harga
    var jumlah: Int = jumlah
    var diskon: Int = diskon

    fun tampil(){
        println("Nama Barang: $nama")
        println("Harga Barang: $harga")
        println("Jumlah Barang: $jumlah")
        println("Diskon: $diskon%")
    }
    fun hitungTotal(): Int {
        val hitung = harga*jumlah
        val disc = diskon*hitung/100
        val total = hitung-disc
        return total
    }
}

fun main() {
    val item1 = Barang("Buku", 15000, 3, 15)
    item1.tampil()
    println(item1.hitungTotal())
}


import base.produk;

public class main {

    public static void main(String[] args) {
        produk p = new produk("Indomie Goreng", 3500, 100, "Makanan");

        System.out.println(p.stok);
        System.out.println(p.harga);
        System.out.println(p.kategori);
        System.out.println(p.nama);

        p.tampilInfo();
    }
}

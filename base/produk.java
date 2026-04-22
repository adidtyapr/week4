package base;

public class produk {
    private String nama;
    String kategori;
    protected double harga;
    public int stok;

    public produk(String nama, double harga, int stok, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }

    public void tampil info() {
        System.out.println("Produk : " + nama);
        System.out.println("Kategori : " + kategori);
        System.out.println("Harga : " + harga);
        System.out.println("Stok : " + stok);
        System.out.println("_____________");
    }
    
}

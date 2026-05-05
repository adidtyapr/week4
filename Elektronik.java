public class Elektronik extends produk {
    private int garansi;
    public Elektronik(String nama, double harga, int stok, String kategori, int garansi) {
        super(nama, harga, stok, kategori);
        this.garansi = garansi;
    }

    public void tampilkanData(){
        super.tampilinfo();
        System.out.println("Garansi : " + garansi + " bulan");
    }

    public void setGaransi(int garansi){
        if(garansi < 0){
            System.out.println("Masa garansi tidak boleh negatif.");
        } else {
            this.garansi = garansi;
        }
    }
}


public class Elektronik extends produk {
    private int garansi;
    public Elektronik(String nama, double harga, int stok, String kategori, int garansi) {
        super(nama, harga, stok, kategori);
        this.garansi = garansi;
    }
    
    @Override
    public void tampilinfo() {
        System.out.println("elektronik");
        super.tampilinfo();
        System.out.println("Masa Garansi : " + garansi + " hari");
    }

    public void setGaransi(int garansi){
        if(garansi < 0){
            System.out.println("Masa garansi tidak boleh negatif.");
            this.garansi =0;
        } else {
            this.garansi = garansi;
        }
    }
}


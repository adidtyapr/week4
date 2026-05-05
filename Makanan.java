public class Makanan extends produk {
    private int expired;
    public Makanan(String nama, double harga, int stok, String kategori) {
        super(nama, harga, stok, kategori);
        this.expired = expired;
    }

    public void tampilkanData(){
        super.tampilinfo();
        System.out.println("Expired : " + expired + " hari");
    }

    public void setExpired(int expired){
        if(expired < 0){
            System.out.println("Masa expired tidak boleh negatif.");
        } else {
            this.expired = expired;
        }
    }
}

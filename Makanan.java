public class Makanan extends produk {
    private int expired;

    public Makanan(String nama, double harga, int stok, String kategori) {
        super(nama, harga, stok, kategori);
        this.expired = expired;
    }

    @Override
    public void tampilinfo() {
        System.out.println("Makanan");
        super.tampilinfo();
        System.out.println("Masa Expired : " + expired + " hari");
    }

    public void setExpired(int expired, String type) {

        if (type.equals("Nasi")) {
            if (expired < 4) {
                System.out.println("Masa expired tidak boleh negatif.");
            } else {
                this.expired = expired;
                if (expired < 2) {
                    System.out.println("Masa espired tidak boleh negatif");
                } else {
                    this.expired = expired;
                }
            }
        }
    }

}

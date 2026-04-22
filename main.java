public class main {
    public static void main(String[] args) {
        produk p = new produk("Baju", 10000.0, 5, "Uniqlo");
    


        System.out.println(p.getNama());
        System.out.println(p.getHarga());

        p.setHarga(20000.0);
        System.out.println(p.getHarga());
    
    };
}
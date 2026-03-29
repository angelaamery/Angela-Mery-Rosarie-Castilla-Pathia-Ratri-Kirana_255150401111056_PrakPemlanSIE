package override;

public class AgenBusApp {
    public static void main(String[] args) {
        Tiket t1 = new Tiket();
        t1.pesan();
        t1.tampil();

        TiketBus t2 = new TiketBus();
        t2.pesan();
        t2.tampil();

        TiketBus t3 = new TiketBus();
        t3.pesan("Kasino", "Bandung", 650, 450000);
        t3.tampil();

        TiketBus t4 = new TiketBus();
        t4.pesan("Angel");
        t4.tampil();

        Tiket t5 = new TiketBus() {
    @Override
    public void tampil() {
        System.out.println("=================================");
        System.out.println("         PT. NEO CITY BUS        ");
        System.out.println("=================================");
        System.out.println("          === TIKET ===          ");
        System.out.println("---------------------------------");
        System.out.printf("Nama Penumpang : %s%n", this.namaPenumpang);
        System.out.printf("Tujuan         : %s%n", this.tujuan);
        System.out.printf("Harga Tiket    : Rp %.0f%n", this.hargaTiket);
        System.out.println("---------------------------------");
        System.out.println("   Terima kasih telah memesan!   ");
        System.out.println("=================================");
    }
};
        t5.pesan("Jaehyun", "Malang", 300, 200000);
        t5.tampil();
        
        t1.pesan("Indro", "Makassar");
        t1.tampil();
        t2.pesan("Dono", "Makassar");
        t2.tampil();
    }
}
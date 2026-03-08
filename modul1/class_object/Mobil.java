package class_object;
public class Mobil {
    private String nopol;
    private String warna;
    private String merk;
    private int kecepatan;
    private int jarakTempuh;

    public void setNopol(String n) {
        nopol = n;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setMerk(String m) {
        merk = m;
    }

    public void setKecepatan(int k) {
        kecepatan = k;
    }

    public void setJarakTempuh(int jarak) {
        jarakTempuh = jarak;
    }

       public void hitungJarakTempuh(int waktu) {
        jarakTempuh = kecepatan * waktu;
    }

    public void tampilKecepatanMS() {
    double kecepatanMS = kecepatan / 3.6;
    System.out.println("Kecepatan mobil dalam m/s adalah " + kecepatanMS);
    }

    public void display() {
        System.out.println("Mobil bermerk " + merk);
        System.out.println("bernomor polisi " + nopol);
        System.out.println("serta memiliki warna " + warna);
        System.out.println("bergerak dengan kecepatan " + kecepatan + " kpj");

        System.out.println("Mobil ini telah menempuh jarak " + jarakTempuh + " km");
    }
}
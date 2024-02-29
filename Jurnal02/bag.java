package Jurnal02;

public class bag {
    private String kode;
    private String jenis;
    private String Nama;
    private int stok;

    public bag(String kode, String jenis, String Nama, int stok) {
        this.kode = kode;
        this.jenis = jenis;
        this.Nama = Nama;
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public String getJenis() {
        return jenis;
    }

    public String getNama() {
        return Nama;
    }

    public int getStok() {
        return stok;
    }

    @Override
    public String toString() {
        return "bag [kode=" + kode + ", jenis=" + jenis + ", Nama=" + Nama + ", stok=" + stok + "]";
    }
}

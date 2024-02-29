package Jurnal02;
public class main {
    public static void main(String[] args) {
        generic<atk> daftarATK = new generic<>(5);
        generic<bag> daftarBag = new generic<>(5);
        daftarATK.addData(new atk("A007","Pulpen" , "Sarasa", 20));
        daftarATK.addData(new atk("A002","Pensil" , "FB", 30));
        daftarATK.addData(new atk("A005","Spidol" , "Snowman", 27));
        daftarATK.addData(new atk("B007","Buku Tulis" , "Sidu", 40));
        daftarATK.addData(new atk("B008","Kertas Origami" , "Bobo", 50));

        daftarBag.addData(new bag("C003", "Tas", "Eiger", 12));
        daftarBag.addData(new bag("C006", "Tas", "Louis Vitton", 7));
        daftarBag.addData(new bag("C004", "Tempat Pensil", "FB", 8));
        daftarBag.addData(new bag("C012", "Tempat Pensil", "Sidu", 5));
        daftarBag.addData(new bag("C008", "Tas", "Converse", 15));

        daftarATK.display();
        daftarBag.display();

        daftarATK.setData(2, new atk("A009","Spidol" , "Hitam", 27));
        bag hapus = new bag("C004", "Tempat Pensil", "FB", 8);
        daftarBag.removeData(2);

        daftarATK.display();
        daftarBag.display();
    }
}
package hashmapp;

import java.util.*;

public class Main {
   public static void main(String[] args) {
      HashMap<Mahasiswa, Integer> daftarMhs = new HashMap<>();
      Scanner s = new Scanner(System.in);
      while (true) {
         System.out.println("\n1. masukkan nilai\n2. hapus nilai\n3. tampilkan semua nilai\n4. keluar");
         int pilihan = s.nextInt();
         switch (pilihan) {
            case 1:
               System.out.println("Masukkan nilai");
               int nilai = s.nextInt();
               daftarMhs.put(new Mahasiswa(), nilai);
               break;
            case 2:
               System.out.println("Masukkan NIM/Nama");
               String pil2 = s.next();
               Iterator<Map.Entry<Mahasiswa, Integer>> iterator = daftarMhs.entrySet().iterator();
               while (iterator.hasNext()) {
                  Map.Entry<Mahasiswa, Integer> entry = iterator.next();
                  if (entry.getKey().getNama().equalsIgnoreCase(pil2) || entry.getKey().getNim().equalsIgnoreCase(pil2))
                     iterator.remove();
               }
               break;
            case 3:
               double ratarata = 0;
               for (Map.Entry<Mahasiswa, Integer> entry : daftarMhs.entrySet()) {
                  System.out.println(entry.getKey() + " - Nilai: " + entry.getValue());
                  ratarata += entry.getValue();
               }
               ratarata /= daftarMhs.size();
               System.out.println("Rata-rata nilai adalah : " + ratarata);
               break;
            case 4:
               s.close();
               System.exit(0);
            default:
               System.out.println("salah input");
               break;
         }
      }
   }
}

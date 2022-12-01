/*
method merupakan suatu blok kode yang akan dieksekusi atau berjalan saat dipanggil. cara kerjanya yaitu, ketika blok method
dibuat, blok method akan disimpan terlebih dahulu, jika method ingin dipanggil, blok method akan dieksekusi. untuk memanggilnya
ketik nama method dan ditambahkan tanda kurung().
 */

public class Method {
    public static void main(String[] args) {
        tampilHelloWorld(); // panggil method
        tampilHelloWorld();  // jika method dipanggil lagi maka blok method akan di jalankan lagi
    }

    /*
    untuk membuat method ketika static void namaMethod(){      -- penulian huruf di awal nama method harus huruf kecil.
        // blok program
      }
     */

    static void tampilHelloWorld(){  //method   --
        System.out.println("hello world");
    }
}

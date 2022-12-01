/*
for each merupakan kata kunci untuk mempersingkat saat kita ingin mengakses data array menggunakan perulangan. fungsi
for each hanya untuk mengakses seluruh data yang ada di dalam array.
 */

public class ForEach {
    public static void main(String[] args) {

        // mengakses array menggunakan perulangan tanpa for each

        String [] nama = {"nama","saya","abdur","rohman"};

        System.out.println("for biasa\n");
        for (int i=0 ;i<nama.length ;i++){  // perulangan dengan for biasa akan memasukkan data array secara satu persatu
            System.out.println(nama[i]);    // yang berarti kita msh bisa mengedit data yang perlu untuk ditampilkan di init statemet
        }


        System.out.println("\ndengan for each\n");
        for(String name: nama){             // perulangan dengan for each akan memasukkan semua data array secara satu persatu
            System.out.println(name);
        }
    }
}

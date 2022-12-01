public class SwitchStatement {
    public static void main(String[] args) {

        /* swicth statement adalah versi statement yang memungkinkan untuk membuat percabangan yang hanya memerlukan
           perbadingan ==, yang dimana program akan dijalankan jika variabel yang diberikan sesuai dengan syarat atau kondisi
            yang dibuat di switch statement.      */

        var nilai = "A";  // -- variabel nilai yang berisi data "A"

        switch(nilai){
            case "A":  // kondisi 1, dimana syarat yang diperlukan untuk menjalankan program di kondisi memuat data "A"
                System.out.println("Anda lulus dengan baik");
                break;
            case "B":  // kondisi 2, jika syarat dikondisi 1 tidak terpenuhi
            case "C":
                System.out.println("Nilai anda cukup baik");
                break;
            case "D":  // kondisi 3
                System.out.println("anda tidak lulus");
            default:  //  kondisi 4 atau terakhir, jika semua syarat/kondisi di atas tidak terpenuhi
                System.out.println("mungkin anda salah jurusan");
        }

        // switch lambda adalah versi singkat dari switch statement, swicth lambda ada di java versi 14

        switch (nilai){
            case "A" -> System.out.println("Anda lulus dengan baik");
            case "B", "c" -> System.out.println("Nilai anda cukup baik");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> System.out.println("Mungkin anda salah jurusan");
        }

        /* yield adalah suatu kata kunci yang berfungsi mengembalikan nilai variabel di switch statement
           yield berguna untuk mempersingkat penulisan variabel di swicth statement, contohnya disini kita akan mengubah
            data di dalam variabel string dengan tidak atau menggunakan kata kunci yield*/


        // tanpa yield
        String ucapan1;
        switch (nilai){
            case "A" -> ucapan1 ="Anda lulus dengan baik";
            case "B", "c" -> ucapan1 = "Nilai anda cukup baik";
            case "D" -> ucapan1 = "Anda tidak lulus";
            default -> ucapan1 = "Mungkin anda salah jurusan";
        }
        System.out.println(ucapan1);

        // tanpa yield
        String ucapan2 = switch (nilai){
            case "A" :
                yield "Anda lulus dengan baik";
            case "B", "c" :
                yield "Nilai anda cukup baik";
            case "D" :
                yield "Anda tidak lulus";
            default :
                yield  "Mungkin anda salah jurusan";
        };
        System.out.println(ucapan2);

    }
}

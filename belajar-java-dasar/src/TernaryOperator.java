public class TernaryOperator {
    public static void main(String[] args) {

        /* ternary operator adalah sebuah operator sederhana dari if else, cara kerjanya adalah jika ada sebuah kondisi
           bernilai true maka nilai pertama atau if nya di ambil, jika false maka nilai kedua atau else nya yang diambil
           ternary operator cocok digunakan untuk membuat if else statement yang hanya memuat 2 kondisi.
         */

        // kita akan mencoba mengubah variabel string di 2 kondisi
        var nilai = 70;

        // tanpa ternary operator
        String ucapan1;

        if (nilai >=75){
            ucapan1 ="selamat anda lulus";
        } else {
            ucapan1 ="anda tidak lulus, coba lagi";
        }
        System.out.println(ucapan1);



        // dengan ternary operator
                                    // nilai true atau if          nilai false atau else
        String ucapan2 =nilai <=75 ? "selamat anda lulus" : "anda tidak lulus, coba lagi";

        System.out.println(ucapan2);
    }
}

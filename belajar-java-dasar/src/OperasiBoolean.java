public class OperasiBoolean {
    public static void main(String[] args) {

        /* boolean hanya berisi true dan false berfungsi untuk operasi perbandingan

         AND (&&)                                 OR (||)                               kebalikan (!)
         true && true = true                      true || true = true                   !true = false
         true && false = false                    true || false = true                  !false = true
         false && true = false                    false || true = true
         false && false = false                   false || false = false                */

        int nilaiAbsen = 70;
        int nilaiUjian = 80;

        // membuat boolean
        boolean lulusAbsen = nilaiAbsen >=75;  // -- bersifat false karena nilai dari varibael nilaiAbsen kurang dari 75 ( tidak memenuhi syarat)
        boolean lulusUjian = nilaiUjian >=75;  // -- bersifat true karena nilai dari variabel NilaiUjian lebih dari 75 (memenuhi syarat)

        boolean lulus = lulusAbsen && lulusUjian;  // menggunakan AND    | false && true = false
        System.out.println(lulus);

        boolean lulus2 = lulusAbsen || lulusUjian; // menggunkana OR     | false || true = true
        System.out.println(lulus2);

    }
}

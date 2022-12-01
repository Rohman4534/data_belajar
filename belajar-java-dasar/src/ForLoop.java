/*
        for adalah salah satu kata kunci untuk perulangan dimana kta bisa print out atau mencetak ulang secara otomatis
        blok kode didalam for akan melakukan perulangan jika kondisi msh bernilai true, akan dihentikan jika bernilai false.

        for(init statement;kondisi;post statement{
        //block perulangan                               --  contoh: System.out.print
        }

        init statement dieksekusi sekali sebelum perulangan
        kodisi dieksekusi di setiap perulangan jika bernilai true maka proses akan diulangan sampai kondisi bernilai
        false atau kondisi sudah tidak memenuhi syarat
        block perulangan berisi sebuah program yang dijalankan contoh nya saat ini mecetak kalimat "saya" menggunakan
        System out print. kalimat "saya" akan terus dicetak sampai bernilai false
        post statement akan dieksekusi di setiap akhir perulangan

        alur eksekusi
        pada saat memulai perulangan pertama, init statement akan di eksekusi. lalu di cek kondisinya, jika bernilai true
        maka akan dieksekusi block perulangan nya. setelah selsai, post statement akan dieksekusi. setelah perulangan
        pertama maka perulangan selanjutnya akan dijalankan. kondisi akan dicek, jika true maka lanjut ke block perulangan
        ,jika false maka perulangan akan langsung berhenti disaat itu juga
         */

public class ForLoop {
    public static void main(String[] args) {

        /* perulangan  tanpa henti
        perulangan ini dapat terjadi kita jika tidak memasukan init statement, kondisi, dan juga post statement
        kondisi ini akan selalu dinilai true, sehingga perulangan akan dijalan terus tanpa henti
         */

        /*for (;;){                                         //-- program perulangan tanpa henti
            System.out.println("perulangan");
        }                                                //  ---- hapus komen untuk menjalan program ini dan komen
                                    */                        //       program lainnya agar program ini bisa terlihat

        /* perulangan dengan kondisi
        perulangan ini terjadi jika kita menambahkan kondisi . perulangan dapat berhenti jika kondisi yang dibuat
        bernilai false      */

        var counter = 1;     // -- init statement untuk menentukan perulangan dimulai

        for (; counter <= 10;){  // -- kondisi untuk menentukan perulangan dihentikan
            System.out.println("perulangan ke " + counter);
            counter++;  // -- post statement
        }

        // perulangan dengan init statement

      /*  for (var counter2=1 ;counter2<=10 ;){
            System.out.println("perulangan ke "+ counter2);
            counter2++;
        }     */

        //perulangan dengna post statement

       /* for (var counter3=1 ;counter3<=10 ;counter3++){
            System.out.println("perulangan ke" +counter3);
        }    */
    }
}

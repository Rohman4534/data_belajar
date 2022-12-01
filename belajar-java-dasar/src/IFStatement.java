public class IFStatement {
    public static void main(String[] args) {
        // if statement adalah salah satu dari percabangan, yaitu program akan dieksekusi jika telah memenuhi suatu syarat

        var nilai = 70;
        var absen = 90;

        if (nilai >=75 && absen >=75){  /* syarat yang perlu dipenuhi agar dapat print kalimat "selamat anda lulus"
                                        di if statement menyatakan bahwa nilai harus lebih dari 75 tidak boleh kurang */

            System.out.println("selamat anda lulus");  /* program tidak akan dieksekusi karena variabel tidak memenuhi syarat
                                                        yang dibuat di if statement, jika program ingin dieksekusi maka
                                                        perlu mengubah nilai variabel nya dari 70 menjadi 75  */

            /* else statement
            ada kondisi dimana jika kita ingin mengeksekusi program jika kondisi if tidak memenuhi syarat (false)
               gunakan else untuk mengeksekusi program lain jika syarat tidak memenuhi atau false       */

        }else {
            System.out.println("silahkan coba lagi tahun depan"); /* print kalimat "Silahkan coba lagi tahun depan jika
                                                                     memenuhi persyaratan,jika memenuhi program tidak akan
                                                                     dijalankan*/
        }

         /* else if statement
            ada kondisi dimana jika if statement pertama tidak terpenuhi maka kita bisa membuat if statement kedua
               gunakan statement else if untuk melakukannya    */

        if (nilai >= 90 && absen>=90){
            System.out.println("Nilai anda A");
        } else if (nilai >= 70 && absen>=70){
            System.out.println("Nilai anda B");
        } else if (nilai >= 60 && absen>=60){
            System.out.println("Nilai anda C");
        } else{                  // syarat terakhir jika tidak memenuhi semua syarat
            System.out.println("Nilai anda E");

            /*  program akan mencetak kalimat yang sudah memenuhi syarat, jika syarat pertama tidak memehuni maka
                akan lanjut ke syarat kedua jika semua syarat tidak memehuni maka akan langsung mencetak else

             */
        }
    }
}

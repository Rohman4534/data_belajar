/* recursive method
  recursive method merupakan kemampuan sebuah method yang dapat memanggil atau menjalankan methodnya sendiri. fungsi dari
  recursive method sendiri bisa kita pakai perulangan. ada beberapa kasus yang dapat dengan mudah diselesaikan dengan
  recursive method, salah satunya adalah factorial.
 */

public class MethodRecursive {
    public static void main(String[] args) {
        // looping
        System.out.println(factorialLoop(5));  // hasil dari 1*2*3*4*5 = 120

        // recursive method
        System.out.println(factorialRecursive(5));  // hasil dari 5*4*3*2*1 = 120

        // error StackOverrflow  // akan error jika stack sekitar 10.000
        //loop(10000);

    }

    // menggunakan perulangan
    static int factorialLoop (int value){  // cth value = 5
        var result = 1 ;

        for (int i=1 ; i <= value ;i++){
            result *= i;   // result akan di kalikan dengan value yang akan menaik di setiap perulangan nya dari 1 ke 2 ke 3 dst
                               // hasil dari perkalian tersebut akan di simpan di variabel result cth 1*1 akan disimpan
                               // dan di perulangan berikutnya 1 * 2  -- 1 merupakan hasil yang disimpan dari perkalian
                               // sebelumnya dan dua merupakan nilai value yang dinaikkan dengan perulangan.
        }
        return result;
    }
    // menggunakan recursive method

    static int factorialRecursive(int value){  //cth value = 5
        if(value==1){                     // 5 akan masuk ke if, jika tidak sesuai kondisi maka 5 akan di kalikan dengan method
                                          // recursive yaitu 5 yang dikurangi 1 = 4 , jadi 5 * (5-1=4) = 20. lalu 4 ini
            return 1;                     // akan di masukkan kembali ke method sebelumnya dari 5 menjadi 4 lalu di proses
                                          // if lagi, lalu akan dikalikan lagi dengan method recursive yang dikurangi lagi,
                                          // jadi 20 * (5-4=3) = 60. lalu 3 dimasukkan lagi ke method recursive sebelumnnya
                                          // dari 4 menjadi 3 proses berulang seterusnya sampai mencapai nilai 1 program akan
                                          // berhenti.
        }else {
         return value * factorialRecursive(value -1);
        }
    }
    /*
         recursive method juga memiliki kelemahan, yaitu jika value yang diisi di program banyak sekali bisa ribuan atau jutaan
         maka program tersebut akan mengalami eror StackOverflow. dimana ketika method yang dipanggil method akan ditumpuk
         yang berarti disimpan, sambil disimpan method yang di dipanggil akan di eksekusi sesuai urutan tumpukan yang berarti
         tumpukan paling bawah akan dieksekusi, saat eksekusi, antrian dari tumpukan method yang dipanggil akan sangat banyak
         sampai membludak dan akhirnya ram dari komputer tidak bisa menampung banyak antrian yang ada dan terjadilah
         error StackOverflow. jadi ketidaksesuaian antara antrian dan eksekusi membuatnya eror.
         */

    // tes membuat error StackOverflow
    /*static void loop(int value){
        if (value == 0){
            System.out.println("selesai");
        }else{
            System.out.println("loop" + value);
            loop(value -1);
        }
    }*/
}

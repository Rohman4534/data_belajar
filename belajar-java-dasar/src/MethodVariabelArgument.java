/* method variabel argument
 terkadang kita ingin mengirim data yang jumlahnya tidak pasti ke dalam sebuah method, untuk memecahkan masalah tersebut
 biasanya kita akan menggunakan array untuk diisikan di parameter array tersebut. tetapi cara tersebut kurang efektif
 . kita bisa menggunakan kata kunci method variabel argument untuk membuat kode kita lebih singkat dan kompleks. parameter
 di method variabel argumen hanya bisa di tempatkan di akhir posisi atau baris parameter.
 */

public class MethodVariabelArgument {
    public static void main(String[] args) {
        // menggunakan array
        int[] isidata = {75,90,98,100,30};
        sayCongrats("Abdur",isidata);  // dibutuhkan pendeklarasian variabel array isidata

        // menggunakan variabel argument
        sayCongrats2("Rohman", 75,90,98,100,30); // nilai akan langsung dinput tanpa mendeklarasikan terlebih dahulu

    }
    // method biasa yang menggunakan array
    static void sayCongrats (String nama, int[] isidata){  // array isidata untuk memproses data yang tidak terhitung jumlahnya
        int total = 0;

        for (var data : isidata){  //  koversi variabel isidata menjadi data
            total += data;   // 0 + isidata       -- agar jumlah nilai bisa ditotal melalui perulangan
        }

        int TotalNilai = total / isidata.length;

        if (TotalNilai >=75){
            System.out.println("Selamat "+ nama +" anda lulus");
        }else {
            System.out.println("Maaf "+ nama +" anda tidak lulus");
        }
    }

    // method yang menggunakan variabel argument
    static void sayCongrats2 (String nama, int... isidata){  // int ... merupakan variabel argument
        int total = 0;

        for (var data : isidata){  //  koversi variabel isidata menjadi data
            total += data;   // 0 + isidata       -- agar jumlah nilai bisa ditotal melalui perulangan
        }

        int TotalNilai = total / isidata.length;

        if (TotalNilai >=75){
            System.out.println("Selamat "+ nama +" anda lulus");
        }else {
            System.out.println("Maaf "+ nama +" anda tidak lulus");
        }
    }
}

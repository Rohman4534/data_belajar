/* method overloading
biasanya didalam method, nama method tidak boleh sama dengan method lainnya.method overloading adalah sebuah istilah
yang dapat membuat method yang sama namanya lebih dari satu. namun terdapat ketentuan di dalam method terrsebut. yaitu
jumlah parameter yang di buat tidak boleh sama dengan method yang lainnya. jika sama maka akan error.
 */

public class MethodOverloading {
    public static void main(String[] args) {

        // method tanpa parameter
        ucapan();

        // method 1 parameter
        ucapan("Rohman");

        // method 2 parameter
        ucapan("Rohman",2143003);
    }

    static void ucapan (){  // --- method ucapan tanpa parameter
        System.out.println("halo");
    }

    static void ucapan (String nama){   // --- method ucapan dengan 1 parameter
        System.out.println("halo " + nama);
    }

    static void ucapan (String nama, int nim){  // --- method ucapan dengan 2 parameter
        System.out.println("halo "+ nama +" "+ nim);
    }
}

/*
parameter berfungsi untuk memberikan informasi di dalam method.cara kerja parameter ini sama dengan variabel. cara nya
adalah dengan menambahkan informasi berupa variabel ke dalam tanda kurung () di dalam method. jika parameter lebih dari
satu bisa dipisah menggunakan tanda koma
 */

public class MethodParameter {
    public static void main(String[] args) {

        helloSay("Abdur rohman",2143003);  // method yang dipanggil harus disikan data atau value nya sesuai
                                                        // dengan parameter yang sesuai di methodnya
        helloSay("Abdur rohim", 2143003);
        
    }

    static void helloSay(String nama, int nim ){   // method dengan parameter String dan int
        System.out.println("hello " + nama + " nim " + nim);
    }
}

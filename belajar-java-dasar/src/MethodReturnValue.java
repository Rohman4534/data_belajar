/*
method return adalah sebuah method yang dapat mengembalikan nilai. maksudnya adalah return dapat membawa nilai dari
method class atau blok method menuju ke main class. nilai yang dibawa bisa apa aja asalkan msh sesuai dengan tipe data
yang ditentukan. data yang di kembalikan harus sama dengan tipe data yang ada di retun method.
 */

public class MethodReturnValue {
    public static void main(String[] args) {  // main class
        jumlah1(2,3);      // dengan void


        int f = jumlah2(2,3);   // dengan return
        System.out.println(f);       // proses mencetak hasil d+f


        System.out.println(hitung(100, "+", 200));   // dengan banyak return
    }

    static void jumlah1 (int a, int b){  // method tanpa return
        int c = a + b;                  // proses penjumlahan di lakukan di dalam blok method.
        System.out.println(c);          // proses mencetak hasil dari a+b akan di cetak di dalam blok method juga, karena
                                        // method void tidak bisa mengembalikan nilai. yang berarti nilai tersebut tidak
                                        // bisa dibawa / dikembalikan ke main class
    }
    static int jumlah2 (int d,int e) {  // method dengan return
        int f = d + e;                  // proses penjumlahan di lakukan di dalam blok method.
        return f;                       // proses mencetak hasil dari d+e bisa di cetak di dalam main class, karena method
    }                                   // return bisa mengembalikan nilai. yang berarti hasil dari d+e dibawa / dikembalikan
                                        // kedalam main class.
                                        // anda bisa mengganti f menjadi nilai apa aja yang penting masih bisa support dengan
                                        // tipe data int


    static int hitung (int value1, String operasi, int value2){
        switch (operasi){
            case "+" :                                      // contoh method dengan banyak return
                return value1 + value2;
            case "-" :
                return value1 - value2;
            default:
                return 0;
        }
    }
}

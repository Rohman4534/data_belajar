/* break adalah kata kunci untuk eksekusi program secara paksa. di perulangan, break akan menghentikan perulangan secara
paksa walaupun kondisi masih bernilai true.
 */

public class Break {
    public static void main(String[] args) {

        var counter =1;
        while(true){   // kondisi true membuat perulangan tanpa henti
            System.out.println("perulangan ke "+ counter);
            counter++;

           if (counter >10) {  // break membuat perulangan dihentikan paksa saat mencapai perulangan ke 10
             break;
           }
        }
    }
}

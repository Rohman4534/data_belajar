/* DoWhileLoop adalah salah satu perulangan yang mirip dengan WhileLoop, bedanya perulangan akan dilakukan terlebih dahulu
   setelah itu pengecekan kondisi. yang mana DoWhile akan melakukan maksimal 1 kali perulangan walaupun kondisi yang
   diberikan bernilai false.
 */

public class DoWhileLoop {
    public static void main(String[] args) {
        var counter = 20;   // -- init statement, ubah nilai dari 20 menjadi 1

        do {
            System.out.println("perulangan ke "+ counter);
            counter++;
        } while (counter<=10);  // -- kondisi
    }                           /* perulangan akan dilakukan sekali karena init statement yang diberikan tidak sesuai
                                   dengan kondisi.*/
}

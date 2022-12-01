/*
while loop adalah salah satu kata kunci dari perulangan. merupakan versi sederhana dari for loop. while loop cocok digunakan
untuk perulangan yang hanya memerlukan kondisi saja
 */

public class WhileLoop {
    public static void main(String[] args) {

        var counter =1;  // init statement

        while(counter<=10){  // kondisi
            System.out.println("perulangan ke " +counter);
            counter++;  // post statement
        }
    }
}

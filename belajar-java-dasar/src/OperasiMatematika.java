public class OperasiMatematika {
    public static void main(String[] args) {

        int a = 100;
        int b = 10;

        System.out.println(a + b);  // penjumlah
        System.out.println(a - b);  // pengurangan
        System.out.println(a * b);  // perkalian
        System.out.println(a / b);  // pembagian
        System.out.println(a % b);  // hasil bagi

        // augmented assignment adalah operasi bilangan akan melakukan operasi dengan jumlah nomor yang ditentukan
        // operasi matematika = a= a + 10 -- operasi mtk biasa | augmented assignment = a+=10 -- lebih sedernaha
        int c = 100;

        System.out.println(c+=10);  // 100 + 10 = 110
        System.out.println(c-=10);  // 110 - 10 = 100
        System.out.println(c*=10);  // 100 * 100 = 1000

        /* unary operator
        ++ -- berfungsi untuk menjumlahkan variabel dengan angka 1 secara berulang | ++= a=a + 1
        -- -- berfungsi untuk mengurangi varibel dengan angka 1 secara berulang | --= a=a - 1
        !  -- adalah kebalikan dari boolean | !true = false / !false= true
        -  -- membuat bilangan negatif
        +  -- membuat bilangan positif                          */

        int d =100;

        d++;  // 100+1 =101   -- angka 100 ditambah 1
        System.out.println(d);

        d--;  // 101-1 =100  -- angka 101 dikurang 1
        System.out.println(d);





    }
}

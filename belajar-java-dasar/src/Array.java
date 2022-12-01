import java.sql.SQLOutput;

public class Array {
    public static void main(String[] args) {

        // array
        String[] StringArray = new String[2];
        StringArray[0] = "Abdur";  // [0] -- adalah index
        StringArray[1] = "Rohman";

        // untuk mencetak data array ketik variabel dan nomor index nya dari data array tersebut
        System.out.println(StringArray[0]); // -- data array yang berisi "Abdur"
        System.out.println(StringArray[1]); // -- data array yang berisi "Rohman"

        // cara mengubah isi dari variabel array
        StringArray[1] = "Rohim";
        System.out.println(StringArray[1]);

        // penulisan sederhana array bisa seperti ini
        int[] arrayInt = new int[] {1,2,3,4};
        long [] arrayLong = {1L,2L,3L,4L};

        // namaArray.length berfungsi untuk menghitung jumlah data di dalam array
        System.out.println(arrayLong.length);  // jumlah data dari variabel arraylong berjumlah 4

        // membuat array di dalam array atau array 2 dimensi
                            //   index 0            index 1             index 2
        String[][] member ={ {"Abdur", "rohman"}, {"Abdur","Rohim"}, {"Abdur", "Rohmun"}, };

        // untuk mencetak data array ketik varibel dan index array dan index dari dalam array tersebut
        System.out.println(member[0][1]); // -- [0] adalah nomor index array 1, [1] adalah data array yang berisi "rohman"
        System.out.println(member[2][1]);







    }
}

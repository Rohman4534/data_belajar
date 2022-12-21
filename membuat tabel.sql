/* membuat tabel di mysql 
untuk membuat tabel kita perlu membuat database terlebih dahulu dan masuk kedalam database tersebut. 
*/

/* dalam membuat tabel kita perlu menambahkan kolom beserta tipe data nya.
disini kita akan membuat tabel dengan nama tabel1 didalamya terdapat 2 kolom yaitu, kolom 1 dengan 
tipe data int yang panjang 8 dan kolom2 dengan tipe data varchar yang panjangnya 20*/


CREATE TABLE tabel1(kolom1 int(8), kolom2 varchar(20));


/* untuk melihat daftar tabel yang kita buat gunakan perintah show. kita juga bisa melihat 
total kolom dan tipe data di tabel dengan perinth describe*/

SHOW TABLE tabel1;

DESCRIBE tabel1;


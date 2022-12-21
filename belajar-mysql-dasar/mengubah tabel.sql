/* mengubah tabel
kita bisa saja salah dalam membuat tabel. sehingga kita menghapus dan membuat ulang tabel tersebut.
kita bisa mengubah tabel yang terlajur kita buat. kita mengubah nama, jumlah kolom, jenis tipedata,
dan lain lain. gunakan perintah alter untuk melakukannya.
*/

/*
ADD COLUMN = menambah kolom
DROP COLUMN = menghapus kolom
RENAME COLUMN = merubah nama kolom
MODIFY COLUMN = memodifikasi tipe data kolom dan panjangnya
MODIFI COLUMN FIRST = mengubah posisi kolom ke posisi paling awal
MODIFY COLUMN AFTER nama_kolom = mengubah posisi kolom ke posisi setelah kolom yang dimasukkan.
*/

DESCRIBE tabel1;

ALTER TABLE tabel1 
        ADD COLUMN kolom3 TEXT,
        ADD COLUMN kolom4 CHAR(30),
        DROP COLUMN kolom4,
        RENAME COLUMN kolom3 TO kolom_baru,
        MODIFY kolom_baru DOUBLE (8,2);
        MODIFY kolom_baru FIRST;

DESCRIBE tabel1;
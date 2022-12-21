/* ketika mengambil data di sql. kita ingin mengambil salah satu baris data saja secara spesifik
. gunakan perintah where setelah perintah select. contoh disini kita akan mengambil sebuah data
di tabel 'contoh_table'. */

CREATE TABLE tabel_where
        (kolom1 varchar(4),kolom2 varchar(15), PRIMARY KEY(kolom1));

INSERT INTO tabel_where (kolom1, kolom2) VALUES
        ('D1','data1'),
        ('D2','data2'),
        ('D3','data3'),
        ('D4','data4'),
        ('D5','data5');

SELECT * FROM tabel_where WHERE kolom1='D1';
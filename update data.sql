/*untuk mengubah data pada tabel, gunakan perintah update. saat update kita perlu menambahkan
perintah where agar tujuan data yang ingin diubah bisa spesifik. perlu hati hati saat penggunaan
perintah update . jika salah menginput tujuan data nya maka memungkinkan data yang terubah bisa
ke semua tabel. untuk mengupdate data kita perlu menambahkan informasi kolom mana yang ingin diubah.

UPDATE nama_tabel 
    SET nama_kolom = 'data_yang_ingin_diubah'
    WHERE nama kolom_referensi/Primary Key = 'data_di kolom/primary';

contoh nya kita akan mengubah isi data di 'kolom2' */

CREATE TABLE tabel_update
        (kolom1 varchar(4),kolom2 varchar(15), PRIMARY KEY(kolom1));

INSERT INTO tabel_update (kolom1, kolom2) VALUES
        ('D1','data1'),
        ('D2','data2'),
        ('D3','data3'),
        ('D4','data4'),
        ('D5','data5');

SELECT * FROM tabel_update;

UPDATE tabel_update
    SET kolom2 = 'data6'
    WHERE kolom1 = 'D5'

SELECT * FROM tabel_update;
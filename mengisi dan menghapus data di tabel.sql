/* untuk melakukan data ke dalam tabel gunakan perintah insert. untuk pengisiannya dilakukan setiap 
1 kolom yang telah dimasukkan.

INSERT INTO nama_tabel (nama_kolom, nama_kolom) VALUES  
                ('data1 kolom1','data1 kolom2'),
                ('data2 kolom1','data2 kolom2'); 

contohnya kita akan mengisi data ke tabel 'contoh table'*/

CREATE TABLE contoh_table (kolom1 VARCHAR(15),kolom2 int(3));

INSERT INTO contoh_table (kolom1, kolom2)VALUES
        ('data1','1'),
        ('data2','2'),
        ('data3','3'),
        ('data4','4'),
        ('data5','5');

SELECT * FROM contoh_table;
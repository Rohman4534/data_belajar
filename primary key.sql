/* pada umumnya setiap tabel pasti ada primary key.primary key adalah identitas dari setiap 
data yang ada di dalam tabel. kolom dalam tabel ditunjuk dan dijadikan sebagai primary key. data 
primary key tidak boleh sama dengan data lainnya oleh karena itu primary key harus bersifat unik dan
tidak bisa di duplikat. primary key dibuat saat pembuatan sebuah tabel. jika tabel sudah dibuat
namun tidak memiliki primary gunakan perintah alter untuk mengubah kolomnya menjadi primary.

PRIMARY KEY (nama_kolom);

ALTER TABLE nama_tabel
        ADD PRIMARY KEY(nama_kolom);
*/

CREATE TABLE contoh_table 
        (kolom1 varchar(4),kolom2 varchar(15), PRIMARY KEY(kolom1));

INSERT INTO contoh_table (kolom1, kolom2) VALUES
        ('D1','data1'),
        ('D2','data2'),
        ('D3','data3'),
        ('D4','data4'),
        ('D5','data5');

ALTER TABLE contoh_table
        ADD PRIMARY KEY(kolom1);

DESCRIBE contoh_table;
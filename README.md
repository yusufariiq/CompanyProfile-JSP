# CompanyProfile-JSP

TUTORIAL MEMBUAT DATABASE SESUAI DENGAN SOURCE CODE JSP

1. Membuat database dengan nama `agenz`, caranya :
    CREATE DATABSE agenz;
-----------------------------------------------------

2. Membuat tabel dengan nama `admin`, caranya :
    CREATE TABLE `admin` (
      `email` varchar(50) DEFAULT NULL,
      `password` varchar(50) DEFAULT NULL
    );
    
    (TABEL ADMIN DIGUNAKAN UNTUK LOGIN KE ADMIN PAGES)
-----------------------------------------------------

3. Membuat tabel dengan nama `employee`, caranya :
    CREATE TABLE `employee` (
      `id` int(11) NOT NULL,
      `name` varchar(100) NOT NULL,
      `email` varchar(50) NOT NULL,
      `phone` varchar(18) NOT NULL,
      `department` varchar(50) NOT NULL,
      `address` varchar(100) NOT NULL
    );
    
    (TABEL ADMIN DIGUNAKAN UNTUK MENAMBAH DATA EMPLOYEE, MENAMPILKAN DATA EMPLOYEE, UPDATE DATA EMPLOYEE, DAN MENGHAPUS DATA EMPLOYEE)
-----------------------------------------------------

4. Membuat tabel dengan nama `contact`, caranya :
  CREATE TABLE `contact` (
    `name` varchar(50) DEFAULT NULL,
    `email` varchar(50) DEFAULT NULL,
    `message` text DEFAULT NULL
  );
  
  (TABEL ADMIN DIGUNAKAN UNTUK MENAMBAHKAN DATA KE CONTACT DAN AGAR MENAMPILKAN PESAN MASUK)

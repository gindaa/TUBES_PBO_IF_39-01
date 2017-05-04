-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 04 Mei 2017 pada 06.20
-- Versi Server: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpus`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `idBuku` int(11) NOT NULL,
  `namaBuku` varchar(20) DEFAULT NULL,
  `Halaman` int(11) DEFAULT NULL,
  `pengarang` varchar(20) DEFAULT NULL,
  `penerbit` varchar(20) DEFAULT NULL,
  `kategori` varchar(10) DEFAULT NULL,
  `genre` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`idBuku`, `namaBuku`, `Halaman`, `pengarang`, `penerbit`, `kategori`, `genre`) VALUES
(1912, 'How to Kill People', 25, 'Ginda', 'Rumah', 'Tutorial', 'Thriller'),
(1922, 'How to Kill People', 25, 'Ginda', 'Rumah', 'Tutorial', 'Thriller');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`idBuku`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

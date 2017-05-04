-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 04 Mei 2017 pada 06.18
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
-- Struktur dari tabel `Member`
--

CREATE TABLE `member` (
  `idMember` int(11) NOT NULL,
  `identitas` int(11) DEFAULT NULL,
  `noIdentitas` int(11) DEFAULT NULL,
  `mStatus` int(11) DEFAULT NULL,
  `namaMember` varchar(20) DEFAULT NULL,
  `noKtpMember` int(11) DEFAULT NULL,
  `noHpMember` int(11) DEFAULT NULL,
  `AlamatMember` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `Member`
--

INSERT INTO `Member` (`idMember`, `identitas`, `noIdentitas`, `mStatus`, `namaMember`, `noKtpMember`, `noHpMember`, `AlamatMember`) VALUES
(123, 442, 12, 2, 'Ginda', 213, 9238, 'Bandung');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Member`
--
ALTER TABLE `Member`
  ADD PRIMARY KEY (`idMember`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 14, 2015 at 05:51 PM
-- Server version: 5.5.24-log
-- PHP Version: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db1`
--

-- --------------------------------------------------------

--
-- Table structure for table `user_acc`
--

CREATE TABLE IF NOT EXISTS `user_acc` (
  `Acc_No` varchar(15) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `DOB` varchar(8) NOT NULL,
  `Mobile` int(10) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `District` varchar(15) NOT NULL,
  `State` varchar(15) NOT NULL,
  `Gender` varchar(100) NOT NULL,
  `Status` varchar(100) NOT NULL,
  `Mother_Name` varchar(20) NOT NULL,
  `Father_Name` varchar(20) NOT NULL,
  `Balance` int(15) NOT NULL,
  `Pic` varchar(100) NOT NULL,
  `Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_acc`
--

INSERT INTO `user_acc` (`Acc_No`, `Name`, `DOB`, `Mobile`, `Address`, `District`, `State`, `Gender`, `Status`, `Mother_Name`, `Father_Name`, `Balance`, `Pic`, `Date`) VALUES
('456', 'jazz', '1-10-0', 32, 'gvch', 'v', 'nv', 'Male', 'Married', 'vndfhgfhgfh', 'v', 52, '2.jpg', '2015-08-14'),
('454', 'Aashita', '1-10-0', 24, 'dg', 'fgd', 'gfd', 'Male', 'Unmarried', 'gdf', 'gfd', 42, '4.jpg', '2015-08-14'),
('44', 'aa', '1-10-0', 52, 'hgm', 'n', 'mn', 'Female', 'Unmarried', 'mn', 'b', 5, '4.jpg', '2015-08-14');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

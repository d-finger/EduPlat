-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 21, 2016 at 03:44 AM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `eduplat_dkkcorpdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_tab_eduplat_t1`
--

CREATE TABLE `admin_tab_eduplat_t1` (
  `Id` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `LastName` varchar(30) NOT NULL,
  `UserName` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `admin_tab_eduplat_t1`
--

INSERT INTO `admin_tab_eduplat_t1` (`Id`, `Name`, `LastName`, `UserName`, `Email`, `Password`) VALUES
(1, 'david', 'kapanga', 'davidkapanga', 'davidkapanga@gmail.com', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `student_tab_eduplat_t2`
--

CREATE TABLE `student_tab_eduplat_t2` (
  `Id` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `LastName` varchar(30) NOT NULL,
  `UserName` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `StudentId` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `teacher_tab_eduplat_t3`
--

CREATE TABLE `teacher_tab_eduplat_t3` (
  `Id` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `LastName` varchar(30) NOT NULL,
  `UserName` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `Cours` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_tab_eduplat_t1`
--
ALTER TABLE `admin_tab_eduplat_t1`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `Email` (`Email`),
  ADD UNIQUE KEY `UserName` (`UserName`);

--
-- Indexes for table `student_tab_eduplat_t2`
--
ALTER TABLE `student_tab_eduplat_t2`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `UserName` (`UserName`),
  ADD UNIQUE KEY `Email` (`Email`),
  ADD UNIQUE KEY `StudentId` (`StudentId`);

--
-- Indexes for table `teacher_tab_eduplat_t3`
--
ALTER TABLE `teacher_tab_eduplat_t3`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `UserName` (`UserName`),
  ADD UNIQUE KEY `Email` (`Email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin_tab_eduplat_t1`
--
ALTER TABLE `admin_tab_eduplat_t1`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `student_tab_eduplat_t2`
--
ALTER TABLE `student_tab_eduplat_t2`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `teacher_tab_eduplat_t3`
--
ALTER TABLE `teacher_tab_eduplat_t3`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

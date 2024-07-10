-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 28, 2023 at 10:35 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jdbcdemo`
--

-- --------------------------------------------------------

--
-- Table structure for table `movies`
--

CREATE TABLE `movies` (
  `movieName` varchar(40) NOT NULL,
  `director` varchar(40) NOT NULL,
  `actor` varchar(40) NOT NULL,
  `imdb` float NOT NULL,
  `poster` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `movies`
--

INSERT INTO `movies` (`movieName`, `director`, `actor`, `imdb`, `poster`) VALUES
(' The Matrix', '', '', 0, '');

-- --------------------------------------------------------

--
-- Table structure for table `moviesinfo`
--

CREATE TABLE `moviesinfo` (
  `movieName` varchar(40) NOT NULL,
  `director` varchar(40) NOT NULL,
  `actor` varchar(40) NOT NULL,
  `imdb` float NOT NULL,
  `poster` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `moviesinfo`
--

INSERT INTO `moviesinfo` (`movieName`, `director`, `actor`, `imdb`, `poster`) VALUES
('Agent', 'Surender Reddy', 'Akhil Akkineni', 4.1, 'src/movies/action/agent.jpg'),
('Asur', 'Gaurav Shukla', 'Barun Sobti, Riddhi Dogra', 8.5, 'Images/Series/Poster/Asur6.JPG'),
('Batman', 'Tim Burton', 'Danny Devito', 10, 'Images/Movies/Poster/batman.JPG'),
('Bholaa', 'Ajay Devgn', 'Ajay Devgn', 6, 'src/movies/action/bhola.jpg'),
('Black Bird', 'Dennis Lehane', 'Paul Walter', 8.9, 'Images/Series/Poster/BlackBird8.JPG'),
('Devo Ke Dev Mahadev', 'Nikhil Sinha', 'Mohit Raina', 10, 'Images/Series/Poster/Mahadev2.JPG'),
('Die Hard', 'John Mictearnan', 'Bruce Willis', 8.7, 'Images/Movies/Poster/die hard.JPG'),
('Gadar2', 'Anil Sharma, Sunny Deol', 'Sunny Deol, Utkarsh Sharma', 5.3, 'src/movies/action/gadar.jpg'),
('Games of Thrones', 'Mark Mylod', 'Kit Harington', 9.2, 'src/series/adventure/got.jpg'),
('IB71', 'Sankalp Reddy', 'Vidyut Jammwal', 7.2, 'src/movies/action/agent.jpg'),
('Legend Hanuman', 'Sharad DevaRajan', 'Shakri SIngh', 10, 'Images/Series/Poster/Hanuman4.JPG'),
('Mahabharat', 'B.R.Chopra', 'Saurabh Raj Jain,Shaheer Sheikh', 10, 'Images/Series/Poster/Mahabharat5.JPG'),
('Manifest', 'Jeff Rake', 'Josh Dallas', 8.9, 'Images/Series/Poster/Manifest7.JPG'),
('Michael', 'Wes Anderson', 'Jean Stapleton', 8.7, 'Images/Movies/Poster/michael.JPG'),
('Patthan', 'Siddharth Anand', 'Shah Rukh Khan', 5.9, 'src/movies/action/pathan.jpg'),
('Radha Krishn', 'Siddharth Kumar Tiwari', 'Sumedh Mudgalkar, Mallika Singh', 10, 'Images/Series/Poster/RadhaKrushn1.JPG'),
('Reptile', 'Grant Singer', 'Benicio Del Toro', 6.6, 'src/series/thriller/reptile.jpg'),
('Sherlock', 'Mark Gatiss', 'Martin Freeman', 8.7, 'Images/Series/Poster/SherLock9.JPG'),
('Siya Ke Ram', 'Aashiuesh Sharma', 'J. Kartik', 10, 'Images/Series/Poster/Ram3.JPG'),
('True Detective', 'Nic Pizzolatto', 'Vince Vaughn', 8.7, 'Images/Series/Poster/true_Detective10.JPG');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `moviesinfo`
--
ALTER TABLE `moviesinfo`
  ADD PRIMARY KEY (`movieName`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

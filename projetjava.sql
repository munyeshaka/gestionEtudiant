-- phpMyAdmin SQL Dump
-- version 3.4.10.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 14, 2020 at 09:47 PM
-- Server version: 5.5.20
-- PHP Version: 5.3.10

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `projetjava`
--

-- --------------------------------------------------------

--
-- Table structure for table `etudiant`
--

CREATE TABLE IF NOT EXISTS `etudiant` (
  `matricule` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(30) NOT NULL,
  `dateNaissance` date NOT NULL,
  `sexe` varchar(20) NOT NULL,
  `photoPassport` varchar(50) NOT NULL,
  `lieuNaissance` varchar(30) NOT NULL,
  `lieuResidence` varchar(50) NOT NULL,
  `anneeAcademique` varchar(18) NOT NULL,
  `faculte` varchar(50) NOT NULL,
  `pere` varchar(80) NOT NULL,
  `mere` varchar(80) NOT NULL,
  PRIMARY KEY (`matricule`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=43 ;

--
-- Dumping data for table `etudiant`
--

INSERT INTO `etudiant` (`matricule`, `nom`, `prenom`, `dateNaissance`, `sexe`, `photoPassport`, `lieuNaissance`, `lieuResidence`, `anneeAcademique`, `faculte`, `pere`, `mere`) VALUES
(1, 'INANYANGE', 'Leslie', '2000-01-02', 'Feminin', 'D:\\BUPQ0025.JPG', 'kigobe', 'kigobe', '2019-2020', 'BST', 'NIYIMPA Pierre', 'MUTONI Alix'),
(2, 'NIYONKURU', 'Ken', '2000-01-02', 'Masculin', 'C:\\Users\\aimab\\Documents\\Ken.jpg', 'Kayanza', 'Maine', '2019-2020', 'Medecine', 'MBONIHANKUYE Jean', 'KAZE Divine'),
(3, 'NIYOMUGISHA', 'Eunice', '1999-01-02', 'Feminin', 'C:\\Users\\aimab\\Documents\\Eunice.jpg', 'kigobe', 'kigobe', '2019-2020', 'BST', 'BUKURU Pierre Claver', 'GAHUNGU '),
(4, 'HABIMANA', 'Doris', '1996-01-14', 'Masculin', 'C:\\Users\\aimab\\Documents\\Doris.jpg', 'Mwenene', 'Gasenyi', '2019-2020', 'Medecine', 'NTUNZWENAYO Malakia', 'GAKOBWA Gorette'),
(5, 'DUSHIME', 'Divin', '2020-01-02', 'Masculin', 'C:\\Users\\aimab\\Documents\\Divin.jpg', 'Kinyami', 'Kinyami', '2018-2019', 'BST', 'MANIRAHO Pie', 'NIYERA Hana'),
(6, 'IRADUKUNDA', 'Pamella', '1999-01-21', 'Feminin', 'D:\\IMG_7702.JPG', 'Musaga', 'Kanyosha', '2019-2020', 'Economie', 'NSABIYUMVA Jean', 'NDAYISENGA Nadine'),
(7, 'IRAKOZE', 'Joshua', '2000-01-02', 'Masculin', 'C:\\Users\\aimab\\Documents\\jo.PNG', 'Sabunda', 'Ngagara', '2019-2020', 'Environnement', 'Ka', 'Med'),
(8, 'NINZIZA', 'Lievet', '2000-01-02', 'Masculin', 'D:\\IMG_7246.PNG', 'Kinyami', 'Kinyami', '2017-2018', 'Environnement', 'MANIRAHO Pie', 'NIYERA Hana'),
(14, 'MUGISHA', 'Divine', '1997-01-21', 'Feminin', 'C:\\Users\\aimab\\Documents\\div.jpg', 'Mwenene', 'Gabiro', '2019-2020', 'Droit', 'MINANI Lambert', 'NSENGIYUMVA Loraine'),
(27, 'Thierry', 'IRAKOZE', '1999-01-03', 'Masculin', 'D:\\IMG_7716.PNG', 'Gihosha', 'Gihosha', '1999-1888', 'BST', 'MANIRAKIZA Tabu', 'KEZA Jeanine'),
(29, 'ARAKAZA', 'Alain Briand', '2000-01-21', 'Masculin', 'C:\\Users\\aimab\\Documents\\Alain.jpg', 'Rubaho', 'Jabe', '2019-2020', 'BST', 'NKURUNZIZA Japhet', 'NIYOYANKUNZE Rose'),
(31, 'AKIZA', 'Vanessa', '1999-01-11', 'Feminin', 'C:\\Users\\aimab\\Documents\\AKIZA.jpg', 'Shikiro', 'Ngagara', '1999-1888', 'Medecine', 'HAKIZIMANA Emmanuel', 'KAZIRI Ninani'),
(38, 'NIBIZI', 'Chris', '1999-01-03', 'Masculin', 'C:\\Users\\aimab\\Documents\\Chris.jpg', 'Ngagara', 'Ngagara', '1999-1888', 'BST', 'CIZA Pascal', 'KEZA Ange'),
(39, 'Joe', 'Biden', '1960-06-03', 'Masculin', 'D:\\BUPQ0025.JPG', 'America', 'USA', '1983-1984', 'Medecine', 'NIYIBIZI Eric', 'NDAYIRAGIJE Maria'),
(40, 'MUNYESHAKA', 'aimable', '2020-01-05', 'Masculin', 'C:\\Users\\aimab\\Documents\\comp.png', 'Sabunda', 'Ngagara', '2019-2020', 'BST', 'Ka', 'Med'),
(41, 'SABIYUMVA', 'Vanessa', '1990-01-02', 'Feminin', 'C:\\Users\\aimab\\Documents\\va.png', 'Musaga', 'Musaga', '2019-2020', 'BST', 'CIZA Pascal', 'KEZA Ange'),
(42, 'CIZA', 'Pascal', '1990-01-11', 'Masculin', 'D:\\IMG_7246.PNG', 'Rweza', 'Rweza', '2018-2019', 'Environnement', 'NZISABIRA Jean', 'KAMARIZA Janviere');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

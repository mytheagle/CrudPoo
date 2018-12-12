-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 11-Dez-2018 às 22:29
-- Versão do servidor: 10.1.36-MariaDB
-- versão do PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `agenda`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastro`
--

CREATE TABLE `cadastro` (
  `cod` int(5) NOT NULL,
  `nome` varchar(15) NOT NULL,
  `sobrenome` varchar(30) NOT NULL,
  `tel` varchar(18) NOT NULL,
  `cpf` varchar(18) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `endr` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cadastro`
--

INSERT INTO `cadastro` (`cod`, `nome`, `sobrenome`, `tel`, `cpf`, `email`, `endr`) VALUES
(6, 'Teste', 'Teste', '888888888', NULL, 'email@teste.com', 'rua teste'),
(7, 'Joao', 'Pedro', '8888888888', NULL, 'joao@hotmail.com', 'Rua do joao'),
(11, 'ClientePF', 'teste', 'teste', NULL, 'teste', 'teste'),
(12, 'ClientePJ', 'teste', 'teste', NULL, 'teste', 'teste');

-- --------------------------------------------------------

--
-- Estrutura da tabela `queue`
--

CREATE TABLE `queue` (
  `data` date NOT NULL,
  `hora` varchar(11) NOT NULL,
  `descr` varchar(50) NOT NULL,
  `cli_id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `queue`
--

INSERT INTO `queue` (`data`, `hora`, `descr`, `cli_id`) VALUES
('2018-10-28', '16:00', 'Observações', 7),
('2018-10-28', '17:00', 'Observações', 6),
('2018-10-28', '18:00', 'Observações', 6),
('2018-10-28', '19:00', 'Observações', 6),
('2018-10-28', 'hora', 'Observações', 6),
('2018-10-29', '10:00', 'Observações', 7),
('2018-10-29', '11:00', 'Observações', 7),
('2018-10-29', '12:00', 'Observações', 6),
('2018-10-29', '13:00', 'Observações', 6),
('2018-11-04', '12:00', 'Vai ser demorado', 7),
('2018-12-04', '12:00', 'Observações', 7),
('2018-12-31', '22:00', 'Observações', 6),
('2018-12-31', '23:00', 'Observações', 6);

-- --------------------------------------------------------

--
-- Estrutura da tabela `users`
--

CREATE TABLE `users` (
  `login` varchar(30) NOT NULL,
  `pass` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `users`
--

INSERT INTO `users` (`login`, `pass`) VALUES
('admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cadastro`
--
ALTER TABLE `cadastro`
  ADD PRIMARY KEY (`cod`);

--
-- Indexes for table `queue`
--
ALTER TABLE `queue`
  ADD PRIMARY KEY (`data`,`hora`),
  ADD KEY `fk_queue` (`cli_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cadastro`
--
ALTER TABLE `cadastro`
  MODIFY `cod` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `queue`
--
ALTER TABLE `queue`
  ADD CONSTRAINT `fk_queue` FOREIGN KEY (`cli_id`) REFERENCES `cadastro` (`cod`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Tempo de geração: 13/11/2017 às 12:20
-- Versão do servidor: 10.1.26-MariaDB
-- Versão do PHP: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `ProjetoFarmacia`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `Cliente`
--

CREATE TABLE `Cliente` (
  `CPF` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `DataNasc` date NOT NULL,
  `RG` int(8) NOT NULL,
  `Telefone` varchar(30) NOT NULL,
  `Endereço` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura para tabela `Fornecedor`
--

CREATE TABLE `Fornecedor` (
`id` int(11) NOT NULL,
  `CNPJ` varchar(16) NOT NULL,
  `Email` varchar(70) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Telefone` varchar(30) NOT NULL,
  `Endereco` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura para tabela `Produto`
--

CREATE TABLE `Produto` (
  `Cod_Remedio` int(11) NOT NULL,
  `Validade` varchar(50) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Marca` varchar(40) NOT NULL,
  `Quantidade` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices de tabelas apagadas
--

--
-- Índices de tabela `Cliente`
--
ALTER TABLE `Cliente`
  ADD PRIMARY KEY (`CPF`);

--
-- Índices de tabela `Fornecedor`
--
ALTER TABLE `Fornecedor`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `Produto`
--
ALTER TABLE `Produto`
  ADD PRIMARY KEY (`Cod_Remedio`);

--
-- AUTO_INCREMENT de tabelas apagadas
--

--
-- AUTO_INCREMENT de tabela `Cliente`
--
ALTER TABLE `Cliente`
  MODIFY `CPF` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `Fornecedor`
--
ALTER TABLE `Fornecedor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `Produto`
--
ALTER TABLE `Produto`
  MODIFY `Cod_Remedio` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.2.2
-- https://www.phpmyadmin.net/
--
-- Host: mysql:3309
-- Tempo de geração: 23/05/2025 às 21:37
-- Versão do servidor: 8.0.41
-- Versão do PHP: 8.2.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `aluga_aqui`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `carros`
--

CREATE TABLE `carros` (
  `id_carros` int NOT NULL,
  `modelo_carros` varchar(255) DEFAULT NULL,
  `marca_carros` varchar(255) DEFAULT NULL,
  `placa_carros` varchar(255) DEFAULT NULL,
  `ano_carros` varchar(255) DEFAULT NULL,
  `cor_carros` varchar(255) DEFAULT NULL,
  `status_carros` varchar(255) DEFAULT NULL,
  `valor_carros` double NOT NULL,
  `imagens_carros` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Despejando dados para a tabela `carros`
--

INSERT INTO `carros` (`id_carros`, `modelo_carros`, `marca_carros`, `placa_carros`, `ano_carros`, `cor_carros`, `status_carros`, `valor_carros`, `imagens_carros`) VALUES
(1, 'Cheiron', 'Bugatti', 'sadad63', '2025', 'azul', 'Disponivel', 1500, 'https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/2023/02/221223090506-01-bugatti-chiron-profilee.jpg?w=1200&h=900&crop=1'),
(2, 'Skyline GT-R R34', 'Nissan', 'xpq9081', '2003', 'Azul', 'Disponivel', 400, 'https://s2-autoesporte.glbimg.com/se9camHJ7IJIVxStZO3VX22TTfc=/0x0:960x480/924x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_cf9d035bf26b4646b105bd958f32089d/internal_photos/bs/2023/V/d/IwKZ56TnmCEKtBkz4vgg/skyline-2.jpg'),
(3, 'Jetta GLI', 'volkswagen', 'ERIC-3625', '2025', 'Branco', 'Disponivel', 150, 'https://clickpetroleoegas.com.br/wp-content/uploads/2024/06/planetcars.jpg'),
(4, 'Civic TYPE R', 'Honda', 'ZG68512', '2025', 'Preto', 'Indisponível', 250, 'https://directimports.com.br/wp-content/uploads/2023/03/2-23.webp');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `carros`
--
ALTER TABLE `carros`
  ADD PRIMARY KEY (`id_carros`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `carros`
--
ALTER TABLE `carros`
  MODIFY `id_carros` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

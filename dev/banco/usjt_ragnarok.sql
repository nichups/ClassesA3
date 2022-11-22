-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: database:3306
-- Tempo de geração: 21-Nov-2022 às 20:44
-- Versão do servidor: 10.4.25-MariaDB-1:10.4.25+maria~focal
-- versão do PHP: 8.0.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `usjt_ragnarok`
--

CREATE DATABASE usjt_ragnarok;

USE usjt_ragnarok;

-- --------------------------------------------------------

--
-- Estrutura da tabela `Colaboradores`
--

CREATE TABLE `Colaboradores` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `fone` varchar(20) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `funcao` varchar(50) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `salario` decimal(9,2) NOT NULL,
  `senha` varchar(50) NOT NULL,
  `numHoras` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `Colaboradores`
--

INSERT INTO `Colaboradores` (`id`, `nome`, `email`, `fone`, `cpf`, `funcao`, `endereco`, `salario`, `senha`, `numHoras`) VALUES
(1, 'Victor Men', 'victinReiDelas@gmai.com', '40028922', '44856754811', 'garoto_de_programa', 'Av. das Catiorinha', '2.00', 'Teste', NULL),
(2, 'Teste', 'Teste', 'Teste', 'Teste', 'Teste', 'Teste', '2000.00', 'Teste', 8),
(3, 'Victor de Carvalho Araujo', 'victor@gmail.com', '11992500115', '75468951235', 'admin', 'Av um', '5000000.00', 'Teste@20', 8),
(4, 'Juninho Play', 'junin@outlook.com', '1140028922', '40028922', 'teste', 'Rua Funk do Yudi', '50000.00', 'Teste@22', 6),
(5, 'Beatriz Melo', 'bia@gmail.com', '11 992541235', '45445689541', 'gestor', 'rUA tESTE', '2000.00', '123', 6);

-- --------------------------------------------------------

--
-- Estrutura da tabela `ControleColaboradores`
--

CREATE TABLE `ControleColaboradores` (
  `id` int(11) NOT NULL,
  `equipes_id` int(11) NOT NULL,
  `colaboradores_id` int(11) NOT NULL,
  `funcao_colab` varchar(50) NOT NULL COMMENT 'Função do colaborador dentro da equipe relacionada'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `ControleColaboradores`
--

INSERT INTO `ControleColaboradores` (`id`, `equipes_id`, `colaboradores_id`, `funcao_colab`) VALUES
(1, 1, 1, 'função Teste');

-- --------------------------------------------------------

--
-- Estrutura da tabela `ControleTarefas`
--

CREATE TABLE `ControleTarefas` (
  `id` int(11) NOT NULL,
  `tarefas_id` int(11) NOT NULL,
  `colaboradores_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `ControleTarefas`
--

INSERT INTO `ControleTarefas` (`id`, `tarefas_id`, `colaboradores_id`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `Equipes`
--

CREATE TABLE `Equipes` (
  `id` int(11) NOT NULL,
  `cntrl_colabs_id` int(11) NOT NULL,
  `funcao` varchar(50) NOT NULL,
  `active` varchar(25) NOT NULL,
  `data_prazo` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `Equipes`
--

INSERT INTO `Equipes` (`id`, `cntrl_colabs_id`, `funcao`, `active`, `data_prazo`) VALUES
(1, 1, 'teste', 'active', '2022-11-30 10:31:11');

-- --------------------------------------------------------

--
-- Estrutura da tabela `Projetos`
--

CREATE TABLE `Projetos` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `equipes_id` int(11) NOT NULL,
  `descricao` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `Projetos`
--

INSERT INTO `Projetos` (`id`, `nome`, `equipes_id`, `descricao`) VALUES
(1, 'Teste', 1, 'Testando ...');

-- --------------------------------------------------------

--
-- Estrutura da tabela `Tarefas`
--

CREATE TABLE `Tarefas` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `tipo` varchar(20) NOT NULL COMMENT 'tarefa/ocorrencia',
  `prazo_de_entrega` datetime DEFAULT current_timestamp(),
  `projetos_id` int(11) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `criador` int(11) NOT NULL,
  `colaborador_responsavel` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `Tarefas`
--

INSERT INTO `Tarefas` (`id`, `nome`, `tipo`, `prazo_de_entrega`, `projetos_id`, `descricao`, `criador`, `colaborador_responsavel`) VALUES
(1, 'Teste', 'tarefa', '2022-11-09 20:58:32', 1, 'Tarefa para teste', 1, 2),
(2, 'Inserir no Banco', 'ocorrencia', '2022-08-03 10:30:00', 1, 'Essa é uma ocorrencia para inserção no banco', 1, 3),
(3, 'Nome teste', 'tarefa', '2022-10-20 00:00:00', 1, 'esse é um teste', 1, 3),
(4, 'Nome Criado', 'ocorrencia', '2022-05-25 00:00:00', 1, 'Teste ocorrencia teste', 1, 3);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `Colaboradores`
--
ALTER TABLE `Colaboradores`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `ControleColaboradores`
--
ALTER TABLE `ControleColaboradores`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_controlecolaboradores_colaboradores_id` (`colaboradores_id`),
  ADD KEY `fk_controlecolaboradores_equipes_id` (`equipes_id`);

--
-- Índices para tabela `ControleTarefas`
--
ALTER TABLE `ControleTarefas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_controletarefas_tarefas_id` (`tarefas_id`),
  ADD KEY `fk_controletarefas_colaboradores_id` (`colaboradores_id`);

--
-- Índices para tabela `Equipes`
--
ALTER TABLE `Equipes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_cntrl_colabs_id` (`cntrl_colabs_id`);

--
-- Índices para tabela `Projetos`
--
ALTER TABLE `Projetos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_projetos_equipes_id` (`equipes_id`);

--
-- Índices para tabela `Tarefas`
--
ALTER TABLE `Tarefas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_tarefas_projetos_id` (`projetos_id`),
  ADD KEY `fk_tarefas_colaboradores_id` (`colaborador_responsavel`),
  ADD KEY `fk_tarefas_criador_id` (`criador`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `Colaboradores`
--
ALTER TABLE `Colaboradores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `ControleColaboradores`
--
ALTER TABLE `ControleColaboradores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `ControleTarefas`
--
ALTER TABLE `ControleTarefas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `Equipes`
--
ALTER TABLE `Equipes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `Projetos`
--
ALTER TABLE `Projetos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `Tarefas`
--
ALTER TABLE `Tarefas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `ControleColaboradores`
--
ALTER TABLE `ControleColaboradores`
  ADD CONSTRAINT `fk_controlecolaboradores_colaboradores_id` FOREIGN KEY (`colaboradores_id`) REFERENCES `Colaboradores` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_controlecolaboradores_equipes_id` FOREIGN KEY (`equipes_id`) REFERENCES `Equipes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `ControleTarefas`
--
ALTER TABLE `ControleTarefas`
  ADD CONSTRAINT `fk_controletarefas_colaboradores_id` FOREIGN KEY (`colaboradores_id`) REFERENCES `Colaboradores` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_controletarefas_tarefas_id` FOREIGN KEY (`tarefas_id`) REFERENCES `Tarefas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `Equipes`
--
ALTER TABLE `Equipes`
  ADD CONSTRAINT `fk_cntrl_colabs_id` FOREIGN KEY (`cntrl_colabs_id`) REFERENCES `ControleColaboradores` (`id`);

--
-- Limitadores para a tabela `Projetos`
--
ALTER TABLE `Projetos`
  ADD CONSTRAINT `fk_projetos_equipes_id` FOREIGN KEY (`equipes_id`) REFERENCES `Equipes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `Tarefas`
--
ALTER TABLE `Tarefas`
  ADD CONSTRAINT `fk_tarefas_colaboradores_id` FOREIGN KEY (`colaborador_responsavel`) REFERENCES `Colaboradores` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tarefas_criador_id` FOREIGN KEY (`criador`) REFERENCES `Colaboradores` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tarefas_projetos_id` FOREIGN KEY (`projetos_id`) REFERENCES `Projetos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

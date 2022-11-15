--
-- Banco de dados: `Ragnarok`
--

CREATE DATABASE Ragnarok;

USE Ragnarok;

-- --------------------------------------------------------

--
-- Estrutura da tabela `Colaboradores`
--

CREATE TABLE Colaboradores 
(
  id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  nome VARCHAR(100) NOT NULL,
  email VARCHAR(50) NOT NULL,
  fone VARCHAR(20) NOT NULL,
  cpf VARCHAR(11) NOT NULL,
  funcao VARCHAR(50) NOT NULL,
  endereco VARCHAR(50) NOT NULL,
  salario DECIMAL(9,2) NOT NULL,
  senha VARCHAR(50) NOT NULL,
  numHoras DATETIME DEFAULT CURRENT_TIMESTAMP
);

--
-- Inserindo dados da tabela `Colaboradores`
--

INSERT INTO Colaboradores (nome, email, fone, cpf, funcao, endereco, salario, numHoras)
  VALUES ('Victor Men', 'victinReiDelas@gmai.com', '40028922', '44856754811', 'garoto_de_programa', 'Av. das Catiorinha', '2.00', '2022-09-05');

-- --------------------------------------------------------

--
-- Estrutura da tabela `ControleColaboradores`
--

CREATE TABLE ControleColaboradores (
  id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  equipes_id int(11) NOT NULL,
  colaboradores_id int(11) NOT NULL,
  funcao_colab varchar(50) NOT NULL COMMENT 'Função do colaborador dentro da equipe relacionada'
);

--
-- Inserindo dados da tabela `ControleColaboradores`
--

INSERT INTO ControleColaboradores (equipes_id, colaboradores_id, funcao_colab)
  VALUES (1, 1, 'função Teste');

-- --------------------------------------------------------

--
-- Estrutura da tabela `ControleTarefas`
--

CREATE TABLE ControleTarefas (
  id int(11) PRIMARY KEY AUTO_INCREMENT NOT NULL,
  tarefas_id int(11) NOT NULL,
  colaboradores_id int(11) NOT NULL
);

--
-- Inserindo dados da tabela `ControleTarefas`
--

INSERT INTO ControleTarefas (tarefas_id, colaboradores_id)
  VALUES (1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `Equipes`
--

CREATE TABLE Equipes (
  id int(11) PRIMARY KEY AUTO_INCREMENT NOT NULL,
  cntrl_colabs_id int(11) NOT NULL,
  funcao varchar(50) NOT NULL,
  active varchar(25) NOT NULL
);

--
-- Inserindo dados da tabela `Equipes`
--

INSERT INTO Equipes (cntrl_colabs_id, funcao, active)
  VALUES (1, 'teste', 'active');
  
-- --------------------------------------------------------

--
-- Estrutura da tabela `Projetos`
--

CREATE TABLE Projetos (
  id int(11) PRIMARY KEY AUTO_INCREMENT NOT NULL,
  nome varchar(50) NOT NULL,
  equipes_id int(11) NOT NULL,
  descricao varchar(255) NOT NULL
);

--
-- Inserindo dados da tabela `Projetos`
--

INSERT INTO Projetos (nome, equipes_id, descricao)
  VALUES ('Teste', 1, 'Testando ...');
  
-- --------------------------------------------------------

--
-- Estrutura da tabela `Tarefas`
--

CREATE TABLE Tarefas (
  id int(11) PRIMARY KEY AUTO_INCREMENT NOT NULL,
  nome varchar(50) NOT NULL,
  prazo_de_entrega DATETIME DEFAULT CURRENT_TIMESTAMP,
  projetos_id int(11) NOT NULL,
  descricao varchar(255) NOT NULL
);

--
-- Inserindo dados da tabela `Tarefas`
--

INSERT INTO Tarefas (nome, prazo_de_entrega, projetos_id, descricao)
  VALUES ('Teste', '2022-11-09 20:58:32', 1, 'Tarefa para teste');

-- --------------------------------------------------------
  
--
-- Limitadores para a tabela `ControleColaboradores`
--
ALTER TABLE ControleColaboradores
  ADD CONSTRAINT fk_controlecolaboradores_colaboradores_id FOREIGN KEY (colaboradores_id) REFERENCES Colaboradores(id) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT fk_controlecolaboradores_equipes_id FOREIGN KEY (equipes_id) REFERENCES Equipes(id) ON DELETE NO ACTION ON UPDATE NO ACTION;


--
-- Limitadores para a tabela `ControleTarefas`
--

ALTER TABLE ControleTarefas 
  ADD CONSTRAINT fk_controletarefas_tarefas_id FOREIGN KEY (tarefas_id) REFERENCES Tarefas(id) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT fk_controletarefas_colaboradores_id FOREIGN KEY (colaboradores_id) REFERENCES Colaboradores(id) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `Equipes`
--
ALTER TABLE Equipes
  ADD CONSTRAINT fk_cntrl_colabs_id FOREIGN KEY (cntrl_colabs_id) REFERENCES ControleColaboradores (id);

--
-- Limitadores para a tabela `Projetos`
--

ALTER TABLE Projetos
  ADD CONSTRAINT fk_projetos_equipes_id FOREIGN KEY (equipes_id) REFERENCES Equipes(id) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `Tarefas`
--
ALTER TABLE Tarefas
  ADD CONSTRAINT fk_tarefas_projetos_id FOREIGN KEY (projetos_id) REFERENCES Projetos (id) ON DELETE NO ACTION ON UPDATE NO ACTION;

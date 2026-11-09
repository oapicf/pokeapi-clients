--
-- PokéAPI.
-- Prepared SQL queries for 'EvolutionVariableDetail' definition.
--


--
-- SELECT template for table `EvolutionVariableDetail`
--
SELECT `id`, `name`, `symbol`, `data_type`, `source`, `version_group`, `names`, `descriptions` FROM `EvolutionVariableDetail` WHERE 1;

--
-- INSERT template for table `EvolutionVariableDetail`
--
INSERT INTO `EvolutionVariableDetail`(`id`, `name`, `symbol`, `data_type`, `source`, `version_group`, `names`, `descriptions`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `EvolutionVariableDetail`
--
UPDATE `EvolutionVariableDetail` SET `id` = ?, `name` = ?, `symbol` = ?, `data_type` = ?, `source` = ?, `version_group` = ?, `names` = ?, `descriptions` = ? WHERE 1;

--
-- DELETE template for table `EvolutionVariableDetail`
--
DELETE FROM `EvolutionVariableDetail` WHERE 0;


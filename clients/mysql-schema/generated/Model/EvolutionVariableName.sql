--
-- PokéAPI.
-- Prepared SQL queries for 'EvolutionVariableName' definition.
--


--
-- SELECT template for table `EvolutionVariableName`
--
SELECT `name`, `language` FROM `EvolutionVariableName` WHERE 1;

--
-- INSERT template for table `EvolutionVariableName`
--
INSERT INTO `EvolutionVariableName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `EvolutionVariableName`
--
UPDATE `EvolutionVariableName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `EvolutionVariableName`
--
DELETE FROM `EvolutionVariableName` WHERE 0;


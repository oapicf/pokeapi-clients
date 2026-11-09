--
-- PokéAPI.
-- Prepared SQL queries for 'EvolutionVariableDescription' definition.
--


--
-- SELECT template for table `EvolutionVariableDescription`
--
SELECT `description`, `language` FROM `EvolutionVariableDescription` WHERE 1;

--
-- INSERT template for table `EvolutionVariableDescription`
--
INSERT INTO `EvolutionVariableDescription`(`description`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `EvolutionVariableDescription`
--
UPDATE `EvolutionVariableDescription` SET `description` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `EvolutionVariableDescription`
--
DELETE FROM `EvolutionVariableDescription` WHERE 0;


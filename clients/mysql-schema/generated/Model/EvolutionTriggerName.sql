--
-- PokéAPI.
-- Prepared SQL queries for 'EvolutionTriggerName' definition.
--


--
-- SELECT template for table `EvolutionTriggerName`
--
SELECT `name`, `language` FROM `EvolutionTriggerName` WHERE 1;

--
-- INSERT template for table `EvolutionTriggerName`
--
INSERT INTO `EvolutionTriggerName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `EvolutionTriggerName`
--
UPDATE `EvolutionTriggerName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `EvolutionTriggerName`
--
DELETE FROM `EvolutionTriggerName` WHERE 0;


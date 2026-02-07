--
-- PokéAPI.
-- Prepared SQL queries for 'EvolutionTriggerSummary' definition.
--


--
-- SELECT template for table `EvolutionTriggerSummary`
--
SELECT `name`, `url` FROM `EvolutionTriggerSummary` WHERE 1;

--
-- INSERT template for table `EvolutionTriggerSummary`
--
INSERT INTO `EvolutionTriggerSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `EvolutionTriggerSummary`
--
UPDATE `EvolutionTriggerSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `EvolutionTriggerSummary`
--
DELETE FROM `EvolutionTriggerSummary` WHERE 0;


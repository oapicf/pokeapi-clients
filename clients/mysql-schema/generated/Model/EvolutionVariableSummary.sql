--
-- PokéAPI.
-- Prepared SQL queries for 'EvolutionVariableSummary' definition.
--


--
-- SELECT template for table `EvolutionVariableSummary`
--
SELECT `name`, `url` FROM `EvolutionVariableSummary` WHERE 1;

--
-- INSERT template for table `EvolutionVariableSummary`
--
INSERT INTO `EvolutionVariableSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `EvolutionVariableSummary`
--
UPDATE `EvolutionVariableSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `EvolutionVariableSummary`
--
DELETE FROM `EvolutionVariableSummary` WHERE 0;


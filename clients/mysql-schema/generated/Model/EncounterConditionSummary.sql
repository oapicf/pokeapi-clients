--
-- PokéAPI.
-- Prepared SQL queries for 'EncounterConditionSummary' definition.
--


--
-- SELECT template for table `EncounterConditionSummary`
--
SELECT `name`, `url` FROM `EncounterConditionSummary` WHERE 1;

--
-- INSERT template for table `EncounterConditionSummary`
--
INSERT INTO `EncounterConditionSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `EncounterConditionSummary`
--
UPDATE `EncounterConditionSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `EncounterConditionSummary`
--
DELETE FROM `EncounterConditionSummary` WHERE 0;


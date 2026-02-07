--
-- PokéAPI.
-- Prepared SQL queries for 'EncounterConditionValueSummary' definition.
--


--
-- SELECT template for table `EncounterConditionValueSummary`
--
SELECT `name`, `url` FROM `EncounterConditionValueSummary` WHERE 1;

--
-- INSERT template for table `EncounterConditionValueSummary`
--
INSERT INTO `EncounterConditionValueSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `EncounterConditionValueSummary`
--
UPDATE `EncounterConditionValueSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `EncounterConditionValueSummary`
--
DELETE FROM `EncounterConditionValueSummary` WHERE 0;


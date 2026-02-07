--
-- PokéAPI.
-- Prepared SQL queries for 'EncounterConditionValueName' definition.
--


--
-- SELECT template for table `EncounterConditionValueName`
--
SELECT `name`, `language` FROM `EncounterConditionValueName` WHERE 1;

--
-- INSERT template for table `EncounterConditionValueName`
--
INSERT INTO `EncounterConditionValueName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `EncounterConditionValueName`
--
UPDATE `EncounterConditionValueName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `EncounterConditionValueName`
--
DELETE FROM `EncounterConditionValueName` WHERE 0;


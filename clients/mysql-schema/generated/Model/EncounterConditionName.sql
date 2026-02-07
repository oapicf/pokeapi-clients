--
-- PokéAPI.
-- Prepared SQL queries for 'EncounterConditionName' definition.
--


--
-- SELECT template for table `EncounterConditionName`
--
SELECT `name`, `language` FROM `EncounterConditionName` WHERE 1;

--
-- INSERT template for table `EncounterConditionName`
--
INSERT INTO `EncounterConditionName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `EncounterConditionName`
--
UPDATE `EncounterConditionName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `EncounterConditionName`
--
DELETE FROM `EncounterConditionName` WHERE 0;


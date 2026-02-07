--
-- PokéAPI.
-- Prepared SQL queries for 'EncounterMethodName' definition.
--


--
-- SELECT template for table `EncounterMethodName`
--
SELECT `name`, `language` FROM `EncounterMethodName` WHERE 1;

--
-- INSERT template for table `EncounterMethodName`
--
INSERT INTO `EncounterMethodName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `EncounterMethodName`
--
UPDATE `EncounterMethodName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `EncounterMethodName`
--
DELETE FROM `EncounterMethodName` WHERE 0;


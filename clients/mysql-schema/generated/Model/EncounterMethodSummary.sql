--
-- PokéAPI.
-- Prepared SQL queries for 'EncounterMethodSummary' definition.
--


--
-- SELECT template for table `EncounterMethodSummary`
--
SELECT `name`, `url` FROM `EncounterMethodSummary` WHERE 1;

--
-- INSERT template for table `EncounterMethodSummary`
--
INSERT INTO `EncounterMethodSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `EncounterMethodSummary`
--
UPDATE `EncounterMethodSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `EncounterMethodSummary`
--
DELETE FROM `EncounterMethodSummary` WHERE 0;


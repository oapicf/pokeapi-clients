--
-- PokéAPI.
-- Prepared SQL queries for 'LocationAreaEncounterRate' definition.
--


--
-- SELECT template for table `LocationAreaEncounterRate`
--
SELECT `encounter_method`, `version_details` FROM `LocationAreaEncounterRate` WHERE 1;

--
-- INSERT template for table `LocationAreaEncounterRate`
--
INSERT INTO `LocationAreaEncounterRate`(`encounter_method`, `version_details`) VALUES (?, ?);

--
-- UPDATE template for table `LocationAreaEncounterRate`
--
UPDATE `LocationAreaEncounterRate` SET `encounter_method` = ?, `version_details` = ? WHERE 1;

--
-- DELETE template for table `LocationAreaEncounterRate`
--
DELETE FROM `LocationAreaEncounterRate` WHERE 0;


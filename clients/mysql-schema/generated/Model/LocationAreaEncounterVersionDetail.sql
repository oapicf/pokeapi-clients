--
-- PokéAPI.
-- Prepared SQL queries for 'LocationAreaEncounterVersionDetail' definition.
--


--
-- SELECT template for table `LocationAreaEncounterVersionDetail`
--
SELECT `rate`, `version` FROM `LocationAreaEncounterVersionDetail` WHERE 1;

--
-- INSERT template for table `LocationAreaEncounterVersionDetail`
--
INSERT INTO `LocationAreaEncounterVersionDetail`(`rate`, `version`) VALUES (?, ?);

--
-- UPDATE template for table `LocationAreaEncounterVersionDetail`
--
UPDATE `LocationAreaEncounterVersionDetail` SET `rate` = ?, `version` = ? WHERE 1;

--
-- DELETE template for table `LocationAreaEncounterVersionDetail`
--
DELETE FROM `LocationAreaEncounterVersionDetail` WHERE 0;


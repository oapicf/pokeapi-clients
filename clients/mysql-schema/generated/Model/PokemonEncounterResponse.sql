--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonEncounterResponse' definition.
--


--
-- SELECT template for table `PokemonEncounterResponse`
--
SELECT `location_area`, `version_details` FROM `PokemonEncounterResponse` WHERE 1;

--
-- INSERT template for table `PokemonEncounterResponse`
--
INSERT INTO `PokemonEncounterResponse`(`location_area`, `version_details`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonEncounterResponse`
--
UPDATE `PokemonEncounterResponse` SET `location_area` = ?, `version_details` = ? WHERE 1;

--
-- DELETE template for table `PokemonEncounterResponse`
--
DELETE FROM `PokemonEncounterResponse` WHERE 0;


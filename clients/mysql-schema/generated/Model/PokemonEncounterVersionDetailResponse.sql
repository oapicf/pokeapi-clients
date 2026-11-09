--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonEncounterVersionDetailResponse' definition.
--


--
-- SELECT template for table `PokemonEncounterVersionDetailResponse`
--
SELECT `version`, `max_chance`, `encounter_details` FROM `PokemonEncounterVersionDetailResponse` WHERE 1;

--
-- INSERT template for table `PokemonEncounterVersionDetailResponse`
--
INSERT INTO `PokemonEncounterVersionDetailResponse`(`version`, `max_chance`, `encounter_details`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PokemonEncounterVersionDetailResponse`
--
UPDATE `PokemonEncounterVersionDetailResponse` SET `version` = ?, `max_chance` = ?, `encounter_details` = ? WHERE 1;

--
-- DELETE template for table `PokemonEncounterVersionDetailResponse`
--
DELETE FROM `PokemonEncounterVersionDetailResponse` WHERE 0;


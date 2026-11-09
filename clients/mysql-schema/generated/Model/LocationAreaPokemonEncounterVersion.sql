--
-- PokéAPI.
-- Prepared SQL queries for 'LocationAreaPokemonEncounterVersion' definition.
--


--
-- SELECT template for table `LocationAreaPokemonEncounterVersion`
--
SELECT `version`, `max_chance`, `encounter_details` FROM `LocationAreaPokemonEncounterVersion` WHERE 1;

--
-- INSERT template for table `LocationAreaPokemonEncounterVersion`
--
INSERT INTO `LocationAreaPokemonEncounterVersion`(`version`, `max_chance`, `encounter_details`) VALUES (?, ?, ?);

--
-- UPDATE template for table `LocationAreaPokemonEncounterVersion`
--
UPDATE `LocationAreaPokemonEncounterVersion` SET `version` = ?, `max_chance` = ?, `encounter_details` = ? WHERE 1;

--
-- DELETE template for table `LocationAreaPokemonEncounterVersion`
--
DELETE FROM `LocationAreaPokemonEncounterVersion` WHERE 0;


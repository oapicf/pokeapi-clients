--
-- PokéAPI.
-- Prepared SQL queries for 'LocationAreaDetail_pokemon_encounters_inner_version_details_inner' definition.
--


--
-- SELECT template for table `LocationAreaDetail_pokemon_encounters_inner_version_details_inne`
--
SELECT `version`, `max_chance`, `encounter_details` FROM `LocationAreaDetail_pokemon_encounters_inner_version_details_inne` WHERE 1;

--
-- INSERT template for table `LocationAreaDetail_pokemon_encounters_inner_version_details_inne`
--
INSERT INTO `LocationAreaDetail_pokemon_encounters_inner_version_details_inne`(`version`, `max_chance`, `encounter_details`) VALUES (?, ?, ?);

--
-- UPDATE template for table `LocationAreaDetail_pokemon_encounters_inner_version_details_inne`
--
UPDATE `LocationAreaDetail_pokemon_encounters_inner_version_details_inne` SET `version` = ?, `max_chance` = ?, `encounter_details` = ? WHERE 1;

--
-- DELETE template for table `LocationAreaDetail_pokemon_encounters_inner_version_details_inne`
--
DELETE FROM `LocationAreaDetail_pokemon_encounters_inner_version_details_inne` WHERE 0;


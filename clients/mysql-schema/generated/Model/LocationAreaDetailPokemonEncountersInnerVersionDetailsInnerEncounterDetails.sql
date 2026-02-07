--
-- PokéAPI.
-- Prepared SQL queries for 'LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details' definition.
--


--
-- SELECT template for table `LocationAreaDetail_pokemon_encounters_inner_version_details_inne`
--
SELECT `min_level`, `max_level`, `condition_values`, `chance`, `method` FROM `LocationAreaDetail_pokemon_encounters_inner_version_details_inne` WHERE 1;

--
-- INSERT template for table `LocationAreaDetail_pokemon_encounters_inner_version_details_inne`
--
INSERT INTO `LocationAreaDetail_pokemon_encounters_inner_version_details_inne`(`min_level`, `max_level`, `condition_values`, `chance`, `method`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `LocationAreaDetail_pokemon_encounters_inner_version_details_inne`
--
UPDATE `LocationAreaDetail_pokemon_encounters_inner_version_details_inne` SET `min_level` = ?, `max_level` = ?, `condition_values` = ?, `chance` = ?, `method` = ? WHERE 1;

--
-- DELETE template for table `LocationAreaDetail_pokemon_encounters_inner_version_details_inne`
--
DELETE FROM `LocationAreaDetail_pokemon_encounters_inner_version_details_inne` WHERE 0;


--
-- PokéAPI.
-- Prepared SQL queries for 'pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner' definition.
--


--
-- SELECT template for table `pokemon_encounters_retrieve_200_response_inner_version_details_i`
--
SELECT `chance`, `condition_values`, `max_level`, `method`, `min_level` FROM `pokemon_encounters_retrieve_200_response_inner_version_details_i` WHERE 1;

--
-- INSERT template for table `pokemon_encounters_retrieve_200_response_inner_version_details_i`
--
INSERT INTO `pokemon_encounters_retrieve_200_response_inner_version_details_i`(`chance`, `condition_values`, `max_level`, `method`, `min_level`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `pokemon_encounters_retrieve_200_response_inner_version_details_i`
--
UPDATE `pokemon_encounters_retrieve_200_response_inner_version_details_i` SET `chance` = ?, `condition_values` = ?, `max_level` = ?, `method` = ?, `min_level` = ? WHERE 1;

--
-- DELETE template for table `pokemon_encounters_retrieve_200_response_inner_version_details_i`
--
DELETE FROM `pokemon_encounters_retrieve_200_response_inner_version_details_i` WHERE 0;


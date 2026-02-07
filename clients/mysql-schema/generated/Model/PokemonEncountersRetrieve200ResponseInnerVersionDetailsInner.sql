--
-- PokéAPI.
-- Prepared SQL queries for 'pokemon_encounters_retrieve_200_response_inner_version_details_inner' definition.
--


--
-- SELECT template for table `pokemon_encounters_retrieve_200_response_inner_version_details_i`
--
SELECT `encounter_details`, `max_chance`, `version` FROM `pokemon_encounters_retrieve_200_response_inner_version_details_i` WHERE 1;

--
-- INSERT template for table `pokemon_encounters_retrieve_200_response_inner_version_details_i`
--
INSERT INTO `pokemon_encounters_retrieve_200_response_inner_version_details_i`(`encounter_details`, `max_chance`, `version`) VALUES (?, ?, ?);

--
-- UPDATE template for table `pokemon_encounters_retrieve_200_response_inner_version_details_i`
--
UPDATE `pokemon_encounters_retrieve_200_response_inner_version_details_i` SET `encounter_details` = ?, `max_chance` = ?, `version` = ? WHERE 1;

--
-- DELETE template for table `pokemon_encounters_retrieve_200_response_inner_version_details_i`
--
DELETE FROM `pokemon_encounters_retrieve_200_response_inner_version_details_i` WHERE 0;


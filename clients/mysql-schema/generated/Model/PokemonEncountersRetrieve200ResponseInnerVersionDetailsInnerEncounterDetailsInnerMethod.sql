--
-- PokéAPI.
-- Prepared SQL queries for 'pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method' definition.
--


--
-- SELECT template for table `pokemon_encounters_retrieve_200_response_inner_version_details_i`
--
SELECT `name`, `url` FROM `pokemon_encounters_retrieve_200_response_inner_version_details_i` WHERE 1;

--
-- INSERT template for table `pokemon_encounters_retrieve_200_response_inner_version_details_i`
--
INSERT INTO `pokemon_encounters_retrieve_200_response_inner_version_details_i`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `pokemon_encounters_retrieve_200_response_inner_version_details_i`
--
UPDATE `pokemon_encounters_retrieve_200_response_inner_version_details_i` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `pokemon_encounters_retrieve_200_response_inner_version_details_i`
--
DELETE FROM `pokemon_encounters_retrieve_200_response_inner_version_details_i` WHERE 0;


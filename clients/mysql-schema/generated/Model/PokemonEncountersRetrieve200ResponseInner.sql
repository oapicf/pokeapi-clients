--
-- PokéAPI.
-- Prepared SQL queries for 'pokemon_encounters_retrieve_200_response_inner' definition.
--


--
-- SELECT template for table `pokemon_encounters_retrieve_200_response_inner`
--
SELECT `location_area`, `version_details` FROM `pokemon_encounters_retrieve_200_response_inner` WHERE 1;

--
-- INSERT template for table `pokemon_encounters_retrieve_200_response_inner`
--
INSERT INTO `pokemon_encounters_retrieve_200_response_inner`(`location_area`, `version_details`) VALUES (?, ?);

--
-- UPDATE template for table `pokemon_encounters_retrieve_200_response_inner`
--
UPDATE `pokemon_encounters_retrieve_200_response_inner` SET `location_area` = ?, `version_details` = ? WHERE 1;

--
-- DELETE template for table `pokemon_encounters_retrieve_200_response_inner`
--
DELETE FROM `pokemon_encounters_retrieve_200_response_inner` WHERE 0;


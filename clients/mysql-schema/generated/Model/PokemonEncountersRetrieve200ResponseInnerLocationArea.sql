--
-- PokéAPI.
-- Prepared SQL queries for 'pokemon_encounters_retrieve_200_response_inner_location_area' definition.
--


--
-- SELECT template for table `pokemon_encounters_retrieve_200_response_inner_location_area`
--
SELECT `name`, `url` FROM `pokemon_encounters_retrieve_200_response_inner_location_area` WHERE 1;

--
-- INSERT template for table `pokemon_encounters_retrieve_200_response_inner_location_area`
--
INSERT INTO `pokemon_encounters_retrieve_200_response_inner_location_area`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `pokemon_encounters_retrieve_200_response_inner_location_area`
--
UPDATE `pokemon_encounters_retrieve_200_response_inner_location_area` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `pokemon_encounters_retrieve_200_response_inner_location_area`
--
DELETE FROM `pokemon_encounters_retrieve_200_response_inner_location_area` WHERE 0;


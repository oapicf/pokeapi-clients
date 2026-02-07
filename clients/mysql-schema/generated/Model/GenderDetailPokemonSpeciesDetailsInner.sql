--
-- PokéAPI.
-- Prepared SQL queries for 'GenderDetail_pokemon_species_details_inner' definition.
--


--
-- SELECT template for table `GenderDetail_pokemon_species_details_inner`
--
SELECT `rate`, `pokemon_species` FROM `GenderDetail_pokemon_species_details_inner` WHERE 1;

--
-- INSERT template for table `GenderDetail_pokemon_species_details_inner`
--
INSERT INTO `GenderDetail_pokemon_species_details_inner`(`rate`, `pokemon_species`) VALUES (?, ?);

--
-- UPDATE template for table `GenderDetail_pokemon_species_details_inner`
--
UPDATE `GenderDetail_pokemon_species_details_inner` SET `rate` = ?, `pokemon_species` = ? WHERE 1;

--
-- DELETE template for table `GenderDetail_pokemon_species_details_inner`
--
DELETE FROM `GenderDetail_pokemon_species_details_inner` WHERE 0;


--
-- PokéAPI.
-- Prepared SQL queries for 'GenderPokemonSpecies' definition.
--


--
-- SELECT template for table `GenderPokemonSpecies`
--
SELECT `rate`, `pokemon_species` FROM `GenderPokemonSpecies` WHERE 1;

--
-- INSERT template for table `GenderPokemonSpecies`
--
INSERT INTO `GenderPokemonSpecies`(`rate`, `pokemon_species`) VALUES (?, ?);

--
-- UPDATE template for table `GenderPokemonSpecies`
--
UPDATE `GenderPokemonSpecies` SET `rate` = ?, `pokemon_species` = ? WHERE 1;

--
-- DELETE template for table `GenderPokemonSpecies`
--
DELETE FROM `GenderPokemonSpecies` WHERE 0;


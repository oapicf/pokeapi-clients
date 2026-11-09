--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonSpeciesVariety' definition.
--


--
-- SELECT template for table `PokemonSpeciesVariety`
--
SELECT `is_default`, `pokemon` FROM `PokemonSpeciesVariety` WHERE 1;

--
-- INSERT template for table `PokemonSpeciesVariety`
--
INSERT INTO `PokemonSpeciesVariety`(`is_default`, `pokemon`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonSpeciesVariety`
--
UPDATE `PokemonSpeciesVariety` SET `is_default` = ?, `pokemon` = ? WHERE 1;

--
-- DELETE template for table `PokemonSpeciesVariety`
--
DELETE FROM `PokemonSpeciesVariety` WHERE 0;


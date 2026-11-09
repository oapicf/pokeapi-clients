--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonSpeciesName' definition.
--


--
-- SELECT template for table `PokemonSpeciesName`
--
SELECT `name`, `language` FROM `PokemonSpeciesName` WHERE 1;

--
-- INSERT template for table `PokemonSpeciesName`
--
INSERT INTO `PokemonSpeciesName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonSpeciesName`
--
UPDATE `PokemonSpeciesName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `PokemonSpeciesName`
--
DELETE FROM `PokemonSpeciesName` WHERE 0;


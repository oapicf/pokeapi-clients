--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonSpeciesDescription' definition.
--


--
-- SELECT template for table `PokemonSpeciesDescription`
--
SELECT `description`, `language` FROM `PokemonSpeciesDescription` WHERE 1;

--
-- INSERT template for table `PokemonSpeciesDescription`
--
INSERT INTO `PokemonSpeciesDescription`(`description`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonSpeciesDescription`
--
UPDATE `PokemonSpeciesDescription` SET `description` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `PokemonSpeciesDescription`
--
DELETE FROM `PokemonSpeciesDescription` WHERE 0;


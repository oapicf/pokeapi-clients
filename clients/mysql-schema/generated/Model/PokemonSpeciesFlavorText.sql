--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonSpeciesFlavorText' definition.
--


--
-- SELECT template for table `PokemonSpeciesFlavorText`
--
SELECT `flavor_text`, `language`, `version` FROM `PokemonSpeciesFlavorText` WHERE 1;

--
-- INSERT template for table `PokemonSpeciesFlavorText`
--
INSERT INTO `PokemonSpeciesFlavorText`(`flavor_text`, `language`, `version`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PokemonSpeciesFlavorText`
--
UPDATE `PokemonSpeciesFlavorText` SET `flavor_text` = ?, `language` = ?, `version` = ? WHERE 1;

--
-- DELETE template for table `PokemonSpeciesFlavorText`
--
DELETE FROM `PokemonSpeciesFlavorText` WHERE 0;


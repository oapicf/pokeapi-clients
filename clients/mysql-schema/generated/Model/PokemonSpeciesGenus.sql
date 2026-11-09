--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonSpeciesGenus' definition.
--


--
-- SELECT template for table `PokemonSpeciesGenus`
--
SELECT `genus`, `language` FROM `PokemonSpeciesGenus` WHERE 1;

--
-- INSERT template for table `PokemonSpeciesGenus`
--
INSERT INTO `PokemonSpeciesGenus`(`genus`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonSpeciesGenus`
--
UPDATE `PokemonSpeciesGenus` SET `genus` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `PokemonSpeciesGenus`
--
DELETE FROM `PokemonSpeciesGenus` WHERE 0;


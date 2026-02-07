--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonSpeciesDetail_genera_inner' definition.
--


--
-- SELECT template for table `PokemonSpeciesDetail_genera_inner`
--
SELECT `genus`, `language` FROM `PokemonSpeciesDetail_genera_inner` WHERE 1;

--
-- INSERT template for table `PokemonSpeciesDetail_genera_inner`
--
INSERT INTO `PokemonSpeciesDetail_genera_inner`(`genus`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonSpeciesDetail_genera_inner`
--
UPDATE `PokemonSpeciesDetail_genera_inner` SET `genus` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `PokemonSpeciesDetail_genera_inner`
--
DELETE FROM `PokemonSpeciesDetail_genera_inner` WHERE 0;


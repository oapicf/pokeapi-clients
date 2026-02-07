--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonSpeciesDetail_varieties_inner' definition.
--


--
-- SELECT template for table `PokemonSpeciesDetail_varieties_inner`
--
SELECT `is_default`, `pokemon` FROM `PokemonSpeciesDetail_varieties_inner` WHERE 1;

--
-- INSERT template for table `PokemonSpeciesDetail_varieties_inner`
--
INSERT INTO `PokemonSpeciesDetail_varieties_inner`(`is_default`, `pokemon`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonSpeciesDetail_varieties_inner`
--
UPDATE `PokemonSpeciesDetail_varieties_inner` SET `is_default` = ?, `pokemon` = ? WHERE 1;

--
-- DELETE template for table `PokemonSpeciesDetail_varieties_inner`
--
DELETE FROM `PokemonSpeciesDetail_varieties_inner` WHERE 0;


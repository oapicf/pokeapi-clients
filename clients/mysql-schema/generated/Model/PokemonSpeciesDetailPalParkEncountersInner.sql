--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonSpeciesDetail_pal_park_encounters_inner' definition.
--


--
-- SELECT template for table `PokemonSpeciesDetail_pal_park_encounters_inner`
--
SELECT `area`, `base_score`, `rate` FROM `PokemonSpeciesDetail_pal_park_encounters_inner` WHERE 1;

--
-- INSERT template for table `PokemonSpeciesDetail_pal_park_encounters_inner`
--
INSERT INTO `PokemonSpeciesDetail_pal_park_encounters_inner`(`area`, `base_score`, `rate`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PokemonSpeciesDetail_pal_park_encounters_inner`
--
UPDATE `PokemonSpeciesDetail_pal_park_encounters_inner` SET `area` = ?, `base_score` = ?, `rate` = ? WHERE 1;

--
-- DELETE template for table `PokemonSpeciesDetail_pal_park_encounters_inner`
--
DELETE FROM `PokemonSpeciesDetail_pal_park_encounters_inner` WHERE 0;


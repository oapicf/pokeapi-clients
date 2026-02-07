--
-- PokéAPI.
-- Prepared SQL queries for 'PalParkAreaDetail_pokemon_encounters_inner' definition.
--


--
-- SELECT template for table `PalParkAreaDetail_pokemon_encounters_inner`
--
SELECT `base_score`, `pokemon-species`, `rate` FROM `PalParkAreaDetail_pokemon_encounters_inner` WHERE 1;

--
-- INSERT template for table `PalParkAreaDetail_pokemon_encounters_inner`
--
INSERT INTO `PalParkAreaDetail_pokemon_encounters_inner`(`base_score`, `pokemon-species`, `rate`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PalParkAreaDetail_pokemon_encounters_inner`
--
UPDATE `PalParkAreaDetail_pokemon_encounters_inner` SET `base_score` = ?, `pokemon-species` = ?, `rate` = ? WHERE 1;

--
-- DELETE template for table `PalParkAreaDetail_pokemon_encounters_inner`
--
DELETE FROM `PalParkAreaDetail_pokemon_encounters_inner` WHERE 0;


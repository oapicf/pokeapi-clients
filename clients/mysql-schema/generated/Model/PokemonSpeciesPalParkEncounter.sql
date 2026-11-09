--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonSpeciesPalParkEncounter' definition.
--


--
-- SELECT template for table `PokemonSpeciesPalParkEncounter`
--
SELECT `base_score`, `rate`, `area` FROM `PokemonSpeciesPalParkEncounter` WHERE 1;

--
-- INSERT template for table `PokemonSpeciesPalParkEncounter`
--
INSERT INTO `PokemonSpeciesPalParkEncounter`(`base_score`, `rate`, `area`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PokemonSpeciesPalParkEncounter`
--
UPDATE `PokemonSpeciesPalParkEncounter` SET `base_score` = ?, `rate` = ?, `area` = ? WHERE 1;

--
-- DELETE template for table `PokemonSpeciesPalParkEncounter`
--
DELETE FROM `PokemonSpeciesPalParkEncounter` WHERE 0;


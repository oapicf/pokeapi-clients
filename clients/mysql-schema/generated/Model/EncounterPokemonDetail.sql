--
-- PokéAPI.
-- Prepared SQL queries for 'EncounterPokemonDetail' definition.
--


--
-- SELECT template for table `EncounterPokemonDetail`
--
SELECT `min_perfect_ivs`, `always_shiny`, `never_shiny`, `is_alpha` FROM `EncounterPokemonDetail` WHERE 1;

--
-- INSERT template for table `EncounterPokemonDetail`
--
INSERT INTO `EncounterPokemonDetail`(`min_perfect_ivs`, `always_shiny`, `never_shiny`, `is_alpha`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `EncounterPokemonDetail`
--
UPDATE `EncounterPokemonDetail` SET `min_perfect_ivs` = ?, `always_shiny` = ?, `never_shiny` = ?, `is_alpha` = ? WHERE 1;

--
-- DELETE template for table `EncounterPokemonDetail`
--
DELETE FROM `EncounterPokemonDetail` WHERE 0;


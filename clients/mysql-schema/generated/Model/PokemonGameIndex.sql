--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonGameIndex' definition.
--


--
-- SELECT template for table `PokemonGameIndex`
--
SELECT `game_index`, `version` FROM `PokemonGameIndex` WHERE 1;

--
-- INSERT template for table `PokemonGameIndex`
--
INSERT INTO `PokemonGameIndex`(`game_index`, `version`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonGameIndex`
--
UPDATE `PokemonGameIndex` SET `game_index` = ?, `version` = ? WHERE 1;

--
-- DELETE template for table `PokemonGameIndex`
--
DELETE FROM `PokemonGameIndex` WHERE 0;


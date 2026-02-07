--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonStat' definition.
--


--
-- SELECT template for table `PokemonStat`
--
SELECT `base_stat`, `effort`, `stat` FROM `PokemonStat` WHERE 1;

--
-- INSERT template for table `PokemonStat`
--
INSERT INTO `PokemonStat`(`base_stat`, `effort`, `stat`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PokemonStat`
--
UPDATE `PokemonStat` SET `base_stat` = ?, `effort` = ?, `stat` = ? WHERE 1;

--
-- DELETE template for table `PokemonStat`
--
DELETE FROM `PokemonStat` WHERE 0;


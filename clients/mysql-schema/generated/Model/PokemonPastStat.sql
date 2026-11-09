--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonPastStat' definition.
--


--
-- SELECT template for table `PokemonPastStat`
--
SELECT `generation`, `stats` FROM `PokemonPastStat` WHERE 1;

--
-- INSERT template for table `PokemonPastStat`
--
INSERT INTO `PokemonPastStat`(`generation`, `stats`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonPastStat`
--
UPDATE `PokemonPastStat` SET `generation` = ?, `stats` = ? WHERE 1;

--
-- DELETE template for table `PokemonPastStat`
--
DELETE FROM `PokemonPastStat` WHERE 0;


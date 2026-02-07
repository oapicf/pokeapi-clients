--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonSpeciesSummary' definition.
--


--
-- SELECT template for table `PokemonSpeciesSummary`
--
SELECT `name`, `url` FROM `PokemonSpeciesSummary` WHERE 1;

--
-- INSERT template for table `PokemonSpeciesSummary`
--
INSERT INTO `PokemonSpeciesSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonSpeciesSummary`
--
UPDATE `PokemonSpeciesSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `PokemonSpeciesSummary`
--
DELETE FROM `PokemonSpeciesSummary` WHERE 0;


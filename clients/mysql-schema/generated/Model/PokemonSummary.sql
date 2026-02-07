--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonSummary' definition.
--


--
-- SELECT template for table `PokemonSummary`
--
SELECT `name`, `url` FROM `PokemonSummary` WHERE 1;

--
-- INSERT template for table `PokemonSummary`
--
INSERT INTO `PokemonSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonSummary`
--
UPDATE `PokemonSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `PokemonSummary`
--
DELETE FROM `PokemonSummary` WHERE 0;


--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonColorSummary' definition.
--


--
-- SELECT template for table `PokemonColorSummary`
--
SELECT `name`, `url` FROM `PokemonColorSummary` WHERE 1;

--
-- INSERT template for table `PokemonColorSummary`
--
INSERT INTO `PokemonColorSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonColorSummary`
--
UPDATE `PokemonColorSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `PokemonColorSummary`
--
DELETE FROM `PokemonColorSummary` WHERE 0;


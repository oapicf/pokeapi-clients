--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonShapeSummary' definition.
--


--
-- SELECT template for table `PokemonShapeSummary`
--
SELECT `name`, `url` FROM `PokemonShapeSummary` WHERE 1;

--
-- INSERT template for table `PokemonShapeSummary`
--
INSERT INTO `PokemonShapeSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonShapeSummary`
--
UPDATE `PokemonShapeSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `PokemonShapeSummary`
--
DELETE FROM `PokemonShapeSummary` WHERE 0;


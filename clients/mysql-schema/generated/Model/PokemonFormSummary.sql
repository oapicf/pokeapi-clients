--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonFormSummary' definition.
--


--
-- SELECT template for table `PokemonFormSummary`
--
SELECT `name`, `url` FROM `PokemonFormSummary` WHERE 1;

--
-- INSERT template for table `PokemonFormSummary`
--
INSERT INTO `PokemonFormSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonFormSummary`
--
UPDATE `PokemonFormSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `PokemonFormSummary`
--
DELETE FROM `PokemonFormSummary` WHERE 0;


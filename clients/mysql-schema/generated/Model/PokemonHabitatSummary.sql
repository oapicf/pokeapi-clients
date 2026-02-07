--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonHabitatSummary' definition.
--


--
-- SELECT template for table `PokemonHabitatSummary`
--
SELECT `name`, `url` FROM `PokemonHabitatSummary` WHERE 1;

--
-- INSERT template for table `PokemonHabitatSummary`
--
INSERT INTO `PokemonHabitatSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonHabitatSummary`
--
UPDATE `PokemonHabitatSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `PokemonHabitatSummary`
--
DELETE FROM `PokemonHabitatSummary` WHERE 0;


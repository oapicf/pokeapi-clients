--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonHabitatName' definition.
--


--
-- SELECT template for table `PokemonHabitatName`
--
SELECT `name`, `language` FROM `PokemonHabitatName` WHERE 1;

--
-- INSERT template for table `PokemonHabitatName`
--
INSERT INTO `PokemonHabitatName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonHabitatName`
--
UPDATE `PokemonHabitatName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `PokemonHabitatName`
--
DELETE FROM `PokemonHabitatName` WHERE 0;


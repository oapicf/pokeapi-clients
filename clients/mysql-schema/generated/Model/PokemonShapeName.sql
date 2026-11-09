--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonShapeName' definition.
--


--
-- SELECT template for table `PokemonShapeName`
--
SELECT `name`, `language` FROM `PokemonShapeName` WHERE 1;

--
-- INSERT template for table `PokemonShapeName`
--
INSERT INTO `PokemonShapeName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonShapeName`
--
UPDATE `PokemonShapeName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `PokemonShapeName`
--
DELETE FROM `PokemonShapeName` WHERE 0;


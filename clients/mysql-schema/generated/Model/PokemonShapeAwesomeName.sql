--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonShapeAwesomeName' definition.
--


--
-- SELECT template for table `PokemonShapeAwesomeName`
--
SELECT `awesome_name`, `language` FROM `PokemonShapeAwesomeName` WHERE 1;

--
-- INSERT template for table `PokemonShapeAwesomeName`
--
INSERT INTO `PokemonShapeAwesomeName`(`awesome_name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonShapeAwesomeName`
--
UPDATE `PokemonShapeAwesomeName` SET `awesome_name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `PokemonShapeAwesomeName`
--
DELETE FROM `PokemonShapeAwesomeName` WHERE 0;


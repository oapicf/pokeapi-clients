--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonShapeDetail' definition.
--


--
-- SELECT template for table `PokemonShapeDetail`
--
SELECT `id`, `name`, `awesome_names`, `names`, `pokemon_species` FROM `PokemonShapeDetail` WHERE 1;

--
-- INSERT template for table `PokemonShapeDetail`
--
INSERT INTO `PokemonShapeDetail`(`id`, `name`, `awesome_names`, `names`, `pokemon_species`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `PokemonShapeDetail`
--
UPDATE `PokemonShapeDetail` SET `id` = ?, `name` = ?, `awesome_names` = ?, `names` = ?, `pokemon_species` = ? WHERE 1;

--
-- DELETE template for table `PokemonShapeDetail`
--
DELETE FROM `PokemonShapeDetail` WHERE 0;


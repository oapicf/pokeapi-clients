--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonColorDetail' definition.
--


--
-- SELECT template for table `PokemonColorDetail`
--
SELECT `id`, `name`, `names`, `pokemon_species` FROM `PokemonColorDetail` WHERE 1;

--
-- INSERT template for table `PokemonColorDetail`
--
INSERT INTO `PokemonColorDetail`(`id`, `name`, `names`, `pokemon_species`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PokemonColorDetail`
--
UPDATE `PokemonColorDetail` SET `id` = ?, `name` = ?, `names` = ?, `pokemon_species` = ? WHERE 1;

--
-- DELETE template for table `PokemonColorDetail`
--
DELETE FROM `PokemonColorDetail` WHERE 0;


--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonHabitatDetail' definition.
--


--
-- SELECT template for table `PokemonHabitatDetail`
--
SELECT `id`, `name`, `names`, `pokemon_species` FROM `PokemonHabitatDetail` WHERE 1;

--
-- INSERT template for table `PokemonHabitatDetail`
--
INSERT INTO `PokemonHabitatDetail`(`id`, `name`, `names`, `pokemon_species`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PokemonHabitatDetail`
--
UPDATE `PokemonHabitatDetail` SET `id` = ?, `name` = ?, `names` = ?, `pokemon_species` = ? WHERE 1;

--
-- DELETE template for table `PokemonHabitatDetail`
--
DELETE FROM `PokemonHabitatDetail` WHERE 0;


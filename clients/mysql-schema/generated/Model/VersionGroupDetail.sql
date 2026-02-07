--
-- PokéAPI.
-- Prepared SQL queries for 'VersionGroupDetail' definition.
--


--
-- SELECT template for table `VersionGroupDetail`
--
SELECT `id`, `name`, `order`, `generation`, `move_learn_methods`, `pokedexes`, `regions`, `versions` FROM `VersionGroupDetail` WHERE 1;

--
-- INSERT template for table `VersionGroupDetail`
--
INSERT INTO `VersionGroupDetail`(`id`, `name`, `order`, `generation`, `move_learn_methods`, `pokedexes`, `regions`, `versions`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `VersionGroupDetail`
--
UPDATE `VersionGroupDetail` SET `id` = ?, `name` = ?, `order` = ?, `generation` = ?, `move_learn_methods` = ?, `pokedexes` = ?, `regions` = ?, `versions` = ? WHERE 1;

--
-- DELETE template for table `VersionGroupDetail`
--
DELETE FROM `VersionGroupDetail` WHERE 0;


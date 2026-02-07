--
-- PokéAPI.
-- Prepared SQL queries for 'EggGroupDetail' definition.
--


--
-- SELECT template for table `EggGroupDetail`
--
SELECT `id`, `name`, `names`, `pokemon_species` FROM `EggGroupDetail` WHERE 1;

--
-- INSERT template for table `EggGroupDetail`
--
INSERT INTO `EggGroupDetail`(`id`, `name`, `names`, `pokemon_species`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `EggGroupDetail`
--
UPDATE `EggGroupDetail` SET `id` = ?, `name` = ?, `names` = ?, `pokemon_species` = ? WHERE 1;

--
-- DELETE template for table `EggGroupDetail`
--
DELETE FROM `EggGroupDetail` WHERE 0;


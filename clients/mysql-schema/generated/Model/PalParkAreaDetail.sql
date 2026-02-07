--
-- PokéAPI.
-- Prepared SQL queries for 'PalParkAreaDetail' definition.
--


--
-- SELECT template for table `PalParkAreaDetail`
--
SELECT `id`, `name`, `names`, `pokemon_encounters` FROM `PalParkAreaDetail` WHERE 1;

--
-- INSERT template for table `PalParkAreaDetail`
--
INSERT INTO `PalParkAreaDetail`(`id`, `name`, `names`, `pokemon_encounters`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PalParkAreaDetail`
--
UPDATE `PalParkAreaDetail` SET `id` = ?, `name` = ?, `names` = ?, `pokemon_encounters` = ? WHERE 1;

--
-- DELETE template for table `PalParkAreaDetail`
--
DELETE FROM `PalParkAreaDetail` WHERE 0;


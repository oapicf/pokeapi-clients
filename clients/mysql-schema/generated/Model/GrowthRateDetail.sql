--
-- PokéAPI.
-- Prepared SQL queries for 'GrowthRateDetail' definition.
--


--
-- SELECT template for table `GrowthRateDetail`
--
SELECT `id`, `name`, `formula`, `descriptions`, `levels`, `pokemon_species` FROM `GrowthRateDetail` WHERE 1;

--
-- INSERT template for table `GrowthRateDetail`
--
INSERT INTO `GrowthRateDetail`(`id`, `name`, `formula`, `descriptions`, `levels`, `pokemon_species`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GrowthRateDetail`
--
UPDATE `GrowthRateDetail` SET `id` = ?, `name` = ?, `formula` = ?, `descriptions` = ?, `levels` = ?, `pokemon_species` = ? WHERE 1;

--
-- DELETE template for table `GrowthRateDetail`
--
DELETE FROM `GrowthRateDetail` WHERE 0;


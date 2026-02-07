--
-- PokéAPI.
-- Prepared SQL queries for 'ItemFlingEffectDetail' definition.
--


--
-- SELECT template for table `ItemFlingEffectDetail`
--
SELECT `id`, `name`, `effect_entries`, `items` FROM `ItemFlingEffectDetail` WHERE 1;

--
-- INSERT template for table `ItemFlingEffectDetail`
--
INSERT INTO `ItemFlingEffectDetail`(`id`, `name`, `effect_entries`, `items`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ItemFlingEffectDetail`
--
UPDATE `ItemFlingEffectDetail` SET `id` = ?, `name` = ?, `effect_entries` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `ItemFlingEffectDetail`
--
DELETE FROM `ItemFlingEffectDetail` WHERE 0;


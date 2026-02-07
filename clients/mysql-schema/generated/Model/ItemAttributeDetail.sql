--
-- PokéAPI.
-- Prepared SQL queries for 'ItemAttributeDetail' definition.
--


--
-- SELECT template for table `ItemAttributeDetail`
--
SELECT `id`, `name`, `descriptions`, `items`, `names` FROM `ItemAttributeDetail` WHERE 1;

--
-- INSERT template for table `ItemAttributeDetail`
--
INSERT INTO `ItemAttributeDetail`(`id`, `name`, `descriptions`, `items`, `names`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ItemAttributeDetail`
--
UPDATE `ItemAttributeDetail` SET `id` = ?, `name` = ?, `descriptions` = ?, `items` = ?, `names` = ? WHERE 1;

--
-- DELETE template for table `ItemAttributeDetail`
--
DELETE FROM `ItemAttributeDetail` WHERE 0;


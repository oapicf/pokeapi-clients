--
-- PokéAPI.
-- Prepared SQL queries for 'ItemPocketDetail' definition.
--


--
-- SELECT template for table `ItemPocketDetail`
--
SELECT `id`, `name`, `categories`, `names` FROM `ItemPocketDetail` WHERE 1;

--
-- INSERT template for table `ItemPocketDetail`
--
INSERT INTO `ItemPocketDetail`(`id`, `name`, `categories`, `names`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ItemPocketDetail`
--
UPDATE `ItemPocketDetail` SET `id` = ?, `name` = ?, `categories` = ?, `names` = ? WHERE 1;

--
-- DELETE template for table `ItemPocketDetail`
--
DELETE FROM `ItemPocketDetail` WHERE 0;


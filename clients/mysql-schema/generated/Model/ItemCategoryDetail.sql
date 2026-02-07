--
-- PokéAPI.
-- Prepared SQL queries for 'ItemCategoryDetail' definition.
--


--
-- SELECT template for table `ItemCategoryDetail`
--
SELECT `id`, `name`, `items`, `names`, `pocket` FROM `ItemCategoryDetail` WHERE 1;

--
-- INSERT template for table `ItemCategoryDetail`
--
INSERT INTO `ItemCategoryDetail`(`id`, `name`, `items`, `names`, `pocket`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ItemCategoryDetail`
--
UPDATE `ItemCategoryDetail` SET `id` = ?, `name` = ?, `items` = ?, `names` = ?, `pocket` = ? WHERE 1;

--
-- DELETE template for table `ItemCategoryDetail`
--
DELETE FROM `ItemCategoryDetail` WHERE 0;


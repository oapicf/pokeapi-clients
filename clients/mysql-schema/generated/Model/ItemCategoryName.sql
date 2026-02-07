--
-- PokéAPI.
-- Prepared SQL queries for 'ItemCategoryName' definition.
--


--
-- SELECT template for table `ItemCategoryName`
--
SELECT `name`, `language` FROM `ItemCategoryName` WHERE 1;

--
-- INSERT template for table `ItemCategoryName`
--
INSERT INTO `ItemCategoryName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `ItemCategoryName`
--
UPDATE `ItemCategoryName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `ItemCategoryName`
--
DELETE FROM `ItemCategoryName` WHERE 0;


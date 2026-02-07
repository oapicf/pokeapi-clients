--
-- PokéAPI.
-- Prepared SQL queries for 'ItemCategorySummary' definition.
--


--
-- SELECT template for table `ItemCategorySummary`
--
SELECT `name`, `url` FROM `ItemCategorySummary` WHERE 1;

--
-- INSERT template for table `ItemCategorySummary`
--
INSERT INTO `ItemCategorySummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `ItemCategorySummary`
--
UPDATE `ItemCategorySummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `ItemCategorySummary`
--
DELETE FROM `ItemCategorySummary` WHERE 0;


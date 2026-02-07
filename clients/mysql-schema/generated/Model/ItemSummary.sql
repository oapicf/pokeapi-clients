--
-- PokéAPI.
-- Prepared SQL queries for 'ItemSummary' definition.
--


--
-- SELECT template for table `ItemSummary`
--
SELECT `name`, `url` FROM `ItemSummary` WHERE 1;

--
-- INSERT template for table `ItemSummary`
--
INSERT INTO `ItemSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `ItemSummary`
--
UPDATE `ItemSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `ItemSummary`
--
DELETE FROM `ItemSummary` WHERE 0;


--
-- PokéAPI.
-- Prepared SQL queries for 'ItemPocketSummary' definition.
--


--
-- SELECT template for table `ItemPocketSummary`
--
SELECT `name`, `url` FROM `ItemPocketSummary` WHERE 1;

--
-- INSERT template for table `ItemPocketSummary`
--
INSERT INTO `ItemPocketSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `ItemPocketSummary`
--
UPDATE `ItemPocketSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `ItemPocketSummary`
--
DELETE FROM `ItemPocketSummary` WHERE 0;


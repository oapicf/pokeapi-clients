--
-- PokéAPI.
-- Prepared SQL queries for 'ItemAttributeSummary' definition.
--


--
-- SELECT template for table `ItemAttributeSummary`
--
SELECT `name`, `url` FROM `ItemAttributeSummary` WHERE 1;

--
-- INSERT template for table `ItemAttributeSummary`
--
INSERT INTO `ItemAttributeSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `ItemAttributeSummary`
--
UPDATE `ItemAttributeSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `ItemAttributeSummary`
--
DELETE FROM `ItemAttributeSummary` WHERE 0;


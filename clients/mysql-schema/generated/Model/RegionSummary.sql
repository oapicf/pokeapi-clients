--
-- PokéAPI.
-- Prepared SQL queries for 'RegionSummary' definition.
--


--
-- SELECT template for table `RegionSummary`
--
SELECT `name`, `url` FROM `RegionSummary` WHERE 1;

--
-- INSERT template for table `RegionSummary`
--
INSERT INTO `RegionSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `RegionSummary`
--
UPDATE `RegionSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `RegionSummary`
--
DELETE FROM `RegionSummary` WHERE 0;


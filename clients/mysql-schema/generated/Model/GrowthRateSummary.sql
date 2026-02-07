--
-- PokéAPI.
-- Prepared SQL queries for 'GrowthRateSummary' definition.
--


--
-- SELECT template for table `GrowthRateSummary`
--
SELECT `name`, `url` FROM `GrowthRateSummary` WHERE 1;

--
-- INSERT template for table `GrowthRateSummary`
--
INSERT INTO `GrowthRateSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `GrowthRateSummary`
--
UPDATE `GrowthRateSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `GrowthRateSummary`
--
DELETE FROM `GrowthRateSummary` WHERE 0;


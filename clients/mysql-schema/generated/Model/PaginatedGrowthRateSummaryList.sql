--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedGrowthRateSummaryList' definition.
--


--
-- SELECT template for table `PaginatedGrowthRateSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedGrowthRateSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedGrowthRateSummaryList`
--
INSERT INTO `PaginatedGrowthRateSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedGrowthRateSummaryList`
--
UPDATE `PaginatedGrowthRateSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedGrowthRateSummaryList`
--
DELETE FROM `PaginatedGrowthRateSummaryList` WHERE 0;


--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedRegionSummaryList' definition.
--


--
-- SELECT template for table `PaginatedRegionSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedRegionSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedRegionSummaryList`
--
INSERT INTO `PaginatedRegionSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedRegionSummaryList`
--
UPDATE `PaginatedRegionSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedRegionSummaryList`
--
DELETE FROM `PaginatedRegionSummaryList` WHERE 0;


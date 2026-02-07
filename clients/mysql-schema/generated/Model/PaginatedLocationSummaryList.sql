--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedLocationSummaryList' definition.
--


--
-- SELECT template for table `PaginatedLocationSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedLocationSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedLocationSummaryList`
--
INSERT INTO `PaginatedLocationSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedLocationSummaryList`
--
UPDATE `PaginatedLocationSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedLocationSummaryList`
--
DELETE FROM `PaginatedLocationSummaryList` WHERE 0;


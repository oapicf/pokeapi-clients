--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedLocationAreaSummaryList' definition.
--


--
-- SELECT template for table `PaginatedLocationAreaSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedLocationAreaSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedLocationAreaSummaryList`
--
INSERT INTO `PaginatedLocationAreaSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedLocationAreaSummaryList`
--
UPDATE `PaginatedLocationAreaSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedLocationAreaSummaryList`
--
DELETE FROM `PaginatedLocationAreaSummaryList` WHERE 0;


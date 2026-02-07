--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedStatSummaryList' definition.
--


--
-- SELECT template for table `PaginatedStatSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedStatSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedStatSummaryList`
--
INSERT INTO `PaginatedStatSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedStatSummaryList`
--
UPDATE `PaginatedStatSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedStatSummaryList`
--
DELETE FROM `PaginatedStatSummaryList` WHERE 0;


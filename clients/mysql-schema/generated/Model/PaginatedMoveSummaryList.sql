--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedMoveSummaryList' definition.
--


--
-- SELECT template for table `PaginatedMoveSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedMoveSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedMoveSummaryList`
--
INSERT INTO `PaginatedMoveSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedMoveSummaryList`
--
UPDATE `PaginatedMoveSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedMoveSummaryList`
--
DELETE FROM `PaginatedMoveSummaryList` WHERE 0;


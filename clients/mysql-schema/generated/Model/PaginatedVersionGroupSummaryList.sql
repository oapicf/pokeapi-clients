--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedVersionGroupSummaryList' definition.
--


--
-- SELECT template for table `PaginatedVersionGroupSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedVersionGroupSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedVersionGroupSummaryList`
--
INSERT INTO `PaginatedVersionGroupSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedVersionGroupSummaryList`
--
UPDATE `PaginatedVersionGroupSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedVersionGroupSummaryList`
--
DELETE FROM `PaginatedVersionGroupSummaryList` WHERE 0;


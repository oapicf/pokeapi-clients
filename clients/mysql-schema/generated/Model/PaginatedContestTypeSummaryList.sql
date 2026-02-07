--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedContestTypeSummaryList' definition.
--


--
-- SELECT template for table `PaginatedContestTypeSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedContestTypeSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedContestTypeSummaryList`
--
INSERT INTO `PaginatedContestTypeSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedContestTypeSummaryList`
--
UPDATE `PaginatedContestTypeSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedContestTypeSummaryList`
--
DELETE FROM `PaginatedContestTypeSummaryList` WHERE 0;


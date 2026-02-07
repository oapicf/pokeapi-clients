--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedVersionSummaryList' definition.
--


--
-- SELECT template for table `PaginatedVersionSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedVersionSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedVersionSummaryList`
--
INSERT INTO `PaginatedVersionSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedVersionSummaryList`
--
UPDATE `PaginatedVersionSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedVersionSummaryList`
--
DELETE FROM `PaginatedVersionSummaryList` WHERE 0;


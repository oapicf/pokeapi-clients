--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedBerrySummaryList' definition.
--


--
-- SELECT template for table `PaginatedBerrySummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedBerrySummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedBerrySummaryList`
--
INSERT INTO `PaginatedBerrySummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedBerrySummaryList`
--
UPDATE `PaginatedBerrySummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedBerrySummaryList`
--
DELETE FROM `PaginatedBerrySummaryList` WHERE 0;


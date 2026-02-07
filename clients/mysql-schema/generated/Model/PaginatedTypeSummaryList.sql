--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedTypeSummaryList' definition.
--


--
-- SELECT template for table `PaginatedTypeSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedTypeSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedTypeSummaryList`
--
INSERT INTO `PaginatedTypeSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedTypeSummaryList`
--
UPDATE `PaginatedTypeSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedTypeSummaryList`
--
DELETE FROM `PaginatedTypeSummaryList` WHERE 0;


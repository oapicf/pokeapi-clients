--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedNatureSummaryList' definition.
--


--
-- SELECT template for table `PaginatedNatureSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedNatureSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedNatureSummaryList`
--
INSERT INTO `PaginatedNatureSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedNatureSummaryList`
--
UPDATE `PaginatedNatureSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedNatureSummaryList`
--
DELETE FROM `PaginatedNatureSummaryList` WHERE 0;


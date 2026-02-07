--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedBerryFlavorSummaryList' definition.
--


--
-- SELECT template for table `PaginatedBerryFlavorSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedBerryFlavorSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedBerryFlavorSummaryList`
--
INSERT INTO `PaginatedBerryFlavorSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedBerryFlavorSummaryList`
--
UPDATE `PaginatedBerryFlavorSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedBerryFlavorSummaryList`
--
DELETE FROM `PaginatedBerryFlavorSummaryList` WHERE 0;


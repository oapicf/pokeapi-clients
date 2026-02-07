--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedItemAttributeSummaryList' definition.
--


--
-- SELECT template for table `PaginatedItemAttributeSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedItemAttributeSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedItemAttributeSummaryList`
--
INSERT INTO `PaginatedItemAttributeSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedItemAttributeSummaryList`
--
UPDATE `PaginatedItemAttributeSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedItemAttributeSummaryList`
--
DELETE FROM `PaginatedItemAttributeSummaryList` WHERE 0;


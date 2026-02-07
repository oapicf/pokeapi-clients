--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedItemSummaryList' definition.
--


--
-- SELECT template for table `PaginatedItemSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedItemSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedItemSummaryList`
--
INSERT INTO `PaginatedItemSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedItemSummaryList`
--
UPDATE `PaginatedItemSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedItemSummaryList`
--
DELETE FROM `PaginatedItemSummaryList` WHERE 0;


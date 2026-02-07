--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedItemCategorySummaryList' definition.
--


--
-- SELECT template for table `PaginatedItemCategorySummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedItemCategorySummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedItemCategorySummaryList`
--
INSERT INTO `PaginatedItemCategorySummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedItemCategorySummaryList`
--
UPDATE `PaginatedItemCategorySummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedItemCategorySummaryList`
--
DELETE FROM `PaginatedItemCategorySummaryList` WHERE 0;


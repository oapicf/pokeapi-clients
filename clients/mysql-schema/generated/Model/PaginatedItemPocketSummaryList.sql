--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedItemPocketSummaryList' definition.
--


--
-- SELECT template for table `PaginatedItemPocketSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedItemPocketSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedItemPocketSummaryList`
--
INSERT INTO `PaginatedItemPocketSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedItemPocketSummaryList`
--
UPDATE `PaginatedItemPocketSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedItemPocketSummaryList`
--
DELETE FROM `PaginatedItemPocketSummaryList` WHERE 0;


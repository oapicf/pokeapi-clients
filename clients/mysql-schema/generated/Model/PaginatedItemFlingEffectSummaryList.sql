--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedItemFlingEffectSummaryList' definition.
--


--
-- SELECT template for table `PaginatedItemFlingEffectSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedItemFlingEffectSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedItemFlingEffectSummaryList`
--
INSERT INTO `PaginatedItemFlingEffectSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedItemFlingEffectSummaryList`
--
UPDATE `PaginatedItemFlingEffectSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedItemFlingEffectSummaryList`
--
DELETE FROM `PaginatedItemFlingEffectSummaryList` WHERE 0;


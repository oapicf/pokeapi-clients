--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedMoveMetaCategorySummaryList' definition.
--


--
-- SELECT template for table `PaginatedMoveMetaCategorySummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedMoveMetaCategorySummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedMoveMetaCategorySummaryList`
--
INSERT INTO `PaginatedMoveMetaCategorySummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedMoveMetaCategorySummaryList`
--
UPDATE `PaginatedMoveMetaCategorySummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedMoveMetaCategorySummaryList`
--
DELETE FROM `PaginatedMoveMetaCategorySummaryList` WHERE 0;


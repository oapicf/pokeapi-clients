--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedMoveTargetSummaryList' definition.
--


--
-- SELECT template for table `PaginatedMoveTargetSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedMoveTargetSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedMoveTargetSummaryList`
--
INSERT INTO `PaginatedMoveTargetSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedMoveTargetSummaryList`
--
UPDATE `PaginatedMoveTargetSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedMoveTargetSummaryList`
--
DELETE FROM `PaginatedMoveTargetSummaryList` WHERE 0;


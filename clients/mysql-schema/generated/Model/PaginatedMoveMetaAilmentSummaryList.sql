--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedMoveMetaAilmentSummaryList' definition.
--


--
-- SELECT template for table `PaginatedMoveMetaAilmentSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedMoveMetaAilmentSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedMoveMetaAilmentSummaryList`
--
INSERT INTO `PaginatedMoveMetaAilmentSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedMoveMetaAilmentSummaryList`
--
UPDATE `PaginatedMoveMetaAilmentSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedMoveMetaAilmentSummaryList`
--
DELETE FROM `PaginatedMoveMetaAilmentSummaryList` WHERE 0;


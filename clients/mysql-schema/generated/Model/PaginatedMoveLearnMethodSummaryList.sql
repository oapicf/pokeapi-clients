--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedMoveLearnMethodSummaryList' definition.
--


--
-- SELECT template for table `PaginatedMoveLearnMethodSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedMoveLearnMethodSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedMoveLearnMethodSummaryList`
--
INSERT INTO `PaginatedMoveLearnMethodSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedMoveLearnMethodSummaryList`
--
UPDATE `PaginatedMoveLearnMethodSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedMoveLearnMethodSummaryList`
--
DELETE FROM `PaginatedMoveLearnMethodSummaryList` WHERE 0;


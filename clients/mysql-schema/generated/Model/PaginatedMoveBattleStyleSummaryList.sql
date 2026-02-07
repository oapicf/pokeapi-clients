--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedMoveBattleStyleSummaryList' definition.
--


--
-- SELECT template for table `PaginatedMoveBattleStyleSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedMoveBattleStyleSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedMoveBattleStyleSummaryList`
--
INSERT INTO `PaginatedMoveBattleStyleSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedMoveBattleStyleSummaryList`
--
UPDATE `PaginatedMoveBattleStyleSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedMoveBattleStyleSummaryList`
--
DELETE FROM `PaginatedMoveBattleStyleSummaryList` WHERE 0;


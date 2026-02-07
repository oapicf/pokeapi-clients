--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedContestEffectSummaryList' definition.
--


--
-- SELECT template for table `PaginatedContestEffectSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedContestEffectSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedContestEffectSummaryList`
--
INSERT INTO `PaginatedContestEffectSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedContestEffectSummaryList`
--
UPDATE `PaginatedContestEffectSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedContestEffectSummaryList`
--
DELETE FROM `PaginatedContestEffectSummaryList` WHERE 0;


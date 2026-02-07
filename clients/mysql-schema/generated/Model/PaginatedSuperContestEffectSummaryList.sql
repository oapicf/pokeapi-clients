--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedSuperContestEffectSummaryList' definition.
--


--
-- SELECT template for table `PaginatedSuperContestEffectSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedSuperContestEffectSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedSuperContestEffectSummaryList`
--
INSERT INTO `PaginatedSuperContestEffectSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedSuperContestEffectSummaryList`
--
UPDATE `PaginatedSuperContestEffectSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedSuperContestEffectSummaryList`
--
DELETE FROM `PaginatedSuperContestEffectSummaryList` WHERE 0;


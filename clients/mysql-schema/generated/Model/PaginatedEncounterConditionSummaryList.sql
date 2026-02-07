--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedEncounterConditionSummaryList' definition.
--


--
-- SELECT template for table `PaginatedEncounterConditionSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedEncounterConditionSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedEncounterConditionSummaryList`
--
INSERT INTO `PaginatedEncounterConditionSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedEncounterConditionSummaryList`
--
UPDATE `PaginatedEncounterConditionSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedEncounterConditionSummaryList`
--
DELETE FROM `PaginatedEncounterConditionSummaryList` WHERE 0;


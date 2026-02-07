--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedEncounterConditionValueSummaryList' definition.
--


--
-- SELECT template for table `PaginatedEncounterConditionValueSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedEncounterConditionValueSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedEncounterConditionValueSummaryList`
--
INSERT INTO `PaginatedEncounterConditionValueSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedEncounterConditionValueSummaryList`
--
UPDATE `PaginatedEncounterConditionValueSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedEncounterConditionValueSummaryList`
--
DELETE FROM `PaginatedEncounterConditionValueSummaryList` WHERE 0;


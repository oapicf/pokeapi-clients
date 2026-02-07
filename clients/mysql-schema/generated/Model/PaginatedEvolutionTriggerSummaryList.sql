--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedEvolutionTriggerSummaryList' definition.
--


--
-- SELECT template for table `PaginatedEvolutionTriggerSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedEvolutionTriggerSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedEvolutionTriggerSummaryList`
--
INSERT INTO `PaginatedEvolutionTriggerSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedEvolutionTriggerSummaryList`
--
UPDATE `PaginatedEvolutionTriggerSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedEvolutionTriggerSummaryList`
--
DELETE FROM `PaginatedEvolutionTriggerSummaryList` WHERE 0;


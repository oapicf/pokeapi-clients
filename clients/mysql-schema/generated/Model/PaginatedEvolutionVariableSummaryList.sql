--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedEvolutionVariableSummaryList' definition.
--


--
-- SELECT template for table `PaginatedEvolutionVariableSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedEvolutionVariableSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedEvolutionVariableSummaryList`
--
INSERT INTO `PaginatedEvolutionVariableSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedEvolutionVariableSummaryList`
--
UPDATE `PaginatedEvolutionVariableSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedEvolutionVariableSummaryList`
--
DELETE FROM `PaginatedEvolutionVariableSummaryList` WHERE 0;


--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedEvolutionChainSummaryList' definition.
--


--
-- SELECT template for table `PaginatedEvolutionChainSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedEvolutionChainSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedEvolutionChainSummaryList`
--
INSERT INTO `PaginatedEvolutionChainSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedEvolutionChainSummaryList`
--
UPDATE `PaginatedEvolutionChainSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedEvolutionChainSummaryList`
--
DELETE FROM `PaginatedEvolutionChainSummaryList` WHERE 0;


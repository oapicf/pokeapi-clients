--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedGenerationSummaryList' definition.
--


--
-- SELECT template for table `PaginatedGenerationSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedGenerationSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedGenerationSummaryList`
--
INSERT INTO `PaginatedGenerationSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedGenerationSummaryList`
--
UPDATE `PaginatedGenerationSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedGenerationSummaryList`
--
DELETE FROM `PaginatedGenerationSummaryList` WHERE 0;


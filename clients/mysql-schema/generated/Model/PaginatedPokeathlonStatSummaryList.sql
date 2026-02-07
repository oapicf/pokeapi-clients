--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedPokeathlonStatSummaryList' definition.
--


--
-- SELECT template for table `PaginatedPokeathlonStatSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedPokeathlonStatSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedPokeathlonStatSummaryList`
--
INSERT INTO `PaginatedPokeathlonStatSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedPokeathlonStatSummaryList`
--
UPDATE `PaginatedPokeathlonStatSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedPokeathlonStatSummaryList`
--
DELETE FROM `PaginatedPokeathlonStatSummaryList` WHERE 0;


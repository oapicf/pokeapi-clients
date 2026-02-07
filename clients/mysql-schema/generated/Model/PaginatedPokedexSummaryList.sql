--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedPokedexSummaryList' definition.
--


--
-- SELECT template for table `PaginatedPokedexSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedPokedexSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedPokedexSummaryList`
--
INSERT INTO `PaginatedPokedexSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedPokedexSummaryList`
--
UPDATE `PaginatedPokedexSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedPokedexSummaryList`
--
DELETE FROM `PaginatedPokedexSummaryList` WHERE 0;


--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedPokemonColorSummaryList' definition.
--


--
-- SELECT template for table `PaginatedPokemonColorSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedPokemonColorSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedPokemonColorSummaryList`
--
INSERT INTO `PaginatedPokemonColorSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedPokemonColorSummaryList`
--
UPDATE `PaginatedPokemonColorSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedPokemonColorSummaryList`
--
DELETE FROM `PaginatedPokemonColorSummaryList` WHERE 0;


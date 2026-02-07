--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedPokemonShapeSummaryList' definition.
--


--
-- SELECT template for table `PaginatedPokemonShapeSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedPokemonShapeSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedPokemonShapeSummaryList`
--
INSERT INTO `PaginatedPokemonShapeSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedPokemonShapeSummaryList`
--
UPDATE `PaginatedPokemonShapeSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedPokemonShapeSummaryList`
--
DELETE FROM `PaginatedPokemonShapeSummaryList` WHERE 0;


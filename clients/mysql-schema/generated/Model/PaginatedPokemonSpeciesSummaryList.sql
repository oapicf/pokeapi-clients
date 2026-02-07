--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedPokemonSpeciesSummaryList' definition.
--


--
-- SELECT template for table `PaginatedPokemonSpeciesSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedPokemonSpeciesSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedPokemonSpeciesSummaryList`
--
INSERT INTO `PaginatedPokemonSpeciesSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedPokemonSpeciesSummaryList`
--
UPDATE `PaginatedPokemonSpeciesSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedPokemonSpeciesSummaryList`
--
DELETE FROM `PaginatedPokemonSpeciesSummaryList` WHERE 0;


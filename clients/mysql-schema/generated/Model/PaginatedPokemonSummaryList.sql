--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedPokemonSummaryList' definition.
--


--
-- SELECT template for table `PaginatedPokemonSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedPokemonSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedPokemonSummaryList`
--
INSERT INTO `PaginatedPokemonSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedPokemonSummaryList`
--
UPDATE `PaginatedPokemonSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedPokemonSummaryList`
--
DELETE FROM `PaginatedPokemonSummaryList` WHERE 0;


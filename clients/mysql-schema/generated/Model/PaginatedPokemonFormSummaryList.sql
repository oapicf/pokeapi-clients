--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedPokemonFormSummaryList' definition.
--


--
-- SELECT template for table `PaginatedPokemonFormSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedPokemonFormSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedPokemonFormSummaryList`
--
INSERT INTO `PaginatedPokemonFormSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedPokemonFormSummaryList`
--
UPDATE `PaginatedPokemonFormSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedPokemonFormSummaryList`
--
DELETE FROM `PaginatedPokemonFormSummaryList` WHERE 0;


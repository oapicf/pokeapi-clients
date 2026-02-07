--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedPokemonHabitatSummaryList' definition.
--


--
-- SELECT template for table `PaginatedPokemonHabitatSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedPokemonHabitatSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedPokemonHabitatSummaryList`
--
INSERT INTO `PaginatedPokemonHabitatSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedPokemonHabitatSummaryList`
--
UPDATE `PaginatedPokemonHabitatSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedPokemonHabitatSummaryList`
--
DELETE FROM `PaginatedPokemonHabitatSummaryList` WHERE 0;


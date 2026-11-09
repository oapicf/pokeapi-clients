--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonHeldItemSummary' definition.
--


--
-- SELECT template for table `PokemonHeldItemSummary`
--
SELECT `item`, `version_details` FROM `PokemonHeldItemSummary` WHERE 1;

--
-- INSERT template for table `PokemonHeldItemSummary`
--
INSERT INTO `PokemonHeldItemSummary`(`item`, `version_details`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonHeldItemSummary`
--
UPDATE `PokemonHeldItemSummary` SET `item` = ?, `version_details` = ? WHERE 1;

--
-- DELETE template for table `PokemonHeldItemSummary`
--
DELETE FROM `PokemonHeldItemSummary` WHERE 0;


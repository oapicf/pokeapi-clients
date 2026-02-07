--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonDetail_held_items' definition.
--


--
-- SELECT template for table `PokemonDetail_held_items`
--
SELECT `item`, `version_details` FROM `PokemonDetail_held_items` WHERE 1;

--
-- INSERT template for table `PokemonDetail_held_items`
--
INSERT INTO `PokemonDetail_held_items`(`item`, `version_details`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonDetail_held_items`
--
UPDATE `PokemonDetail_held_items` SET `item` = ?, `version_details` = ? WHERE 1;

--
-- DELETE template for table `PokemonDetail_held_items`
--
DELETE FROM `PokemonDetail_held_items` WHERE 0;


--
-- PokéAPI.
-- Prepared SQL queries for 'ItemDetail_held_by_pokemon_inner' definition.
--


--
-- SELECT template for table `ItemDetail_held_by_pokemon_inner`
--
SELECT `pokemon`, `version-details` FROM `ItemDetail_held_by_pokemon_inner` WHERE 1;

--
-- INSERT template for table `ItemDetail_held_by_pokemon_inner`
--
INSERT INTO `ItemDetail_held_by_pokemon_inner`(`pokemon`, `version-details`) VALUES (?, ?);

--
-- UPDATE template for table `ItemDetail_held_by_pokemon_inner`
--
UPDATE `ItemDetail_held_by_pokemon_inner` SET `pokemon` = ?, `version-details` = ? WHERE 1;

--
-- DELETE template for table `ItemDetail_held_by_pokemon_inner`
--
DELETE FROM `ItemDetail_held_by_pokemon_inner` WHERE 0;


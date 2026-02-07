--
-- PokéAPI.
-- Prepared SQL queries for 'ItemDetail_held_by_pokemon_inner_version_details_inner' definition.
--


--
-- SELECT template for table `ItemDetail_held_by_pokemon_inner_version_details_inner`
--
SELECT `rarity`, `version` FROM `ItemDetail_held_by_pokemon_inner_version_details_inner` WHERE 1;

--
-- INSERT template for table `ItemDetail_held_by_pokemon_inner_version_details_inner`
--
INSERT INTO `ItemDetail_held_by_pokemon_inner_version_details_inner`(`rarity`, `version`) VALUES (?, ?);

--
-- UPDATE template for table `ItemDetail_held_by_pokemon_inner_version_details_inner`
--
UPDATE `ItemDetail_held_by_pokemon_inner_version_details_inner` SET `rarity` = ?, `version` = ? WHERE 1;

--
-- DELETE template for table `ItemDetail_held_by_pokemon_inner_version_details_inner`
--
DELETE FROM `ItemDetail_held_by_pokemon_inner_version_details_inner` WHERE 0;


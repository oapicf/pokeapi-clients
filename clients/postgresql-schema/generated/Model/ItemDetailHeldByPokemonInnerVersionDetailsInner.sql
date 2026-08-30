--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemDetail_held_by_pokemon_inner_version_details_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_detail_held_by_pokemon_inner_version_details_inner'
--
SELECT rarity, "version" FROM item_detail_held_by_pokemon_inner_version_details_inner WHERE 1=1;

--
-- INSERT template for table 'item_detail_held_by_pokemon_inner_version_details_inner'
--
INSERT INTO item_detail_held_by_pokemon_inner_version_details_inner (rarity, "version") VALUES (?, ?);

--
-- UPDATE template for table 'item_detail_held_by_pokemon_inner_version_details_inner'
--
UPDATE item_detail_held_by_pokemon_inner_version_details_inner SET rarity = ?, "version" = ? WHERE 1=2;

--
-- DELETE template for table 'item_detail_held_by_pokemon_inner_version_details_inner'
--
DELETE FROM item_detail_held_by_pokemon_inner_version_details_inner WHERE 1=2;


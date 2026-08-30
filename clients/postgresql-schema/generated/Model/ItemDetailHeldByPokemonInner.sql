--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemDetail_held_by_pokemon_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_detail_held_by_pokemon_inner'
--
SELECT pokemon, version_details FROM item_detail_held_by_pokemon_inner WHERE 1=1;

--
-- INSERT template for table 'item_detail_held_by_pokemon_inner'
--
INSERT INTO item_detail_held_by_pokemon_inner (pokemon, version_details) VALUES (?, ?);

--
-- UPDATE template for table 'item_detail_held_by_pokemon_inner'
--
UPDATE item_detail_held_by_pokemon_inner SET pokemon = ?, version_details = ? WHERE 1=2;

--
-- DELETE template for table 'item_detail_held_by_pokemon_inner'
--
DELETE FROM item_detail_held_by_pokemon_inner WHERE 1=2;


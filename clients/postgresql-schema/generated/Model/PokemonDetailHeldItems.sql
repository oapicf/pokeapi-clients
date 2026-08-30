--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonDetail_held_items' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_detail_held_items'
--
SELECT item, version_details FROM pokemon_detail_held_items WHERE 1=1;

--
-- INSERT template for table 'pokemon_detail_held_items'
--
INSERT INTO pokemon_detail_held_items (item, version_details) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_detail_held_items'
--
UPDATE pokemon_detail_held_items SET item = ?, version_details = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_detail_held_items'
--
DELETE FROM pokemon_detail_held_items WHERE 1=2;


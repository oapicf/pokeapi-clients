--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonHeldItemSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_held_item_summary'
--
SELECT item, version_details FROM pokemon_held_item_summary WHERE 1=1;

--
-- INSERT template for table 'pokemon_held_item_summary'
--
INSERT INTO pokemon_held_item_summary (item, version_details) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_held_item_summary'
--
UPDATE pokemon_held_item_summary SET item = ?, version_details = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_held_item_summary'
--
DELETE FROM pokemon_held_item_summary WHERE 1=2;


--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonHeldItemVersion' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_held_item_version'
--
SELECT rarity, "version" FROM pokemon_held_item_version WHERE 1=1;

--
-- INSERT template for table 'pokemon_held_item_version'
--
INSERT INTO pokemon_held_item_version (rarity, "version") VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_held_item_version'
--
UPDATE pokemon_held_item_version SET rarity = ?, "version" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_held_item_version'
--
DELETE FROM pokemon_held_item_version WHERE 1=2;


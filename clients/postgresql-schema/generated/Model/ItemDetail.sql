--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_detail'
--
SELECT "id", "name", "cost", fling_power, fling_effect, "attributes", category, effect_entries, flavor_text_entries, game_indices, "names", held_by_pokemon, sprites, baby_trigger_for, machines FROM item_detail WHERE 1=1;

--
-- INSERT template for table 'item_detail'
--
INSERT INTO item_detail ("id", "name", "cost", fling_power, fling_effect, "attributes", category, effect_entries, flavor_text_entries, game_indices, "names", held_by_pokemon, sprites, baby_trigger_for, machines) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'item_detail'
--
UPDATE item_detail SET "id" = ?, "name" = ?, "cost" = ?, fling_power = ?, fling_effect = ?, "attributes" = ?, category = ?, effect_entries = ?, flavor_text_entries = ?, game_indices = ?, "names" = ?, held_by_pokemon = ?, sprites = ?, baby_trigger_for = ?, machines = ? WHERE 1=2;

--
-- DELETE template for table 'item_detail'
--
DELETE FROM item_detail WHERE 1=2;


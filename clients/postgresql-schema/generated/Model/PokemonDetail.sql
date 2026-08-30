--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_detail'
--
SELECT "id", "name", base_experience, height, is_default, "order", weight, abilities, past_abilities, forms, game_indices, held_items, location_area_encounters, moves, species, sprites, cries, stats, "types", past_types FROM pokemon_detail WHERE 1=1;

--
-- INSERT template for table 'pokemon_detail'
--
INSERT INTO pokemon_detail ("id", "name", base_experience, height, is_default, "order", weight, abilities, past_abilities, forms, game_indices, held_items, location_area_encounters, moves, species, sprites, cries, stats, "types", past_types) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'pokemon_detail'
--
UPDATE pokemon_detail SET "id" = ?, "name" = ?, base_experience = ?, height = ?, is_default = ?, "order" = ?, weight = ?, abilities = ?, past_abilities = ?, forms = ?, game_indices = ?, held_items = ?, location_area_encounters = ?, moves = ?, species = ?, sprites = ?, cries = ?, stats = ?, "types" = ?, past_types = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_detail'
--
DELETE FROM pokemon_detail WHERE 1=2;


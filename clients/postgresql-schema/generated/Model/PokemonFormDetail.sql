--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonFormDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_form_detail'
--
SELECT "id", "name", "order", form_order, is_default, is_battle_only, is_mega, form_name, pokemon, sprites, version_group, form_names, "names", "types" FROM pokemon_form_detail WHERE 1=1;

--
-- INSERT template for table 'pokemon_form_detail'
--
INSERT INTO pokemon_form_detail ("id", "name", "order", form_order, is_default, is_battle_only, is_mega, form_name, pokemon, sprites, version_group, form_names, "names", "types") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'pokemon_form_detail'
--
UPDATE pokemon_form_detail SET "id" = ?, "name" = ?, "order" = ?, form_order = ?, is_default = ?, is_battle_only = ?, is_mega = ?, form_name = ?, pokemon = ?, sprites = ?, version_group = ?, form_names = ?, "names" = ?, "types" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_form_detail'
--
DELETE FROM pokemon_form_detail WHERE 1=2;


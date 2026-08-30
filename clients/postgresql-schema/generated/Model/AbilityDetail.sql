--
-- "PokéAPI"
-- Prepared SQL queries for 'AbilityDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ability_detail'
--
SELECT "id", "name", is_main_series, generation, "names", effect_entries, effect_changes, flavor_text_entries, pokemon FROM ability_detail WHERE 1=1;

--
-- INSERT template for table 'ability_detail'
--
INSERT INTO ability_detail ("id", "name", is_main_series, generation, "names", effect_entries, effect_changes, flavor_text_entries, pokemon) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ability_detail'
--
UPDATE ability_detail SET "id" = ?, "name" = ?, is_main_series = ?, generation = ?, "names" = ?, effect_entries = ?, effect_changes = ?, flavor_text_entries = ?, pokemon = ? WHERE 1=2;

--
-- DELETE template for table 'ability_detail'
--
DELETE FROM ability_detail WHERE 1=2;


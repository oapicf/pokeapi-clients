--
-- "PokéAPI"
-- Prepared SQL queries for 'PokedexDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokedex_detail'
--
SELECT "id", "name", is_main_series, descriptions, "names", pokemon_entries, region, version_groups FROM pokedex_detail WHERE 1=1;

--
-- INSERT template for table 'pokedex_detail'
--
INSERT INTO pokedex_detail ("id", "name", is_main_series, descriptions, "names", pokemon_entries, region, version_groups) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'pokedex_detail'
--
UPDATE pokedex_detail SET "id" = ?, "name" = ?, is_main_series = ?, descriptions = ?, "names" = ?, pokemon_entries = ?, region = ?, version_groups = ? WHERE 1=2;

--
-- DELETE template for table 'pokedex_detail'
--
DELETE FROM pokedex_detail WHERE 1=2;


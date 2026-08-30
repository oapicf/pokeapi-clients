--
-- "PokéAPI"
-- Prepared SQL queries for 'RegionDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'region_detail'
--
SELECT "id", "name", locations, main_generation, "names", pokedexes, version_groups FROM region_detail WHERE 1=1;

--
-- INSERT template for table 'region_detail'
--
INSERT INTO region_detail ("id", "name", locations, main_generation, "names", pokedexes, version_groups) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'region_detail'
--
UPDATE region_detail SET "id" = ?, "name" = ?, locations = ?, main_generation = ?, "names" = ?, pokedexes = ?, version_groups = ? WHERE 1=2;

--
-- DELETE template for table 'region_detail'
--
DELETE FROM region_detail WHERE 1=2;


--
-- "PokéAPI"
-- Prepared SQL queries for 'GenerationDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'generation_detail'
--
SELECT "id", "name", abilities, main_region, moves, "names", pokemon_species, "types", version_groups FROM generation_detail WHERE 1=1;

--
-- INSERT template for table 'generation_detail'
--
INSERT INTO generation_detail ("id", "name", abilities, main_region, moves, "names", pokemon_species, "types", version_groups) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'generation_detail'
--
UPDATE generation_detail SET "id" = ?, "name" = ?, abilities = ?, main_region = ?, moves = ?, "names" = ?, pokemon_species = ?, "types" = ?, version_groups = ? WHERE 1=2;

--
-- DELETE template for table 'generation_detail'
--
DELETE FROM generation_detail WHERE 1=2;


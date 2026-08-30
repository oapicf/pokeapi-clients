--
-- "PokéAPI"
-- Prepared SQL queries for 'VersionGroupDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'version_group_detail'
--
SELECT "id", "name", "order", generation, move_learn_methods, pokedexes, regions, versions FROM version_group_detail WHERE 1=1;

--
-- INSERT template for table 'version_group_detail'
--
INSERT INTO version_group_detail ("id", "name", "order", generation, move_learn_methods, pokedexes, regions, versions) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'version_group_detail'
--
UPDATE version_group_detail SET "id" = ?, "name" = ?, "order" = ?, generation = ?, move_learn_methods = ?, pokedexes = ?, regions = ?, versions = ? WHERE 1=2;

--
-- DELETE template for table 'version_group_detail'
--
DELETE FROM version_group_detail WHERE 1=2;


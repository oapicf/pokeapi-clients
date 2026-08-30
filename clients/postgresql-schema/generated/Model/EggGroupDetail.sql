--
-- "PokéAPI"
-- Prepared SQL queries for 'EggGroupDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'egg_group_detail'
--
SELECT "id", "name", "names", pokemon_species FROM egg_group_detail WHERE 1=1;

--
-- INSERT template for table 'egg_group_detail'
--
INSERT INTO egg_group_detail ("id", "name", "names", pokemon_species) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'egg_group_detail'
--
UPDATE egg_group_detail SET "id" = ?, "name" = ?, "names" = ?, pokemon_species = ? WHERE 1=2;

--
-- DELETE template for table 'egg_group_detail'
--
DELETE FROM egg_group_detail WHERE 1=2;


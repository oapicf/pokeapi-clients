--
-- "PokéAPI"
-- Prepared SQL queries for 'EggGroupName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'egg_group_name'
--
SELECT "name", "language" FROM egg_group_name WHERE 1=1;

--
-- INSERT template for table 'egg_group_name'
--
INSERT INTO egg_group_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'egg_group_name'
--
UPDATE egg_group_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'egg_group_name'
--
DELETE FROM egg_group_name WHERE 1=2;


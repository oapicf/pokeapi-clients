--
-- "PokéAPI"
-- Prepared SQL queries for 'EggGroupSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'egg_group_summary'
--
SELECT "name", url FROM egg_group_summary WHERE 1=1;

--
-- INSERT template for table 'egg_group_summary'
--
INSERT INTO egg_group_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'egg_group_summary'
--
UPDATE egg_group_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'egg_group_summary'
--
DELETE FROM egg_group_summary WHERE 1=2;


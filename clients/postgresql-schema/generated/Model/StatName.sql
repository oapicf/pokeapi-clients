--
-- "PokéAPI"
-- Prepared SQL queries for 'StatName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'stat_name'
--
SELECT "name", "language" FROM stat_name WHERE 1=1;

--
-- INSERT template for table 'stat_name'
--
INSERT INTO stat_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'stat_name'
--
UPDATE stat_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'stat_name'
--
DELETE FROM stat_name WHERE 1=2;


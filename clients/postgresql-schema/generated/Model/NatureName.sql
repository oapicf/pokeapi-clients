--
-- "PokéAPI"
-- Prepared SQL queries for 'NatureName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'nature_name'
--
SELECT "name", "language" FROM nature_name WHERE 1=1;

--
-- INSERT template for table 'nature_name'
--
INSERT INTO nature_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'nature_name'
--
UPDATE nature_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'nature_name'
--
DELETE FROM nature_name WHERE 1=2;


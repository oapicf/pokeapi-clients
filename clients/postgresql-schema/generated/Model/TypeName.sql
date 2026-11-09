--
-- "PokéAPI"
-- Prepared SQL queries for 'TypeName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'type_name'
--
SELECT "name", "language" FROM type_name WHERE 1=1;

--
-- INSERT template for table 'type_name'
--
INSERT INTO type_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'type_name'
--
UPDATE type_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'type_name'
--
DELETE FROM type_name WHERE 1=2;


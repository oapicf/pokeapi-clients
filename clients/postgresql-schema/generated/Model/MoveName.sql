--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_name'
--
SELECT "name", "language" FROM move_name WHERE 1=1;

--
-- INSERT template for table 'move_name'
--
INSERT INTO move_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'move_name'
--
UPDATE move_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'move_name'
--
DELETE FROM move_name WHERE 1=2;


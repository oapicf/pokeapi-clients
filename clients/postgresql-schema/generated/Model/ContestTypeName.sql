--
-- "PokéAPI"
-- Prepared SQL queries for 'ContestTypeName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'contest_type_name'
--
SELECT "name", color, "language" FROM contest_type_name WHERE 1=1;

--
-- INSERT template for table 'contest_type_name'
--
INSERT INTO contest_type_name ("name", color, "language") VALUES (?, ?, ?);

--
-- UPDATE template for table 'contest_type_name'
--
UPDATE contest_type_name SET "name" = ?, color = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'contest_type_name'
--
DELETE FROM contest_type_name WHERE 1=2;


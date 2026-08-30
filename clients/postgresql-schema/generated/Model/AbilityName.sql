--
-- "PokéAPI"
-- Prepared SQL queries for 'AbilityName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ability_name'
--
SELECT "name", "language" FROM ability_name WHERE 1=1;

--
-- INSERT template for table 'ability_name'
--
INSERT INTO ability_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'ability_name'
--
UPDATE ability_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'ability_name'
--
DELETE FROM ability_name WHERE 1=2;


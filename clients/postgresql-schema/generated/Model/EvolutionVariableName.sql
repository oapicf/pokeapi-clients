--
-- "PokéAPI"
-- Prepared SQL queries for 'EvolutionVariableName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'evolution_variable_name'
--
SELECT "name", "language" FROM evolution_variable_name WHERE 1=1;

--
-- INSERT template for table 'evolution_variable_name'
--
INSERT INTO evolution_variable_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'evolution_variable_name'
--
UPDATE evolution_variable_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'evolution_variable_name'
--
DELETE FROM evolution_variable_name WHERE 1=2;


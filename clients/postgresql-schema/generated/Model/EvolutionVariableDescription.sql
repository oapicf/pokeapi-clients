--
-- "PokéAPI"
-- Prepared SQL queries for 'EvolutionVariableDescription' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'evolution_variable_description'
--
SELECT description, "language" FROM evolution_variable_description WHERE 1=1;

--
-- INSERT template for table 'evolution_variable_description'
--
INSERT INTO evolution_variable_description (description, "language") VALUES (?, ?);

--
-- UPDATE template for table 'evolution_variable_description'
--
UPDATE evolution_variable_description SET description = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'evolution_variable_description'
--
DELETE FROM evolution_variable_description WHERE 1=2;


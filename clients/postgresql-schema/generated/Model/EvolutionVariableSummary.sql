--
-- "PokéAPI"
-- Prepared SQL queries for 'EvolutionVariableSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'evolution_variable_summary'
--
SELECT "name", url FROM evolution_variable_summary WHERE 1=1;

--
-- INSERT template for table 'evolution_variable_summary'
--
INSERT INTO evolution_variable_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'evolution_variable_summary'
--
UPDATE evolution_variable_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'evolution_variable_summary'
--
DELETE FROM evolution_variable_summary WHERE 1=2;


--
-- "PokéAPI"
-- Prepared SQL queries for 'EvolutionTriggerName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'evolution_trigger_name'
--
SELECT "name", "language" FROM evolution_trigger_name WHERE 1=1;

--
-- INSERT template for table 'evolution_trigger_name'
--
INSERT INTO evolution_trigger_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'evolution_trigger_name'
--
UPDATE evolution_trigger_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'evolution_trigger_name'
--
DELETE FROM evolution_trigger_name WHERE 1=2;


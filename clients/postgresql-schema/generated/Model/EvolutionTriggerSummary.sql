--
-- "PokéAPI"
-- Prepared SQL queries for 'EvolutionTriggerSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'evolution_trigger_summary'
--
SELECT "name", url FROM evolution_trigger_summary WHERE 1=1;

--
-- INSERT template for table 'evolution_trigger_summary'
--
INSERT INTO evolution_trigger_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'evolution_trigger_summary'
--
UPDATE evolution_trigger_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'evolution_trigger_summary'
--
DELETE FROM evolution_trigger_summary WHERE 1=2;


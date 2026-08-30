--
-- "PokéAPI"
-- Prepared SQL queries for 'AbilitySummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ability_summary'
--
SELECT "name", url FROM ability_summary WHERE 1=1;

--
-- INSERT template for table 'ability_summary'
--
INSERT INTO ability_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'ability_summary'
--
UPDATE ability_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'ability_summary'
--
DELETE FROM ability_summary WHERE 1=2;


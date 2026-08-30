--
-- "PokéAPI"
-- Prepared SQL queries for 'GenerationSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'generation_summary'
--
SELECT "name", url FROM generation_summary WHERE 1=1;

--
-- INSERT template for table 'generation_summary'
--
INSERT INTO generation_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'generation_summary'
--
UPDATE generation_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'generation_summary'
--
DELETE FROM generation_summary WHERE 1=2;


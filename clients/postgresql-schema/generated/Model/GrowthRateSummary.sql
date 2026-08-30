--
-- "PokéAPI"
-- Prepared SQL queries for 'GrowthRateSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'growth_rate_summary'
--
SELECT "name", url FROM growth_rate_summary WHERE 1=1;

--
-- INSERT template for table 'growth_rate_summary'
--
INSERT INTO growth_rate_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'growth_rate_summary'
--
UPDATE growth_rate_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'growth_rate_summary'
--
DELETE FROM growth_rate_summary WHERE 1=2;


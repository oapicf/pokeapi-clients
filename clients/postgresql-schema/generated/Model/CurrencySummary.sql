--
-- "PokéAPI"
-- Prepared SQL queries for 'CurrencySummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'currency_summary'
--
SELECT "name", url FROM currency_summary WHERE 1=1;

--
-- INSERT template for table 'currency_summary'
--
INSERT INTO currency_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'currency_summary'
--
UPDATE currency_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'currency_summary'
--
DELETE FROM currency_summary WHERE 1=2;


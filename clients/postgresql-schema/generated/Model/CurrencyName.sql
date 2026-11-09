--
-- "PokéAPI"
-- Prepared SQL queries for 'CurrencyName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'currency_name'
--
SELECT "name", "language" FROM currency_name WHERE 1=1;

--
-- INSERT template for table 'currency_name'
--
INSERT INTO currency_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'currency_name'
--
UPDATE currency_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'currency_name'
--
DELETE FROM currency_name WHERE 1=2;


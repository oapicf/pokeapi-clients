--
-- "PokéAPI"
-- Prepared SQL queries for 'CurrencyDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'currency_detail'
--
SELECT "id", "name", "names" FROM currency_detail WHERE 1=1;

--
-- INSERT template for table 'currency_detail'
--
INSERT INTO currency_detail ("id", "name", "names") VALUES (?, ?, ?);

--
-- UPDATE template for table 'currency_detail'
--
UPDATE currency_detail SET "id" = ?, "name" = ?, "names" = ? WHERE 1=2;

--
-- DELETE template for table 'currency_detail'
--
DELETE FROM currency_detail WHERE 1=2;


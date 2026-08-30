--
-- "PokéAPI"
-- Prepared SQL queries for 'GrowthRateDescription' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'growth_rate_description'
--
SELECT description, "language" FROM growth_rate_description WHERE 1=1;

--
-- INSERT template for table 'growth_rate_description'
--
INSERT INTO growth_rate_description (description, "language") VALUES (?, ?);

--
-- UPDATE template for table 'growth_rate_description'
--
UPDATE growth_rate_description SET description = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'growth_rate_description'
--
DELETE FROM growth_rate_description WHERE 1=2;


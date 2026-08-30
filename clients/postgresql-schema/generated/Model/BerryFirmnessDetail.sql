--
-- "PokéAPI"
-- Prepared SQL queries for 'BerryFirmnessDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'berry_firmness_detail'
--
SELECT "id", "name", berries, "names" FROM berry_firmness_detail WHERE 1=1;

--
-- INSERT template for table 'berry_firmness_detail'
--
INSERT INTO berry_firmness_detail ("id", "name", berries, "names") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'berry_firmness_detail'
--
UPDATE berry_firmness_detail SET "id" = ?, "name" = ?, berries = ?, "names" = ? WHERE 1=2;

--
-- DELETE template for table 'berry_firmness_detail'
--
DELETE FROM berry_firmness_detail WHERE 1=2;


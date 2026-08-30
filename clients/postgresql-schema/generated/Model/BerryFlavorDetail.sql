--
-- "PokéAPI"
-- Prepared SQL queries for 'BerryFlavorDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'berry_flavor_detail'
--
SELECT "id", "name", berries, contest_type, "names" FROM berry_flavor_detail WHERE 1=1;

--
-- INSERT template for table 'berry_flavor_detail'
--
INSERT INTO berry_flavor_detail ("id", "name", berries, contest_type, "names") VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'berry_flavor_detail'
--
UPDATE berry_flavor_detail SET "id" = ?, "name" = ?, berries = ?, contest_type = ?, "names" = ? WHERE 1=2;

--
-- DELETE template for table 'berry_flavor_detail'
--
DELETE FROM berry_flavor_detail WHERE 1=2;


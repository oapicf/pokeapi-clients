--
-- "PokéAPI"
-- Prepared SQL queries for 'ContestTypeDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'contest_type_detail'
--
SELECT "id", "name", berry_flavor, "names" FROM contest_type_detail WHERE 1=1;

--
-- INSERT template for table 'contest_type_detail'
--
INSERT INTO contest_type_detail ("id", "name", berry_flavor, "names") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'contest_type_detail'
--
UPDATE contest_type_detail SET "id" = ?, "name" = ?, berry_flavor = ?, "names" = ? WHERE 1=2;

--
-- DELETE template for table 'contest_type_detail'
--
DELETE FROM contest_type_detail WHERE 1=2;


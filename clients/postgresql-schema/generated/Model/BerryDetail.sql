--
-- "PokéAPI"
-- Prepared SQL queries for 'BerryDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'berry_detail'
--
SELECT "id", "name", growth_time, max_harvest, natural_gift_power, "size", smoothness, soil_dryness, firmness, flavors, item, natural_gift_type FROM berry_detail WHERE 1=1;

--
-- INSERT template for table 'berry_detail'
--
INSERT INTO berry_detail ("id", "name", growth_time, max_harvest, natural_gift_power, "size", smoothness, soil_dryness, firmness, flavors, item, natural_gift_type) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'berry_detail'
--
UPDATE berry_detail SET "id" = ?, "name" = ?, growth_time = ?, max_harvest = ?, natural_gift_power = ?, "size" = ?, smoothness = ?, soil_dryness = ?, firmness = ?, flavors = ?, item = ?, natural_gift_type = ? WHERE 1=2;

--
-- DELETE template for table 'berry_detail'
--
DELETE FROM berry_detail WHERE 1=2;


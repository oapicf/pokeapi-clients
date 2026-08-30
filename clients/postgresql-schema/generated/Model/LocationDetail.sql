--
-- "PokéAPI"
-- Prepared SQL queries for 'LocationDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'location_detail'
--
SELECT "id", "name", region, "names", game_indices, areas FROM location_detail WHERE 1=1;

--
-- INSERT template for table 'location_detail'
--
INSERT INTO location_detail ("id", "name", region, "names", game_indices, areas) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'location_detail'
--
UPDATE location_detail SET "id" = ?, "name" = ?, region = ?, "names" = ?, game_indices = ?, areas = ? WHERE 1=2;

--
-- DELETE template for table 'location_detail'
--
DELETE FROM location_detail WHERE 1=2;


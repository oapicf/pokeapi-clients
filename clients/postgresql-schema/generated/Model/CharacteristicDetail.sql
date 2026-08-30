--
-- "PokéAPI"
-- Prepared SQL queries for 'CharacteristicDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'characteristic_detail'
--
SELECT "id", gene_modulo, possible_values, highest_stat, descriptions FROM characteristic_detail WHERE 1=1;

--
-- INSERT template for table 'characteristic_detail'
--
INSERT INTO characteristic_detail ("id", gene_modulo, possible_values, highest_stat, descriptions) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'characteristic_detail'
--
UPDATE characteristic_detail SET "id" = ?, gene_modulo = ?, possible_values = ?, highest_stat = ?, descriptions = ? WHERE 1=2;

--
-- DELETE template for table 'characteristic_detail'
--
DELETE FROM characteristic_detail WHERE 1=2;


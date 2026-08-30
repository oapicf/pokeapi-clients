--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemFlingEffectDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_fling_effect_detail'
--
SELECT "id", "name", effect_entries, items FROM item_fling_effect_detail WHERE 1=1;

--
-- INSERT template for table 'item_fling_effect_detail'
--
INSERT INTO item_fling_effect_detail ("id", "name", effect_entries, items) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'item_fling_effect_detail'
--
UPDATE item_fling_effect_detail SET "id" = ?, "name" = ?, effect_entries = ?, items = ? WHERE 1=2;

--
-- DELETE template for table 'item_fling_effect_detail'
--
DELETE FROM item_fling_effect_detail WHERE 1=2;


--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemFlingEffectSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_fling_effect_summary'
--
SELECT "name", url FROM item_fling_effect_summary WHERE 1=1;

--
-- INSERT template for table 'item_fling_effect_summary'
--
INSERT INTO item_fling_effect_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'item_fling_effect_summary'
--
UPDATE item_fling_effect_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'item_fling_effect_summary'
--
DELETE FROM item_fling_effect_summary WHERE 1=2;


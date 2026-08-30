--
-- "PokéAPI"
-- Prepared SQL queries for 'ItemFlingEffectEffectText' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_fling_effect_effect_text'
--
SELECT effect, "language" FROM item_fling_effect_effect_text WHERE 1=1;

--
-- INSERT template for table 'item_fling_effect_effect_text'
--
INSERT INTO item_fling_effect_effect_text (effect, "language") VALUES (?, ?);

--
-- UPDATE template for table 'item_fling_effect_effect_text'
--
UPDATE item_fling_effect_effect_text SET effect = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'item_fling_effect_effect_text'
--
DELETE FROM item_fling_effect_effect_text WHERE 1=2;


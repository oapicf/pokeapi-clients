--
-- "PokéAPI"
-- Prepared SQL queries for 'ContestEffectDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'contest_effect_detail'
--
SELECT "id", appeal, jam, effect_entries, flavor_text_entries FROM contest_effect_detail WHERE 1=1;

--
-- INSERT template for table 'contest_effect_detail'
--
INSERT INTO contest_effect_detail ("id", appeal, jam, effect_entries, flavor_text_entries) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'contest_effect_detail'
--
UPDATE contest_effect_detail SET "id" = ?, appeal = ?, jam = ?, effect_entries = ?, flavor_text_entries = ? WHERE 1=2;

--
-- DELETE template for table 'contest_effect_detail'
--
DELETE FROM contest_effect_detail WHERE 1=2;


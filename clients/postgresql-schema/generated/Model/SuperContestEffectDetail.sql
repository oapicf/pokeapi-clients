--
-- "PokéAPI"
-- Prepared SQL queries for 'SuperContestEffectDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'super_contest_effect_detail'
--
SELECT "id", appeal, flavor_text_entries, moves FROM super_contest_effect_detail WHERE 1=1;

--
-- INSERT template for table 'super_contest_effect_detail'
--
INSERT INTO super_contest_effect_detail ("id", appeal, flavor_text_entries, moves) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'super_contest_effect_detail'
--
UPDATE super_contest_effect_detail SET "id" = ?, appeal = ?, flavor_text_entries = ?, moves = ? WHERE 1=2;

--
-- DELETE template for table 'super_contest_effect_detail'
--
DELETE FROM super_contest_effect_detail WHERE 1=2;


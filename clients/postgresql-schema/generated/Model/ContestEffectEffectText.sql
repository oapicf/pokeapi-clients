--
-- "PokéAPI"
-- Prepared SQL queries for 'ContestEffectEffectText' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'contest_effect_effect_text'
--
SELECT effect, "language" FROM contest_effect_effect_text WHERE 1=1;

--
-- INSERT template for table 'contest_effect_effect_text'
--
INSERT INTO contest_effect_effect_text (effect, "language") VALUES (?, ?);

--
-- UPDATE template for table 'contest_effect_effect_text'
--
UPDATE contest_effect_effect_text SET effect = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'contest_effect_effect_text'
--
DELETE FROM contest_effect_effect_text WHERE 1=2;


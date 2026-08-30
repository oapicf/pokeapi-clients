--
-- "PokéAPI"
-- Prepared SQL queries for 'AbilityEffectText' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ability_effect_text'
--
SELECT effect, short_effect, "language" FROM ability_effect_text WHERE 1=1;

--
-- INSERT template for table 'ability_effect_text'
--
INSERT INTO ability_effect_text (effect, short_effect, "language") VALUES (?, ?, ?);

--
-- UPDATE template for table 'ability_effect_text'
--
UPDATE ability_effect_text SET effect = ?, short_effect = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'ability_effect_text'
--
DELETE FROM ability_effect_text WHERE 1=2;


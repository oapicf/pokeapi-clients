--
-- "PokéAPI"
-- Prepared SQL queries for 'AbilityChangeEffectText' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ability_change_effect_text'
--
SELECT effect, "language" FROM ability_change_effect_text WHERE 1=1;

--
-- INSERT template for table 'ability_change_effect_text'
--
INSERT INTO ability_change_effect_text (effect, "language") VALUES (?, ?);

--
-- UPDATE template for table 'ability_change_effect_text'
--
UPDATE ability_change_effect_text SET effect = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'ability_change_effect_text'
--
DELETE FROM ability_change_effect_text WHERE 1=2;


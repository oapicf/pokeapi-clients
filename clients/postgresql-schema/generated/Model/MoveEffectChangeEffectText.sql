--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveEffectChangeEffectText' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_effect_change_effect_text'
--
SELECT effect, "language" FROM move_effect_change_effect_text WHERE 1=1;

--
-- INSERT template for table 'move_effect_change_effect_text'
--
INSERT INTO move_effect_change_effect_text (effect, "language") VALUES (?, ?);

--
-- UPDATE template for table 'move_effect_change_effect_text'
--
UPDATE move_effect_change_effect_text SET effect = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'move_effect_change_effect_text'
--
DELETE FROM move_effect_change_effect_text WHERE 1=2;


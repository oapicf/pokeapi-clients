--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveEffectChange' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_effect_change'
--
SELECT version_group, effect_entries FROM move_effect_change WHERE 1=1;

--
-- INSERT template for table 'move_effect_change'
--
INSERT INTO move_effect_change (version_group, effect_entries) VALUES (?, ?);

--
-- UPDATE template for table 'move_effect_change'
--
UPDATE move_effect_change SET version_group = ?, effect_entries = ? WHERE 1=2;

--
-- DELETE template for table 'move_effect_change'
--
DELETE FROM move_effect_change WHERE 1=2;


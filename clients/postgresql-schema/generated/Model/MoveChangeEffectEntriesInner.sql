--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveChange_effect_entries_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_change_effect_entries_inner'
--
SELECT effect, short_effect, "language" FROM move_change_effect_entries_inner WHERE 1=1;

--
-- INSERT template for table 'move_change_effect_entries_inner'
--
INSERT INTO move_change_effect_entries_inner (effect, short_effect, "language") VALUES (?, ?, ?);

--
-- UPDATE template for table 'move_change_effect_entries_inner'
--
UPDATE move_change_effect_entries_inner SET effect = ?, short_effect = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'move_change_effect_entries_inner'
--
DELETE FROM move_change_effect_entries_inner WHERE 1=2;


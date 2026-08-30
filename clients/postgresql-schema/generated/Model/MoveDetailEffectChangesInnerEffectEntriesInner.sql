--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveDetail_effect_changes_inner_effect_entries_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_detail_effect_changes_inner_effect_entries_inner'
--
SELECT effect, "language" FROM move_detail_effect_changes_inner_effect_entries_inner WHERE 1=1;

--
-- INSERT template for table 'move_detail_effect_changes_inner_effect_entries_inner'
--
INSERT INTO move_detail_effect_changes_inner_effect_entries_inner (effect, "language") VALUES (?, ?);

--
-- UPDATE template for table 'move_detail_effect_changes_inner_effect_entries_inner'
--
UPDATE move_detail_effect_changes_inner_effect_entries_inner SET effect = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'move_detail_effect_changes_inner_effect_entries_inner'
--
DELETE FROM move_detail_effect_changes_inner_effect_entries_inner WHERE 1=2;


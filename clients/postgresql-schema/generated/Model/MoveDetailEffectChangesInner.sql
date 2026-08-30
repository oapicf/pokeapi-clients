--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveDetail_effect_changes_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_detail_effect_changes_inner'
--
SELECT effect_entries, version_group FROM move_detail_effect_changes_inner WHERE 1=1;

--
-- INSERT template for table 'move_detail_effect_changes_inner'
--
INSERT INTO move_detail_effect_changes_inner (effect_entries, version_group) VALUES (?, ?);

--
-- UPDATE template for table 'move_detail_effect_changes_inner'
--
UPDATE move_detail_effect_changes_inner SET effect_entries = ?, version_group = ? WHERE 1=2;

--
-- DELETE template for table 'move_detail_effect_changes_inner'
--
DELETE FROM move_detail_effect_changes_inner WHERE 1=2;


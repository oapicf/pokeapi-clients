--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveComboUsage' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_combo_usage'
--
SELECT use_before, use_after FROM move_combo_usage WHERE 1=1;

--
-- INSERT template for table 'move_combo_usage'
--
INSERT INTO move_combo_usage (use_before, use_after) VALUES (?, ?);

--
-- UPDATE template for table 'move_combo_usage'
--
UPDATE move_combo_usage SET use_before = ?, use_after = ? WHERE 1=2;

--
-- DELETE template for table 'move_combo_usage'
--
DELETE FROM move_combo_usage WHERE 1=2;


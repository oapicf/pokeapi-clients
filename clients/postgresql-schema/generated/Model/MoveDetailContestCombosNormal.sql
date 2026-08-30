--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveDetail_contest_combos_normal' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_detail_contest_combos_normal'
--
SELECT use_before, use_after FROM move_detail_contest_combos_normal WHERE 1=1;

--
-- INSERT template for table 'move_detail_contest_combos_normal'
--
INSERT INTO move_detail_contest_combos_normal (use_before, use_after) VALUES (?, ?);

--
-- UPDATE template for table 'move_detail_contest_combos_normal'
--
UPDATE move_detail_contest_combos_normal SET use_before = ?, use_after = ? WHERE 1=2;

--
-- DELETE template for table 'move_detail_contest_combos_normal'
--
DELETE FROM move_detail_contest_combos_normal WHERE 1=2;


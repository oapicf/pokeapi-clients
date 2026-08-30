--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveDetail_contest_combos' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_detail_contest_combos'
--
SELECT normal, super FROM move_detail_contest_combos WHERE 1=1;

--
-- INSERT template for table 'move_detail_contest_combos'
--
INSERT INTO move_detail_contest_combos (normal, super) VALUES (?, ?);

--
-- UPDATE template for table 'move_detail_contest_combos'
--
UPDATE move_detail_contest_combos SET normal = ?, super = ? WHERE 1=2;

--
-- DELETE template for table 'move_detail_contest_combos'
--
DELETE FROM move_detail_contest_combos WHERE 1=2;


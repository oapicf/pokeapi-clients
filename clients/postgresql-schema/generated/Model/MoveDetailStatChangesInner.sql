--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveDetail_stat_changes_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_detail_stat_changes_inner'
--
SELECT change, stat FROM move_detail_stat_changes_inner WHERE 1=1;

--
-- INSERT template for table 'move_detail_stat_changes_inner'
--
INSERT INTO move_detail_stat_changes_inner (change, stat) VALUES (?, ?);

--
-- UPDATE template for table 'move_detail_stat_changes_inner'
--
UPDATE move_detail_stat_changes_inner SET change = ?, stat = ? WHERE 1=2;

--
-- DELETE template for table 'move_detail_stat_changes_inner'
--
DELETE FROM move_detail_stat_changes_inner WHERE 1=2;


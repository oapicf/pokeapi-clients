--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveMetaStatChange' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_meta_stat_change'
--
SELECT change, stat FROM move_meta_stat_change WHERE 1=1;

--
-- INSERT template for table 'move_meta_stat_change'
--
INSERT INTO move_meta_stat_change (change, stat) VALUES (?, ?);

--
-- UPDATE template for table 'move_meta_stat_change'
--
UPDATE move_meta_stat_change SET change = ?, stat = ? WHERE 1=2;

--
-- DELETE template for table 'move_meta_stat_change'
--
DELETE FROM move_meta_stat_change WHERE 1=2;


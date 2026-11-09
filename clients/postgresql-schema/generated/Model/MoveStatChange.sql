--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveStatChange' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_stat_change'
--
SELECT change, "move" FROM move_stat_change WHERE 1=1;

--
-- INSERT template for table 'move_stat_change'
--
INSERT INTO move_stat_change (change, "move") VALUES (?, ?);

--
-- UPDATE template for table 'move_stat_change'
--
UPDATE move_stat_change SET change = ?, "move" = ? WHERE 1=2;

--
-- DELETE template for table 'move_stat_change'
--
DELETE FROM move_stat_change WHERE 1=2;


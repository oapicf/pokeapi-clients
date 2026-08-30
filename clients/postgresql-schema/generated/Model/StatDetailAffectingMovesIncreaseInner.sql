--
-- "PokéAPI"
-- Prepared SQL queries for 'StatDetail_affecting_moves_increase_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'stat_detail_affecting_moves_increase_inner'
--
SELECT change, "move" FROM stat_detail_affecting_moves_increase_inner WHERE 1=1;

--
-- INSERT template for table 'stat_detail_affecting_moves_increase_inner'
--
INSERT INTO stat_detail_affecting_moves_increase_inner (change, "move") VALUES (?, ?);

--
-- UPDATE template for table 'stat_detail_affecting_moves_increase_inner'
--
UPDATE stat_detail_affecting_moves_increase_inner SET change = ?, "move" = ? WHERE 1=2;

--
-- DELETE template for table 'stat_detail_affecting_moves_increase_inner'
--
DELETE FROM stat_detail_affecting_moves_increase_inner WHERE 1=2;


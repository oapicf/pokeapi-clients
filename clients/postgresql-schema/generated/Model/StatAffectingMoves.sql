--
-- "PokéAPI"
-- Prepared SQL queries for 'StatAffectingMoves' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'stat_affecting_moves'
--
SELECT increase, decrease FROM stat_affecting_moves WHERE 1=1;

--
-- INSERT template for table 'stat_affecting_moves'
--
INSERT INTO stat_affecting_moves (increase, decrease) VALUES (?, ?);

--
-- UPDATE template for table 'stat_affecting_moves'
--
UPDATE stat_affecting_moves SET increase = ?, decrease = ? WHERE 1=2;

--
-- DELETE template for table 'stat_affecting_moves'
--
DELETE FROM stat_affecting_moves WHERE 1=2;


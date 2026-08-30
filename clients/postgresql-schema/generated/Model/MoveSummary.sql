--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_summary'
--
SELECT "name", url FROM move_summary WHERE 1=1;

--
-- INSERT template for table 'move_summary'
--
INSERT INTO move_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'move_summary'
--
UPDATE move_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'move_summary'
--
DELETE FROM move_summary WHERE 1=2;


--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveTargetSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_target_summary'
--
SELECT "name", url FROM move_target_summary WHERE 1=1;

--
-- INSERT template for table 'move_target_summary'
--
INSERT INTO move_target_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'move_target_summary'
--
UPDATE move_target_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'move_target_summary'
--
DELETE FROM move_target_summary WHERE 1=2;


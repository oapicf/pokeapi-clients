--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveTargetName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_target_name'
--
SELECT "name", "language" FROM move_target_name WHERE 1=1;

--
-- INSERT template for table 'move_target_name'
--
INSERT INTO move_target_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'move_target_name'
--
UPDATE move_target_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'move_target_name'
--
DELETE FROM move_target_name WHERE 1=2;


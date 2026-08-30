--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveTargetDescription' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_target_description'
--
SELECT description, "language" FROM move_target_description WHERE 1=1;

--
-- INSERT template for table 'move_target_description'
--
INSERT INTO move_target_description (description, "language") VALUES (?, ?);

--
-- UPDATE template for table 'move_target_description'
--
UPDATE move_target_description SET description = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'move_target_description'
--
DELETE FROM move_target_description WHERE 1=2;


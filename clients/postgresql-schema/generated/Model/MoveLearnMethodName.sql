--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveLearnMethodName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_learn_method_name'
--
SELECT "name", "language" FROM move_learn_method_name WHERE 1=1;

--
-- INSERT template for table 'move_learn_method_name'
--
INSERT INTO move_learn_method_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'move_learn_method_name'
--
UPDATE move_learn_method_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'move_learn_method_name'
--
DELETE FROM move_learn_method_name WHERE 1=2;


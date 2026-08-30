--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveLearnMethodDescription' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_learn_method_description'
--
SELECT description, "language" FROM move_learn_method_description WHERE 1=1;

--
-- INSERT template for table 'move_learn_method_description'
--
INSERT INTO move_learn_method_description (description, "language") VALUES (?, ?);

--
-- UPDATE template for table 'move_learn_method_description'
--
UPDATE move_learn_method_description SET description = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'move_learn_method_description'
--
DELETE FROM move_learn_method_description WHERE 1=2;


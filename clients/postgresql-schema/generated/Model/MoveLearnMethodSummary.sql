--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveLearnMethodSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_learn_method_summary'
--
SELECT "name", url FROM move_learn_method_summary WHERE 1=1;

--
-- INSERT template for table 'move_learn_method_summary'
--
INSERT INTO move_learn_method_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'move_learn_method_summary'
--
UPDATE move_learn_method_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'move_learn_method_summary'
--
DELETE FROM move_learn_method_summary WHERE 1=2;


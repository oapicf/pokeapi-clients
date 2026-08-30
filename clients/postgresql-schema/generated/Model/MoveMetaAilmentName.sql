--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveMetaAilmentName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_meta_ailment_name'
--
SELECT "name", "language" FROM move_meta_ailment_name WHERE 1=1;

--
-- INSERT template for table 'move_meta_ailment_name'
--
INSERT INTO move_meta_ailment_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'move_meta_ailment_name'
--
UPDATE move_meta_ailment_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'move_meta_ailment_name'
--
DELETE FROM move_meta_ailment_name WHERE 1=2;


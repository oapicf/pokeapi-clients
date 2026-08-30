--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveMetaCategoryDescription' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_meta_category_description'
--
SELECT description, "language" FROM move_meta_category_description WHERE 1=1;

--
-- INSERT template for table 'move_meta_category_description'
--
INSERT INTO move_meta_category_description (description, "language") VALUES (?, ?);

--
-- UPDATE template for table 'move_meta_category_description'
--
UPDATE move_meta_category_description SET description = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'move_meta_category_description'
--
DELETE FROM move_meta_category_description WHERE 1=2;


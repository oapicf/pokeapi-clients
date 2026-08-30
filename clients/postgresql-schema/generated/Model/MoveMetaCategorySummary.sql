--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveMetaCategorySummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_meta_category_summary'
--
SELECT "name", url FROM move_meta_category_summary WHERE 1=1;

--
-- INSERT template for table 'move_meta_category_summary'
--
INSERT INTO move_meta_category_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'move_meta_category_summary'
--
UPDATE move_meta_category_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'move_meta_category_summary'
--
DELETE FROM move_meta_category_summary WHERE 1=2;


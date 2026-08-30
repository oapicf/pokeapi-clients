--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveMetaAilmentSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_meta_ailment_summary'
--
SELECT "name", url FROM move_meta_ailment_summary WHERE 1=1;

--
-- INSERT template for table 'move_meta_ailment_summary'
--
INSERT INTO move_meta_ailment_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'move_meta_ailment_summary'
--
UPDATE move_meta_ailment_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'move_meta_ailment_summary'
--
DELETE FROM move_meta_ailment_summary WHERE 1=2;


--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveDamageClassSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_damage_class_summary'
--
SELECT "name", url FROM move_damage_class_summary WHERE 1=1;

--
-- INSERT template for table 'move_damage_class_summary'
--
INSERT INTO move_damage_class_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'move_damage_class_summary'
--
UPDATE move_damage_class_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'move_damage_class_summary'
--
DELETE FROM move_damage_class_summary WHERE 1=2;


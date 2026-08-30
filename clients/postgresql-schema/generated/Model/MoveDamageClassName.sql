--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveDamageClassName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_damage_class_name'
--
SELECT "name", "language" FROM move_damage_class_name WHERE 1=1;

--
-- INSERT template for table 'move_damage_class_name'
--
INSERT INTO move_damage_class_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'move_damage_class_name'
--
UPDATE move_damage_class_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'move_damage_class_name'
--
DELETE FROM move_damage_class_name WHERE 1=2;


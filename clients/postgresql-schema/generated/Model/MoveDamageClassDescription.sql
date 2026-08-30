--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveDamageClassDescription' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_damage_class_description'
--
SELECT description, "language" FROM move_damage_class_description WHERE 1=1;

--
-- INSERT template for table 'move_damage_class_description'
--
INSERT INTO move_damage_class_description (description, "language") VALUES (?, ?);

--
-- UPDATE template for table 'move_damage_class_description'
--
UPDATE move_damage_class_description SET description = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'move_damage_class_description'
--
DELETE FROM move_damage_class_description WHERE 1=2;


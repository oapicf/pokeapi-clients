--
-- "PokéAPI"
-- Prepared SQL queries for 'TypeRelationships' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'type_relationships'
--
SELECT no_damage_to, half_damage_to, double_damage_to, no_damage_from, half_damage_from, double_damage_from FROM type_relationships WHERE 1=1;

--
-- INSERT template for table 'type_relationships'
--
INSERT INTO type_relationships (no_damage_to, half_damage_to, double_damage_to, no_damage_from, half_damage_from, double_damage_from) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'type_relationships'
--
UPDATE type_relationships SET no_damage_to = ?, half_damage_to = ?, double_damage_to = ?, no_damage_from = ?, half_damage_from = ?, double_damage_from = ? WHERE 1=2;

--
-- DELETE template for table 'type_relationships'
--
DELETE FROM type_relationships WHERE 1=2;


--
-- "PokéAPI"
-- Prepared SQL queries for 'TypePastRelationships' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'type_past_relationships'
--
SELECT generation, damage_relations FROM type_past_relationships WHERE 1=1;

--
-- INSERT template for table 'type_past_relationships'
--
INSERT INTO type_past_relationships (generation, damage_relations) VALUES (?, ?);

--
-- UPDATE template for table 'type_past_relationships'
--
UPDATE type_past_relationships SET generation = ?, damage_relations = ? WHERE 1=2;

--
-- DELETE template for table 'type_past_relationships'
--
DELETE FROM type_past_relationships WHERE 1=2;


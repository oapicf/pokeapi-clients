--
-- "PokéAPI"
-- Prepared SQL queries for 'TypeDetail_past_damage_relations_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'type_detail_past_damage_relations_inner'
--
SELECT generation, damage_relations FROM type_detail_past_damage_relations_inner WHERE 1=1;

--
-- INSERT template for table 'type_detail_past_damage_relations_inner'
--
INSERT INTO type_detail_past_damage_relations_inner (generation, damage_relations) VALUES (?, ?);

--
-- UPDATE template for table 'type_detail_past_damage_relations_inner'
--
UPDATE type_detail_past_damage_relations_inner SET generation = ?, damage_relations = ? WHERE 1=2;

--
-- DELETE template for table 'type_detail_past_damage_relations_inner'
--
DELETE FROM type_detail_past_damage_relations_inner WHERE 1=2;


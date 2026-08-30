--
-- "PokéAPI"
-- Prepared SQL queries for 'TypeDetail_past_damage_relations_inner_damage_relations' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'type_detail_past_damage_relations_inner_damage_relations'
--
SELECT no_damage_to, half_damage_to, double_damage_to, no_damage_from, half_damage_from, double_damage_from FROM type_detail_past_damage_relations_inner_damage_relations WHERE 1=1;

--
-- INSERT template for table 'type_detail_past_damage_relations_inner_damage_relations'
--
INSERT INTO type_detail_past_damage_relations_inner_damage_relations (no_damage_to, half_damage_to, double_damage_to, no_damage_from, half_damage_from, double_damage_from) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'type_detail_past_damage_relations_inner_damage_relations'
--
UPDATE type_detail_past_damage_relations_inner_damage_relations SET no_damage_to = ?, half_damage_to = ?, double_damage_to = ?, no_damage_from = ?, half_damage_from = ?, double_damage_from = ? WHERE 1=2;

--
-- DELETE template for table 'type_detail_past_damage_relations_inner_damage_relations'
--
DELETE FROM type_detail_past_damage_relations_inner_damage_relations WHERE 1=2;


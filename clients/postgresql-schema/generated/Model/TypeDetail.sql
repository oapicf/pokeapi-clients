--
-- "PokéAPI"
-- Prepared SQL queries for 'TypeDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'type_detail'
--
SELECT "id", "name", damage_relations, past_damage_relations, game_indices, generation, move_damage_class, "names", pokemon, moves, sprites FROM type_detail WHERE 1=1;

--
-- INSERT template for table 'type_detail'
--
INSERT INTO type_detail ("id", "name", damage_relations, past_damage_relations, game_indices, generation, move_damage_class, "names", pokemon, moves, sprites) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'type_detail'
--
UPDATE type_detail SET "id" = ?, "name" = ?, damage_relations = ?, past_damage_relations = ?, game_indices = ?, generation = ?, move_damage_class = ?, "names" = ?, pokemon = ?, moves = ?, sprites = ? WHERE 1=2;

--
-- DELETE template for table 'type_detail'
--
DELETE FROM type_detail WHERE 1=2;


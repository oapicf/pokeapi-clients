--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonDetail_moves_inner_version_group_details_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_detail_moves_inner_version_group_details_inner'
--
SELECT level_learned_at, move_learn_method, version_group FROM pokemon_detail_moves_inner_version_group_details_inner WHERE 1=1;

--
-- INSERT template for table 'pokemon_detail_moves_inner_version_group_details_inner'
--
INSERT INTO pokemon_detail_moves_inner_version_group_details_inner (level_learned_at, move_learn_method, version_group) VALUES (?, ?, ?);

--
-- UPDATE template for table 'pokemon_detail_moves_inner_version_group_details_inner'
--
UPDATE pokemon_detail_moves_inner_version_group_details_inner SET level_learned_at = ?, move_learn_method = ?, version_group = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_detail_moves_inner_version_group_details_inner'
--
DELETE FROM pokemon_detail_moves_inner_version_group_details_inner WHERE 1=2;


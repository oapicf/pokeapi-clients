--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonMoveVersionGroup' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_move_version_group'
--
SELECT level_learned_at, move_learn_method, version_group, "order" FROM pokemon_move_version_group WHERE 1=1;

--
-- INSERT template for table 'pokemon_move_version_group'
--
INSERT INTO pokemon_move_version_group (level_learned_at, move_learn_method, version_group, "order") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'pokemon_move_version_group'
--
UPDATE pokemon_move_version_group SET level_learned_at = ?, move_learn_method = ?, version_group = ?, "order" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_move_version_group'
--
DELETE FROM pokemon_move_version_group WHERE 1=2;


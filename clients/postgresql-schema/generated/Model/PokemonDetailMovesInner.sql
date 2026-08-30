--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonDetail_moves_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_detail_moves_inner'
--
SELECT "move", version_group_details FROM pokemon_detail_moves_inner WHERE 1=1;

--
-- INSERT template for table 'pokemon_detail_moves_inner'
--
INSERT INTO pokemon_detail_moves_inner ("move", version_group_details) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_detail_moves_inner'
--
UPDATE pokemon_detail_moves_inner SET "move" = ?, version_group_details = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_detail_moves_inner'
--
DELETE FROM pokemon_detail_moves_inner WHERE 1=2;


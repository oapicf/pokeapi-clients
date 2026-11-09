--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonEvolution_known_move' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_evolution_known_move'
--
SELECT "name", url FROM pokemon_evolution_known_move WHERE 1=1;

--
-- INSERT template for table 'pokemon_evolution_known_move'
--
INSERT INTO pokemon_evolution_known_move ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_evolution_known_move'
--
UPDATE pokemon_evolution_known_move SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_evolution_known_move'
--
DELETE FROM pokemon_evolution_known_move WHERE 1=2;


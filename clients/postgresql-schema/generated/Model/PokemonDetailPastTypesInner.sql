--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonDetail_past_types_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_detail_past_types_inner'
--
SELECT generation, "types" FROM pokemon_detail_past_types_inner WHERE 1=1;

--
-- INSERT template for table 'pokemon_detail_past_types_inner'
--
INSERT INTO pokemon_detail_past_types_inner (generation, "types") VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_detail_past_types_inner'
--
UPDATE pokemon_detail_past_types_inner SET generation = ?, "types" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_detail_past_types_inner'
--
DELETE FROM pokemon_detail_past_types_inner WHERE 1=2;


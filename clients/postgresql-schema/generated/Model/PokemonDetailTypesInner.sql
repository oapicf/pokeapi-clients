--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonDetail_types_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_detail_types_inner'
--
SELECT slot, "type" FROM pokemon_detail_types_inner WHERE 1=1;

--
-- INSERT template for table 'pokemon_detail_types_inner'
--
INSERT INTO pokemon_detail_types_inner (slot, "type") VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_detail_types_inner'
--
UPDATE pokemon_detail_types_inner SET slot = ?, "type" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_detail_types_inner'
--
DELETE FROM pokemon_detail_types_inner WHERE 1=2;


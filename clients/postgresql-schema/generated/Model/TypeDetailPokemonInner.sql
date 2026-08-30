--
-- "PokéAPI"
-- Prepared SQL queries for 'TypeDetail_pokemon_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'type_detail_pokemon_inner'
--
SELECT slot, pokemon FROM type_detail_pokemon_inner WHERE 1=1;

--
-- INSERT template for table 'type_detail_pokemon_inner'
--
INSERT INTO type_detail_pokemon_inner (slot, pokemon) VALUES (?, ?);

--
-- UPDATE template for table 'type_detail_pokemon_inner'
--
UPDATE type_detail_pokemon_inner SET slot = ?, pokemon = ? WHERE 1=2;

--
-- DELETE template for table 'type_detail_pokemon_inner'
--
DELETE FROM type_detail_pokemon_inner WHERE 1=2;


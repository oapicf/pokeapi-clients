--
-- "PokéAPI"
-- Prepared SQL queries for 'TypePokemon' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'type_pokemon'
--
SELECT slot, pokemon FROM type_pokemon WHERE 1=1;

--
-- INSERT template for table 'type_pokemon'
--
INSERT INTO type_pokemon (slot, pokemon) VALUES (?, ?);

--
-- UPDATE template for table 'type_pokemon'
--
UPDATE type_pokemon SET slot = ?, pokemon = ? WHERE 1=2;

--
-- DELETE template for table 'type_pokemon'
--
DELETE FROM type_pokemon WHERE 1=2;


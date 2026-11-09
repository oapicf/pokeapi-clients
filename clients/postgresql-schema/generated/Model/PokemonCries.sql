--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonCries' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_cries'
--
SELECT latest, legacy FROM pokemon_cries WHERE 1=1;

--
-- INSERT template for table 'pokemon_cries'
--
INSERT INTO pokemon_cries (latest, legacy) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_cries'
--
UPDATE pokemon_cries SET latest = ?, legacy = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_cries'
--
DELETE FROM pokemon_cries WHERE 1=2;


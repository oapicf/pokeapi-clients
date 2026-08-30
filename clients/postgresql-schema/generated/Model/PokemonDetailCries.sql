--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonDetail_cries' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_detail_cries'
--
SELECT latest, legacy FROM pokemon_detail_cries WHERE 1=1;

--
-- INSERT template for table 'pokemon_detail_cries'
--
INSERT INTO pokemon_detail_cries (latest, legacy) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_detail_cries'
--
UPDATE pokemon_detail_cries SET latest = ?, legacy = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_detail_cries'
--
DELETE FROM pokemon_detail_cries WHERE 1=2;


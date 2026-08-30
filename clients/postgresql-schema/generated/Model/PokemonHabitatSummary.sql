--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonHabitatSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_habitat_summary'
--
SELECT "name", url FROM pokemon_habitat_summary WHERE 1=1;

--
-- INSERT template for table 'pokemon_habitat_summary'
--
INSERT INTO pokemon_habitat_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_habitat_summary'
--
UPDATE pokemon_habitat_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_habitat_summary'
--
DELETE FROM pokemon_habitat_summary WHERE 1=2;


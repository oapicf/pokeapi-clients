--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonHabitatName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_habitat_name'
--
SELECT "name", "language" FROM pokemon_habitat_name WHERE 1=1;

--
-- INSERT template for table 'pokemon_habitat_name'
--
INSERT INTO pokemon_habitat_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_habitat_name'
--
UPDATE pokemon_habitat_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_habitat_name'
--
DELETE FROM pokemon_habitat_name WHERE 1=2;


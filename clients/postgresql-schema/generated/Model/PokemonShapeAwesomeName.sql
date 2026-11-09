--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonShapeAwesomeName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_shape_awesome_name'
--
SELECT awesome_name, "language" FROM pokemon_shape_awesome_name WHERE 1=1;

--
-- INSERT template for table 'pokemon_shape_awesome_name'
--
INSERT INTO pokemon_shape_awesome_name (awesome_name, "language") VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_shape_awesome_name'
--
UPDATE pokemon_shape_awesome_name SET awesome_name = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_shape_awesome_name'
--
DELETE FROM pokemon_shape_awesome_name WHERE 1=2;


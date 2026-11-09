--
-- "PokéAPI"
-- Prepared SQL queries for 'EvolutionChainLink' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'evolution_chain_link'
--
SELECT is_baby, species, evolution_details, evolves_to FROM evolution_chain_link WHERE 1=1;

--
-- INSERT template for table 'evolution_chain_link'
--
INSERT INTO evolution_chain_link (is_baby, species, evolution_details, evolves_to) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'evolution_chain_link'
--
UPDATE evolution_chain_link SET is_baby = ?, species = ?, evolution_details = ?, evolves_to = ? WHERE 1=2;

--
-- DELETE template for table 'evolution_chain_link'
--
DELETE FROM evolution_chain_link WHERE 1=2;


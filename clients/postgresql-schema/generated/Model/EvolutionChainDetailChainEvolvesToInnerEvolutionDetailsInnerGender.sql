--
-- "PokéAPI"
-- Prepared SQL queries for 'EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'evolution_chain_detail_chain_evolves_to_inner_evolution_details'
--
SELECT "name", url FROM evolution_chain_detail_chain_evolves_to_inner_evolution_details WHERE 1=1;

--
-- INSERT template for table 'evolution_chain_detail_chain_evolves_to_inner_evolution_details'
--
INSERT INTO evolution_chain_detail_chain_evolves_to_inner_evolution_details ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'evolution_chain_detail_chain_evolves_to_inner_evolution_details'
--
UPDATE evolution_chain_detail_chain_evolves_to_inner_evolution_details SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'evolution_chain_detail_chain_evolves_to_inner_evolution_details'
--
DELETE FROM evolution_chain_detail_chain_evolves_to_inner_evolution_details WHERE 1=2;


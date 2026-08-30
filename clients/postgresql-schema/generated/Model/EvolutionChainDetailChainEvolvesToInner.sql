--
-- "PokéAPI"
-- Prepared SQL queries for 'EvolutionChainDetail_chain_evolves_to_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'evolution_chain_detail_chain_evolves_to_inner'
--
SELECT evolution_details, is_baby, species FROM evolution_chain_detail_chain_evolves_to_inner WHERE 1=1;

--
-- INSERT template for table 'evolution_chain_detail_chain_evolves_to_inner'
--
INSERT INTO evolution_chain_detail_chain_evolves_to_inner (evolution_details, is_baby, species) VALUES (?, ?, ?);

--
-- UPDATE template for table 'evolution_chain_detail_chain_evolves_to_inner'
--
UPDATE evolution_chain_detail_chain_evolves_to_inner SET evolution_details = ?, is_baby = ?, species = ? WHERE 1=2;

--
-- DELETE template for table 'evolution_chain_detail_chain_evolves_to_inner'
--
DELETE FROM evolution_chain_detail_chain_evolves_to_inner WHERE 1=2;


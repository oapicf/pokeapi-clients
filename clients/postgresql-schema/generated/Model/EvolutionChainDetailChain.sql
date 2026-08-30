--
-- "PokéAPI"
-- Prepared SQL queries for 'EvolutionChainDetail_chain' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'evolution_chain_detail_chain'
--
SELECT evolution_details, evolves_to, is_baby, species FROM evolution_chain_detail_chain WHERE 1=1;

--
-- INSERT template for table 'evolution_chain_detail_chain'
--
INSERT INTO evolution_chain_detail_chain (evolution_details, evolves_to, is_baby, species) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'evolution_chain_detail_chain'
--
UPDATE evolution_chain_detail_chain SET evolution_details = ?, evolves_to = ?, is_baby = ?, species = ? WHERE 1=2;

--
-- DELETE template for table 'evolution_chain_detail_chain'
--
DELETE FROM evolution_chain_detail_chain WHERE 1=2;


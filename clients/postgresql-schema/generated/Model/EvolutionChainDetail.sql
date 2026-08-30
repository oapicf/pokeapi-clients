--
-- "PokéAPI"
-- Prepared SQL queries for 'EvolutionChainDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'evolution_chain_detail'
--
SELECT "id", baby_trigger_item, "chain" FROM evolution_chain_detail WHERE 1=1;

--
-- INSERT template for table 'evolution_chain_detail'
--
INSERT INTO evolution_chain_detail ("id", baby_trigger_item, "chain") VALUES (?, ?, ?);

--
-- UPDATE template for table 'evolution_chain_detail'
--
UPDATE evolution_chain_detail SET "id" = ?, baby_trigger_item = ?, "chain" = ? WHERE 1=2;

--
-- DELETE template for table 'evolution_chain_detail'
--
DELETE FROM evolution_chain_detail WHERE 1=2;


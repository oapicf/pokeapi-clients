--
-- "PokéAPI"
-- Prepared SQL queries for 'EvolutionVariableDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'evolution_variable_detail'
--
SELECT "id", "name", symbol, data_type, "source", version_group, "names", descriptions FROM evolution_variable_detail WHERE 1=1;

--
-- INSERT template for table 'evolution_variable_detail'
--
INSERT INTO evolution_variable_detail ("id", "name", symbol, data_type, "source", version_group, "names", descriptions) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'evolution_variable_detail'
--
UPDATE evolution_variable_detail SET "id" = ?, "name" = ?, symbol = ?, data_type = ?, "source" = ?, version_group = ?, "names" = ?, descriptions = ? WHERE 1=2;

--
-- DELETE template for table 'evolution_variable_detail'
--
DELETE FROM evolution_variable_detail WHERE 1=2;


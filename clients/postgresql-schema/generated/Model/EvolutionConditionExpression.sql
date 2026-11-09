--
-- "PokéAPI"
-- Prepared SQL queries for 'EvolutionConditionExpression' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'evolution_condition_expression'
--
SELECT "expression", percentage_chance, variables FROM evolution_condition_expression WHERE 1=1;

--
-- INSERT template for table 'evolution_condition_expression'
--
INSERT INTO evolution_condition_expression ("expression", percentage_chance, variables) VALUES (?, ?, ?);

--
-- UPDATE template for table 'evolution_condition_expression'
--
UPDATE evolution_condition_expression SET "expression" = ?, percentage_chance = ?, variables = ? WHERE 1=2;

--
-- DELETE template for table 'evolution_condition_expression'
--
DELETE FROM evolution_condition_expression WHERE 1=2;


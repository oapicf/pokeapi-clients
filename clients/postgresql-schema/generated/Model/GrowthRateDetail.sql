--
-- "PokéAPI"
-- Prepared SQL queries for 'GrowthRateDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'growth_rate_detail'
--
SELECT "id", "name", formula, descriptions, levels, pokemon_species FROM growth_rate_detail WHERE 1=1;

--
-- INSERT template for table 'growth_rate_detail'
--
INSERT INTO growth_rate_detail ("id", "name", formula, descriptions, levels, pokemon_species) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'growth_rate_detail'
--
UPDATE growth_rate_detail SET "id" = ?, "name" = ?, formula = ?, descriptions = ?, levels = ?, pokemon_species = ? WHERE 1=2;

--
-- DELETE template for table 'growth_rate_detail'
--
DELETE FROM growth_rate_detail WHERE 1=2;


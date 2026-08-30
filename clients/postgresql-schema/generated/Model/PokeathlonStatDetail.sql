--
-- "PokéAPI"
-- Prepared SQL queries for 'PokeathlonStatDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokeathlon_stat_detail'
--
SELECT "id", "name", affecting_natures, "names" FROM pokeathlon_stat_detail WHERE 1=1;

--
-- INSERT template for table 'pokeathlon_stat_detail'
--
INSERT INTO pokeathlon_stat_detail ("id", "name", affecting_natures, "names") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'pokeathlon_stat_detail'
--
UPDATE pokeathlon_stat_detail SET "id" = ?, "name" = ?, affecting_natures = ?, "names" = ? WHERE 1=2;

--
-- DELETE template for table 'pokeathlon_stat_detail'
--
DELETE FROM pokeathlon_stat_detail WHERE 1=2;


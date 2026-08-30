--
-- "PokéAPI"
-- Prepared SQL queries for 'PokeathlonStatDetail_affecting_natures_increase_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokeathlon_stat_detail_affecting_natures_increase_inner'
--
SELECT max_change, nature FROM pokeathlon_stat_detail_affecting_natures_increase_inner WHERE 1=1;

--
-- INSERT template for table 'pokeathlon_stat_detail_affecting_natures_increase_inner'
--
INSERT INTO pokeathlon_stat_detail_affecting_natures_increase_inner (max_change, nature) VALUES (?, ?);

--
-- UPDATE template for table 'pokeathlon_stat_detail_affecting_natures_increase_inner'
--
UPDATE pokeathlon_stat_detail_affecting_natures_increase_inner SET max_change = ?, nature = ? WHERE 1=2;

--
-- DELETE template for table 'pokeathlon_stat_detail_affecting_natures_increase_inner'
--
DELETE FROM pokeathlon_stat_detail_affecting_natures_increase_inner WHERE 1=2;


--
-- "PokéAPI"
-- Prepared SQL queries for 'PokeathlonStatDetail_affecting_natures' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokeathlon_stat_detail_affecting_natures'
--
SELECT decrease, increase FROM pokeathlon_stat_detail_affecting_natures WHERE 1=1;

--
-- INSERT template for table 'pokeathlon_stat_detail_affecting_natures'
--
INSERT INTO pokeathlon_stat_detail_affecting_natures (decrease, increase) VALUES (?, ?);

--
-- UPDATE template for table 'pokeathlon_stat_detail_affecting_natures'
--
UPDATE pokeathlon_stat_detail_affecting_natures SET decrease = ?, increase = ? WHERE 1=2;

--
-- DELETE template for table 'pokeathlon_stat_detail_affecting_natures'
--
DELETE FROM pokeathlon_stat_detail_affecting_natures WHERE 1=2;


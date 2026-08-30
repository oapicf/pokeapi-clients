--
-- "PokéAPI"
-- Prepared SQL queries for 'NatureDetail_pokeathlon_stat_changes_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'nature_detail_pokeathlon_stat_changes_inner'
--
SELECT max_change, pokeathlon_stat FROM nature_detail_pokeathlon_stat_changes_inner WHERE 1=1;

--
-- INSERT template for table 'nature_detail_pokeathlon_stat_changes_inner'
--
INSERT INTO nature_detail_pokeathlon_stat_changes_inner (max_change, pokeathlon_stat) VALUES (?, ?);

--
-- UPDATE template for table 'nature_detail_pokeathlon_stat_changes_inner'
--
UPDATE nature_detail_pokeathlon_stat_changes_inner SET max_change = ?, pokeathlon_stat = ? WHERE 1=2;

--
-- DELETE template for table 'nature_detail_pokeathlon_stat_changes_inner'
--
DELETE FROM nature_detail_pokeathlon_stat_changes_inner WHERE 1=2;


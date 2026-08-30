--
-- "PokéAPI"
-- Prepared SQL queries for 'PokeathlonStatSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokeathlon_stat_summary'
--
SELECT "name", url FROM pokeathlon_stat_summary WHERE 1=1;

--
-- INSERT template for table 'pokeathlon_stat_summary'
--
INSERT INTO pokeathlon_stat_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'pokeathlon_stat_summary'
--
UPDATE pokeathlon_stat_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'pokeathlon_stat_summary'
--
DELETE FROM pokeathlon_stat_summary WHERE 1=2;


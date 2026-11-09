--
-- "PokéAPI"
-- Prepared SQL queries for 'PokeathlonStatAffectingNatures' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokeathlon_stat_affecting_natures'
--
SELECT increase, decrease FROM pokeathlon_stat_affecting_natures WHERE 1=1;

--
-- INSERT template for table 'pokeathlon_stat_affecting_natures'
--
INSERT INTO pokeathlon_stat_affecting_natures (increase, decrease) VALUES (?, ?);

--
-- UPDATE template for table 'pokeathlon_stat_affecting_natures'
--
UPDATE pokeathlon_stat_affecting_natures SET increase = ?, decrease = ? WHERE 1=2;

--
-- DELETE template for table 'pokeathlon_stat_affecting_natures'
--
DELETE FROM pokeathlon_stat_affecting_natures WHERE 1=2;


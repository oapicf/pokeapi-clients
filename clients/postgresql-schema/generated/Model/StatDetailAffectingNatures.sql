--
-- "PokéAPI"
-- Prepared SQL queries for 'StatDetail_affecting_natures' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'stat_detail_affecting_natures'
--
SELECT increase, decrease FROM stat_detail_affecting_natures WHERE 1=1;

--
-- INSERT template for table 'stat_detail_affecting_natures'
--
INSERT INTO stat_detail_affecting_natures (increase, decrease) VALUES (?, ?);

--
-- UPDATE template for table 'stat_detail_affecting_natures'
--
UPDATE stat_detail_affecting_natures SET increase = ?, decrease = ? WHERE 1=2;

--
-- DELETE template for table 'stat_detail_affecting_natures'
--
DELETE FROM stat_detail_affecting_natures WHERE 1=2;


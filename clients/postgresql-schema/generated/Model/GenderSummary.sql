--
-- "PokéAPI"
-- Prepared SQL queries for 'GenderSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'gender_summary'
--
SELECT "name", url FROM gender_summary WHERE 1=1;

--
-- INSERT template for table 'gender_summary'
--
INSERT INTO gender_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'gender_summary'
--
UPDATE gender_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'gender_summary'
--
DELETE FROM gender_summary WHERE 1=2;


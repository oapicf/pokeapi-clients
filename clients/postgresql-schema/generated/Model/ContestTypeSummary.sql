--
-- "PokéAPI"
-- Prepared SQL queries for 'ContestTypeSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'contest_type_summary'
--
SELECT "name", url FROM contest_type_summary WHERE 1=1;

--
-- INSERT template for table 'contest_type_summary'
--
INSERT INTO contest_type_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'contest_type_summary'
--
UPDATE contest_type_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'contest_type_summary'
--
DELETE FROM contest_type_summary WHERE 1=2;


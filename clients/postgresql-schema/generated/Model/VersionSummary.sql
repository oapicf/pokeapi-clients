--
-- "PokéAPI"
-- Prepared SQL queries for 'VersionSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'version_summary'
--
SELECT "name", url FROM version_summary WHERE 1=1;

--
-- INSERT template for table 'version_summary'
--
INSERT INTO version_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'version_summary'
--
UPDATE version_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'version_summary'
--
DELETE FROM version_summary WHERE 1=2;


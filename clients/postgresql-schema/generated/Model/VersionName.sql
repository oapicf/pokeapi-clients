--
-- "PokéAPI"
-- Prepared SQL queries for 'VersionName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'version_name'
--
SELECT "name", "language" FROM version_name WHERE 1=1;

--
-- INSERT template for table 'version_name'
--
INSERT INTO version_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'version_name'
--
UPDATE version_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'version_name'
--
DELETE FROM version_name WHERE 1=2;


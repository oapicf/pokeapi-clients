--
-- "PokéAPI"
-- Prepared SQL queries for 'LanguageName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'language_name'
--
SELECT "name", "language" FROM language_name WHERE 1=1;

--
-- INSERT template for table 'language_name'
--
INSERT INTO language_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'language_name'
--
UPDATE language_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'language_name'
--
DELETE FROM language_name WHERE 1=2;


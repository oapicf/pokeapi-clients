--
-- "PokéAPI"
-- Prepared SQL queries for 'Experience' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'experience'
--
SELECT "level", experience FROM experience WHERE 1=1;

--
-- INSERT template for table 'experience'
--
INSERT INTO experience ("level", experience) VALUES (?, ?);

--
-- UPDATE template for table 'experience'
--
UPDATE experience SET "level" = ?, experience = ? WHERE 1=2;

--
-- DELETE template for table 'experience'
--
DELETE FROM experience WHERE 1=2;


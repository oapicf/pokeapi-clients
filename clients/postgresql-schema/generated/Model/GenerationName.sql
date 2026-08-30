--
-- "PokéAPI"
-- Prepared SQL queries for 'GenerationName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'generation_name'
--
SELECT "name", "language" FROM generation_name WHERE 1=1;

--
-- INSERT template for table 'generation_name'
--
INSERT INTO generation_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'generation_name'
--
UPDATE generation_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'generation_name'
--
DELETE FROM generation_name WHERE 1=2;


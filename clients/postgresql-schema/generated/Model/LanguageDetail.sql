--
-- "PokéAPI"
-- Prepared SQL queries for 'LanguageDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'language_detail'
--
SELECT "id", "name", official, iso639, iso3166, "names" FROM language_detail WHERE 1=1;

--
-- INSERT template for table 'language_detail'
--
INSERT INTO language_detail ("id", "name", official, iso639, iso3166, "names") VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'language_detail'
--
UPDATE language_detail SET "id" = ?, "name" = ?, official = ?, iso639 = ?, iso3166 = ?, "names" = ? WHERE 1=2;

--
-- DELETE template for table 'language_detail'
--
DELETE FROM language_detail WHERE 1=2;


--
-- "PokéAPI"
-- Prepared SQL queries for 'BerryDetail_flavors_inner_flavor' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'berry_detail_flavors_inner_flavor'
--
SELECT "name", url FROM berry_detail_flavors_inner_flavor WHERE 1=1;

--
-- INSERT template for table 'berry_detail_flavors_inner_flavor'
--
INSERT INTO berry_detail_flavors_inner_flavor ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'berry_detail_flavors_inner_flavor'
--
UPDATE berry_detail_flavors_inner_flavor SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'berry_detail_flavors_inner_flavor'
--
DELETE FROM berry_detail_flavors_inner_flavor WHERE 1=2;


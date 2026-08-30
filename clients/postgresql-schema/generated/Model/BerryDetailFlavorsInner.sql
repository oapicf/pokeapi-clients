--
-- "PokéAPI"
-- Prepared SQL queries for 'BerryDetail_flavors_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'berry_detail_flavors_inner'
--
SELECT potency, flavor FROM berry_detail_flavors_inner WHERE 1=1;

--
-- INSERT template for table 'berry_detail_flavors_inner'
--
INSERT INTO berry_detail_flavors_inner (potency, flavor) VALUES (?, ?);

--
-- UPDATE template for table 'berry_detail_flavors_inner'
--
UPDATE berry_detail_flavors_inner SET potency = ?, flavor = ? WHERE 1=2;

--
-- DELETE template for table 'berry_detail_flavors_inner'
--
DELETE FROM berry_detail_flavors_inner WHERE 1=2;


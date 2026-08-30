--
-- "PokéAPI"
-- Prepared SQL queries for 'BerryFlavorDetail_berries_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'berry_flavor_detail_berries_inner'
--
SELECT potency, berry FROM berry_flavor_detail_berries_inner WHERE 1=1;

--
-- INSERT template for table 'berry_flavor_detail_berries_inner'
--
INSERT INTO berry_flavor_detail_berries_inner (potency, berry) VALUES (?, ?);

--
-- UPDATE template for table 'berry_flavor_detail_berries_inner'
--
UPDATE berry_flavor_detail_berries_inner SET potency = ?, berry = ? WHERE 1=2;

--
-- DELETE template for table 'berry_flavor_detail_berries_inner'
--
DELETE FROM berry_flavor_detail_berries_inner WHERE 1=2;


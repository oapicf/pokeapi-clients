--
-- "PokéAPI"
-- Prepared SQL queries for 'BerryFlavorDetail_berries_inner_berry' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'berry_flavor_detail_berries_inner_berry'
--
SELECT "name", url FROM berry_flavor_detail_berries_inner_berry WHERE 1=1;

--
-- INSERT template for table 'berry_flavor_detail_berries_inner_berry'
--
INSERT INTO berry_flavor_detail_berries_inner_berry ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'berry_flavor_detail_berries_inner_berry'
--
UPDATE berry_flavor_detail_berries_inner_berry SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'berry_flavor_detail_berries_inner_berry'
--
DELETE FROM berry_flavor_detail_berries_inner_berry WHERE 1=2;


--
-- "PokéAPI"
-- Prepared SQL queries for 'BerryFlavorBerryMap' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'berry_flavor_berry_map'
--
SELECT potency, berry FROM berry_flavor_berry_map WHERE 1=1;

--
-- INSERT template for table 'berry_flavor_berry_map'
--
INSERT INTO berry_flavor_berry_map (potency, berry) VALUES (?, ?);

--
-- UPDATE template for table 'berry_flavor_berry_map'
--
UPDATE berry_flavor_berry_map SET potency = ?, berry = ? WHERE 1=2;

--
-- DELETE template for table 'berry_flavor_berry_map'
--
DELETE FROM berry_flavor_berry_map WHERE 1=2;


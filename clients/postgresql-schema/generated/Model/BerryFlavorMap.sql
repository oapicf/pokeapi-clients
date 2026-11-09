--
-- "PokéAPI"
-- Prepared SQL queries for 'BerryFlavorMap' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'berry_flavor_map'
--
SELECT potency, flavor FROM berry_flavor_map WHERE 1=1;

--
-- INSERT template for table 'berry_flavor_map'
--
INSERT INTO berry_flavor_map (potency, flavor) VALUES (?, ?);

--
-- UPDATE template for table 'berry_flavor_map'
--
UPDATE berry_flavor_map SET potency = ?, flavor = ? WHERE 1=2;

--
-- DELETE template for table 'berry_flavor_map'
--
DELETE FROM berry_flavor_map WHERE 1=2;


--
-- "PokéAPI"
-- Prepared SQL queries for 'CharacteristicDescription' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'characteristic_description'
--
SELECT description, "language" FROM characteristic_description WHERE 1=1;

--
-- INSERT template for table 'characteristic_description'
--
INSERT INTO characteristic_description (description, "language") VALUES (?, ?);

--
-- UPDATE template for table 'characteristic_description'
--
UPDATE characteristic_description SET description = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'characteristic_description'
--
DELETE FROM characteristic_description WHERE 1=2;


--
-- "PokéAPI"
-- Prepared SQL queries for 'PokeapiMetaResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokeapi_meta_response'
--
SELECT deploy_date, hash, tag FROM pokeapi_meta_response WHERE 1=1;

--
-- INSERT template for table 'pokeapi_meta_response'
--
INSERT INTO pokeapi_meta_response (deploy_date, hash, tag) VALUES (?, ?, ?);

--
-- UPDATE template for table 'pokeapi_meta_response'
--
UPDATE pokeapi_meta_response SET deploy_date = ?, hash = ?, tag = ? WHERE 1=2;

--
-- DELETE template for table 'pokeapi_meta_response'
--
DELETE FROM pokeapi_meta_response WHERE 1=2;


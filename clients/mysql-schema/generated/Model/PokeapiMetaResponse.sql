--
-- PokéAPI.
-- Prepared SQL queries for 'PokeapiMetaResponse' definition.
--


--
-- SELECT template for table `PokeapiMetaResponse`
--
SELECT `deploy_date`, `hash`, `tag` FROM `PokeapiMetaResponse` WHERE 1;

--
-- INSERT template for table `PokeapiMetaResponse`
--
INSERT INTO `PokeapiMetaResponse`(`deploy_date`, `hash`, `tag`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PokeapiMetaResponse`
--
UPDATE `PokeapiMetaResponse` SET `deploy_date` = ?, `hash` = ?, `tag` = ? WHERE 1;

--
-- DELETE template for table `PokeapiMetaResponse`
--
DELETE FROM `PokeapiMetaResponse` WHERE 0;


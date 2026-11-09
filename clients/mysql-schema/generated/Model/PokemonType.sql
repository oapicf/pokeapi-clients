--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonType' definition.
--


--
-- SELECT template for table `PokemonType`
--
SELECT `slot`, `type` FROM `PokemonType` WHERE 1;

--
-- INSERT template for table `PokemonType`
--
INSERT INTO `PokemonType`(`slot`, `type`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonType`
--
UPDATE `PokemonType` SET `slot` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `PokemonType`
--
DELETE FROM `PokemonType` WHERE 0;


--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonFormType' definition.
--


--
-- SELECT template for table `PokemonFormType`
--
SELECT `slot`, `type` FROM `PokemonFormType` WHERE 1;

--
-- INSERT template for table `PokemonFormType`
--
INSERT INTO `PokemonFormType`(`slot`, `type`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonFormType`
--
UPDATE `PokemonFormType` SET `slot` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `PokemonFormType`
--
DELETE FROM `PokemonFormType` WHERE 0;


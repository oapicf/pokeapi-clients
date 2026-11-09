--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonHeldItemVersion' definition.
--


--
-- SELECT template for table `PokemonHeldItemVersion`
--
SELECT `rarity`, `version` FROM `PokemonHeldItemVersion` WHERE 1;

--
-- INSERT template for table `PokemonHeldItemVersion`
--
INSERT INTO `PokemonHeldItemVersion`(`rarity`, `version`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonHeldItemVersion`
--
UPDATE `PokemonHeldItemVersion` SET `rarity` = ?, `version` = ? WHERE 1;

--
-- DELETE template for table `PokemonHeldItemVersion`
--
DELETE FROM `PokemonHeldItemVersion` WHERE 0;


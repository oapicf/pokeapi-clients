--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonFormFlavorText' definition.
--


--
-- SELECT template for table `PokemonFormFlavorText`
--
SELECT `flavor_text`, `language`, `version` FROM `PokemonFormFlavorText` WHERE 1;

--
-- INSERT template for table `PokemonFormFlavorText`
--
INSERT INTO `PokemonFormFlavorText`(`flavor_text`, `language`, `version`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PokemonFormFlavorText`
--
UPDATE `PokemonFormFlavorText` SET `flavor_text` = ?, `language` = ?, `version` = ? WHERE 1;

--
-- DELETE template for table `PokemonFormFlavorText`
--
DELETE FROM `PokemonFormFlavorText` WHERE 0;


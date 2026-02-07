--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonDetail_types_inner' definition.
--


--
-- SELECT template for table `PokemonDetail_types_inner`
--
SELECT `slot`, `type` FROM `PokemonDetail_types_inner` WHERE 1;

--
-- INSERT template for table `PokemonDetail_types_inner`
--
INSERT INTO `PokemonDetail_types_inner`(`slot`, `type`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonDetail_types_inner`
--
UPDATE `PokemonDetail_types_inner` SET `slot` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `PokemonDetail_types_inner`
--
DELETE FROM `PokemonDetail_types_inner` WHERE 0;


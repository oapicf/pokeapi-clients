--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonDetail_abilities_inner' definition.
--


--
-- SELECT template for table `PokemonDetail_abilities_inner`
--
SELECT `ability`, `is_hidden`, `slot` FROM `PokemonDetail_abilities_inner` WHERE 1;

--
-- INSERT template for table `PokemonDetail_abilities_inner`
--
INSERT INTO `PokemonDetail_abilities_inner`(`ability`, `is_hidden`, `slot`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PokemonDetail_abilities_inner`
--
UPDATE `PokemonDetail_abilities_inner` SET `ability` = ?, `is_hidden` = ?, `slot` = ? WHERE 1;

--
-- DELETE template for table `PokemonDetail_abilities_inner`
--
DELETE FROM `PokemonDetail_abilities_inner` WHERE 0;


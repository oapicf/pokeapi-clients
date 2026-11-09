--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonEvolution_known_move' definition.
--


--
-- SELECT template for table `PokemonEvolution_known_move`
--
SELECT `name`, `url` FROM `PokemonEvolution_known_move` WHERE 1;

--
-- INSERT template for table `PokemonEvolution_known_move`
--
INSERT INTO `PokemonEvolution_known_move`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonEvolution_known_move`
--
UPDATE `PokemonEvolution_known_move` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `PokemonEvolution_known_move`
--
DELETE FROM `PokemonEvolution_known_move` WHERE 0;


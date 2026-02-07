--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonShapeDetail_names_inner' definition.
--


--
-- SELECT template for table `PokemonShapeDetail_names_inner`
--
SELECT `url`, `name` FROM `PokemonShapeDetail_names_inner` WHERE 1;

--
-- INSERT template for table `PokemonShapeDetail_names_inner`
--
INSERT INTO `PokemonShapeDetail_names_inner`(`url`, `name`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonShapeDetail_names_inner`
--
UPDATE `PokemonShapeDetail_names_inner` SET `url` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `PokemonShapeDetail_names_inner`
--
DELETE FROM `PokemonShapeDetail_names_inner` WHERE 0;


--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonShapeDetail_awesome_names_inner' definition.
--


--
-- SELECT template for table `PokemonShapeDetail_awesome_names_inner`
--
SELECT `awesome_name`, `language` FROM `PokemonShapeDetail_awesome_names_inner` WHERE 1;

--
-- INSERT template for table `PokemonShapeDetail_awesome_names_inner`
--
INSERT INTO `PokemonShapeDetail_awesome_names_inner`(`awesome_name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonShapeDetail_awesome_names_inner`
--
UPDATE `PokemonShapeDetail_awesome_names_inner` SET `awesome_name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `PokemonShapeDetail_awesome_names_inner`
--
DELETE FROM `PokemonShapeDetail_awesome_names_inner` WHERE 0;


--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonFormDetail_form_names_inner' definition.
--


--
-- SELECT template for table `PokemonFormDetail_form_names_inner`
--
SELECT `language`, `name` FROM `PokemonFormDetail_form_names_inner` WHERE 1;

--
-- INSERT template for table `PokemonFormDetail_form_names_inner`
--
INSERT INTO `PokemonFormDetail_form_names_inner`(`language`, `name`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonFormDetail_form_names_inner`
--
UPDATE `PokemonFormDetail_form_names_inner` SET `language` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `PokemonFormDetail_form_names_inner`
--
DELETE FROM `PokemonFormDetail_form_names_inner` WHERE 0;


--
-- PokéAPI.
-- Prepared SQL queries for 'TypeGameSprite' definition.
--


--
-- SELECT template for table `TypeGameSprite`
--
SELECT `name_icon`, `symbol_icon` FROM `TypeGameSprite` WHERE 1;

--
-- INSERT template for table `TypeGameSprite`
--
INSERT INTO `TypeGameSprite`(`name_icon`, `symbol_icon`) VALUES (?, ?);

--
-- UPDATE template for table `TypeGameSprite`
--
UPDATE `TypeGameSprite` SET `name_icon` = ?, `symbol_icon` = ? WHERE 1;

--
-- DELETE template for table `TypeGameSprite`
--
DELETE FROM `TypeGameSprite` WHERE 0;


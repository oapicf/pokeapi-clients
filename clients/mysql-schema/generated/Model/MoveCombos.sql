--
-- PokéAPI.
-- Prepared SQL queries for 'MoveCombos' definition.
--


--
-- SELECT template for table `MoveCombos`
--
SELECT `normal`, `super` FROM `MoveCombos` WHERE 1;

--
-- INSERT template for table `MoveCombos`
--
INSERT INTO `MoveCombos`(`normal`, `super`) VALUES (?, ?);

--
-- UPDATE template for table `MoveCombos`
--
UPDATE `MoveCombos` SET `normal` = ?, `super` = ? WHERE 1;

--
-- DELETE template for table `MoveCombos`
--
DELETE FROM `MoveCombos` WHERE 0;


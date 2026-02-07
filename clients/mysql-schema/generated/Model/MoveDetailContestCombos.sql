--
-- PokéAPI.
-- Prepared SQL queries for 'MoveDetail_contest_combos' definition.
--


--
-- SELECT template for table `MoveDetail_contest_combos`
--
SELECT `normal`, `super` FROM `MoveDetail_contest_combos` WHERE 1;

--
-- INSERT template for table `MoveDetail_contest_combos`
--
INSERT INTO `MoveDetail_contest_combos`(`normal`, `super`) VALUES (?, ?);

--
-- UPDATE template for table `MoveDetail_contest_combos`
--
UPDATE `MoveDetail_contest_combos` SET `normal` = ?, `super` = ? WHERE 1;

--
-- DELETE template for table `MoveDetail_contest_combos`
--
DELETE FROM `MoveDetail_contest_combos` WHERE 0;


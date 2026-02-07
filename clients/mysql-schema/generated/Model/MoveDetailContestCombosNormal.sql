--
-- PokéAPI.
-- Prepared SQL queries for 'MoveDetail_contest_combos_normal' definition.
--


--
-- SELECT template for table `MoveDetail_contest_combos_normal`
--
SELECT `use_before`, `use_after` FROM `MoveDetail_contest_combos_normal` WHERE 1;

--
-- INSERT template for table `MoveDetail_contest_combos_normal`
--
INSERT INTO `MoveDetail_contest_combos_normal`(`use_before`, `use_after`) VALUES (?, ?);

--
-- UPDATE template for table `MoveDetail_contest_combos_normal`
--
UPDATE `MoveDetail_contest_combos_normal` SET `use_before` = ?, `use_after` = ? WHERE 1;

--
-- DELETE template for table `MoveDetail_contest_combos_normal`
--
DELETE FROM `MoveDetail_contest_combos_normal` WHERE 0;


--
-- PokéAPI.
-- Prepared SQL queries for 'MoveDetail_stat_changes_inner' definition.
--


--
-- SELECT template for table `MoveDetail_stat_changes_inner`
--
SELECT `change`, `stat` FROM `MoveDetail_stat_changes_inner` WHERE 1;

--
-- INSERT template for table `MoveDetail_stat_changes_inner`
--
INSERT INTO `MoveDetail_stat_changes_inner`(`change`, `stat`) VALUES (?, ?);

--
-- UPDATE template for table `MoveDetail_stat_changes_inner`
--
UPDATE `MoveDetail_stat_changes_inner` SET `change` = ?, `stat` = ? WHERE 1;

--
-- DELETE template for table `MoveDetail_stat_changes_inner`
--
DELETE FROM `MoveDetail_stat_changes_inner` WHERE 0;


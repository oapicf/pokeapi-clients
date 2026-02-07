--
-- PokéAPI.
-- Prepared SQL queries for 'StatDetail_affecting_moves_increase_inner' definition.
--


--
-- SELECT template for table `StatDetail_affecting_moves_increase_inner`
--
SELECT `change`, `move` FROM `StatDetail_affecting_moves_increase_inner` WHERE 1;

--
-- INSERT template for table `StatDetail_affecting_moves_increase_inner`
--
INSERT INTO `StatDetail_affecting_moves_increase_inner`(`change`, `move`) VALUES (?, ?);

--
-- UPDATE template for table `StatDetail_affecting_moves_increase_inner`
--
UPDATE `StatDetail_affecting_moves_increase_inner` SET `change` = ?, `move` = ? WHERE 1;

--
-- DELETE template for table `StatDetail_affecting_moves_increase_inner`
--
DELETE FROM `StatDetail_affecting_moves_increase_inner` WHERE 0;


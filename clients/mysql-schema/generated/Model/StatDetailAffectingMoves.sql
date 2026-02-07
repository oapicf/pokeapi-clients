--
-- PokéAPI.
-- Prepared SQL queries for 'StatDetail_affecting_moves' definition.
--


--
-- SELECT template for table `StatDetail_affecting_moves`
--
SELECT `increase`, `decrease` FROM `StatDetail_affecting_moves` WHERE 1;

--
-- INSERT template for table `StatDetail_affecting_moves`
--
INSERT INTO `StatDetail_affecting_moves`(`increase`, `decrease`) VALUES (?, ?);

--
-- UPDATE template for table `StatDetail_affecting_moves`
--
UPDATE `StatDetail_affecting_moves` SET `increase` = ?, `decrease` = ? WHERE 1;

--
-- DELETE template for table `StatDetail_affecting_moves`
--
DELETE FROM `StatDetail_affecting_moves` WHERE 0;


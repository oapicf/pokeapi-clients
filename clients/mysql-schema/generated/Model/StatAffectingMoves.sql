--
-- PokéAPI.
-- Prepared SQL queries for 'StatAffectingMoves' definition.
--


--
-- SELECT template for table `StatAffectingMoves`
--
SELECT `increase`, `decrease` FROM `StatAffectingMoves` WHERE 1;

--
-- INSERT template for table `StatAffectingMoves`
--
INSERT INTO `StatAffectingMoves`(`increase`, `decrease`) VALUES (?, ?);

--
-- UPDATE template for table `StatAffectingMoves`
--
UPDATE `StatAffectingMoves` SET `increase` = ?, `decrease` = ? WHERE 1;

--
-- DELETE template for table `StatAffectingMoves`
--
DELETE FROM `StatAffectingMoves` WHERE 0;


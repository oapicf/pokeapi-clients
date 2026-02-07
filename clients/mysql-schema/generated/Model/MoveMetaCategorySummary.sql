--
-- PokéAPI.
-- Prepared SQL queries for 'MoveMetaCategorySummary' definition.
--


--
-- SELECT template for table `MoveMetaCategorySummary`
--
SELECT `name`, `url` FROM `MoveMetaCategorySummary` WHERE 1;

--
-- INSERT template for table `MoveMetaCategorySummary`
--
INSERT INTO `MoveMetaCategorySummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `MoveMetaCategorySummary`
--
UPDATE `MoveMetaCategorySummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `MoveMetaCategorySummary`
--
DELETE FROM `MoveMetaCategorySummary` WHERE 0;


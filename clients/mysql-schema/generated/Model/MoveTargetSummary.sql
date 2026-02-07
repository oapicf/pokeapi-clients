--
-- PokéAPI.
-- Prepared SQL queries for 'MoveTargetSummary' definition.
--


--
-- SELECT template for table `MoveTargetSummary`
--
SELECT `name`, `url` FROM `MoveTargetSummary` WHERE 1;

--
-- INSERT template for table `MoveTargetSummary`
--
INSERT INTO `MoveTargetSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `MoveTargetSummary`
--
UPDATE `MoveTargetSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `MoveTargetSummary`
--
DELETE FROM `MoveTargetSummary` WHERE 0;


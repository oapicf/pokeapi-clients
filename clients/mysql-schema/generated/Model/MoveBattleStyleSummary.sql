--
-- PokéAPI.
-- Prepared SQL queries for 'MoveBattleStyleSummary' definition.
--


--
-- SELECT template for table `MoveBattleStyleSummary`
--
SELECT `name`, `url` FROM `MoveBattleStyleSummary` WHERE 1;

--
-- INSERT template for table `MoveBattleStyleSummary`
--
INSERT INTO `MoveBattleStyleSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `MoveBattleStyleSummary`
--
UPDATE `MoveBattleStyleSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `MoveBattleStyleSummary`
--
DELETE FROM `MoveBattleStyleSummary` WHERE 0;


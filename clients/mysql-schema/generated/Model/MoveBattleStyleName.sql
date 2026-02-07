--
-- PokéAPI.
-- Prepared SQL queries for 'MoveBattleStyleName' definition.
--


--
-- SELECT template for table `MoveBattleStyleName`
--
SELECT `name`, `language` FROM `MoveBattleStyleName` WHERE 1;

--
-- INSERT template for table `MoveBattleStyleName`
--
INSERT INTO `MoveBattleStyleName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `MoveBattleStyleName`
--
UPDATE `MoveBattleStyleName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `MoveBattleStyleName`
--
DELETE FROM `MoveBattleStyleName` WHERE 0;


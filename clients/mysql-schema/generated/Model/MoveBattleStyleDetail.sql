--
-- PokéAPI.
-- Prepared SQL queries for 'MoveBattleStyleDetail' definition.
--


--
-- SELECT template for table `MoveBattleStyleDetail`
--
SELECT `id`, `name`, `names` FROM `MoveBattleStyleDetail` WHERE 1;

--
-- INSERT template for table `MoveBattleStyleDetail`
--
INSERT INTO `MoveBattleStyleDetail`(`id`, `name`, `names`) VALUES (?, ?, ?);

--
-- UPDATE template for table `MoveBattleStyleDetail`
--
UPDATE `MoveBattleStyleDetail` SET `id` = ?, `name` = ?, `names` = ? WHERE 1;

--
-- DELETE template for table `MoveBattleStyleDetail`
--
DELETE FROM `MoveBattleStyleDetail` WHERE 0;


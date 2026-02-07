--
-- PokéAPI.
-- Prepared SQL queries for 'MoveLearnMethodDetail' definition.
--


--
-- SELECT template for table `MoveLearnMethodDetail`
--
SELECT `id`, `name`, `names`, `descriptions`, `version_groups` FROM `MoveLearnMethodDetail` WHERE 1;

--
-- INSERT template for table `MoveLearnMethodDetail`
--
INSERT INTO `MoveLearnMethodDetail`(`id`, `name`, `names`, `descriptions`, `version_groups`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `MoveLearnMethodDetail`
--
UPDATE `MoveLearnMethodDetail` SET `id` = ?, `name` = ?, `names` = ?, `descriptions` = ?, `version_groups` = ? WHERE 1;

--
-- DELETE template for table `MoveLearnMethodDetail`
--
DELETE FROM `MoveLearnMethodDetail` WHERE 0;


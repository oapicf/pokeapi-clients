--
-- PokéAPI.
-- Prepared SQL queries for 'MoveName' definition.
--


--
-- SELECT template for table `MoveName`
--
SELECT `name`, `language` FROM `MoveName` WHERE 1;

--
-- INSERT template for table `MoveName`
--
INSERT INTO `MoveName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `MoveName`
--
UPDATE `MoveName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `MoveName`
--
DELETE FROM `MoveName` WHERE 0;


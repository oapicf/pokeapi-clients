--
-- PokéAPI.
-- Prepared SQL queries for 'MoveDamageClassSummary' definition.
--


--
-- SELECT template for table `MoveDamageClassSummary`
--
SELECT `name`, `url` FROM `MoveDamageClassSummary` WHERE 1;

--
-- INSERT template for table `MoveDamageClassSummary`
--
INSERT INTO `MoveDamageClassSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `MoveDamageClassSummary`
--
UPDATE `MoveDamageClassSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `MoveDamageClassSummary`
--
DELETE FROM `MoveDamageClassSummary` WHERE 0;


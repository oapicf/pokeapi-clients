--
-- PokéAPI.
-- Prepared SQL queries for 'Experience' definition.
--


--
-- SELECT template for table `Experience`
--
SELECT `level`, `experience` FROM `Experience` WHERE 1;

--
-- INSERT template for table `Experience`
--
INSERT INTO `Experience`(`level`, `experience`) VALUES (?, ?);

--
-- UPDATE template for table `Experience`
--
UPDATE `Experience` SET `level` = ?, `experience` = ? WHERE 1;

--
-- DELETE template for table `Experience`
--
DELETE FROM `Experience` WHERE 0;


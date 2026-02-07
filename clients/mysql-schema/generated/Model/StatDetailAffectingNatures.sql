--
-- PokéAPI.
-- Prepared SQL queries for 'StatDetail_affecting_natures' definition.
--


--
-- SELECT template for table `StatDetail_affecting_natures`
--
SELECT `increase`, `decrease` FROM `StatDetail_affecting_natures` WHERE 1;

--
-- INSERT template for table `StatDetail_affecting_natures`
--
INSERT INTO `StatDetail_affecting_natures`(`increase`, `decrease`) VALUES (?, ?);

--
-- UPDATE template for table `StatDetail_affecting_natures`
--
UPDATE `StatDetail_affecting_natures` SET `increase` = ?, `decrease` = ? WHERE 1;

--
-- DELETE template for table `StatDetail_affecting_natures`
--
DELETE FROM `StatDetail_affecting_natures` WHERE 0;


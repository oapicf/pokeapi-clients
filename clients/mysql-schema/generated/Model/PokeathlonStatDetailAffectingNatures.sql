--
-- PokéAPI.
-- Prepared SQL queries for 'PokeathlonStatDetail_affecting_natures' definition.
--


--
-- SELECT template for table `PokeathlonStatDetail_affecting_natures`
--
SELECT `decrease`, `increase` FROM `PokeathlonStatDetail_affecting_natures` WHERE 1;

--
-- INSERT template for table `PokeathlonStatDetail_affecting_natures`
--
INSERT INTO `PokeathlonStatDetail_affecting_natures`(`decrease`, `increase`) VALUES (?, ?);

--
-- UPDATE template for table `PokeathlonStatDetail_affecting_natures`
--
UPDATE `PokeathlonStatDetail_affecting_natures` SET `decrease` = ?, `increase` = ? WHERE 1;

--
-- DELETE template for table `PokeathlonStatDetail_affecting_natures`
--
DELETE FROM `PokeathlonStatDetail_affecting_natures` WHERE 0;


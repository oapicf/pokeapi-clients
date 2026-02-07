--
-- PokéAPI.
-- Prepared SQL queries for 'GenerationSummary' definition.
--


--
-- SELECT template for table `GenerationSummary`
--
SELECT `name`, `url` FROM `GenerationSummary` WHERE 1;

--
-- INSERT template for table `GenerationSummary`
--
INSERT INTO `GenerationSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `GenerationSummary`
--
UPDATE `GenerationSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `GenerationSummary`
--
DELETE FROM `GenerationSummary` WHERE 0;


--
-- PokéAPI.
-- Prepared SQL queries for 'ItemAttributeName' definition.
--


--
-- SELECT template for table `ItemAttributeName`
--
SELECT `name`, `language` FROM `ItemAttributeName` WHERE 1;

--
-- INSERT template for table `ItemAttributeName`
--
INSERT INTO `ItemAttributeName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `ItemAttributeName`
--
UPDATE `ItemAttributeName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `ItemAttributeName`
--
DELETE FROM `ItemAttributeName` WHERE 0;


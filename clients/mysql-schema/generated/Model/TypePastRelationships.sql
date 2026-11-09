--
-- PokéAPI.
-- Prepared SQL queries for 'TypePastRelationships' definition.
--


--
-- SELECT template for table `TypePastRelationships`
--
SELECT `generation`, `damage_relations` FROM `TypePastRelationships` WHERE 1;

--
-- INSERT template for table `TypePastRelationships`
--
INSERT INTO `TypePastRelationships`(`generation`, `damage_relations`) VALUES (?, ?);

--
-- UPDATE template for table `TypePastRelationships`
--
UPDATE `TypePastRelationships` SET `generation` = ?, `damage_relations` = ? WHERE 1;

--
-- DELETE template for table `TypePastRelationships`
--
DELETE FROM `TypePastRelationships` WHERE 0;


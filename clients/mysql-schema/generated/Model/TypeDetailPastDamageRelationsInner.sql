--
-- PokéAPI.
-- Prepared SQL queries for 'TypeDetail_past_damage_relations_inner' definition.
--


--
-- SELECT template for table `TypeDetail_past_damage_relations_inner`
--
SELECT `generation`, `damage_relations` FROM `TypeDetail_past_damage_relations_inner` WHERE 1;

--
-- INSERT template for table `TypeDetail_past_damage_relations_inner`
--
INSERT INTO `TypeDetail_past_damage_relations_inner`(`generation`, `damage_relations`) VALUES (?, ?);

--
-- UPDATE template for table `TypeDetail_past_damage_relations_inner`
--
UPDATE `TypeDetail_past_damage_relations_inner` SET `generation` = ?, `damage_relations` = ? WHERE 1;

--
-- DELETE template for table `TypeDetail_past_damage_relations_inner`
--
DELETE FROM `TypeDetail_past_damage_relations_inner` WHERE 0;


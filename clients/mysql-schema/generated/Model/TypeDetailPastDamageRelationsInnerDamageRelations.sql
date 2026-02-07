--
-- PokéAPI.
-- Prepared SQL queries for 'TypeDetail_past_damage_relations_inner_damage_relations' definition.
--


--
-- SELECT template for table `TypeDetail_past_damage_relations_inner_damage_relations`
--
SELECT `no_damage_to`, `half_damage_to`, `double_damage_to`, `no_damage_from`, `half_damage_from`, `double_damage_from` FROM `TypeDetail_past_damage_relations_inner_damage_relations` WHERE 1;

--
-- INSERT template for table `TypeDetail_past_damage_relations_inner_damage_relations`
--
INSERT INTO `TypeDetail_past_damage_relations_inner_damage_relations`(`no_damage_to`, `half_damage_to`, `double_damage_to`, `no_damage_from`, `half_damage_from`, `double_damage_from`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TypeDetail_past_damage_relations_inner_damage_relations`
--
UPDATE `TypeDetail_past_damage_relations_inner_damage_relations` SET `no_damage_to` = ?, `half_damage_to` = ?, `double_damage_to` = ?, `no_damage_from` = ?, `half_damage_from` = ?, `double_damage_from` = ? WHERE 1;

--
-- DELETE template for table `TypeDetail_past_damage_relations_inner_damage_relations`
--
DELETE FROM `TypeDetail_past_damage_relations_inner_damage_relations` WHERE 0;


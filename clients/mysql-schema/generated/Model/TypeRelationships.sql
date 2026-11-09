--
-- PokéAPI.
-- Prepared SQL queries for 'TypeRelationships' definition.
--


--
-- SELECT template for table `TypeRelationships`
--
SELECT `no_damage_to`, `half_damage_to`, `double_damage_to`, `no_damage_from`, `half_damage_from`, `double_damage_from` FROM `TypeRelationships` WHERE 1;

--
-- INSERT template for table `TypeRelationships`
--
INSERT INTO `TypeRelationships`(`no_damage_to`, `half_damage_to`, `double_damage_to`, `no_damage_from`, `half_damage_from`, `double_damage_from`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TypeRelationships`
--
UPDATE `TypeRelationships` SET `no_damage_to` = ?, `half_damage_to` = ?, `double_damage_to` = ?, `no_damage_from` = ?, `half_damage_from` = ?, `double_damage_from` = ? WHERE 1;

--
-- DELETE template for table `TypeRelationships`
--
DELETE FROM `TypeRelationships` WHERE 0;


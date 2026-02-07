--
-- PokéAPI.
-- Prepared SQL queries for 'NatureBattleStylePreference' definition.
--


--
-- SELECT template for table `NatureBattleStylePreference`
--
SELECT `low_hp_preference`, `high_hp_preference`, `move_battle_style` FROM `NatureBattleStylePreference` WHERE 1;

--
-- INSERT template for table `NatureBattleStylePreference`
--
INSERT INTO `NatureBattleStylePreference`(`low_hp_preference`, `high_hp_preference`, `move_battle_style`) VALUES (?, ?, ?);

--
-- UPDATE template for table `NatureBattleStylePreference`
--
UPDATE `NatureBattleStylePreference` SET `low_hp_preference` = ?, `high_hp_preference` = ?, `move_battle_style` = ? WHERE 1;

--
-- DELETE template for table `NatureBattleStylePreference`
--
DELETE FROM `NatureBattleStylePreference` WHERE 0;


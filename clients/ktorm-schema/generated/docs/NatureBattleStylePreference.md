
# Table `NatureBattleStylePreference`
(mapped from: NatureBattleStylePreference)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**lowHpPreference** | low_hp_preference | int NOT NULL |  | **kotlin.Int** | Chance of using the move, in percent, if HP is under one half. | 
**highHpPreference** | high_hp_preference | int NOT NULL |  | **kotlin.Int** | Chance of using the move, in percent, if HP is over one half. | 
**moveBattleStyle** | move_battle_style | long NOT NULL |  | [**MoveBattleStyleSummary**](MoveBattleStyleSummary.md) | The move battle style. |  [foreignkey]






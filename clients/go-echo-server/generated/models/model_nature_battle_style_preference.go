package models

type NatureBattleStylePreference struct {

	LowHpPreference int32 `json:"low_hp_preference"`

	HighHpPreference int32 `json:"high_hp_preference"`

	MoveBattleStyle MoveBattleStyleSummary `json:"move_battle_style"`
}

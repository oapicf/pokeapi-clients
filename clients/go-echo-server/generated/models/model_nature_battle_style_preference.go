package models

type NatureBattleStylePreference struct {

	// Chance of using the move, in percent, if HP is under one half.
	LowHpPreference int32 `json:"low_hp_preference"`

	// Chance of using the move, in percent, if HP is over one half.
	HighHpPreference int32 `json:"high_hp_preference"`

	// The move battle style.
	MoveBattleStyle MoveBattleStyleSummary `json:"move_battle_style"`
}

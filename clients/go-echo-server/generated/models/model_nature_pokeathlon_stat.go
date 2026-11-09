package models

type NaturePokeathlonStat struct {

	// The amount of change.
	MaxChange int32 `json:"max_change"`

	// The stat being affected.
	PokeathlonStat PokeathlonStatSummary `json:"pokeathlon_stat"`
}

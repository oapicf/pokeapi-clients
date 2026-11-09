package models

type PokeathlonStatAffectingNature struct {

	// The maximum amount of change to the referenced Pokéathlon stat.
	MaxChange int32 `json:"max_change"`

	// The nature causing the change.
	Nature NatureSummary `json:"nature"`
}

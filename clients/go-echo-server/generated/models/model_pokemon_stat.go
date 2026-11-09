package models

type PokemonStat struct {

	// The base value of the stat.
	BaseStat int32 `json:"base_stat"`

	// The effort points (EV) the Pokémon has in the stat.
	Effort int32 `json:"effort"`

	// The stat the Pokémon has.
	Stat StatSummary `json:"stat"`
}

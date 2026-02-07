package models

type PokemonStat struct {

	BaseStat int32 `json:"base_stat"`

	Effort int32 `json:"effort"`

	Stat StatSummary `json:"stat"`
}

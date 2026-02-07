package models

type PokedexDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	IsMainSeries bool `json:"is_main_series,omitempty"`

	Descriptions []PokedexDescription `json:"descriptions"`

	Names []PokedexName `json:"names"`

	PokemonEntries []PokedexDetailPokemonEntriesInner `json:"pokemon_entries"`

	Region RegionSummary `json:"region"`

	VersionGroups []AbilityDetailPokemonInnerPokemon `json:"version_groups"`
}

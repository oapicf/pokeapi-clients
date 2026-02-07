package models

type RegionDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Locations []LocationSummary `json:"locations"`

	MainGeneration GenerationSummary `json:"main_generation"`

	Names []RegionName `json:"names"`

	Pokedexes []PokedexSummary `json:"pokedexes"`

	VersionGroups []AbilityDetailPokemonInnerPokemon `json:"version_groups"`
}

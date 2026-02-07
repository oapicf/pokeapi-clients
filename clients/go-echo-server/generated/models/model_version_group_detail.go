package models

type VersionGroupDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Order *int32 `json:"order,omitempty"`

	Generation GenerationSummary `json:"generation"`

	MoveLearnMethods []AbilityDetailPokemonInnerPokemon `json:"move_learn_methods"`

	Pokedexes []AbilityDetailPokemonInnerPokemon `json:"pokedexes"`

	Regions []AbilityDetailPokemonInnerPokemon `json:"regions"`

	Versions []VersionSummary `json:"versions"`
}

package models

type PokemonDetailMovesInner struct {

	Move AbilityDetailPokemonInnerPokemon `json:"move"`

	VersionGroupDetails []PokemonDetailMovesInnerVersionGroupDetailsInner `json:"version_group_details"`
}

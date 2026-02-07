package models

type PokemonDetailHeldItems struct {

	Item AbilityDetailPokemonInnerPokemon `json:"item"`

	VersionDetails []ItemDetailHeldByPokemonInnerVersionDetailsInner `json:"version_details"`
}

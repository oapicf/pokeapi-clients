package models

type ItemDetailHeldByPokemonInner struct {

	Pokemon AbilityDetailPokemonInnerPokemon `json:"pokemon"`

	VersionDetails []ItemDetailHeldByPokemonInnerVersionDetailsInner `json:"version-details"`
}

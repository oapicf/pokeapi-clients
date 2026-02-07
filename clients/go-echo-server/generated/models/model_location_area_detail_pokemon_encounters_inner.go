package models

type LocationAreaDetailPokemonEncountersInner struct {

	Pokemon AbilityDetailPokemonInnerPokemon `json:"pokemon"`

	VersionDetails []LocationAreaDetailPokemonEncountersInnerVersionDetailsInner `json:"version_details"`
}

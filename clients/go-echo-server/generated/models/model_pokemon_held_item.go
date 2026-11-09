package models

type PokemonHeldItem struct {

	// The Pokémon that holds this item.
	Pokemon PokemonSummary `json:"pokemon"`

	// The details for the version that this item is held in by the Pokémon.
	VersionDetails []PokemonHeldItemVersion `json:"version_details"`
}

package models

type PokemonHeldItemSummary struct {

	// The item the referenced Pokémon holds.
	Item ItemSummary `json:"item"`

	// The details of the different versions in which the item is held.
	VersionDetails []PokemonHeldItemVersion `json:"version_details"`
}

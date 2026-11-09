package models

type PokemonHeldItemVersion struct {

	// How often the item is held.
	Rarity int32 `json:"rarity"`

	// The version in which the item is held.
	Version VersionSummary `json:"version"`
}

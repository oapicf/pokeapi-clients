package models

type PokemonMove struct {

	// The move the Pokémon can learn.
	Move MoveSummary `json:"move"`

	// The details of the version in which the Pokémon can learn the move.
	VersionGroupDetails []PokemonMoveVersionGroup `json:"version_group_details"`
}

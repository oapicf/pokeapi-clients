package models

type LocationAreaPokemonEncounter struct {

	// The Pokémon being encountered.
	Pokemon PokemonSummary `json:"pokemon"`

	// A list of versions and encounters with Pokémon that might happen in the referenced location area.
	VersionDetails []LocationAreaPokemonEncounterVersion `json:"version_details"`
}

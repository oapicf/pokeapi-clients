package models

type PokemonEncounterResponse struct {

	// The location area the referenced Pokémon can be encountered in.
	LocationArea LocationAreaSummary `json:"location_area"`

	// A list of versions and encounters with the referenced Pokémon that might happen.
	VersionDetails []PokemonEncounterVersionDetailResponse `json:"version_details"`
}

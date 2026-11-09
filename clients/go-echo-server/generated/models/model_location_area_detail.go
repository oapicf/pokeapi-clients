package models

type LocationAreaDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The internal id of an API resource within game data.
	GameIndex int32 `json:"game_index"`

	// A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
	EncounterMethodRates []LocationAreaEncounterRate `json:"encounter_method_rates"`

	// The region this location area can be found in.
	Location LocationSummary `json:"location"`

	// The name of this resource listed in different languages.
	Names []LocationAreaName `json:"names"`

	// A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
	PokemonEncounters []LocationAreaPokemonEncounter `json:"pokemon_encounters"`
}

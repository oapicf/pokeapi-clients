package models

type PalParkAreaDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The name of this resource listed in different languages.
	Names []PalParkAreaName `json:"names"`

	// A list of Pokémon encountered in thi pal park area along with details.
	PokemonEncounters []PalParkEncounter `json:"pokemon_encounters"`
}

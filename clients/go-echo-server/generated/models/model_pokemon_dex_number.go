package models

type PokemonDexNumber struct {

	// The index of this Pokémon species entry within the Pokédex.
	EntryNumber int32 `json:"entry_number"`

	// The Pokémon species being encountered.
	PokemonSpecies PokemonSpeciesSummary `json:"pokemon_species"`
}

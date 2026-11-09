package models

type PokemonDexEntry struct {

	// The index number within the Pokédex.
	EntryNumber int32 `json:"entry_number"`

	// The Pokédex the referenced Pokémon species can be found in.
	Pokedex PokedexSummary `json:"pokedex"`
}

package models

type PokemonDexEntry struct {

	EntryNumber int32 `json:"entry_number"`

	Pokedex PokedexSummary `json:"pokedex"`
}

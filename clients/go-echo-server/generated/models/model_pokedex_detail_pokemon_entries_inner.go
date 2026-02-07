package models

type PokedexDetailPokemonEntriesInner struct {

	EntryNumber int32 `json:"entry_number"`

	PokemonSpecies AbilityDetailPokemonInnerPokemon `json:"pokemon_species"`
}

package models

type PokemonSpeciesGenus struct {

	// The localized genus for the referenced Pokémon species
	Genus string `json:"genus"`

	// The language this genus is in.
	Language LanguageSummary `json:"language"`
}

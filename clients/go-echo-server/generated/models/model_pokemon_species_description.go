package models

type PokemonSpeciesDescription struct {

	Description string `json:"description,omitempty"`

	Language LanguageSummary `json:"language"`
}

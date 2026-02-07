package models

type PokedexDescription struct {

	Description string `json:"description,omitempty"`

	Language LanguageSummary `json:"language"`
}

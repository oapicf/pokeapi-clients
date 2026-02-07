package models

type PokedexName struct {

	Name string `json:"name"`

	Language LanguageSummary `json:"language"`
}

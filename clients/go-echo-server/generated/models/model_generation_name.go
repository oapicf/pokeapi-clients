package models

type GenerationName struct {

	Name string `json:"name"`

	Language LanguageSummary `json:"language"`
}

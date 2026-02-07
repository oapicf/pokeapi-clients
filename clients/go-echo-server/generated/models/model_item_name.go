package models

type ItemName struct {

	Name string `json:"name"`

	Language LanguageSummary `json:"language"`
}

package models

type StatName struct {

	Name string `json:"name"`

	Language LanguageSummary `json:"language"`
}

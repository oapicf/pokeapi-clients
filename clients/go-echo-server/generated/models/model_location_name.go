package models

type LocationName struct {

	Name string `json:"name"`

	Language LanguageSummary `json:"language"`
}

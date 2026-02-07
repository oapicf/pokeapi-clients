package models

type LanguageName struct {

	Name string `json:"name"`

	Language LanguageSummary `json:"language"`
}

package models

type EncounterMethodName struct {

	Name string `json:"name"`

	Language LanguageSummary `json:"language"`
}

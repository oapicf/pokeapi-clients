package models

type EncounterConditionName struct {

	Name string `json:"name"`

	Language LanguageSummary `json:"language"`
}

package models

type MoveLearnMethodDescription struct {

	Description string `json:"description,omitempty"`

	Language LanguageSummary `json:"language"`
}

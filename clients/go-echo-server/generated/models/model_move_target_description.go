package models

type MoveTargetDescription struct {

	Description string `json:"description,omitempty"`

	Language LanguageSummary `json:"language"`
}

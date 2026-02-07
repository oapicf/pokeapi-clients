package models

type EncounterMethodDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Order *int32 `json:"order,omitempty"`

	Names []EncounterMethodName `json:"names"`
}

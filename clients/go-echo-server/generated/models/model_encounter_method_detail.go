package models

type EncounterMethodDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// A good value for sorting.
	Order *int32 `json:"order,omitempty"`

	// The name of this resource listed in different languages.
	Names []EncounterMethodName `json:"names"`
}

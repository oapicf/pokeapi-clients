package models

type ItemPocketDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// A list of item categories that are relevant to this item pocket.
	Categories []ItemCategorySummary `json:"categories"`

	// The name of this resource listed in different languages.
	Names []ItemPocketName `json:"names"`
}

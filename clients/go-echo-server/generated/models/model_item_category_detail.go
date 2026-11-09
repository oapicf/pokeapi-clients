package models

type ItemCategoryDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// A list of items that are a part of this category.
	Items []ItemSummary `json:"items"`

	// The name of this item category listed in different languages.
	Names []ItemCategoryName `json:"names"`

	// The pocket items in this category would be put in.
	Pocket ItemPocketSummary `json:"pocket"`
}

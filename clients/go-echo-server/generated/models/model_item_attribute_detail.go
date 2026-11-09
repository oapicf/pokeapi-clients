package models

type ItemAttributeDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The description of this item attribute listed in different languages.
	Descriptions []ItemAttributeDescription `json:"descriptions"`

	// A list of items that have this attribute.
	Items []ItemSummary `json:"items"`

	// The name of this item attribute listed in different languages.
	Names []ItemAttributeName `json:"names"`
}

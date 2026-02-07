package models

type ItemCategoryDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Items []ItemSummary `json:"items"`

	Names []ItemCategoryName `json:"names"`

	Pocket ItemPocketSummary `json:"pocket"`
}

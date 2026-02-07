package models

type ItemPocketDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Categories []ItemCategorySummary `json:"categories"`

	Names []ItemPocketName `json:"names"`
}

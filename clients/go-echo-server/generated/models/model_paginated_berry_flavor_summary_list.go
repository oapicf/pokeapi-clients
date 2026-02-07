package models

type PaginatedBerryFlavorSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []BerryFlavorSummary `json:"results,omitempty"`
}

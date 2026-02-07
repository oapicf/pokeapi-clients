package models

type PaginatedBerryFirmnessSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []BerryFirmnessSummary `json:"results,omitempty"`
}

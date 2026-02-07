package models

type PaginatedGenerationSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []GenerationSummary `json:"results,omitempty"`
}

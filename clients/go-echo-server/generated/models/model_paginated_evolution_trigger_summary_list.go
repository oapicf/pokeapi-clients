package models

type PaginatedEvolutionTriggerSummaryList struct {

	// The total number of resources available from this API.
	Count int32 `json:"count"`

	// The URL for the next page in the list, or null if there is no next page.
	Next *string `json:"next,omitempty"`

	// The URL for the previous page in the list, or null if there is no previous page.
	Previous *string `json:"previous,omitempty"`

	// A list of API resources on this page.
	Results []EvolutionTriggerSummary `json:"results"`
}

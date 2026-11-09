package models

type StatAffectingNatures struct {

	// A list of natures and how they change the referenced stat.
	Increase []NatureSummary `json:"increase"`

	// A list of nature sand how they change the referenced stat.
	Decrease []NatureSummary `json:"decrease"`
}

package models

type ItemPrice struct {

	// The purchase price in this currency and version group, or null if unavailable.
	PurchasePrice *int32 `json:"purchase_price,omitempty"`

	// The sell price in this currency and version group, or null if unavailable.
	SellPrice *int32 `json:"sell_price,omitempty"`

	// The currency used for this price.
	Currency CurrencySummary `json:"currency"`

	// The version group to which this price applies.
	VersionGroup VersionGroupSummary `json:"version_group"`
}

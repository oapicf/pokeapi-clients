package models

type Experience struct {

	// The level gained.
	Level int32 `json:"level"`

	// The amount of experience required to reach the referenced level.
	Experience int32 `json:"experience"`
}

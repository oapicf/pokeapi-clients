/*


No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 20220523
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// PalParkEncounterArea Areas where the Pokémon species can be encountered in pal park.
type PalParkEncounterArea struct {
	// The base score given to the player when the referenced Pokemon is caught during a pal park run.
	BaseScore *int32 `json:"base_score,omitempty"`
	// The base rate for encountering the referenced Pokemon in this pal park area.
	Rate *int32 `json:"rate,omitempty"`
	Area *NamedAPIResource `json:"area,omitempty"`
}

// NewPalParkEncounterArea instantiates a new PalParkEncounterArea object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPalParkEncounterArea() *PalParkEncounterArea {
	this := PalParkEncounterArea{}
	return &this
}

// NewPalParkEncounterAreaWithDefaults instantiates a new PalParkEncounterArea object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPalParkEncounterAreaWithDefaults() *PalParkEncounterArea {
	this := PalParkEncounterArea{}
	return &this
}

// GetBaseScore returns the BaseScore field value if set, zero value otherwise.
func (o *PalParkEncounterArea) GetBaseScore() int32 {
	if o == nil || isNil(o.BaseScore) {
		var ret int32
		return ret
	}
	return *o.BaseScore
}

// GetBaseScoreOk returns a tuple with the BaseScore field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PalParkEncounterArea) GetBaseScoreOk() (*int32, bool) {
	if o == nil || isNil(o.BaseScore) {
    return nil, false
	}
	return o.BaseScore, true
}

// HasBaseScore returns a boolean if a field has been set.
func (o *PalParkEncounterArea) HasBaseScore() bool {
	if o != nil && !isNil(o.BaseScore) {
		return true
	}

	return false
}

// SetBaseScore gets a reference to the given int32 and assigns it to the BaseScore field.
func (o *PalParkEncounterArea) SetBaseScore(v int32) {
	o.BaseScore = &v
}

// GetRate returns the Rate field value if set, zero value otherwise.
func (o *PalParkEncounterArea) GetRate() int32 {
	if o == nil || isNil(o.Rate) {
		var ret int32
		return ret
	}
	return *o.Rate
}

// GetRateOk returns a tuple with the Rate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PalParkEncounterArea) GetRateOk() (*int32, bool) {
	if o == nil || isNil(o.Rate) {
    return nil, false
	}
	return o.Rate, true
}

// HasRate returns a boolean if a field has been set.
func (o *PalParkEncounterArea) HasRate() bool {
	if o != nil && !isNil(o.Rate) {
		return true
	}

	return false
}

// SetRate gets a reference to the given int32 and assigns it to the Rate field.
func (o *PalParkEncounterArea) SetRate(v int32) {
	o.Rate = &v
}

// GetArea returns the Area field value if set, zero value otherwise.
func (o *PalParkEncounterArea) GetArea() NamedAPIResource {
	if o == nil || isNil(o.Area) {
		var ret NamedAPIResource
		return ret
	}
	return *o.Area
}

// GetAreaOk returns a tuple with the Area field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PalParkEncounterArea) GetAreaOk() (*NamedAPIResource, bool) {
	if o == nil || isNil(o.Area) {
    return nil, false
	}
	return o.Area, true
}

// HasArea returns a boolean if a field has been set.
func (o *PalParkEncounterArea) HasArea() bool {
	if o != nil && !isNil(o.Area) {
		return true
	}

	return false
}

// SetArea gets a reference to the given NamedAPIResource and assigns it to the Area field.
func (o *PalParkEncounterArea) SetArea(v NamedAPIResource) {
	o.Area = &v
}

func (o PalParkEncounterArea) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.BaseScore) {
		toSerialize["base_score"] = o.BaseScore
	}
	if !isNil(o.Rate) {
		toSerialize["rate"] = o.Rate
	}
	if !isNil(o.Area) {
		toSerialize["area"] = o.Area
	}
	return json.Marshal(toSerialize)
}

type NullablePalParkEncounterArea struct {
	value *PalParkEncounterArea
	isSet bool
}

func (v NullablePalParkEncounterArea) Get() *PalParkEncounterArea {
	return v.value
}

func (v *NullablePalParkEncounterArea) Set(val *PalParkEncounterArea) {
	v.value = val
	v.isSet = true
}

func (v NullablePalParkEncounterArea) IsSet() bool {
	return v.isSet
}

func (v *NullablePalParkEncounterArea) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePalParkEncounterArea(val *PalParkEncounterArea) *NullablePalParkEncounterArea {
	return &NullablePalParkEncounterArea{value: val, isSet: true}
}

func (v NullablePalParkEncounterArea) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePalParkEncounterArea) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}



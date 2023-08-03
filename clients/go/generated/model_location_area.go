/*


No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 20220523
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// LocationArea struct for LocationArea
type LocationArea struct {
	Id *int32 `json:"id,omitempty"`
	Name *string `json:"name,omitempty"`
	GameIndex *int32 `json:"game_index,omitempty"`
	EncounterMethodRates []EncounterMethodRate `json:"encounter_method_rates,omitempty"`
	Location *Location `json:"location,omitempty"`
	Names []Name `json:"names,omitempty"`
	PokemonEncounters []PokemonEncounter `json:"pokemon_encounters,omitempty"`
}

// NewLocationArea instantiates a new LocationArea object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewLocationArea() *LocationArea {
	this := LocationArea{}
	return &this
}

// NewLocationAreaWithDefaults instantiates a new LocationArea object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewLocationAreaWithDefaults() *LocationArea {
	this := LocationArea{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *LocationArea) GetId() int32 {
	if o == nil || isNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LocationArea) GetIdOk() (*int32, bool) {
	if o == nil || isNil(o.Id) {
    return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *LocationArea) HasId() bool {
	if o != nil && !isNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *LocationArea) SetId(v int32) {
	o.Id = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *LocationArea) GetName() string {
	if o == nil || isNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LocationArea) GetNameOk() (*string, bool) {
	if o == nil || isNil(o.Name) {
    return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *LocationArea) HasName() bool {
	if o != nil && !isNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *LocationArea) SetName(v string) {
	o.Name = &v
}

// GetGameIndex returns the GameIndex field value if set, zero value otherwise.
func (o *LocationArea) GetGameIndex() int32 {
	if o == nil || isNil(o.GameIndex) {
		var ret int32
		return ret
	}
	return *o.GameIndex
}

// GetGameIndexOk returns a tuple with the GameIndex field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LocationArea) GetGameIndexOk() (*int32, bool) {
	if o == nil || isNil(o.GameIndex) {
    return nil, false
	}
	return o.GameIndex, true
}

// HasGameIndex returns a boolean if a field has been set.
func (o *LocationArea) HasGameIndex() bool {
	if o != nil && !isNil(o.GameIndex) {
		return true
	}

	return false
}

// SetGameIndex gets a reference to the given int32 and assigns it to the GameIndex field.
func (o *LocationArea) SetGameIndex(v int32) {
	o.GameIndex = &v
}

// GetEncounterMethodRates returns the EncounterMethodRates field value if set, zero value otherwise.
func (o *LocationArea) GetEncounterMethodRates() []EncounterMethodRate {
	if o == nil || isNil(o.EncounterMethodRates) {
		var ret []EncounterMethodRate
		return ret
	}
	return o.EncounterMethodRates
}

// GetEncounterMethodRatesOk returns a tuple with the EncounterMethodRates field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LocationArea) GetEncounterMethodRatesOk() ([]EncounterMethodRate, bool) {
	if o == nil || isNil(o.EncounterMethodRates) {
    return nil, false
	}
	return o.EncounterMethodRates, true
}

// HasEncounterMethodRates returns a boolean if a field has been set.
func (o *LocationArea) HasEncounterMethodRates() bool {
	if o != nil && !isNil(o.EncounterMethodRates) {
		return true
	}

	return false
}

// SetEncounterMethodRates gets a reference to the given []EncounterMethodRate and assigns it to the EncounterMethodRates field.
func (o *LocationArea) SetEncounterMethodRates(v []EncounterMethodRate) {
	o.EncounterMethodRates = v
}

// GetLocation returns the Location field value if set, zero value otherwise.
func (o *LocationArea) GetLocation() Location {
	if o == nil || isNil(o.Location) {
		var ret Location
		return ret
	}
	return *o.Location
}

// GetLocationOk returns a tuple with the Location field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LocationArea) GetLocationOk() (*Location, bool) {
	if o == nil || isNil(o.Location) {
    return nil, false
	}
	return o.Location, true
}

// HasLocation returns a boolean if a field has been set.
func (o *LocationArea) HasLocation() bool {
	if o != nil && !isNil(o.Location) {
		return true
	}

	return false
}

// SetLocation gets a reference to the given Location and assigns it to the Location field.
func (o *LocationArea) SetLocation(v Location) {
	o.Location = &v
}

// GetNames returns the Names field value if set, zero value otherwise.
func (o *LocationArea) GetNames() []Name {
	if o == nil || isNil(o.Names) {
		var ret []Name
		return ret
	}
	return o.Names
}

// GetNamesOk returns a tuple with the Names field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LocationArea) GetNamesOk() ([]Name, bool) {
	if o == nil || isNil(o.Names) {
    return nil, false
	}
	return o.Names, true
}

// HasNames returns a boolean if a field has been set.
func (o *LocationArea) HasNames() bool {
	if o != nil && !isNil(o.Names) {
		return true
	}

	return false
}

// SetNames gets a reference to the given []Name and assigns it to the Names field.
func (o *LocationArea) SetNames(v []Name) {
	o.Names = v
}

// GetPokemonEncounters returns the PokemonEncounters field value if set, zero value otherwise.
func (o *LocationArea) GetPokemonEncounters() []PokemonEncounter {
	if o == nil || isNil(o.PokemonEncounters) {
		var ret []PokemonEncounter
		return ret
	}
	return o.PokemonEncounters
}

// GetPokemonEncountersOk returns a tuple with the PokemonEncounters field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LocationArea) GetPokemonEncountersOk() ([]PokemonEncounter, bool) {
	if o == nil || isNil(o.PokemonEncounters) {
    return nil, false
	}
	return o.PokemonEncounters, true
}

// HasPokemonEncounters returns a boolean if a field has been set.
func (o *LocationArea) HasPokemonEncounters() bool {
	if o != nil && !isNil(o.PokemonEncounters) {
		return true
	}

	return false
}

// SetPokemonEncounters gets a reference to the given []PokemonEncounter and assigns it to the PokemonEncounters field.
func (o *LocationArea) SetPokemonEncounters(v []PokemonEncounter) {
	o.PokemonEncounters = v
}

func (o LocationArea) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !isNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !isNil(o.GameIndex) {
		toSerialize["game_index"] = o.GameIndex
	}
	if !isNil(o.EncounterMethodRates) {
		toSerialize["encounter_method_rates"] = o.EncounterMethodRates
	}
	if !isNil(o.Location) {
		toSerialize["location"] = o.Location
	}
	if !isNil(o.Names) {
		toSerialize["names"] = o.Names
	}
	if !isNil(o.PokemonEncounters) {
		toSerialize["pokemon_encounters"] = o.PokemonEncounters
	}
	return json.Marshal(toSerialize)
}

type NullableLocationArea struct {
	value *LocationArea
	isSet bool
}

func (v NullableLocationArea) Get() *LocationArea {
	return v.value
}

func (v *NullableLocationArea) Set(val *LocationArea) {
	v.value = val
	v.isSet = true
}

func (v NullableLocationArea) IsSet() bool {
	return v.isSet
}

func (v *NullableLocationArea) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableLocationArea(val *LocationArea) *NullableLocationArea {
	return &NullableLocationArea{value: val, isSet: true}
}

func (v NullableLocationArea) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableLocationArea) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}



/*


No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 20220523
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// Name struct for Name
type Name struct {
	Language *NamedAPIResource `json:"language,omitempty"`
	Name *string `json:"name,omitempty"`
}

// NewName instantiates a new Name object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewName() *Name {
	this := Name{}
	return &this
}

// NewNameWithDefaults instantiates a new Name object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewNameWithDefaults() *Name {
	this := Name{}
	return &this
}

// GetLanguage returns the Language field value if set, zero value otherwise.
func (o *Name) GetLanguage() NamedAPIResource {
	if o == nil || isNil(o.Language) {
		var ret NamedAPIResource
		return ret
	}
	return *o.Language
}

// GetLanguageOk returns a tuple with the Language field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Name) GetLanguageOk() (*NamedAPIResource, bool) {
	if o == nil || isNil(o.Language) {
    return nil, false
	}
	return o.Language, true
}

// HasLanguage returns a boolean if a field has been set.
func (o *Name) HasLanguage() bool {
	if o != nil && !isNil(o.Language) {
		return true
	}

	return false
}

// SetLanguage gets a reference to the given NamedAPIResource and assigns it to the Language field.
func (o *Name) SetLanguage(v NamedAPIResource) {
	o.Language = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *Name) GetName() string {
	if o == nil || isNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Name) GetNameOk() (*string, bool) {
	if o == nil || isNil(o.Name) {
    return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *Name) HasName() bool {
	if o != nil && !isNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *Name) SetName(v string) {
	o.Name = &v
}

func (o Name) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Language) {
		toSerialize["language"] = o.Language
	}
	if !isNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	return json.Marshal(toSerialize)
}

type NullableName struct {
	value *Name
	isSet bool
}

func (v NullableName) Get() *Name {
	return v.value
}

func (v *NullableName) Set(val *Name) {
	v.value = val
	v.isSet = true
}

func (v NullableName) IsSet() bool {
	return v.isSet
}

func (v *NullableName) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableName(val *Name) *NullableName {
	return &NullableName{value: val, isSet: true}
}

func (v NullableName) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableName) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}



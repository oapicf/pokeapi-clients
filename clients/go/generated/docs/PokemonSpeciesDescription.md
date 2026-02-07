# PokemonSpeciesDescription

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **string** |  | [optional] 
**Language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Methods

### NewPokemonSpeciesDescription

`func NewPokemonSpeciesDescription(language LanguageSummary, ) *PokemonSpeciesDescription`

NewPokemonSpeciesDescription instantiates a new PokemonSpeciesDescription object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonSpeciesDescriptionWithDefaults

`func NewPokemonSpeciesDescriptionWithDefaults() *PokemonSpeciesDescription`

NewPokemonSpeciesDescriptionWithDefaults instantiates a new PokemonSpeciesDescription object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *PokemonSpeciesDescription) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *PokemonSpeciesDescription) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *PokemonSpeciesDescription) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *PokemonSpeciesDescription) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetLanguage

`func (o *PokemonSpeciesDescription) GetLanguage() LanguageSummary`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *PokemonSpeciesDescription) GetLanguageOk() (*LanguageSummary, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *PokemonSpeciesDescription) SetLanguage(v LanguageSummary)`

SetLanguage sets Language field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# Gender

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** | The identifier for this gender resource | [optional] 
**Name** | Pointer to **string** | The name for this gender resource | [optional] 
**PokemonSpeciesDetails** | Pointer to [**[]GenderPokemonSpeciesDetailsInner**](GenderPokemonSpeciesDetailsInner.md) |  | [optional] 

## Methods

### NewGender

`func NewGender() *Gender`

NewGender instantiates a new Gender object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenderWithDefaults

`func NewGenderWithDefaults() *Gender`

NewGenderWithDefaults instantiates a new Gender object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Gender) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Gender) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Gender) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *Gender) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *Gender) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Gender) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Gender) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *Gender) HasName() bool`

HasName returns a boolean if a field has been set.

### GetPokemonSpeciesDetails

`func (o *Gender) GetPokemonSpeciesDetails() []GenderPokemonSpeciesDetailsInner`

GetPokemonSpeciesDetails returns the PokemonSpeciesDetails field if non-nil, zero value otherwise.

### GetPokemonSpeciesDetailsOk

`func (o *Gender) GetPokemonSpeciesDetailsOk() (*[]GenderPokemonSpeciesDetailsInner, bool)`

GetPokemonSpeciesDetailsOk returns a tuple with the PokemonSpeciesDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonSpeciesDetails

`func (o *Gender) SetPokemonSpeciesDetails(v []GenderPokemonSpeciesDetailsInner)`

SetPokemonSpeciesDetails sets PokemonSpeciesDetails field to given value.

### HasPokemonSpeciesDetails

`func (o *Gender) HasPokemonSpeciesDetails() bool`

HasPokemonSpeciesDetails returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



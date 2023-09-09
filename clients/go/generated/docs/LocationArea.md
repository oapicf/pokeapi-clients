# LocationArea

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** |  | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**GameIndex** | Pointer to **int32** |  | [optional] 
**EncounterMethodRates** | Pointer to [**[]EncounterMethodRate**](EncounterMethodRate.md) |  | [optional] 
**Location** | Pointer to [**Location**](Location.md) |  | [optional] 
**Names** | Pointer to [**[]Name**](Name.md) |  | [optional] 
**PokemonEncounters** | Pointer to [**[]PokemonEncounter**](PokemonEncounter.md) |  | [optional] 

## Methods

### NewLocationArea

`func NewLocationArea() *LocationArea`

NewLocationArea instantiates a new LocationArea object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocationAreaWithDefaults

`func NewLocationAreaWithDefaults() *LocationArea`

NewLocationAreaWithDefaults instantiates a new LocationArea object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *LocationArea) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *LocationArea) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *LocationArea) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *LocationArea) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *LocationArea) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *LocationArea) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *LocationArea) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *LocationArea) HasName() bool`

HasName returns a boolean if a field has been set.

### GetGameIndex

`func (o *LocationArea) GetGameIndex() int32`

GetGameIndex returns the GameIndex field if non-nil, zero value otherwise.

### GetGameIndexOk

`func (o *LocationArea) GetGameIndexOk() (*int32, bool)`

GetGameIndexOk returns a tuple with the GameIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGameIndex

`func (o *LocationArea) SetGameIndex(v int32)`

SetGameIndex sets GameIndex field to given value.

### HasGameIndex

`func (o *LocationArea) HasGameIndex() bool`

HasGameIndex returns a boolean if a field has been set.

### GetEncounterMethodRates

`func (o *LocationArea) GetEncounterMethodRates() []EncounterMethodRate`

GetEncounterMethodRates returns the EncounterMethodRates field if non-nil, zero value otherwise.

### GetEncounterMethodRatesOk

`func (o *LocationArea) GetEncounterMethodRatesOk() (*[]EncounterMethodRate, bool)`

GetEncounterMethodRatesOk returns a tuple with the EncounterMethodRates field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEncounterMethodRates

`func (o *LocationArea) SetEncounterMethodRates(v []EncounterMethodRate)`

SetEncounterMethodRates sets EncounterMethodRates field to given value.

### HasEncounterMethodRates

`func (o *LocationArea) HasEncounterMethodRates() bool`

HasEncounterMethodRates returns a boolean if a field has been set.

### GetLocation

`func (o *LocationArea) GetLocation() Location`

GetLocation returns the Location field if non-nil, zero value otherwise.

### GetLocationOk

`func (o *LocationArea) GetLocationOk() (*Location, bool)`

GetLocationOk returns a tuple with the Location field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocation

`func (o *LocationArea) SetLocation(v Location)`

SetLocation sets Location field to given value.

### HasLocation

`func (o *LocationArea) HasLocation() bool`

HasLocation returns a boolean if a field has been set.

### GetNames

`func (o *LocationArea) GetNames() []Name`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *LocationArea) GetNamesOk() (*[]Name, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *LocationArea) SetNames(v []Name)`

SetNames sets Names field to given value.

### HasNames

`func (o *LocationArea) HasNames() bool`

HasNames returns a boolean if a field has been set.

### GetPokemonEncounters

`func (o *LocationArea) GetPokemonEncounters() []PokemonEncounter`

GetPokemonEncounters returns the PokemonEncounters field if non-nil, zero value otherwise.

### GetPokemonEncountersOk

`func (o *LocationArea) GetPokemonEncountersOk() (*[]PokemonEncounter, bool)`

GetPokemonEncountersOk returns a tuple with the PokemonEncounters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonEncounters

`func (o *LocationArea) SetPokemonEncounters(v []PokemonEncounter)`

SetPokemonEncounters sets PokemonEncounters field to given value.

### HasPokemonEncounters

`func (o *LocationArea) HasPokemonEncounters() bool`

HasPokemonEncounters returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



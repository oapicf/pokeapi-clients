# LocationAreaDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**GameIndex** | **int32** | The internal id of an API resource within game data. | 
**EncounterMethodRates** | [**[]LocationAreaEncounterRate**](LocationAreaEncounterRate.md) | A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. | [readonly] 
**Location** | [**LocationSummary**](LocationSummary.md) | The region this location area can be found in. | 
**Names** | [**[]LocationAreaName**](LocationAreaName.md) | The name of this resource listed in different languages. | [readonly] 
**PokemonEncounters** | [**[]LocationAreaPokemonEncounter**](LocationAreaPokemonEncounter.md) | A list of Pokémon that can be encountered in this area along with version specific details about the encounter. | [readonly] 

## Methods

### NewLocationAreaDetail

`func NewLocationAreaDetail(id int32, name string, gameIndex int32, encounterMethodRates []LocationAreaEncounterRate, location LocationSummary, names []LocationAreaName, pokemonEncounters []LocationAreaPokemonEncounter, ) *LocationAreaDetail`

NewLocationAreaDetail instantiates a new LocationAreaDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocationAreaDetailWithDefaults

`func NewLocationAreaDetailWithDefaults() *LocationAreaDetail`

NewLocationAreaDetailWithDefaults instantiates a new LocationAreaDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *LocationAreaDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *LocationAreaDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *LocationAreaDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *LocationAreaDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *LocationAreaDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *LocationAreaDetail) SetName(v string)`

SetName sets Name field to given value.


### GetGameIndex

`func (o *LocationAreaDetail) GetGameIndex() int32`

GetGameIndex returns the GameIndex field if non-nil, zero value otherwise.

### GetGameIndexOk

`func (o *LocationAreaDetail) GetGameIndexOk() (*int32, bool)`

GetGameIndexOk returns a tuple with the GameIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGameIndex

`func (o *LocationAreaDetail) SetGameIndex(v int32)`

SetGameIndex sets GameIndex field to given value.


### GetEncounterMethodRates

`func (o *LocationAreaDetail) GetEncounterMethodRates() []LocationAreaEncounterRate`

GetEncounterMethodRates returns the EncounterMethodRates field if non-nil, zero value otherwise.

### GetEncounterMethodRatesOk

`func (o *LocationAreaDetail) GetEncounterMethodRatesOk() (*[]LocationAreaEncounterRate, bool)`

GetEncounterMethodRatesOk returns a tuple with the EncounterMethodRates field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEncounterMethodRates

`func (o *LocationAreaDetail) SetEncounterMethodRates(v []LocationAreaEncounterRate)`

SetEncounterMethodRates sets EncounterMethodRates field to given value.


### GetLocation

`func (o *LocationAreaDetail) GetLocation() LocationSummary`

GetLocation returns the Location field if non-nil, zero value otherwise.

### GetLocationOk

`func (o *LocationAreaDetail) GetLocationOk() (*LocationSummary, bool)`

GetLocationOk returns a tuple with the Location field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocation

`func (o *LocationAreaDetail) SetLocation(v LocationSummary)`

SetLocation sets Location field to given value.


### GetNames

`func (o *LocationAreaDetail) GetNames() []LocationAreaName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *LocationAreaDetail) GetNamesOk() (*[]LocationAreaName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *LocationAreaDetail) SetNames(v []LocationAreaName)`

SetNames sets Names field to given value.


### GetPokemonEncounters

`func (o *LocationAreaDetail) GetPokemonEncounters() []LocationAreaPokemonEncounter`

GetPokemonEncounters returns the PokemonEncounters field if non-nil, zero value otherwise.

### GetPokemonEncountersOk

`func (o *LocationAreaDetail) GetPokemonEncountersOk() (*[]LocationAreaPokemonEncounter, bool)`

GetPokemonEncountersOk returns a tuple with the PokemonEncounters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemonEncounters

`func (o *LocationAreaDetail) SetPokemonEncounters(v []LocationAreaPokemonEncounter)`

SetPokemonEncounters sets PokemonEncounters field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



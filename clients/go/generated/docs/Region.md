# Region

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | 
**Locations** | [**[]NamedAPIResource**](NamedAPIResource.md) |  | 
**Name** | **string** |  | 
**Names** | [**[]Name**](Name.md) |  | 
**MainGeneration** | [**NamedAPIResource**](NamedAPIResource.md) |  | 
**Pokedexes** | [**[]NamedAPIResource**](NamedAPIResource.md) |  | 
**VersionGroups** | [**[]NamedAPIResource**](NamedAPIResource.md) |  | 

## Methods

### NewRegion

`func NewRegion(id int32, locations []NamedAPIResource, name string, names []Name, mainGeneration NamedAPIResource, pokedexes []NamedAPIResource, versionGroups []NamedAPIResource, ) *Region`

NewRegion instantiates a new Region object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRegionWithDefaults

`func NewRegionWithDefaults() *Region`

NewRegionWithDefaults instantiates a new Region object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Region) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Region) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Region) SetId(v int32)`

SetId sets Id field to given value.


### GetLocations

`func (o *Region) GetLocations() []NamedAPIResource`

GetLocations returns the Locations field if non-nil, zero value otherwise.

### GetLocationsOk

`func (o *Region) GetLocationsOk() (*[]NamedAPIResource, bool)`

GetLocationsOk returns a tuple with the Locations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocations

`func (o *Region) SetLocations(v []NamedAPIResource)`

SetLocations sets Locations field to given value.


### GetName

`func (o *Region) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Region) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Region) SetName(v string)`

SetName sets Name field to given value.


### GetNames

`func (o *Region) GetNames() []Name`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *Region) GetNamesOk() (*[]Name, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *Region) SetNames(v []Name)`

SetNames sets Names field to given value.


### GetMainGeneration

`func (o *Region) GetMainGeneration() NamedAPIResource`

GetMainGeneration returns the MainGeneration field if non-nil, zero value otherwise.

### GetMainGenerationOk

`func (o *Region) GetMainGenerationOk() (*NamedAPIResource, bool)`

GetMainGenerationOk returns a tuple with the MainGeneration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMainGeneration

`func (o *Region) SetMainGeneration(v NamedAPIResource)`

SetMainGeneration sets MainGeneration field to given value.


### GetPokedexes

`func (o *Region) GetPokedexes() []NamedAPIResource`

GetPokedexes returns the Pokedexes field if non-nil, zero value otherwise.

### GetPokedexesOk

`func (o *Region) GetPokedexesOk() (*[]NamedAPIResource, bool)`

GetPokedexesOk returns a tuple with the Pokedexes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokedexes

`func (o *Region) SetPokedexes(v []NamedAPIResource)`

SetPokedexes sets Pokedexes field to given value.


### GetVersionGroups

`func (o *Region) GetVersionGroups() []NamedAPIResource`

GetVersionGroups returns the VersionGroups field if non-nil, zero value otherwise.

### GetVersionGroupsOk

`func (o *Region) GetVersionGroupsOk() (*[]NamedAPIResource, bool)`

GetVersionGroupsOk returns a tuple with the VersionGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroups

`func (o *Region) SetVersionGroups(v []NamedAPIResource)`

SetVersionGroups sets VersionGroups field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



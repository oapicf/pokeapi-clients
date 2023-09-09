# VersionGameIndex

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**GameIndex** | Pointer to **int32** | The internal id of the game used in generation VI and VII to identify different versions of the same Pokémon species.  | [optional] 
**Version** | Pointer to [**NamedAPIResource**](NamedAPIResource.md) |  | [optional] 

## Methods

### NewVersionGameIndex

`func NewVersionGameIndex() *VersionGameIndex`

NewVersionGameIndex instantiates a new VersionGameIndex object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewVersionGameIndexWithDefaults

`func NewVersionGameIndexWithDefaults() *VersionGameIndex`

NewVersionGameIndexWithDefaults instantiates a new VersionGameIndex object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGameIndex

`func (o *VersionGameIndex) GetGameIndex() int32`

GetGameIndex returns the GameIndex field if non-nil, zero value otherwise.

### GetGameIndexOk

`func (o *VersionGameIndex) GetGameIndexOk() (*int32, bool)`

GetGameIndexOk returns a tuple with the GameIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGameIndex

`func (o *VersionGameIndex) SetGameIndex(v int32)`

SetGameIndex sets GameIndex field to given value.

### HasGameIndex

`func (o *VersionGameIndex) HasGameIndex() bool`

HasGameIndex returns a boolean if a field has been set.

### GetVersion

`func (o *VersionGameIndex) GetVersion() NamedAPIResource`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *VersionGameIndex) GetVersionOk() (*NamedAPIResource, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *VersionGameIndex) SetVersion(v NamedAPIResource)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *VersionGameIndex) HasVersion() bool`

HasVersion returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# Version

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | 
**Name** | **string** |  | 
**Names** | [**[]Name**](Name.md) |  | 
**VersionGroup** | [**NamedAPIResource**](NamedAPIResource.md) |  | 

## Methods

### NewVersion

`func NewVersion(id int32, name string, names []Name, versionGroup NamedAPIResource, ) *Version`

NewVersion instantiates a new Version object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewVersionWithDefaults

`func NewVersionWithDefaults() *Version`

NewVersionWithDefaults instantiates a new Version object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Version) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Version) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Version) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *Version) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Version) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Version) SetName(v string)`

SetName sets Name field to given value.


### GetNames

`func (o *Version) GetNames() []Name`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *Version) GetNamesOk() (*[]Name, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *Version) SetNames(v []Name)`

SetNames sets Names field to given value.


### GetVersionGroup

`func (o *Version) GetVersionGroup() NamedAPIResource`

GetVersionGroup returns the VersionGroup field if non-nil, zero value otherwise.

### GetVersionGroupOk

`func (o *Version) GetVersionGroupOk() (*NamedAPIResource, bool)`

GetVersionGroupOk returns a tuple with the VersionGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroup

`func (o *Version) SetVersionGroup(v NamedAPIResource)`

SetVersionGroup sets VersionGroup field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



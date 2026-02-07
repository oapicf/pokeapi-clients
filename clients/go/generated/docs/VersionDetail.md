# VersionDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Names** | [**[]VersionName**](VersionName.md) |  | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 

## Methods

### NewVersionDetail

`func NewVersionDetail(id int32, name string, names []VersionName, versionGroup VersionGroupSummary, ) *VersionDetail`

NewVersionDetail instantiates a new VersionDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewVersionDetailWithDefaults

`func NewVersionDetailWithDefaults() *VersionDetail`

NewVersionDetailWithDefaults instantiates a new VersionDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *VersionDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *VersionDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *VersionDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *VersionDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *VersionDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *VersionDetail) SetName(v string)`

SetName sets Name field to given value.


### GetNames

`func (o *VersionDetail) GetNames() []VersionName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *VersionDetail) GetNamesOk() (*[]VersionName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *VersionDetail) SetNames(v []VersionName)`

SetNames sets Names field to given value.


### GetVersionGroup

`func (o *VersionDetail) GetVersionGroup() VersionGroupSummary`

GetVersionGroup returns the VersionGroup field if non-nil, zero value otherwise.

### GetVersionGroupOk

`func (o *VersionDetail) GetVersionGroupOk() (*VersionGroupSummary, bool)`

GetVersionGroupOk returns a tuple with the VersionGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroup

`func (o *VersionDetail) SetVersionGroup(v VersionGroupSummary)`

SetVersionGroup sets VersionGroup field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



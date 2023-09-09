# MachineVersionDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Machine** | [**APIResource**](APIResource.md) |  | 
**VersionGroup** | [**APIResource**](APIResource.md) |  | 

## Methods

### NewMachineVersionDetail

`func NewMachineVersionDetail(machine APIResource, versionGroup APIResource, ) *MachineVersionDetail`

NewMachineVersionDetail instantiates a new MachineVersionDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMachineVersionDetailWithDefaults

`func NewMachineVersionDetailWithDefaults() *MachineVersionDetail`

NewMachineVersionDetailWithDefaults instantiates a new MachineVersionDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMachine

`func (o *MachineVersionDetail) GetMachine() APIResource`

GetMachine returns the Machine field if non-nil, zero value otherwise.

### GetMachineOk

`func (o *MachineVersionDetail) GetMachineOk() (*APIResource, bool)`

GetMachineOk returns a tuple with the Machine field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMachine

`func (o *MachineVersionDetail) SetMachine(v APIResource)`

SetMachine sets Machine field to given value.


### GetVersionGroup

`func (o *MachineVersionDetail) GetVersionGroup() APIResource`

GetVersionGroup returns the VersionGroup field if non-nil, zero value otherwise.

### GetVersionGroupOk

`func (o *MachineVersionDetail) GetVersionGroupOk() (*APIResource, bool)`

GetVersionGroupOk returns a tuple with the VersionGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroup

`func (o *MachineVersionDetail) SetVersionGroup(v APIResource)`

SetVersionGroup sets VersionGroup field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



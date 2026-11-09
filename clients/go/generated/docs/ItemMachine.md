# ItemMachine

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Machine** | [**MachineSummary**](MachineSummary.md) | The machine that teaches a move from an item. | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group of this specific machine. | 

## Methods

### NewItemMachine

`func NewItemMachine(machine MachineSummary, versionGroup VersionGroupSummary, ) *ItemMachine`

NewItemMachine instantiates a new ItemMachine object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemMachineWithDefaults

`func NewItemMachineWithDefaults() *ItemMachine`

NewItemMachineWithDefaults instantiates a new ItemMachine object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMachine

`func (o *ItemMachine) GetMachine() MachineSummary`

GetMachine returns the Machine field if non-nil, zero value otherwise.

### GetMachineOk

`func (o *ItemMachine) GetMachineOk() (*MachineSummary, bool)`

GetMachineOk returns a tuple with the Machine field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMachine

`func (o *ItemMachine) SetMachine(v MachineSummary)`

SetMachine sets Machine field to given value.


### GetVersionGroup

`func (o *ItemMachine) GetVersionGroup() VersionGroupSummary`

GetVersionGroup returns the VersionGroup field if non-nil, zero value otherwise.

### GetVersionGroupOk

`func (o *ItemMachine) GetVersionGroupOk() (*VersionGroupSummary, bool)`

GetVersionGroupOk returns a tuple with the VersionGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroup

`func (o *ItemMachine) SetVersionGroup(v VersionGroupSummary)`

SetVersionGroup sets VersionGroup field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



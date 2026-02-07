# MachineDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Item** | [**ItemSummary**](ItemSummary.md) |  | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 
**Move** | [**MoveSummary**](MoveSummary.md) |  | 

## Methods

### NewMachineDetail

`func NewMachineDetail(id int32, item ItemSummary, versionGroup VersionGroupSummary, move MoveSummary, ) *MachineDetail`

NewMachineDetail instantiates a new MachineDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMachineDetailWithDefaults

`func NewMachineDetailWithDefaults() *MachineDetail`

NewMachineDetailWithDefaults instantiates a new MachineDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *MachineDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MachineDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MachineDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetItem

`func (o *MachineDetail) GetItem() ItemSummary`

GetItem returns the Item field if non-nil, zero value otherwise.

### GetItemOk

`func (o *MachineDetail) GetItemOk() (*ItemSummary, bool)`

GetItemOk returns a tuple with the Item field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItem

`func (o *MachineDetail) SetItem(v ItemSummary)`

SetItem sets Item field to given value.


### GetVersionGroup

`func (o *MachineDetail) GetVersionGroup() VersionGroupSummary`

GetVersionGroup returns the VersionGroup field if non-nil, zero value otherwise.

### GetVersionGroupOk

`func (o *MachineDetail) GetVersionGroupOk() (*VersionGroupSummary, bool)`

GetVersionGroupOk returns a tuple with the VersionGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroup

`func (o *MachineDetail) SetVersionGroup(v VersionGroupSummary)`

SetVersionGroup sets VersionGroup field to given value.


### GetMove

`func (o *MachineDetail) GetMove() MoveSummary`

GetMove returns the Move field if non-nil, zero value otherwise.

### GetMoveOk

`func (o *MachineDetail) GetMoveOk() (*MoveSummary, bool)`

GetMoveOk returns a tuple with the Move field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMove

`func (o *MachineDetail) SetMove(v MoveSummary)`

SetMove sets Move field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



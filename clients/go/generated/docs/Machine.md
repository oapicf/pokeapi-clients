# Machine

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** |  | [optional] 
**Item** | Pointer to [**NamedAPIResource**](NamedAPIResource.md) |  | [optional] 
**Move** | Pointer to [**NamedAPIResource**](NamedAPIResource.md) |  | [optional] 
**VersionGroup** | Pointer to [**NamedAPIResource**](NamedAPIResource.md) |  | [optional] 

## Methods

### NewMachine

`func NewMachine() *Machine`

NewMachine instantiates a new Machine object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMachineWithDefaults

`func NewMachineWithDefaults() *Machine`

NewMachineWithDefaults instantiates a new Machine object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Machine) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Machine) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Machine) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *Machine) HasId() bool`

HasId returns a boolean if a field has been set.

### GetItem

`func (o *Machine) GetItem() NamedAPIResource`

GetItem returns the Item field if non-nil, zero value otherwise.

### GetItemOk

`func (o *Machine) GetItemOk() (*NamedAPIResource, bool)`

GetItemOk returns a tuple with the Item field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItem

`func (o *Machine) SetItem(v NamedAPIResource)`

SetItem sets Item field to given value.

### HasItem

`func (o *Machine) HasItem() bool`

HasItem returns a boolean if a field has been set.

### GetMove

`func (o *Machine) GetMove() NamedAPIResource`

GetMove returns the Move field if non-nil, zero value otherwise.

### GetMoveOk

`func (o *Machine) GetMoveOk() (*NamedAPIResource, bool)`

GetMoveOk returns a tuple with the Move field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMove

`func (o *Machine) SetMove(v NamedAPIResource)`

SetMove sets Move field to given value.

### HasMove

`func (o *Machine) HasMove() bool`

HasMove returns a boolean if a field has been set.

### GetVersionGroup

`func (o *Machine) GetVersionGroup() NamedAPIResource`

GetVersionGroup returns the VersionGroup field if non-nil, zero value otherwise.

### GetVersionGroupOk

`func (o *Machine) GetVersionGroupOk() (*NamedAPIResource, bool)`

GetVersionGroupOk returns a tuple with the VersionGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroup

`func (o *Machine) SetVersionGroup(v NamedAPIResource)`

SetVersionGroup sets VersionGroup field to given value.

### HasVersionGroup

`func (o *Machine) HasVersionGroup() bool`

HasVersionGroup returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



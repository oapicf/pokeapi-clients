# EvolutionChain

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this evolution chain resource | 
**BabyTriggerItem** | Pointer to [**NullableEvolutionChainBabyTriggerItem**](EvolutionChainBabyTriggerItem.md) |  | [optional] 
**Chain** | [**EvolutionChainChain**](EvolutionChainChain.md) |  | 

## Methods

### NewEvolutionChain

`func NewEvolutionChain(id int32, chain EvolutionChainChain, ) *EvolutionChain`

NewEvolutionChain instantiates a new EvolutionChain object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEvolutionChainWithDefaults

`func NewEvolutionChainWithDefaults() *EvolutionChain`

NewEvolutionChainWithDefaults instantiates a new EvolutionChain object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *EvolutionChain) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *EvolutionChain) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *EvolutionChain) SetId(v int32)`

SetId sets Id field to given value.


### GetBabyTriggerItem

`func (o *EvolutionChain) GetBabyTriggerItem() EvolutionChainBabyTriggerItem`

GetBabyTriggerItem returns the BabyTriggerItem field if non-nil, zero value otherwise.

### GetBabyTriggerItemOk

`func (o *EvolutionChain) GetBabyTriggerItemOk() (*EvolutionChainBabyTriggerItem, bool)`

GetBabyTriggerItemOk returns a tuple with the BabyTriggerItem field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBabyTriggerItem

`func (o *EvolutionChain) SetBabyTriggerItem(v EvolutionChainBabyTriggerItem)`

SetBabyTriggerItem sets BabyTriggerItem field to given value.

### HasBabyTriggerItem

`func (o *EvolutionChain) HasBabyTriggerItem() bool`

HasBabyTriggerItem returns a boolean if a field has been set.

### SetBabyTriggerItemNil

`func (o *EvolutionChain) SetBabyTriggerItemNil(b bool)`

 SetBabyTriggerItemNil sets the value for BabyTriggerItem to be an explicit nil

### UnsetBabyTriggerItem
`func (o *EvolutionChain) UnsetBabyTriggerItem()`

UnsetBabyTriggerItem ensures that no value is present for BabyTriggerItem, not even an explicit nil
### GetChain

`func (o *EvolutionChain) GetChain() EvolutionChainChain`

GetChain returns the Chain field if non-nil, zero value otherwise.

### GetChainOk

`func (o *EvolutionChain) GetChainOk() (*EvolutionChainChain, bool)`

GetChainOk returns a tuple with the Chain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChain

`func (o *EvolutionChain) SetChain(v EvolutionChainChain)`

SetChain sets Chain field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



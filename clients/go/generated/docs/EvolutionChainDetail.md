# EvolutionChainDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this resource. | [readonly] 
**BabyTriggerItem** | [**NullableItemSummary**](ItemSummary.md) | The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon. | 
**Chain** | [**EvolutionChainLink**](EvolutionChainLink.md) | The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order. | [readonly] 

## Methods

### NewEvolutionChainDetail

`func NewEvolutionChainDetail(id int32, babyTriggerItem NullableItemSummary, chain EvolutionChainLink, ) *EvolutionChainDetail`

NewEvolutionChainDetail instantiates a new EvolutionChainDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEvolutionChainDetailWithDefaults

`func NewEvolutionChainDetailWithDefaults() *EvolutionChainDetail`

NewEvolutionChainDetailWithDefaults instantiates a new EvolutionChainDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *EvolutionChainDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *EvolutionChainDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *EvolutionChainDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetBabyTriggerItem

`func (o *EvolutionChainDetail) GetBabyTriggerItem() ItemSummary`

GetBabyTriggerItem returns the BabyTriggerItem field if non-nil, zero value otherwise.

### GetBabyTriggerItemOk

`func (o *EvolutionChainDetail) GetBabyTriggerItemOk() (*ItemSummary, bool)`

GetBabyTriggerItemOk returns a tuple with the BabyTriggerItem field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBabyTriggerItem

`func (o *EvolutionChainDetail) SetBabyTriggerItem(v ItemSummary)`

SetBabyTriggerItem sets BabyTriggerItem field to given value.


### SetBabyTriggerItemNil

`func (o *EvolutionChainDetail) SetBabyTriggerItemNil(b bool)`

 SetBabyTriggerItemNil sets the value for BabyTriggerItem to be an explicit nil

### UnsetBabyTriggerItem
`func (o *EvolutionChainDetail) UnsetBabyTriggerItem()`

UnsetBabyTriggerItem ensures that no value is present for BabyTriggerItem, not even an explicit nil
### GetChain

`func (o *EvolutionChainDetail) GetChain() EvolutionChainLink`

GetChain returns the Chain field if non-nil, zero value otherwise.

### GetChainOk

`func (o *EvolutionChainDetail) GetChainOk() (*EvolutionChainLink, bool)`

GetChainOk returns a tuple with the Chain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChain

`func (o *EvolutionChainDetail) SetChain(v EvolutionChainLink)`

SetChain sets Chain field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



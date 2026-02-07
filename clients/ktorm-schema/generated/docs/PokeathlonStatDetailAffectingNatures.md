
# Table `PokeathlonStatDetail_affecting_natures`
(mapped from: PokeathlonStatDetailAffectingNatures)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**decrease** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokeathlonStatDetailAffectingNaturesDecreaseInner&gt;**](PokeathlonStatDetailAffectingNaturesDecreaseInner.md) |  | 
**increase** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokeathlonStatDetailAffectingNaturesIncreaseInner&gt;**](PokeathlonStatDetailAffectingNaturesIncreaseInner.md) |  | 


# **Table `PokeathlonStatDetailAffectingNaturesPokeathlonStatDetailAffectingNaturesDecreaseInner`**
(mapped from: PokeathlonStatDetailAffectingNaturesPokeathlonStatDetailAffectingNaturesDecreaseInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokeathlonStatDetailAffectingNatures | pokeathlonStatDetailAffectingNatures | long | | kotlin.Long | Primary Key | *one*
pokeathlonStatDetailAffectingNaturesDecreaseInner | pokeathlonStatDetailAffectingNaturesDecreaseInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokeathlonStatDetailAffectingNaturesPokeathlonStatDetailAffectingNaturesIncreaseInner`**
(mapped from: PokeathlonStatDetailAffectingNaturesPokeathlonStatDetailAffectingNaturesIncreaseInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokeathlonStatDetailAffectingNatures | pokeathlonStatDetailAffectingNatures | long | | kotlin.Long | Primary Key | *one*
pokeathlonStatDetailAffectingNaturesIncreaseInner | pokeathlonStatDetailAffectingNaturesIncreaseInner | long | | kotlin.Long | Foreign Key | *many*




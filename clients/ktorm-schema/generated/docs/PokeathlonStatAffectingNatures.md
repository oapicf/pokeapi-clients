
# Table `PokeathlonStatAffectingNatures`
(mapped from: PokeathlonStatAffectingNatures)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**increase** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokeathlonStatAffectingNature&gt;**](PokeathlonStatAffectingNature.md) | A list of natures and how they change the referenced Pokéathlon stat. | 
**decrease** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokeathlonStatAffectingNature&gt;**](PokeathlonStatAffectingNature.md) | A list of natures and how they change the referenced Pokéathlon stat. | 


# **Table `PokeathlonStatAffectingNaturesPokeathlonStatAffectingNature`**
(mapped from: PokeathlonStatAffectingNaturesPokeathlonStatAffectingNature)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokeathlonStatAffectingNatures | pokeathlonStatAffectingNatures | long | | kotlin.Long | Primary Key | *one*
pokeathlonStatAffectingNature | pokeathlonStatAffectingNature | long | | kotlin.Long | Foreign Key | *many*



# **Table `PokeathlonStatAffectingNaturesPokeathlonStatAffectingNature`**
(mapped from: PokeathlonStatAffectingNaturesPokeathlonStatAffectingNature)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pokeathlonStatAffectingNatures | pokeathlonStatAffectingNatures | long | | kotlin.Long | Primary Key | *one*
pokeathlonStatAffectingNature | pokeathlonStatAffectingNature | long | | kotlin.Long | Foreign Key | *many*





# Table `ContestEffectDetail`
(mapped from: ContestEffectDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**appeal** | appeal | int NOT NULL |  | **kotlin.Int** | The base number of hearts the user of this move gets. | 
**jam** | jam | int NOT NULL |  | **kotlin.Int** | The base number of hearts the user&#39;s opponent loses. | 
**effectEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ContestEffectEffectText&gt;**](ContestEffectEffectText.md) | The result of this contest effect listed in different languages. |  [readonly]
**flavorTextEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ContestEffectFlavorText&gt;**](ContestEffectFlavorText.md) | The flavor text of this contest effect listed in different languages. |  [readonly]





# **Table `ContestEffectDetailContestEffectEffectText`**
(mapped from: ContestEffectDetailContestEffectEffectText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
contestEffectDetail | contestEffectDetail | long | | kotlin.Long | Primary Key | *one*
contestEffectEffectText | contestEffectEffectText | long | | kotlin.Long | Foreign Key | *many*



# **Table `ContestEffectDetailContestEffectFlavorText`**
(mapped from: ContestEffectDetailContestEffectFlavorText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
contestEffectDetail | contestEffectDetail | long | | kotlin.Long | Primary Key | *one*
contestEffectFlavorText | contestEffectFlavorText | long | | kotlin.Long | Foreign Key | *many*




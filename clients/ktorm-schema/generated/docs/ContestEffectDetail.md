
# Table `ContestEffectDetail`
(mapped from: ContestEffectDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**appeal** | appeal | int NOT NULL |  | **kotlin.Int** |  | 
**jam** | jam | int NOT NULL |  | **kotlin.Int** |  | 
**effectEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ContestEffectEffectText&gt;**](ContestEffectEffectText.md) |  | 
**flavorTextEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ContestEffectFlavorText&gt;**](ContestEffectFlavorText.md) |  | 





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




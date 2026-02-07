
# Table `SuperContestEffectDetail`
(mapped from: SuperContestEffectDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**appeal** | appeal | int NOT NULL |  | **kotlin.Int** |  | 
**flavorTextEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SuperContestEffectFlavorText&gt;**](SuperContestEffectFlavorText.md) |  | 
**moves** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveSummary&gt;**](MoveSummary.md) |  | 




# **Table `SuperContestEffectDetailSuperContestEffectFlavorText`**
(mapped from: SuperContestEffectDetailSuperContestEffectFlavorText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
superContestEffectDetail | superContestEffectDetail | long | | kotlin.Long | Primary Key | *one*
superContestEffectFlavorText | superContestEffectFlavorText | long | | kotlin.Long | Foreign Key | *many*



# **Table `SuperContestEffectDetailMoveSummary`**
(mapped from: SuperContestEffectDetailMoveSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
superContestEffectDetail | superContestEffectDetail | long | | kotlin.Long | Primary Key | *one*
moveSummary | moveSummary | long | | kotlin.Long | Foreign Key | *many*




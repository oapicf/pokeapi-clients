
# Table `SuperContestEffectDetail`
(mapped from: SuperContestEffectDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**appeal** | appeal | int NOT NULL |  | **kotlin.Int** | The level of appeal this super contest effect has. | 
**flavorTextEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SuperContestEffectFlavorText&gt;**](SuperContestEffectFlavorText.md) | The flavor text of this super contest effect listed in different languages. |  [readonly]
**moves** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that have the effect when used in super contests. |  [readonly]




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




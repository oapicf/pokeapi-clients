
# Table `NatureDetail`
(mapped from: NatureDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**decreasedStat** | decreased_stat | long NOT NULL |  | [**StatSummary**](StatSummary.md) |  |  [foreignkey]
**increasedStat** | increased_stat | long NOT NULL |  | [**StatSummary**](StatSummary.md) |  |  [foreignkey]
**likesFlavor** | likes_flavor | long NOT NULL |  | [**BerryFlavorSummary**](BerryFlavorSummary.md) |  |  [foreignkey]
**hatesFlavor** | hates_flavor | long NOT NULL |  | [**BerryFlavorSummary**](BerryFlavorSummary.md) |  |  [foreignkey]
**berries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BerrySummary&gt;**](BerrySummary.md) |  | 
**pokeathlonStatChanges** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;NatureDetailPokeathlonStatChangesInner&gt;**](NatureDetailPokeathlonStatChangesInner.md) |  | 
**moveBattleStylePreferences** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;NatureBattleStylePreference&gt;**](NatureBattleStylePreference.md) |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;NatureName&gt;**](NatureName.md) |  | 








# **Table `NatureDetailBerrySummary`**
(mapped from: NatureDetailBerrySummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
natureDetail | natureDetail | long | | kotlin.Long | Primary Key | *one*
berrySummary | berrySummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `NatureDetailNatureDetailPokeathlonStatChangesInner`**
(mapped from: NatureDetailNatureDetailPokeathlonStatChangesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
natureDetail | natureDetail | long | | kotlin.Long | Primary Key | *one*
natureDetailPokeathlonStatChangesInner | natureDetailPokeathlonStatChangesInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `NatureDetailNatureBattleStylePreference`**
(mapped from: NatureDetailNatureBattleStylePreference)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
natureDetail | natureDetail | long | | kotlin.Long | Primary Key | *one*
natureBattleStylePreference | natureBattleStylePreference | long | | kotlin.Long | Foreign Key | *many*



# **Table `NatureDetailNatureName`**
(mapped from: NatureDetailNatureName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
natureDetail | natureDetail | long | | kotlin.Long | Primary Key | *one*
natureName | natureName | long | | kotlin.Long | Foreign Key | *many*




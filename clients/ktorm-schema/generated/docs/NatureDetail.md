
# Table `NatureDetail`
(mapped from: NatureDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**decreasedStat** | decreased_stat | long NOT NULL |  | [**StatSummary**](StatSummary.md) | The stat decreased by 10% in Pokémon with this nature. |  [foreignkey]
**increasedStat** | increased_stat | long NOT NULL |  | [**StatSummary**](StatSummary.md) | The stat increased by 10% in Pokémon with this nature. |  [foreignkey]
**likesFlavor** | likes_flavor | long NOT NULL |  | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor liked by Pokémon with this nature. |  [foreignkey]
**hatesFlavor** | hates_flavor | long NOT NULL |  | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor hated by Pokémon with this nature. |  [foreignkey]
**pokeathlonStatChanges** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;NaturePokeathlonStat&gt;**](NaturePokeathlonStat.md) | A list of Pokéathlon stats this nature effects and how much it effects them. |  [readonly]
**moveBattleStylePreferences** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;NatureBattleStylePreference&gt;**](NatureBattleStylePreference.md) | A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. |  [readonly]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;NatureName&gt;**](NatureName.md) | The name of this resource listed in different languages. |  [readonly]








# **Table `NatureDetailNaturePokeathlonStat`**
(mapped from: NatureDetailNaturePokeathlonStat)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
natureDetail | natureDetail | long | | kotlin.Long | Primary Key | *one*
naturePokeathlonStat | naturePokeathlonStat | long | | kotlin.Long | Foreign Key | *many*



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




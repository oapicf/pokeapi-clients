# openapi::NatureDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** |  | [readonly] 
**name** | **character** |  | [Max. length: 100] 
**decreased_stat** | [**StatSummary**](StatSummary.md) |  | 
**increased_stat** | [**StatSummary**](StatSummary.md) |  | 
**likes_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) |  | 
**hates_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) |  | 
**berries** | [**array[BerrySummary]**](BerrySummary.md) |  | 
**pokeathlon_stat_changes** | [**array[NatureDetailPokeathlonStatChangesInner]**](NatureDetail_pokeathlon_stat_changes_inner.md) |  | 
**move_battle_style_preferences** | [**array[NatureBattleStylePreference]**](NatureBattleStylePreference.md) |  | 
**names** | [**array[NatureName]**](NatureName.md) |  | 



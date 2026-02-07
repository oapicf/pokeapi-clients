# openapi::PokemonFormDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** |  | [readonly] 
**name** | **character** |  | [Max. length: 100] 
**order** | **integer** |  | [optional] 
**form_order** | **integer** |  | [optional] 
**is_default** | **character** |  | [optional] 
**is_battle_only** | **character** |  | [optional] 
**is_mega** | **character** |  | [optional] 
**form_name** | **character** |  | [Max. length: 30] 
**pokemon** | [**PokemonSummary**](PokemonSummary.md) |  | 
**sprites** | [**PokemonFormDetailSprites**](PokemonFormDetail_sprites.md) |  | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 
**form_names** | [**array[PokemonFormDetailFormNamesInner]**](PokemonFormDetail_form_names_inner.md) |  | 
**names** | [**array[PokemonFormDetailFormNamesInner]**](PokemonFormDetail_form_names_inner.md) |  | 
**types** | [**array[PokemonDetailTypesInner]**](PokemonDetail_types_inner.md) |  | 



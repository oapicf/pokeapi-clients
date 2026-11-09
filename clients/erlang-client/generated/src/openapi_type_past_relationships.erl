-module(openapi_type_past_relationships).

-export([encode/1]).

-export_type([openapi_type_past_relationships/0]).

-type openapi_type_past_relationships() ::
    #{ 'generation' := openapi_generation_summary:openapi_generation_summary(),
       'damage_relations' := openapi_type_relationships:openapi_type_relationships()
     }.

encode(#{ 'generation' := Generation,
          'damage_relations' := DamageRelations
        }) ->
    #{ 'generation' => Generation,
       'damage_relations' => DamageRelations
     }.

-module(openapi_evolution_variable_detail).

-export([encode/1]).

-export_type([openapi_evolution_variable_detail/0]).

-type openapi_evolution_variable_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'symbol' := binary(),
       'data_type' => binary(),
       'source' => binary(),
       'version_group' := openapi_version_group_summary:openapi_version_group_summary(),
       'names' := list(),
       'descriptions' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'symbol' := Symbol,
          'data_type' := DataType,
          'source' := Source,
          'version_group' := VersionGroup,
          'names' := Names,
          'descriptions' := Descriptions
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'symbol' => Symbol,
       'data_type' => DataType,
       'source' => Source,
       'version_group' => VersionGroup,
       'names' => Names,
       'descriptions' => Descriptions
     }.

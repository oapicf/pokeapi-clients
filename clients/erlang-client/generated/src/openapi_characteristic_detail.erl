-module(openapi_characteristic_detail).

-export([encode/1]).

-export_type([openapi_characteristic_detail/0]).

-type openapi_characteristic_detail() ::
    #{ 'id' := integer(),
       'gene_modulo' := integer(),
       'possible_values' := list(),
       'highest_stat' := openapi_stat_summary:openapi_stat_summary(),
       'descriptions' := list()
     }.

encode(#{ 'id' := Id,
          'gene_modulo' := GeneModulo,
          'possible_values' := PossibleValues,
          'highest_stat' := HighestStat,
          'descriptions' := Descriptions
        }) ->
    #{ 'id' => Id,
       'gene_modulo' => GeneModulo,
       'possible_values' => PossibleValues,
       'highest_stat' => HighestStat,
       'descriptions' => Descriptions
     }.

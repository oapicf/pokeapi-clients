-module(openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender).

-include("openapi.hrl").

-export([openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender/0]).

-export([openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender/1]).

-export_type([openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender/0]).

-type openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender() ->
    openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender([]).

openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


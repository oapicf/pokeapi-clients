-module(openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender).

-export([encode/1]).

-export_type([openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender/0]).

-type openapi_evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender() ::
    #{ 'name' := binary(),
       'url' := openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'name' := Name,
          'url' := Url
        }) ->
    #{ 'name' => Name,
       'url' => Url
     }.

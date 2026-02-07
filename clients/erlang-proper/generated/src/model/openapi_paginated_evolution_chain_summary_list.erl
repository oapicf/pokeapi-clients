-module(openapi_paginated_evolution_chain_summary_list).

-include("openapi.hrl").

-export([openapi_paginated_evolution_chain_summary_list/0]).

-export([openapi_paginated_evolution_chain_summary_list/1]).

-export_type([openapi_paginated_evolution_chain_summary_list/0]).

-type openapi_paginated_evolution_chain_summary_list() ::
  [ {'count', integer() }
  | {'next', openapi_u_ri:openapi_u_ri() }
  | {'previous', openapi_u_ri:openapi_u_ri() }
  | {'results', list(openapi_evolution_chain_summary:openapi_evolution_chain_summary()) }
  ].


openapi_paginated_evolution_chain_summary_list() ->
    openapi_paginated_evolution_chain_summary_list([]).

openapi_paginated_evolution_chain_summary_list(Fields) ->
  Default = [ {'count', integer() }
            , {'next', binary() }
            , {'previous', binary() }
            , {'results', list(openapi_evolution_chain_summary:openapi_evolution_chain_summary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


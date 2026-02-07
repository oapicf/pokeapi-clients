-module(openapi_moves_api).

-export([move_ailment_list/1, move_ailment_list/2,
         move_ailment_retrieve/2, move_ailment_retrieve/3,
         move_battle_style_list/1, move_battle_style_list/2,
         move_battle_style_retrieve/2, move_battle_style_retrieve/3,
         move_category_list/1, move_category_list/2,
         move_category_retrieve/2, move_category_retrieve/3,
         move_learn_method_list/1, move_learn_method_list/2,
         move_learn_method_retrieve/2, move_learn_method_retrieve/3,
         move_list/1, move_list/2,
         move_retrieve/2, move_retrieve/3,
         move_target_list/1, move_target_list/2,
         move_target_retrieve/2, move_target_retrieve/3]).

-define(BASE_URL, <<"">>).

%% @doc List move meta ailments
%% Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
-spec move_ailment_list(ctx:ctx()) -> {ok, openapi_paginated_move_meta_ailment_summary_list:openapi_paginated_move_meta_ailment_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_ailment_list(Ctx) ->
    move_ailment_list(Ctx, #{}).

-spec move_ailment_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_move_meta_ailment_summary_list:openapi_paginated_move_meta_ailment_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_ailment_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/move-ailment/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get move meta ailment
%% Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
-spec move_ailment_retrieve(ctx:ctx(), binary()) -> {ok, openapi_move_meta_ailment_detail:openapi_move_meta_ailment_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_ailment_retrieve(Ctx, Id) ->
    move_ailment_retrieve(Ctx, Id, #{}).

-spec move_ailment_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_move_meta_ailment_detail:openapi_move_meta_ailment_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_ailment_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/move-ailment/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List move battle styles
%% Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
-spec move_battle_style_list(ctx:ctx()) -> {ok, openapi_paginated_move_battle_style_summary_list:openapi_paginated_move_battle_style_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_battle_style_list(Ctx) ->
    move_battle_style_list(Ctx, #{}).

-spec move_battle_style_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_move_battle_style_summary_list:openapi_paginated_move_battle_style_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_battle_style_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/move-battle-style/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get move battle style
%% Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
-spec move_battle_style_retrieve(ctx:ctx(), binary()) -> {ok, openapi_move_battle_style_detail:openapi_move_battle_style_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_battle_style_retrieve(Ctx, Id) ->
    move_battle_style_retrieve(Ctx, Id, #{}).

-spec move_battle_style_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_move_battle_style_detail:openapi_move_battle_style_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_battle_style_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/move-battle-style/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List move meta categories
%% Very general categories that loosely group move effects.
-spec move_category_list(ctx:ctx()) -> {ok, openapi_paginated_move_meta_category_summary_list:openapi_paginated_move_meta_category_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_category_list(Ctx) ->
    move_category_list(Ctx, #{}).

-spec move_category_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_move_meta_category_summary_list:openapi_paginated_move_meta_category_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_category_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/move-category/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get move meta category
%% Very general categories that loosely group move effects.
-spec move_category_retrieve(ctx:ctx(), binary()) -> {ok, openapi_move_meta_category_detail:openapi_move_meta_category_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_category_retrieve(Ctx, Id) ->
    move_category_retrieve(Ctx, Id, #{}).

-spec move_category_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_move_meta_category_detail:openapi_move_meta_category_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_category_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/move-category/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List move learn methods
%% Methods by which Pokémon can learn moves.
-spec move_learn_method_list(ctx:ctx()) -> {ok, openapi_paginated_move_learn_method_summary_list:openapi_paginated_move_learn_method_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_learn_method_list(Ctx) ->
    move_learn_method_list(Ctx, #{}).

-spec move_learn_method_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_move_learn_method_summary_list:openapi_paginated_move_learn_method_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_learn_method_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/move-learn-method/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get move learn method
%% Methods by which Pokémon can learn moves.
-spec move_learn_method_retrieve(ctx:ctx(), binary()) -> {ok, openapi_move_learn_method_detail:openapi_move_learn_method_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_learn_method_retrieve(Ctx, Id) ->
    move_learn_method_retrieve(Ctx, Id, #{}).

-spec move_learn_method_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_move_learn_method_detail:openapi_move_learn_method_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_learn_method_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/move-learn-method/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List moves
%% Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
-spec move_list(ctx:ctx()) -> {ok, openapi_paginated_move_summary_list:openapi_paginated_move_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_list(Ctx) ->
    move_list(Ctx, #{}).

-spec move_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_move_summary_list:openapi_paginated_move_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/move/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get move
%% Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
-spec move_retrieve(ctx:ctx(), binary()) -> {ok, openapi_move_detail:openapi_move_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_retrieve(Ctx, Id) ->
    move_retrieve(Ctx, Id, #{}).

-spec move_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_move_detail:openapi_move_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/move/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List move targets
%% Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
-spec move_target_list(ctx:ctx()) -> {ok, openapi_paginated_move_target_summary_list:openapi_paginated_move_target_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_target_list(Ctx) ->
    move_target_list(Ctx, #{}).

-spec move_target_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_move_target_summary_list:openapi_paginated_move_target_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_target_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/move-target/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get move target
%% Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
-spec move_target_retrieve(ctx:ctx(), binary()) -> {ok, openapi_move_target_detail:openapi_move_target_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_target_retrieve(Ctx, Id) ->
    move_target_retrieve(Ctx, Id, #{}).

-spec move_target_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_move_target_detail:openapi_move_target_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
move_target_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/move-target/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).



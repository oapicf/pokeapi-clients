<a name="__pageTop"></a>
# GamesApi   { #GamesApi }


All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generation_list**](#generation_list) | **GET** `/api/v2/generation/` | List genrations
[**generation_retrieve**](#generation_retrieve) | **GET** `/api/v2/generation/{id}/` | Get genration
[**pokedex_list**](#pokedex_list) | **GET** `/api/v2/pokedex/` | List pokedex
[**pokedex_retrieve**](#pokedex_retrieve) | **GET** `/api/v2/pokedex/{id}/` | Get pokedex
[**version_group_list**](#version_group_list) | **GET** `/api/v2/version-group/` | List version groups
[**version_group_retrieve**](#version_group_retrieve) | **GET** `/api/v2/version-group/{id}/` | Get version group
[**version_list**](#version_list) | **GET** `/api/v2/version/` | List versions
[**version_retrieve**](#version_retrieve) | **GET** `/api/v2/version/{id}/` | Get version

# **generation_list**   { #generation_list }
<a name="generation_list"></a>

> `generation_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List genrations

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = GamesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = GamesApi.new(config, client)


# Invoke an endpoint
api.generation_list(
	# limit: int   Eg: 56
	# Number of results to return per page.
	limit,
	# offset: int   Eg: 56
	# The initial index from which to return the results.
	offset,
	# q: String   Eg: q_example
	# > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
	q,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "generation_list", response)
		assert(response.data is PaginatedGenerationSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **generation_retrieve**   { #generation_retrieve }
<a name="generation_retrieve"></a>

> `generation_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get genration

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = GamesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = GamesApi.new(config, client)


# Invoke an endpoint
api.generation_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "generation_retrieve", response)
		assert(response.data is GenerationDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pokedex_list**   { #pokedex_list }
<a name="pokedex_list"></a>

> `pokedex_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = GamesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = GamesApi.new(config, client)


# Invoke an endpoint
api.pokedex_list(
	# limit: int   Eg: 56
	# Number of results to return per page.
	limit,
	# offset: int   Eg: 56
	# The initial index from which to return the results.
	offset,
	# q: String   Eg: q_example
	# > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
	q,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "pokedex_list", response)
		assert(response.data is PaginatedPokedexSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pokedex_retrieve**   { #pokedex_retrieve }
<a name="pokedex_retrieve"></a>

> `pokedex_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = GamesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = GamesApi.new(config, client)


# Invoke an endpoint
api.pokedex_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "pokedex_retrieve", response)
		assert(response.data is PokedexDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **version_group_list**   { #version_group_list }
<a name="version_group_list"></a>

> `version_group_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List version groups

Version groups categorize highly similar versions of the games.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = GamesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = GamesApi.new(config, client)


# Invoke an endpoint
api.version_group_list(
	# limit: int   Eg: 56
	# Number of results to return per page.
	limit,
	# offset: int   Eg: 56
	# The initial index from which to return the results.
	offset,
	# q: String   Eg: q_example
	# > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
	q,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "version_group_list", response)
		assert(response.data is PaginatedVersionGroupSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **version_group_retrieve**   { #version_group_retrieve }
<a name="version_group_retrieve"></a>

> `version_group_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get version group

Version groups categorize highly similar versions of the games.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = GamesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = GamesApi.new(config, client)


# Invoke an endpoint
api.version_group_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "version_group_retrieve", response)
		assert(response.data is VersionGroupDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **version_list**   { #version_list }
<a name="version_list"></a>

> `version_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List versions

Versions of the games, e.g., Red, Blue or Yellow.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = GamesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = GamesApi.new(config, client)


# Invoke an endpoint
api.version_list(
	# limit: int   Eg: 56
	# Number of results to return per page.
	limit,
	# offset: int   Eg: 56
	# The initial index from which to return the results.
	offset,
	# q: String   Eg: q_example
	# > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
	q,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "version_list", response)
		assert(response.data is PaginatedVersionSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **version_retrieve**   { #version_retrieve }
<a name="version_retrieve"></a>

> `version_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get version

Versions of the games, e.g., Red, Blue or Yellow.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = GamesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = GamesApi.new(config, client)


# Invoke an endpoint
api.version_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "version_retrieve", response)
		assert(response.data is VersionDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```


### Authorization

[basicAuth](../README.md#basicAuth), 
[cookieAuth](../README.md#cookieAuth)

[[Back to top]](#__pageTop) \
[[Back to API list]](../README.md#documentation-for-api-endpoints) \
[[Back to Model list]](../README.md#documentation-for-models) \
[[Back to README]](../README.md) \


<a name="__pageTop"></a>
# PokemonApi   { #PokemonApi }


All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ability_list**](#ability_list) | **GET** `/api/v2/ability/` | 
[**ability_retrieve**](#ability_retrieve) | **GET** `/api/v2/ability/{id}/` | 
[**characteristic_list**](#characteristic_list) | **GET** `/api/v2/characteristic/` | List charecterictics
[**characteristic_retrieve**](#characteristic_retrieve) | **GET** `/api/v2/characteristic/{id}/` | Get characteristic
[**egg_group_list**](#egg_group_list) | **GET** `/api/v2/egg-group/` | List egg groups
[**egg_group_retrieve**](#egg_group_retrieve) | **GET** `/api/v2/egg-group/{id}/` | Get egg group
[**gender_list**](#gender_list) | **GET** `/api/v2/gender/` | List genders
[**gender_retrieve**](#gender_retrieve) | **GET** `/api/v2/gender/{id}/` | Get gender
[**growth_rate_list**](#growth_rate_list) | **GET** `/api/v2/growth-rate/` | List growth rates
[**growth_rate_retrieve**](#growth_rate_retrieve) | **GET** `/api/v2/growth-rate/{id}/` | Get growth rate
[**move_damage_class_list**](#move_damage_class_list) | **GET** `/api/v2/move-damage-class/` | List move damage classes
[**move_damage_class_retrieve**](#move_damage_class_retrieve) | **GET** `/api/v2/move-damage-class/{id}/` | Get move damage class
[**nature_list**](#nature_list) | **GET** `/api/v2/nature/` | List natures
[**nature_retrieve**](#nature_retrieve) | **GET** `/api/v2/nature/{id}/` | Get nature
[**pokeathlon_stat_list**](#pokeathlon_stat_list) | **GET** `/api/v2/pokeathlon-stat/` | List pokeathlon stats
[**pokeathlon_stat_retrieve**](#pokeathlon_stat_retrieve) | **GET** `/api/v2/pokeathlon-stat/{id}/` | Get pokeathlon stat
[**pokemon_color_list**](#pokemon_color_list) | **GET** `/api/v2/pokemon-color/` | List pokemon colors
[**pokemon_color_retrieve**](#pokemon_color_retrieve) | **GET** `/api/v2/pokemon-color/{id}/` | Get pokemon color
[**pokemon_form_list**](#pokemon_form_list) | **GET** `/api/v2/pokemon-form/` | List pokemon forms
[**pokemon_form_retrieve**](#pokemon_form_retrieve) | **GET** `/api/v2/pokemon-form/{id}/` | Get pokemon form
[**pokemon_habitat_list**](#pokemon_habitat_list) | **GET** `/api/v2/pokemon-habitat/` | List pokemom habitas
[**pokemon_habitat_retrieve**](#pokemon_habitat_retrieve) | **GET** `/api/v2/pokemon-habitat/{id}/` | Get pokemom habita
[**pokemon_list**](#pokemon_list) | **GET** `/api/v2/pokemon/` | List pokemon
[**pokemon_retrieve**](#pokemon_retrieve) | **GET** `/api/v2/pokemon/{id}/` | Get pokemon
[**pokemon_shape_list**](#pokemon_shape_list) | **GET** `/api/v2/pokemon-shape/` | List pokemon shapes
[**pokemon_shape_retrieve**](#pokemon_shape_retrieve) | **GET** `/api/v2/pokemon-shape/{id}/` | Get pokemon shape
[**pokemon_species_list**](#pokemon_species_list) | **GET** `/api/v2/pokemon-species/` | List pokemon species
[**pokemon_species_retrieve**](#pokemon_species_retrieve) | **GET** `/api/v2/pokemon-species/{id}/` | Get pokemon species
[**stat_list**](#stat_list) | **GET** `/api/v2/stat/` | List stats
[**stat_retrieve**](#stat_retrieve) | **GET** `/api/v2/stat/{id}/` | Get stat
[**type_list**](#type_list) | **GET** `/api/v2/type/` | List types
[**type_retrieve**](#type_retrieve) | **GET** `/api/v2/type/{id}/` | Get types

# **ability_list**   { #ability_list }
<a name="ability_list"></a>

> `ability_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.ability_list(
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
		prints("Success!", "ability_list", response)
		assert(response.data is PaginatedAbilitySummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **ability_retrieve**   { #ability_retrieve }
<a name="ability_retrieve"></a>

> `ability_retrieve(id: String, on_success: Callable, on_failure: Callable)`



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.ability_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ability_retrieve", response)
		assert(response.data is AbilityDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **characteristic_list**   { #characteristic_list }
<a name="characteristic_list"></a>

> `characteristic_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List charecterictics

Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.characteristic_list(
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
		prints("Success!", "characteristic_list", response)
		assert(response.data is PaginatedCharacteristicSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **characteristic_retrieve**   { #characteristic_retrieve }
<a name="characteristic_retrieve"></a>

> `characteristic_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get characteristic

Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.characteristic_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "characteristic_retrieve", response)
		assert(response.data is CharacteristicDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **egg_group_list**   { #egg_group_list }
<a name="egg_group_list"></a>

> `egg_group_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List egg groups

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.egg_group_list(
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
		prints("Success!", "egg_group_list", response)
		assert(response.data is PaginatedEggGroupSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **egg_group_retrieve**   { #egg_group_retrieve }
<a name="egg_group_retrieve"></a>

> `egg_group_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get egg group

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.egg_group_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "egg_group_retrieve", response)
		assert(response.data is EggGroupDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **gender_list**   { #gender_list }
<a name="gender_list"></a>

> `gender_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List genders

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.gender_list(
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
		prints("Success!", "gender_list", response)
		assert(response.data is PaginatedGenderSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **gender_retrieve**   { #gender_retrieve }
<a name="gender_retrieve"></a>

> `gender_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get gender

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.gender_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "gender_retrieve", response)
		assert(response.data is GenderDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **growth_rate_list**   { #growth_rate_list }
<a name="growth_rate_list"></a>

> `growth_rate_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List growth rates

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.growth_rate_list(
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
		prints("Success!", "growth_rate_list", response)
		assert(response.data is PaginatedGrowthRateSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **growth_rate_retrieve**   { #growth_rate_retrieve }
<a name="growth_rate_retrieve"></a>

> `growth_rate_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get growth rate

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.growth_rate_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "growth_rate_retrieve", response)
		assert(response.data is GrowthRateDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **move_damage_class_list**   { #move_damage_class_list }
<a name="move_damage_class_list"></a>

> `move_damage_class_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List move damage classes

Damage classes moves can have, e.g. physical, special, or non-damaging.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.move_damage_class_list(
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
		prints("Success!", "move_damage_class_list", response)
		assert(response.data is PaginatedMoveDamageClassSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **move_damage_class_retrieve**   { #move_damage_class_retrieve }
<a name="move_damage_class_retrieve"></a>

> `move_damage_class_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get move damage class

Damage classes moves can have, e.g. physical, special, or non-damaging.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.move_damage_class_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "move_damage_class_retrieve", response)
		assert(response.data is MoveDamageClassDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **nature_list**   { #nature_list }
<a name="nature_list"></a>

> `nature_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List natures

Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.nature_list(
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
		prints("Success!", "nature_list", response)
		assert(response.data is PaginatedNatureSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **nature_retrieve**   { #nature_retrieve }
<a name="nature_retrieve"></a>

> `nature_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get nature

Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.nature_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "nature_retrieve", response)
		assert(response.data is NatureDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pokeathlon_stat_list**   { #pokeathlon_stat_list }
<a name="pokeathlon_stat_list"></a>

> `pokeathlon_stat_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List pokeathlon stats

Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.pokeathlon_stat_list(
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
		prints("Success!", "pokeathlon_stat_list", response)
		assert(response.data is PaginatedPokeathlonStatSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pokeathlon_stat_retrieve**   { #pokeathlon_stat_retrieve }
<a name="pokeathlon_stat_retrieve"></a>

> `pokeathlon_stat_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get pokeathlon stat

Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.pokeathlon_stat_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "pokeathlon_stat_retrieve", response)
		assert(response.data is PokeathlonStatDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pokemon_color_list**   { #pokemon_color_list }
<a name="pokemon_color_list"></a>

> `pokemon_color_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List pokemon colors

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.pokemon_color_list(
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
		prints("Success!", "pokemon_color_list", response)
		assert(response.data is PaginatedPokemonColorSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pokemon_color_retrieve**   { #pokemon_color_retrieve }
<a name="pokemon_color_retrieve"></a>

> `pokemon_color_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get pokemon color

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.pokemon_color_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "pokemon_color_retrieve", response)
		assert(response.data is PokemonColorDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pokemon_form_list**   { #pokemon_form_list }
<a name="pokemon_form_list"></a>

> `pokemon_form_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List pokemon forms

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.pokemon_form_list(
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
		prints("Success!", "pokemon_form_list", response)
		assert(response.data is PaginatedPokemonFormSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pokemon_form_retrieve**   { #pokemon_form_retrieve }
<a name="pokemon_form_retrieve"></a>

> `pokemon_form_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get pokemon form

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.pokemon_form_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "pokemon_form_retrieve", response)
		assert(response.data is PokemonFormDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pokemon_habitat_list**   { #pokemon_habitat_list }
<a name="pokemon_habitat_list"></a>

> `pokemon_habitat_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List pokemom habitas

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.pokemon_habitat_list(
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
		prints("Success!", "pokemon_habitat_list", response)
		assert(response.data is PaginatedPokemonHabitatSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pokemon_habitat_retrieve**   { #pokemon_habitat_retrieve }
<a name="pokemon_habitat_retrieve"></a>

> `pokemon_habitat_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get pokemom habita

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.pokemon_habitat_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "pokemon_habitat_retrieve", response)
		assert(response.data is PokemonHabitatDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pokemon_list**   { #pokemon_list }
<a name="pokemon_list"></a>

> `pokemon_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.pokemon_list(
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
		prints("Success!", "pokemon_list", response)
		assert(response.data is PaginatedPokemonSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pokemon_retrieve**   { #pokemon_retrieve }
<a name="pokemon_retrieve"></a>

> `pokemon_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.pokemon_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "pokemon_retrieve", response)
		assert(response.data is PokemonDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pokemon_shape_list**   { #pokemon_shape_list }
<a name="pokemon_shape_list"></a>

> `pokemon_shape_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List pokemon shapes

Shapes used for sorting Pokémon in a Pokédex.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.pokemon_shape_list(
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
		prints("Success!", "pokemon_shape_list", response)
		assert(response.data is PaginatedPokemonShapeSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pokemon_shape_retrieve**   { #pokemon_shape_retrieve }
<a name="pokemon_shape_retrieve"></a>

> `pokemon_shape_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get pokemon shape

Shapes used for sorting Pokémon in a Pokédex.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.pokemon_shape_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "pokemon_shape_retrieve", response)
		assert(response.data is PokemonShapeDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pokemon_species_list**   { #pokemon_species_list }
<a name="pokemon_species_list"></a>

> `pokemon_species_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.pokemon_species_list(
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
		prints("Success!", "pokemon_species_list", response)
		assert(response.data is PaginatedPokemonSpeciesSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **pokemon_species_retrieve**   { #pokemon_species_retrieve }
<a name="pokemon_species_retrieve"></a>

> `pokemon_species_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.pokemon_species_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "pokemon_species_retrieve", response)
		assert(response.data is PokemonSpeciesDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **stat_list**   { #stat_list }
<a name="stat_list"></a>

> `stat_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List stats

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.stat_list(
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
		prints("Success!", "stat_list", response)
		assert(response.data is PaginatedStatSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **stat_retrieve**   { #stat_retrieve }
<a name="stat_retrieve"></a>

> `stat_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get stat

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.stat_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "stat_retrieve", response)
		assert(response.data is StatDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **type_list**   { #type_list }
<a name="type_list"></a>

> `type_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.type_list(
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
		prints("Success!", "type_list", response)
		assert(response.data is PaginatedTypeSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **type_retrieve**   { #type_retrieve }
<a name="type_retrieve"></a>

> `type_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

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
var api = PokemonApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = PokemonApi.new(config, client)


# Invoke an endpoint
api.type_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "type_retrieve", response)
		assert(response.data is TypeDetail)
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


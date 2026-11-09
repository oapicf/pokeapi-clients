#' Create a new PokemonEvolution
#'
#' @description
#' PokemonEvolution Class
#'
#' @docType class
#' @title PokemonEvolution
#' @description PokemonEvolution Class
#' @format An \code{R6Class} generator object
#' @field version_group The version group in which these evolution requirements apply. \link{VersionGroupSummary}
#' @field is_default Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker. character [optional]
#' @field item The item required to cause evolution this into Pokémon species. \link{ItemSummary}
#' @field trigger The type of event that triggers evolution into this Pokémon species. \link{EvolutionTriggerSummary}
#' @field gender The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species. integer [optional]
#' @field held_item The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species. \link{ItemSummary}
#' @field known_move  \link{PokemonEvolutionKnownMove}
#' @field known_move_type  \link{PokemonEvolutionKnownMove}
#' @field location The location the evolution must be triggered at. \link{LocationSummary}
#' @field min_level The minimum required level of the evolving Pokémon species to evolve into this Pokémon species. integer [optional]
#' @field min_happiness The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species. integer [optional]
#' @field min_beauty The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species. integer [optional]
#' @field min_affection The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species. integer [optional]
#' @field near_special_rock Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species. character [optional]
#' @field needs_multiplayer Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle). character [optional]
#' @field needs_overworld_rain Whether or not it must be raining in the overworld to cause evolution this Pokémon species. character [optional]
#' @field party_species The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species. \link{PokemonSpeciesSummary}
#' @field party_type The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species. \link{TypeSummary}
#' @field relative_physical_stats The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense. integer [optional]
#' @field time_of_day The required time of day. Day or night. character [optional]
#' @field trade_species Pokémon species for which this one must be traded. \link{PokemonSpeciesSummary}
#' @field turn_upside_down Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. character [optional]
#' @field region The required region in which this evolution can occur. \link{RegionSummary}
#' @field required_pokemon_form The Pokémon form required before evolving, or null if unrestricted. \link{PokemonFormSummary}
#' @field evolved_pokemon_form The Pokémon form produced by this evolution, or null if unspecified. \link{PokemonFormSummary}
#' @field used_move The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species. \link{MoveSummary}
#' @field min_move_count The minimum number of times a move must be used in order to evolve into this Pokémon species. integer [optional]
#' @field min_steps The minimum number of steps that must be taken in order to evolve into this Pokémon species. integer [optional]
#' @field min_damage_taken The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species. integer [optional]
#' @field allowed_natures The natures that allow this evolution, or null if unrestricted. list(\link{NatureSummary})
#' @field condition_expression An additional evolution condition expressed in reverse Polish notation, or null if none. \link{EvolutionConditionExpression}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonEvolution <- R6::R6Class(
  "PokemonEvolution",
  public = list(
    `version_group` = NULL,
    `is_default` = NULL,
    `item` = NULL,
    `trigger` = NULL,
    `gender` = NULL,
    `held_item` = NULL,
    `known_move` = NULL,
    `known_move_type` = NULL,
    `location` = NULL,
    `min_level` = NULL,
    `min_happiness` = NULL,
    `min_beauty` = NULL,
    `min_affection` = NULL,
    `near_special_rock` = NULL,
    `needs_multiplayer` = NULL,
    `needs_overworld_rain` = NULL,
    `party_species` = NULL,
    `party_type` = NULL,
    `relative_physical_stats` = NULL,
    `time_of_day` = NULL,
    `trade_species` = NULL,
    `turn_upside_down` = NULL,
    `region` = NULL,
    `required_pokemon_form` = NULL,
    `evolved_pokemon_form` = NULL,
    `used_move` = NULL,
    `min_move_count` = NULL,
    `min_steps` = NULL,
    `min_damage_taken` = NULL,
    `allowed_natures` = NULL,
    `condition_expression` = NULL,

    #' @description
    #' Initialize a new PokemonEvolution class.
    #'
    #' @param version_group The version group in which these evolution requirements apply.
    #' @param item The item required to cause evolution this into Pokémon species.
    #' @param trigger The type of event that triggers evolution into this Pokémon species.
    #' @param held_item The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
    #' @param known_move known_move
    #' @param known_move_type known_move_type
    #' @param location The location the evolution must be triggered at.
    #' @param party_species The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
    #' @param party_type The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
    #' @param trade_species Pokémon species for which this one must be traded.
    #' @param region The required region in which this evolution can occur.
    #' @param required_pokemon_form The Pokémon form required before evolving, or null if unrestricted.
    #' @param evolved_pokemon_form The Pokémon form produced by this evolution, or null if unspecified.
    #' @param used_move The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
    #' @param allowed_natures The natures that allow this evolution, or null if unrestricted.
    #' @param condition_expression An additional evolution condition expressed in reverse Polish notation, or null if none.
    #' @param is_default Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
    #' @param gender The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
    #' @param min_level The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
    #' @param min_happiness The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
    #' @param min_beauty The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
    #' @param min_affection The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
    #' @param near_special_rock Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
    #' @param needs_multiplayer Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
    #' @param needs_overworld_rain Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
    #' @param relative_physical_stats The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
    #' @param time_of_day The required time of day. Day or night.
    #' @param turn_upside_down Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
    #' @param min_move_count The minimum number of times a move must be used in order to evolve into this Pokémon species.
    #' @param min_steps The minimum number of steps that must be taken in order to evolve into this Pokémon species.
    #' @param min_damage_taken The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
    #' @param ... Other optional arguments.
    initialize = function(`version_group`, `item`, `trigger`, `held_item`, `known_move`, `known_move_type`, `location`, `party_species`, `party_type`, `trade_species`, `region`, `required_pokemon_form`, `evolved_pokemon_form`, `used_move`, `allowed_natures`, `condition_expression`, `is_default` = NULL, `gender` = NULL, `min_level` = NULL, `min_happiness` = NULL, `min_beauty` = NULL, `min_affection` = NULL, `near_special_rock` = NULL, `needs_multiplayer` = NULL, `needs_overworld_rain` = NULL, `relative_physical_stats` = NULL, `time_of_day` = NULL, `turn_upside_down` = NULL, `min_move_count` = NULL, `min_steps` = NULL, `min_damage_taken` = NULL, ...) {
      if (!missing(`version_group`)) {
        stopifnot(R6::is.R6(`version_group`))
        self$`version_group` <- `version_group`
      }
      if (!missing(`item`)) {
        stopifnot(R6::is.R6(`item`))
        self$`item` <- `item`
      }
      if (!missing(`trigger`)) {
        stopifnot(R6::is.R6(`trigger`))
        self$`trigger` <- `trigger`
      }
      if (!missing(`held_item`)) {
        stopifnot(R6::is.R6(`held_item`))
        self$`held_item` <- `held_item`
      }
      if (!missing(`known_move`)) {
        stopifnot(R6::is.R6(`known_move`))
        self$`known_move` <- `known_move`
      }
      if (!missing(`known_move_type`)) {
        stopifnot(R6::is.R6(`known_move_type`))
        self$`known_move_type` <- `known_move_type`
      }
      if (!missing(`location`)) {
        stopifnot(R6::is.R6(`location`))
        self$`location` <- `location`
      }
      if (!missing(`party_species`)) {
        stopifnot(R6::is.R6(`party_species`))
        self$`party_species` <- `party_species`
      }
      if (!missing(`party_type`)) {
        stopifnot(R6::is.R6(`party_type`))
        self$`party_type` <- `party_type`
      }
      if (!missing(`trade_species`)) {
        stopifnot(R6::is.R6(`trade_species`))
        self$`trade_species` <- `trade_species`
      }
      if (!missing(`region`)) {
        stopifnot(R6::is.R6(`region`))
        self$`region` <- `region`
      }
      if (!missing(`required_pokemon_form`)) {
        stopifnot(R6::is.R6(`required_pokemon_form`))
        self$`required_pokemon_form` <- `required_pokemon_form`
      }
      if (!missing(`evolved_pokemon_form`)) {
        stopifnot(R6::is.R6(`evolved_pokemon_form`))
        self$`evolved_pokemon_form` <- `evolved_pokemon_form`
      }
      if (!missing(`used_move`)) {
        stopifnot(R6::is.R6(`used_move`))
        self$`used_move` <- `used_move`
      }
      if (!missing(`allowed_natures`)) {
        stopifnot(is.vector(`allowed_natures`), length(`allowed_natures`) != 0)
        sapply(`allowed_natures`, function(x) stopifnot(R6::is.R6(x)))
        self$`allowed_natures` <- `allowed_natures`
      }
      if (!missing(`condition_expression`)) {
        stopifnot(R6::is.R6(`condition_expression`))
        self$`condition_expression` <- `condition_expression`
      }
      if (!is.null(`is_default`)) {
        if (!(is.logical(`is_default`) && length(`is_default`) == 1)) {
          stop(paste("Error! Invalid data for `is_default`. Must be a boolean:", `is_default`))
        }
        self$`is_default` <- `is_default`
      }
      if (!is.null(`gender`)) {
        if (!(is.numeric(`gender`) && length(`gender`) == 1)) {
          stop(paste("Error! Invalid data for `gender`. Must be an integer:", `gender`))
        }
        self$`gender` <- `gender`
      }
      if (!is.null(`min_level`)) {
        if (!(is.numeric(`min_level`) && length(`min_level`) == 1)) {
          stop(paste("Error! Invalid data for `min_level`. Must be an integer:", `min_level`))
        }
        self$`min_level` <- `min_level`
      }
      if (!is.null(`min_happiness`)) {
        if (!(is.numeric(`min_happiness`) && length(`min_happiness`) == 1)) {
          stop(paste("Error! Invalid data for `min_happiness`. Must be an integer:", `min_happiness`))
        }
        self$`min_happiness` <- `min_happiness`
      }
      if (!is.null(`min_beauty`)) {
        if (!(is.numeric(`min_beauty`) && length(`min_beauty`) == 1)) {
          stop(paste("Error! Invalid data for `min_beauty`. Must be an integer:", `min_beauty`))
        }
        self$`min_beauty` <- `min_beauty`
      }
      if (!is.null(`min_affection`)) {
        if (!(is.numeric(`min_affection`) && length(`min_affection`) == 1)) {
          stop(paste("Error! Invalid data for `min_affection`. Must be an integer:", `min_affection`))
        }
        self$`min_affection` <- `min_affection`
      }
      if (!is.null(`near_special_rock`)) {
        if (!(is.logical(`near_special_rock`) && length(`near_special_rock`) == 1)) {
          stop(paste("Error! Invalid data for `near_special_rock`. Must be a boolean:", `near_special_rock`))
        }
        self$`near_special_rock` <- `near_special_rock`
      }
      if (!is.null(`needs_multiplayer`)) {
        if (!(is.logical(`needs_multiplayer`) && length(`needs_multiplayer`) == 1)) {
          stop(paste("Error! Invalid data for `needs_multiplayer`. Must be a boolean:", `needs_multiplayer`))
        }
        self$`needs_multiplayer` <- `needs_multiplayer`
      }
      if (!is.null(`needs_overworld_rain`)) {
        if (!(is.logical(`needs_overworld_rain`) && length(`needs_overworld_rain`) == 1)) {
          stop(paste("Error! Invalid data for `needs_overworld_rain`. Must be a boolean:", `needs_overworld_rain`))
        }
        self$`needs_overworld_rain` <- `needs_overworld_rain`
      }
      if (!is.null(`relative_physical_stats`)) {
        if (!(is.numeric(`relative_physical_stats`) && length(`relative_physical_stats`) == 1)) {
          stop(paste("Error! Invalid data for `relative_physical_stats`. Must be an integer:", `relative_physical_stats`))
        }
        self$`relative_physical_stats` <- `relative_physical_stats`
      }
      if (!is.null(`time_of_day`)) {
        if (!(is.character(`time_of_day`) && length(`time_of_day`) == 1)) {
          stop(paste("Error! Invalid data for `time_of_day`. Must be a string:", `time_of_day`))
        }
        self$`time_of_day` <- `time_of_day`
      }
      if (!is.null(`turn_upside_down`)) {
        if (!(is.logical(`turn_upside_down`) && length(`turn_upside_down`) == 1)) {
          stop(paste("Error! Invalid data for `turn_upside_down`. Must be a boolean:", `turn_upside_down`))
        }
        self$`turn_upside_down` <- `turn_upside_down`
      }
      if (!is.null(`min_move_count`)) {
        if (!(is.numeric(`min_move_count`) && length(`min_move_count`) == 1)) {
          stop(paste("Error! Invalid data for `min_move_count`. Must be an integer:", `min_move_count`))
        }
        self$`min_move_count` <- `min_move_count`
      }
      if (!is.null(`min_steps`)) {
        if (!(is.numeric(`min_steps`) && length(`min_steps`) == 1)) {
          stop(paste("Error! Invalid data for `min_steps`. Must be an integer:", `min_steps`))
        }
        self$`min_steps` <- `min_steps`
      }
      if (!is.null(`min_damage_taken`)) {
        if (!(is.numeric(`min_damage_taken`) && length(`min_damage_taken`) == 1)) {
          stop(paste("Error! Invalid data for `min_damage_taken`. Must be an integer:", `min_damage_taken`))
        }
        self$`min_damage_taken` <- `min_damage_taken`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return PokemonEvolution as a base R list.
    #' @examples
    #' # convert array of PokemonEvolution (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert PokemonEvolution to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonEvolutionObject <- list()
      if (!is.null(self$`version_group`)) {
        PokemonEvolutionObject[["version_group"]] <-
          self$extractSimpleType(self$`version_group`)
      }
      if (!is.null(self$`is_default`)) {
        PokemonEvolutionObject[["is_default"]] <-
          self$`is_default`
      }
      if (!is.null(self$`item`)) {
        PokemonEvolutionObject[["item"]] <-
          self$extractSimpleType(self$`item`)
      }
      if (!is.null(self$`trigger`)) {
        PokemonEvolutionObject[["trigger"]] <-
          self$extractSimpleType(self$`trigger`)
      }
      if (!is.null(self$`gender`)) {
        PokemonEvolutionObject[["gender"]] <-
          self$`gender`
      }
      if (!is.null(self$`held_item`)) {
        PokemonEvolutionObject[["held_item"]] <-
          self$extractSimpleType(self$`held_item`)
      }
      if (!is.null(self$`known_move`)) {
        PokemonEvolutionObject[["known_move"]] <-
          self$extractSimpleType(self$`known_move`)
      }
      if (!is.null(self$`known_move_type`)) {
        PokemonEvolutionObject[["known_move_type"]] <-
          self$extractSimpleType(self$`known_move_type`)
      }
      if (!is.null(self$`location`)) {
        PokemonEvolutionObject[["location"]] <-
          self$extractSimpleType(self$`location`)
      }
      if (!is.null(self$`min_level`)) {
        PokemonEvolutionObject[["min_level"]] <-
          self$`min_level`
      }
      if (!is.null(self$`min_happiness`)) {
        PokemonEvolutionObject[["min_happiness"]] <-
          self$`min_happiness`
      }
      if (!is.null(self$`min_beauty`)) {
        PokemonEvolutionObject[["min_beauty"]] <-
          self$`min_beauty`
      }
      if (!is.null(self$`min_affection`)) {
        PokemonEvolutionObject[["min_affection"]] <-
          self$`min_affection`
      }
      if (!is.null(self$`near_special_rock`)) {
        PokemonEvolutionObject[["near_special_rock"]] <-
          self$`near_special_rock`
      }
      if (!is.null(self$`needs_multiplayer`)) {
        PokemonEvolutionObject[["needs_multiplayer"]] <-
          self$`needs_multiplayer`
      }
      if (!is.null(self$`needs_overworld_rain`)) {
        PokemonEvolutionObject[["needs_overworld_rain"]] <-
          self$`needs_overworld_rain`
      }
      if (!is.null(self$`party_species`)) {
        PokemonEvolutionObject[["party_species"]] <-
          self$extractSimpleType(self$`party_species`)
      }
      if (!is.null(self$`party_type`)) {
        PokemonEvolutionObject[["party_type"]] <-
          self$extractSimpleType(self$`party_type`)
      }
      if (!is.null(self$`relative_physical_stats`)) {
        PokemonEvolutionObject[["relative_physical_stats"]] <-
          self$`relative_physical_stats`
      }
      if (!is.null(self$`time_of_day`)) {
        PokemonEvolutionObject[["time_of_day"]] <-
          self$`time_of_day`
      }
      if (!is.null(self$`trade_species`)) {
        PokemonEvolutionObject[["trade_species"]] <-
          self$extractSimpleType(self$`trade_species`)
      }
      if (!is.null(self$`turn_upside_down`)) {
        PokemonEvolutionObject[["turn_upside_down"]] <-
          self$`turn_upside_down`
      }
      if (!is.null(self$`region`)) {
        PokemonEvolutionObject[["region"]] <-
          self$extractSimpleType(self$`region`)
      }
      if (!is.null(self$`required_pokemon_form`)) {
        PokemonEvolutionObject[["required_pokemon_form"]] <-
          self$extractSimpleType(self$`required_pokemon_form`)
      }
      if (!is.null(self$`evolved_pokemon_form`)) {
        PokemonEvolutionObject[["evolved_pokemon_form"]] <-
          self$extractSimpleType(self$`evolved_pokemon_form`)
      }
      if (!is.null(self$`used_move`)) {
        PokemonEvolutionObject[["used_move"]] <-
          self$extractSimpleType(self$`used_move`)
      }
      if (!is.null(self$`min_move_count`)) {
        PokemonEvolutionObject[["min_move_count"]] <-
          self$`min_move_count`
      }
      if (!is.null(self$`min_steps`)) {
        PokemonEvolutionObject[["min_steps"]] <-
          self$`min_steps`
      }
      if (!is.null(self$`min_damage_taken`)) {
        PokemonEvolutionObject[["min_damage_taken"]] <-
          self$`min_damage_taken`
      }
      if (!is.null(self$`allowed_natures`)) {
        PokemonEvolutionObject[["allowed_natures"]] <-
          self$extractSimpleType(self$`allowed_natures`)
      }
      if (!is.null(self$`condition_expression`)) {
        PokemonEvolutionObject[["condition_expression"]] <-
          self$extractSimpleType(self$`condition_expression`)
      }
      return(PokemonEvolutionObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonEvolution
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonEvolution
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`version_group`)) {
        `version_group_object` <- VersionGroupSummary$new()
        `version_group_object`$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
        self$`version_group` <- `version_group_object`
      }
      if (!is.null(this_object$`is_default`)) {
        self$`is_default` <- this_object$`is_default`
      }
      if (!is.null(this_object$`item`)) {
        `item_object` <- ItemSummary$new()
        `item_object`$fromJSON(jsonlite::toJSON(this_object$`item`, auto_unbox = TRUE, digits = NA))
        self$`item` <- `item_object`
      }
      if (!is.null(this_object$`trigger`)) {
        `trigger_object` <- EvolutionTriggerSummary$new()
        `trigger_object`$fromJSON(jsonlite::toJSON(this_object$`trigger`, auto_unbox = TRUE, digits = NA))
        self$`trigger` <- `trigger_object`
      }
      if (!is.null(this_object$`gender`)) {
        self$`gender` <- this_object$`gender`
      }
      if (!is.null(this_object$`held_item`)) {
        `held_item_object` <- ItemSummary$new()
        `held_item_object`$fromJSON(jsonlite::toJSON(this_object$`held_item`, auto_unbox = TRUE, digits = NA))
        self$`held_item` <- `held_item_object`
      }
      if (!is.null(this_object$`known_move`)) {
        `known_move_object` <- PokemonEvolutionKnownMove$new()
        `known_move_object`$fromJSON(jsonlite::toJSON(this_object$`known_move`, auto_unbox = TRUE, digits = NA))
        self$`known_move` <- `known_move_object`
      }
      if (!is.null(this_object$`known_move_type`)) {
        `known_move_type_object` <- PokemonEvolutionKnownMove$new()
        `known_move_type_object`$fromJSON(jsonlite::toJSON(this_object$`known_move_type`, auto_unbox = TRUE, digits = NA))
        self$`known_move_type` <- `known_move_type_object`
      }
      if (!is.null(this_object$`location`)) {
        `location_object` <- LocationSummary$new()
        `location_object`$fromJSON(jsonlite::toJSON(this_object$`location`, auto_unbox = TRUE, digits = NA))
        self$`location` <- `location_object`
      }
      if (!is.null(this_object$`min_level`)) {
        self$`min_level` <- this_object$`min_level`
      }
      if (!is.null(this_object$`min_happiness`)) {
        self$`min_happiness` <- this_object$`min_happiness`
      }
      if (!is.null(this_object$`min_beauty`)) {
        self$`min_beauty` <- this_object$`min_beauty`
      }
      if (!is.null(this_object$`min_affection`)) {
        self$`min_affection` <- this_object$`min_affection`
      }
      if (!is.null(this_object$`near_special_rock`)) {
        self$`near_special_rock` <- this_object$`near_special_rock`
      }
      if (!is.null(this_object$`needs_multiplayer`)) {
        self$`needs_multiplayer` <- this_object$`needs_multiplayer`
      }
      if (!is.null(this_object$`needs_overworld_rain`)) {
        self$`needs_overworld_rain` <- this_object$`needs_overworld_rain`
      }
      if (!is.null(this_object$`party_species`)) {
        `party_species_object` <- PokemonSpeciesSummary$new()
        `party_species_object`$fromJSON(jsonlite::toJSON(this_object$`party_species`, auto_unbox = TRUE, digits = NA))
        self$`party_species` <- `party_species_object`
      }
      if (!is.null(this_object$`party_type`)) {
        `party_type_object` <- TypeSummary$new()
        `party_type_object`$fromJSON(jsonlite::toJSON(this_object$`party_type`, auto_unbox = TRUE, digits = NA))
        self$`party_type` <- `party_type_object`
      }
      if (!is.null(this_object$`relative_physical_stats`)) {
        self$`relative_physical_stats` <- this_object$`relative_physical_stats`
      }
      if (!is.null(this_object$`time_of_day`)) {
        self$`time_of_day` <- this_object$`time_of_day`
      }
      if (!is.null(this_object$`trade_species`)) {
        `trade_species_object` <- PokemonSpeciesSummary$new()
        `trade_species_object`$fromJSON(jsonlite::toJSON(this_object$`trade_species`, auto_unbox = TRUE, digits = NA))
        self$`trade_species` <- `trade_species_object`
      }
      if (!is.null(this_object$`turn_upside_down`)) {
        self$`turn_upside_down` <- this_object$`turn_upside_down`
      }
      if (!is.null(this_object$`region`)) {
        `region_object` <- RegionSummary$new()
        `region_object`$fromJSON(jsonlite::toJSON(this_object$`region`, auto_unbox = TRUE, digits = NA))
        self$`region` <- `region_object`
      }
      if (!is.null(this_object$`required_pokemon_form`)) {
        `required_pokemon_form_object` <- PokemonFormSummary$new()
        `required_pokemon_form_object`$fromJSON(jsonlite::toJSON(this_object$`required_pokemon_form`, auto_unbox = TRUE, digits = NA))
        self$`required_pokemon_form` <- `required_pokemon_form_object`
      }
      if (!is.null(this_object$`evolved_pokemon_form`)) {
        `evolved_pokemon_form_object` <- PokemonFormSummary$new()
        `evolved_pokemon_form_object`$fromJSON(jsonlite::toJSON(this_object$`evolved_pokemon_form`, auto_unbox = TRUE, digits = NA))
        self$`evolved_pokemon_form` <- `evolved_pokemon_form_object`
      }
      if (!is.null(this_object$`used_move`)) {
        `used_move_object` <- MoveSummary$new()
        `used_move_object`$fromJSON(jsonlite::toJSON(this_object$`used_move`, auto_unbox = TRUE, digits = NA))
        self$`used_move` <- `used_move_object`
      }
      if (!is.null(this_object$`min_move_count`)) {
        self$`min_move_count` <- this_object$`min_move_count`
      }
      if (!is.null(this_object$`min_steps`)) {
        self$`min_steps` <- this_object$`min_steps`
      }
      if (!is.null(this_object$`min_damage_taken`)) {
        self$`min_damage_taken` <- this_object$`min_damage_taken`
      }
      if (!is.null(this_object$`allowed_natures`)) {
        self$`allowed_natures` <- ApiClient$new()$deserializeObj(this_object$`allowed_natures`, "array[NatureSummary]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`condition_expression`)) {
        `condition_expression_object` <- EvolutionConditionExpression$new()
        `condition_expression_object`$fromJSON(jsonlite::toJSON(this_object$`condition_expression`, auto_unbox = TRUE, digits = NA))
        self$`condition_expression` <- `condition_expression_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonEvolution in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonEvolution
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonEvolution
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`version_group` <- VersionGroupSummary$new()$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
      self$`is_default` <- this_object$`is_default`
      self$`item` <- ItemSummary$new()$fromJSON(jsonlite::toJSON(this_object$`item`, auto_unbox = TRUE, digits = NA))
      self$`trigger` <- EvolutionTriggerSummary$new()$fromJSON(jsonlite::toJSON(this_object$`trigger`, auto_unbox = TRUE, digits = NA))
      self$`gender` <- this_object$`gender`
      self$`held_item` <- ItemSummary$new()$fromJSON(jsonlite::toJSON(this_object$`held_item`, auto_unbox = TRUE, digits = NA))
      self$`known_move` <- PokemonEvolutionKnownMove$new()$fromJSON(jsonlite::toJSON(this_object$`known_move`, auto_unbox = TRUE, digits = NA))
      self$`known_move_type` <- PokemonEvolutionKnownMove$new()$fromJSON(jsonlite::toJSON(this_object$`known_move_type`, auto_unbox = TRUE, digits = NA))
      self$`location` <- LocationSummary$new()$fromJSON(jsonlite::toJSON(this_object$`location`, auto_unbox = TRUE, digits = NA))
      self$`min_level` <- this_object$`min_level`
      self$`min_happiness` <- this_object$`min_happiness`
      self$`min_beauty` <- this_object$`min_beauty`
      self$`min_affection` <- this_object$`min_affection`
      self$`near_special_rock` <- this_object$`near_special_rock`
      self$`needs_multiplayer` <- this_object$`needs_multiplayer`
      self$`needs_overworld_rain` <- this_object$`needs_overworld_rain`
      self$`party_species` <- PokemonSpeciesSummary$new()$fromJSON(jsonlite::toJSON(this_object$`party_species`, auto_unbox = TRUE, digits = NA))
      self$`party_type` <- TypeSummary$new()$fromJSON(jsonlite::toJSON(this_object$`party_type`, auto_unbox = TRUE, digits = NA))
      self$`relative_physical_stats` <- this_object$`relative_physical_stats`
      self$`time_of_day` <- this_object$`time_of_day`
      self$`trade_species` <- PokemonSpeciesSummary$new()$fromJSON(jsonlite::toJSON(this_object$`trade_species`, auto_unbox = TRUE, digits = NA))
      self$`turn_upside_down` <- this_object$`turn_upside_down`
      self$`region` <- RegionSummary$new()$fromJSON(jsonlite::toJSON(this_object$`region`, auto_unbox = TRUE, digits = NA))
      self$`required_pokemon_form` <- PokemonFormSummary$new()$fromJSON(jsonlite::toJSON(this_object$`required_pokemon_form`, auto_unbox = TRUE, digits = NA))
      self$`evolved_pokemon_form` <- PokemonFormSummary$new()$fromJSON(jsonlite::toJSON(this_object$`evolved_pokemon_form`, auto_unbox = TRUE, digits = NA))
      self$`used_move` <- MoveSummary$new()$fromJSON(jsonlite::toJSON(this_object$`used_move`, auto_unbox = TRUE, digits = NA))
      self$`min_move_count` <- this_object$`min_move_count`
      self$`min_steps` <- this_object$`min_steps`
      self$`min_damage_taken` <- this_object$`min_damage_taken`
      self$`allowed_natures` <- ApiClient$new()$deserializeObj(this_object$`allowed_natures`, "array[NatureSummary]", loadNamespace("openapi"))
      self$`condition_expression` <- EvolutionConditionExpression$new()$fromJSON(jsonlite::toJSON(this_object$`condition_expression`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonEvolution and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `version_group`
      if (!is.null(input_json$`version_group`)) {
        stopifnot(R6::is.R6(input_json$`version_group`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEvolution: the required field `version_group` is missing."))
      }
      # check the required field `item`
      if (!is.null(input_json$`item`)) {
        stopifnot(R6::is.R6(input_json$`item`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEvolution: the required field `item` is missing."))
      }
      # check the required field `trigger`
      if (!is.null(input_json$`trigger`)) {
        stopifnot(R6::is.R6(input_json$`trigger`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEvolution: the required field `trigger` is missing."))
      }
      # check the required field `held_item`
      if (!is.null(input_json$`held_item`)) {
        stopifnot(R6::is.R6(input_json$`held_item`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEvolution: the required field `held_item` is missing."))
      }
      # check the required field `known_move`
      if (!is.null(input_json$`known_move`)) {
        stopifnot(R6::is.R6(input_json$`known_move`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEvolution: the required field `known_move` is missing."))
      }
      # check the required field `known_move_type`
      if (!is.null(input_json$`known_move_type`)) {
        stopifnot(R6::is.R6(input_json$`known_move_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEvolution: the required field `known_move_type` is missing."))
      }
      # check the required field `location`
      if (!is.null(input_json$`location`)) {
        stopifnot(R6::is.R6(input_json$`location`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEvolution: the required field `location` is missing."))
      }
      # check the required field `party_species`
      if (!is.null(input_json$`party_species`)) {
        stopifnot(R6::is.R6(input_json$`party_species`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEvolution: the required field `party_species` is missing."))
      }
      # check the required field `party_type`
      if (!is.null(input_json$`party_type`)) {
        stopifnot(R6::is.R6(input_json$`party_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEvolution: the required field `party_type` is missing."))
      }
      # check the required field `trade_species`
      if (!is.null(input_json$`trade_species`)) {
        stopifnot(R6::is.R6(input_json$`trade_species`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEvolution: the required field `trade_species` is missing."))
      }
      # check the required field `region`
      if (!is.null(input_json$`region`)) {
        stopifnot(R6::is.R6(input_json$`region`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEvolution: the required field `region` is missing."))
      }
      # check the required field `required_pokemon_form`
      if (!is.null(input_json$`required_pokemon_form`)) {
        stopifnot(R6::is.R6(input_json$`required_pokemon_form`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEvolution: the required field `required_pokemon_form` is missing."))
      }
      # check the required field `evolved_pokemon_form`
      if (!is.null(input_json$`evolved_pokemon_form`)) {
        stopifnot(R6::is.R6(input_json$`evolved_pokemon_form`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEvolution: the required field `evolved_pokemon_form` is missing."))
      }
      # check the required field `used_move`
      if (!is.null(input_json$`used_move`)) {
        stopifnot(R6::is.R6(input_json$`used_move`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEvolution: the required field `used_move` is missing."))
      }
      # check the required field `allowed_natures`
      if (!is.null(input_json$`allowed_natures`)) {
        stopifnot(is.vector(input_json$`allowed_natures`), length(input_json$`allowed_natures`) != 0)
        tmp <- sapply(input_json$`allowed_natures`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEvolution: the required field `allowed_natures` is missing."))
      }
      # check the required field `condition_expression`
      if (!is.null(input_json$`condition_expression`)) {
        stopifnot(R6::is.R6(input_json$`condition_expression`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEvolution: the required field `condition_expression` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonEvolution
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `version_group` is null
      if (is.null(self$`version_group`)) {
        return(FALSE)
      }

      # check if the required `trigger` is null
      if (is.null(self$`trigger`)) {
        return(FALSE)
      }

      # check if the required `known_move` is null
      if (is.null(self$`known_move`)) {
        return(FALSE)
      }

      # check if the required `known_move_type` is null
      if (is.null(self$`known_move_type`)) {
        return(FALSE)
      }

      if (self$`min_level` > 2147483647) {
        return(FALSE)
      }
      if (self$`min_level` < -2147483648) {
        return(FALSE)
      }

      if (self$`min_happiness` > 2147483647) {
        return(FALSE)
      }
      if (self$`min_happiness` < -2147483648) {
        return(FALSE)
      }

      if (self$`min_beauty` > 2147483647) {
        return(FALSE)
      }
      if (self$`min_beauty` < -2147483648) {
        return(FALSE)
      }

      if (self$`min_affection` > 2147483647) {
        return(FALSE)
      }
      if (self$`min_affection` < -2147483648) {
        return(FALSE)
      }

      if (self$`relative_physical_stats` > 2147483647) {
        return(FALSE)
      }
      if (self$`relative_physical_stats` < -2147483648) {
        return(FALSE)
      }

      if (nchar(self$`time_of_day`) > 10) {
        return(FALSE)
      }

      if (self$`min_move_count` > 2147483647) {
        return(FALSE)
      }
      if (self$`min_move_count` < -2147483648) {
        return(FALSE)
      }

      if (self$`min_steps` > 2147483647) {
        return(FALSE)
      }
      if (self$`min_steps` < -2147483648) {
        return(FALSE)
      }

      if (self$`min_damage_taken` > 2147483647) {
        return(FALSE)
      }
      if (self$`min_damage_taken` < -2147483648) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `version_group` is null
      if (is.null(self$`version_group`)) {
        invalid_fields["version_group"] <- "Non-nullable required field `version_group` cannot be null."
      }

      # check if the required `trigger` is null
      if (is.null(self$`trigger`)) {
        invalid_fields["trigger"] <- "Non-nullable required field `trigger` cannot be null."
      }

      # check if the required `known_move` is null
      if (is.null(self$`known_move`)) {
        invalid_fields["known_move"] <- "Non-nullable required field `known_move` cannot be null."
      }

      # check if the required `known_move_type` is null
      if (is.null(self$`known_move_type`)) {
        invalid_fields["known_move_type"] <- "Non-nullable required field `known_move_type` cannot be null."
      }

      if (self$`min_level` > 2147483647) {
        invalid_fields["min_level"] <- "Invalid value for `min_level`, must be smaller than or equal to 2147483647."
      }
      if (self$`min_level` < -2147483648) {
        invalid_fields["min_level"] <- "Invalid value for `min_level`, must be bigger than or equal to -2147483648."
      }

      if (self$`min_happiness` > 2147483647) {
        invalid_fields["min_happiness"] <- "Invalid value for `min_happiness`, must be smaller than or equal to 2147483647."
      }
      if (self$`min_happiness` < -2147483648) {
        invalid_fields["min_happiness"] <- "Invalid value for `min_happiness`, must be bigger than or equal to -2147483648."
      }

      if (self$`min_beauty` > 2147483647) {
        invalid_fields["min_beauty"] <- "Invalid value for `min_beauty`, must be smaller than or equal to 2147483647."
      }
      if (self$`min_beauty` < -2147483648) {
        invalid_fields["min_beauty"] <- "Invalid value for `min_beauty`, must be bigger than or equal to -2147483648."
      }

      if (self$`min_affection` > 2147483647) {
        invalid_fields["min_affection"] <- "Invalid value for `min_affection`, must be smaller than or equal to 2147483647."
      }
      if (self$`min_affection` < -2147483648) {
        invalid_fields["min_affection"] <- "Invalid value for `min_affection`, must be bigger than or equal to -2147483648."
      }

      if (self$`relative_physical_stats` > 2147483647) {
        invalid_fields["relative_physical_stats"] <- "Invalid value for `relative_physical_stats`, must be smaller than or equal to 2147483647."
      }
      if (self$`relative_physical_stats` < -2147483648) {
        invalid_fields["relative_physical_stats"] <- "Invalid value for `relative_physical_stats`, must be bigger than or equal to -2147483648."
      }

      if (nchar(self$`time_of_day`) > 10) {
        invalid_fields["time_of_day"] <- "Invalid length for `time_of_day`, must be smaller than or equal to 10."
      }

      if (self$`min_move_count` > 2147483647) {
        invalid_fields["min_move_count"] <- "Invalid value for `min_move_count`, must be smaller than or equal to 2147483647."
      }
      if (self$`min_move_count` < -2147483648) {
        invalid_fields["min_move_count"] <- "Invalid value for `min_move_count`, must be bigger than or equal to -2147483648."
      }

      if (self$`min_steps` > 2147483647) {
        invalid_fields["min_steps"] <- "Invalid value for `min_steps`, must be smaller than or equal to 2147483647."
      }
      if (self$`min_steps` < -2147483648) {
        invalid_fields["min_steps"] <- "Invalid value for `min_steps`, must be bigger than or equal to -2147483648."
      }

      if (self$`min_damage_taken` > 2147483647) {
        invalid_fields["min_damage_taken"] <- "Invalid value for `min_damage_taken`, must be smaller than or equal to 2147483647."
      }
      if (self$`min_damage_taken` < -2147483648) {
        invalid_fields["min_damage_taken"] <- "Invalid value for `min_damage_taken`, must be bigger than or equal to -2147483648."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# PokemonEvolution$unlock()
#
## Below is an example to define the print function
# PokemonEvolution$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonEvolution$lock()


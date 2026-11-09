#' Create a new PokemonDetail
#'
#' @description
#' PokemonDetail Class
#'
#' @docType class
#' @title PokemonDetail
#' @description PokemonDetail Class
#' @format An \code{R6Class} generator object
#' @field id The identifier for this resource. integer
#' @field name The name for this resource. character
#' @field base_experience The base experience gained for defeating this Pokémon. integer [optional]
#' @field height The height of this Pokémon in decimetres. integer [optional]
#' @field is_default Set for exactly one Pokémon used as the default for each species. character [optional]
#' @field order Order for sorting. Almost national order, except families are grouped together. integer [optional]
#' @field weight The weight of this Pokémon in hectograms. integer [optional]
#' @field abilities A list of abilities this Pokémon could potentially have. list(\link{PokemonAbility})
#' @field past_abilities A list of details showing abilities this pokémon had in previous generations list(\link{PokemonPastAbility})
#' @field forms A list of forms this Pokémon can take on. list(\link{PokemonFormSummary})
#' @field game_indices A list of game indices relevent to Pokémon item by generation. list(\link{PokemonGameIndex})
#' @field held_items A list of items this Pokémon may be holding when encountered. list(\link{PokemonHeldItemSummary})
#' @field location_area_encounters A link to a list of location areas, as well as encounter details pertaining to specific versions. character
#' @field moves A list of moves along with learn methods and level details pertaining to specific version groups. list(\link{PokemonMove})
#' @field species The species this Pokémon belongs to. \link{PokemonSpeciesSummary}
#' @field sprites A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a> \link{PokemonSprites}
#' @field cries A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a> \link{PokemonCries}
#' @field stats A list of base stat values for this Pokémon. list(\link{PokemonStat})
#' @field past_stats A list of details showing stats this pokémon had in previous generations list(\link{PokemonPastStat})
#' @field types A list of details showing types this Pokémon has. list(\link{PokemonType})
#' @field past_types A list of details showing types this pokémon had in previous generations list(\link{PokemonPastType})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonDetail <- R6::R6Class(
  "PokemonDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `base_experience` = NULL,
    `height` = NULL,
    `is_default` = NULL,
    `order` = NULL,
    `weight` = NULL,
    `abilities` = NULL,
    `past_abilities` = NULL,
    `forms` = NULL,
    `game_indices` = NULL,
    `held_items` = NULL,
    `location_area_encounters` = NULL,
    `moves` = NULL,
    `species` = NULL,
    `sprites` = NULL,
    `cries` = NULL,
    `stats` = NULL,
    `past_stats` = NULL,
    `types` = NULL,
    `past_types` = NULL,

    #' @description
    #' Initialize a new PokemonDetail class.
    #'
    #' @param id The identifier for this resource.
    #' @param name The name for this resource.
    #' @param abilities A list of abilities this Pokémon could potentially have.
    #' @param past_abilities A list of details showing abilities this pokémon had in previous generations
    #' @param forms A list of forms this Pokémon can take on.
    #' @param game_indices A list of game indices relevent to Pokémon item by generation.
    #' @param held_items A list of items this Pokémon may be holding when encountered.
    #' @param location_area_encounters A link to a list of location areas, as well as encounter details pertaining to specific versions.
    #' @param moves A list of moves along with learn methods and level details pertaining to specific version groups.
    #' @param species The species this Pokémon belongs to.
    #' @param sprites A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>
    #' @param cries A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>
    #' @param stats A list of base stat values for this Pokémon.
    #' @param past_stats A list of details showing stats this pokémon had in previous generations
    #' @param types A list of details showing types this Pokémon has.
    #' @param past_types A list of details showing types this pokémon had in previous generations
    #' @param base_experience The base experience gained for defeating this Pokémon.
    #' @param height The height of this Pokémon in decimetres.
    #' @param is_default Set for exactly one Pokémon used as the default for each species.
    #' @param order Order for sorting. Almost national order, except families are grouped together.
    #' @param weight The weight of this Pokémon in hectograms.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `abilities`, `past_abilities`, `forms`, `game_indices`, `held_items`, `location_area_encounters`, `moves`, `species`, `sprites`, `cries`, `stats`, `past_stats`, `types`, `past_types`, `base_experience` = NULL, `height` = NULL, `is_default` = NULL, `order` = NULL, `weight` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`abilities`)) {
        stopifnot(is.vector(`abilities`), length(`abilities`) != 0)
        sapply(`abilities`, function(x) stopifnot(R6::is.R6(x)))
        self$`abilities` <- `abilities`
      }
      if (!missing(`past_abilities`)) {
        stopifnot(is.vector(`past_abilities`), length(`past_abilities`) != 0)
        sapply(`past_abilities`, function(x) stopifnot(R6::is.R6(x)))
        self$`past_abilities` <- `past_abilities`
      }
      if (!missing(`forms`)) {
        stopifnot(is.vector(`forms`), length(`forms`) != 0)
        sapply(`forms`, function(x) stopifnot(R6::is.R6(x)))
        self$`forms` <- `forms`
      }
      if (!missing(`game_indices`)) {
        stopifnot(is.vector(`game_indices`), length(`game_indices`) != 0)
        sapply(`game_indices`, function(x) stopifnot(R6::is.R6(x)))
        self$`game_indices` <- `game_indices`
      }
      if (!missing(`held_items`)) {
        stopifnot(is.vector(`held_items`), length(`held_items`) != 0)
        sapply(`held_items`, function(x) stopifnot(R6::is.R6(x)))
        self$`held_items` <- `held_items`
      }
      if (!missing(`location_area_encounters`)) {
        if (!(is.character(`location_area_encounters`) && length(`location_area_encounters`) == 1)) {
          stop(paste("Error! Invalid data for `location_area_encounters`. Must be a string:", `location_area_encounters`))
        }
        self$`location_area_encounters` <- `location_area_encounters`
      }
      if (!missing(`moves`)) {
        stopifnot(is.vector(`moves`), length(`moves`) != 0)
        sapply(`moves`, function(x) stopifnot(R6::is.R6(x)))
        self$`moves` <- `moves`
      }
      if (!missing(`species`)) {
        stopifnot(R6::is.R6(`species`))
        self$`species` <- `species`
      }
      if (!missing(`sprites`)) {
        stopifnot(R6::is.R6(`sprites`))
        self$`sprites` <- `sprites`
      }
      if (!missing(`cries`)) {
        stopifnot(R6::is.R6(`cries`))
        self$`cries` <- `cries`
      }
      if (!missing(`stats`)) {
        stopifnot(is.vector(`stats`), length(`stats`) != 0)
        sapply(`stats`, function(x) stopifnot(R6::is.R6(x)))
        self$`stats` <- `stats`
      }
      if (!missing(`past_stats`)) {
        stopifnot(is.vector(`past_stats`), length(`past_stats`) != 0)
        sapply(`past_stats`, function(x) stopifnot(R6::is.R6(x)))
        self$`past_stats` <- `past_stats`
      }
      if (!missing(`types`)) {
        stopifnot(is.vector(`types`), length(`types`) != 0)
        sapply(`types`, function(x) stopifnot(R6::is.R6(x)))
        self$`types` <- `types`
      }
      if (!missing(`past_types`)) {
        stopifnot(is.vector(`past_types`), length(`past_types`) != 0)
        sapply(`past_types`, function(x) stopifnot(R6::is.R6(x)))
        self$`past_types` <- `past_types`
      }
      if (!is.null(`base_experience`)) {
        if (!(is.numeric(`base_experience`) && length(`base_experience`) == 1)) {
          stop(paste("Error! Invalid data for `base_experience`. Must be an integer:", `base_experience`))
        }
        self$`base_experience` <- `base_experience`
      }
      if (!is.null(`height`)) {
        if (!(is.numeric(`height`) && length(`height`) == 1)) {
          stop(paste("Error! Invalid data for `height`. Must be an integer:", `height`))
        }
        self$`height` <- `height`
      }
      if (!is.null(`is_default`)) {
        if (!(is.logical(`is_default`) && length(`is_default`) == 1)) {
          stop(paste("Error! Invalid data for `is_default`. Must be a boolean:", `is_default`))
        }
        self$`is_default` <- `is_default`
      }
      if (!is.null(`order`)) {
        if (!(is.numeric(`order`) && length(`order`) == 1)) {
          stop(paste("Error! Invalid data for `order`. Must be an integer:", `order`))
        }
        self$`order` <- `order`
      }
      if (!is.null(`weight`)) {
        if (!(is.numeric(`weight`) && length(`weight`) == 1)) {
          stop(paste("Error! Invalid data for `weight`. Must be an integer:", `weight`))
        }
        self$`weight` <- `weight`
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
    #' @return PokemonDetail as a base R list.
    #' @examples
    #' # convert array of PokemonDetail (x) to a data frame
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
    #' Convert PokemonDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonDetailObject <- list()
      if (!is.null(self$`id`)) {
        PokemonDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        PokemonDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`base_experience`)) {
        PokemonDetailObject[["base_experience"]] <-
          self$`base_experience`
      }
      if (!is.null(self$`height`)) {
        PokemonDetailObject[["height"]] <-
          self$`height`
      }
      if (!is.null(self$`is_default`)) {
        PokemonDetailObject[["is_default"]] <-
          self$`is_default`
      }
      if (!is.null(self$`order`)) {
        PokemonDetailObject[["order"]] <-
          self$`order`
      }
      if (!is.null(self$`weight`)) {
        PokemonDetailObject[["weight"]] <-
          self$`weight`
      }
      if (!is.null(self$`abilities`)) {
        PokemonDetailObject[["abilities"]] <-
          self$extractSimpleType(self$`abilities`)
      }
      if (!is.null(self$`past_abilities`)) {
        PokemonDetailObject[["past_abilities"]] <-
          self$extractSimpleType(self$`past_abilities`)
      }
      if (!is.null(self$`forms`)) {
        PokemonDetailObject[["forms"]] <-
          self$extractSimpleType(self$`forms`)
      }
      if (!is.null(self$`game_indices`)) {
        PokemonDetailObject[["game_indices"]] <-
          self$extractSimpleType(self$`game_indices`)
      }
      if (!is.null(self$`held_items`)) {
        PokemonDetailObject[["held_items"]] <-
          self$extractSimpleType(self$`held_items`)
      }
      if (!is.null(self$`location_area_encounters`)) {
        PokemonDetailObject[["location_area_encounters"]] <-
          self$`location_area_encounters`
      }
      if (!is.null(self$`moves`)) {
        PokemonDetailObject[["moves"]] <-
          self$extractSimpleType(self$`moves`)
      }
      if (!is.null(self$`species`)) {
        PokemonDetailObject[["species"]] <-
          self$extractSimpleType(self$`species`)
      }
      if (!is.null(self$`sprites`)) {
        PokemonDetailObject[["sprites"]] <-
          self$extractSimpleType(self$`sprites`)
      }
      if (!is.null(self$`cries`)) {
        PokemonDetailObject[["cries"]] <-
          self$extractSimpleType(self$`cries`)
      }
      if (!is.null(self$`stats`)) {
        PokemonDetailObject[["stats"]] <-
          self$extractSimpleType(self$`stats`)
      }
      if (!is.null(self$`past_stats`)) {
        PokemonDetailObject[["past_stats"]] <-
          self$extractSimpleType(self$`past_stats`)
      }
      if (!is.null(self$`types`)) {
        PokemonDetailObject[["types"]] <-
          self$extractSimpleType(self$`types`)
      }
      if (!is.null(self$`past_types`)) {
        PokemonDetailObject[["past_types"]] <-
          self$extractSimpleType(self$`past_types`)
      }
      return(PokemonDetailObject)
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
    #' Deserialize JSON string into an instance of PokemonDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`base_experience`)) {
        self$`base_experience` <- this_object$`base_experience`
      }
      if (!is.null(this_object$`height`)) {
        self$`height` <- this_object$`height`
      }
      if (!is.null(this_object$`is_default`)) {
        self$`is_default` <- this_object$`is_default`
      }
      if (!is.null(this_object$`order`)) {
        self$`order` <- this_object$`order`
      }
      if (!is.null(this_object$`weight`)) {
        self$`weight` <- this_object$`weight`
      }
      if (!is.null(this_object$`abilities`)) {
        self$`abilities` <- ApiClient$new()$deserializeObj(this_object$`abilities`, "array[PokemonAbility]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`past_abilities`)) {
        self$`past_abilities` <- ApiClient$new()$deserializeObj(this_object$`past_abilities`, "array[PokemonPastAbility]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`forms`)) {
        self$`forms` <- ApiClient$new()$deserializeObj(this_object$`forms`, "array[PokemonFormSummary]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`game_indices`)) {
        self$`game_indices` <- ApiClient$new()$deserializeObj(this_object$`game_indices`, "array[PokemonGameIndex]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`held_items`)) {
        self$`held_items` <- ApiClient$new()$deserializeObj(this_object$`held_items`, "array[PokemonHeldItemSummary]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`location_area_encounters`)) {
        self$`location_area_encounters` <- this_object$`location_area_encounters`
      }
      if (!is.null(this_object$`moves`)) {
        self$`moves` <- ApiClient$new()$deserializeObj(this_object$`moves`, "array[PokemonMove]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`species`)) {
        `species_object` <- PokemonSpeciesSummary$new()
        `species_object`$fromJSON(jsonlite::toJSON(this_object$`species`, auto_unbox = TRUE, digits = NA))
        self$`species` <- `species_object`
      }
      if (!is.null(this_object$`sprites`)) {
        `sprites_object` <- PokemonSprites$new()
        `sprites_object`$fromJSON(jsonlite::toJSON(this_object$`sprites`, auto_unbox = TRUE, digits = NA))
        self$`sprites` <- `sprites_object`
      }
      if (!is.null(this_object$`cries`)) {
        `cries_object` <- PokemonCries$new()
        `cries_object`$fromJSON(jsonlite::toJSON(this_object$`cries`, auto_unbox = TRUE, digits = NA))
        self$`cries` <- `cries_object`
      }
      if (!is.null(this_object$`stats`)) {
        self$`stats` <- ApiClient$new()$deserializeObj(this_object$`stats`, "array[PokemonStat]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`past_stats`)) {
        self$`past_stats` <- ApiClient$new()$deserializeObj(this_object$`past_stats`, "array[PokemonPastStat]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`types`)) {
        self$`types` <- ApiClient$new()$deserializeObj(this_object$`types`, "array[PokemonType]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`past_types`)) {
        self$`past_types` <- ApiClient$new()$deserializeObj(this_object$`past_types`, "array[PokemonPastType]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`base_experience` <- this_object$`base_experience`
      self$`height` <- this_object$`height`
      self$`is_default` <- this_object$`is_default`
      self$`order` <- this_object$`order`
      self$`weight` <- this_object$`weight`
      self$`abilities` <- ApiClient$new()$deserializeObj(this_object$`abilities`, "array[PokemonAbility]", loadNamespace("openapi"))
      self$`past_abilities` <- ApiClient$new()$deserializeObj(this_object$`past_abilities`, "array[PokemonPastAbility]", loadNamespace("openapi"))
      self$`forms` <- ApiClient$new()$deserializeObj(this_object$`forms`, "array[PokemonFormSummary]", loadNamespace("openapi"))
      self$`game_indices` <- ApiClient$new()$deserializeObj(this_object$`game_indices`, "array[PokemonGameIndex]", loadNamespace("openapi"))
      self$`held_items` <- ApiClient$new()$deserializeObj(this_object$`held_items`, "array[PokemonHeldItemSummary]", loadNamespace("openapi"))
      self$`location_area_encounters` <- this_object$`location_area_encounters`
      self$`moves` <- ApiClient$new()$deserializeObj(this_object$`moves`, "array[PokemonMove]", loadNamespace("openapi"))
      self$`species` <- PokemonSpeciesSummary$new()$fromJSON(jsonlite::toJSON(this_object$`species`, auto_unbox = TRUE, digits = NA))
      self$`sprites` <- PokemonSprites$new()$fromJSON(jsonlite::toJSON(this_object$`sprites`, auto_unbox = TRUE, digits = NA))
      self$`cries` <- PokemonCries$new()$fromJSON(jsonlite::toJSON(this_object$`cries`, auto_unbox = TRUE, digits = NA))
      self$`stats` <- ApiClient$new()$deserializeObj(this_object$`stats`, "array[PokemonStat]", loadNamespace("openapi"))
      self$`past_stats` <- ApiClient$new()$deserializeObj(this_object$`past_stats`, "array[PokemonPastStat]", loadNamespace("openapi"))
      self$`types` <- ApiClient$new()$deserializeObj(this_object$`types`, "array[PokemonType]", loadNamespace("openapi"))
      self$`past_types` <- ApiClient$new()$deserializeObj(this_object$`past_types`, "array[PokemonPastType]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonDetail and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.numeric(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetail: the required field `name` is missing."))
      }
      # check the required field `abilities`
      if (!is.null(input_json$`abilities`)) {
        stopifnot(is.vector(input_json$`abilities`), length(input_json$`abilities`) != 0)
        tmp <- sapply(input_json$`abilities`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetail: the required field `abilities` is missing."))
      }
      # check the required field `past_abilities`
      if (!is.null(input_json$`past_abilities`)) {
        stopifnot(is.vector(input_json$`past_abilities`), length(input_json$`past_abilities`) != 0)
        tmp <- sapply(input_json$`past_abilities`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetail: the required field `past_abilities` is missing."))
      }
      # check the required field `forms`
      if (!is.null(input_json$`forms`)) {
        stopifnot(is.vector(input_json$`forms`), length(input_json$`forms`) != 0)
        tmp <- sapply(input_json$`forms`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetail: the required field `forms` is missing."))
      }
      # check the required field `game_indices`
      if (!is.null(input_json$`game_indices`)) {
        stopifnot(is.vector(input_json$`game_indices`), length(input_json$`game_indices`) != 0)
        tmp <- sapply(input_json$`game_indices`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetail: the required field `game_indices` is missing."))
      }
      # check the required field `held_items`
      if (!is.null(input_json$`held_items`)) {
        stopifnot(is.vector(input_json$`held_items`), length(input_json$`held_items`) != 0)
        tmp <- sapply(input_json$`held_items`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetail: the required field `held_items` is missing."))
      }
      # check the required field `location_area_encounters`
      if (!is.null(input_json$`location_area_encounters`)) {
        if (!(is.character(input_json$`location_area_encounters`) && length(input_json$`location_area_encounters`) == 1)) {
          stop(paste("Error! Invalid data for `location_area_encounters`. Must be a string:", input_json$`location_area_encounters`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetail: the required field `location_area_encounters` is missing."))
      }
      # check the required field `moves`
      if (!is.null(input_json$`moves`)) {
        stopifnot(is.vector(input_json$`moves`), length(input_json$`moves`) != 0)
        tmp <- sapply(input_json$`moves`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetail: the required field `moves` is missing."))
      }
      # check the required field `species`
      if (!is.null(input_json$`species`)) {
        stopifnot(R6::is.R6(input_json$`species`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetail: the required field `species` is missing."))
      }
      # check the required field `sprites`
      if (!is.null(input_json$`sprites`)) {
        stopifnot(R6::is.R6(input_json$`sprites`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetail: the required field `sprites` is missing."))
      }
      # check the required field `cries`
      if (!is.null(input_json$`cries`)) {
        stopifnot(R6::is.R6(input_json$`cries`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetail: the required field `cries` is missing."))
      }
      # check the required field `stats`
      if (!is.null(input_json$`stats`)) {
        stopifnot(is.vector(input_json$`stats`), length(input_json$`stats`) != 0)
        tmp <- sapply(input_json$`stats`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetail: the required field `stats` is missing."))
      }
      # check the required field `past_stats`
      if (!is.null(input_json$`past_stats`)) {
        stopifnot(is.vector(input_json$`past_stats`), length(input_json$`past_stats`) != 0)
        tmp <- sapply(input_json$`past_stats`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetail: the required field `past_stats` is missing."))
      }
      # check the required field `types`
      if (!is.null(input_json$`types`)) {
        stopifnot(is.vector(input_json$`types`), length(input_json$`types`) != 0)
        tmp <- sapply(input_json$`types`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetail: the required field `types` is missing."))
      }
      # check the required field `past_types`
      if (!is.null(input_json$`past_types`)) {
        stopifnot(is.vector(input_json$`past_types`), length(input_json$`past_types`) != 0)
        tmp <- sapply(input_json$`past_types`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetail: the required field `past_types` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonDetail
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      if (nchar(self$`name`) > 200) {
        return(FALSE)
      }

      if (self$`base_experience` > 2147483647) {
        return(FALSE)
      }
      if (self$`base_experience` < -2147483648) {
        return(FALSE)
      }

      if (self$`height` > 2147483647) {
        return(FALSE)
      }
      if (self$`height` < -2147483648) {
        return(FALSE)
      }

      if (self$`order` > 2147483647) {
        return(FALSE)
      }
      if (self$`order` < -2147483648) {
        return(FALSE)
      }

      if (self$`weight` > 2147483647) {
        return(FALSE)
      }
      if (self$`weight` < -2147483648) {
        return(FALSE)
      }

      # check if the required `abilities` is null
      if (is.null(self$`abilities`)) {
        return(FALSE)
      }

      # check if the required `past_abilities` is null
      if (is.null(self$`past_abilities`)) {
        return(FALSE)
      }

      # check if the required `forms` is null
      if (is.null(self$`forms`)) {
        return(FALSE)
      }

      # check if the required `game_indices` is null
      if (is.null(self$`game_indices`)) {
        return(FALSE)
      }

      # check if the required `held_items` is null
      if (is.null(self$`held_items`)) {
        return(FALSE)
      }

      # check if the required `location_area_encounters` is null
      if (is.null(self$`location_area_encounters`)) {
        return(FALSE)
      }

      # check if the required `moves` is null
      if (is.null(self$`moves`)) {
        return(FALSE)
      }

      # check if the required `species` is null
      if (is.null(self$`species`)) {
        return(FALSE)
      }

      # check if the required `sprites` is null
      if (is.null(self$`sprites`)) {
        return(FALSE)
      }

      # check if the required `cries` is null
      if (is.null(self$`cries`)) {
        return(FALSE)
      }

      # check if the required `stats` is null
      if (is.null(self$`stats`)) {
        return(FALSE)
      }

      # check if the required `past_stats` is null
      if (is.null(self$`past_stats`)) {
        return(FALSE)
      }

      # check if the required `types` is null
      if (is.null(self$`types`)) {
        return(FALSE)
      }

      # check if the required `past_types` is null
      if (is.null(self$`past_types`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      if (nchar(self$`name`) > 200) {
        invalid_fields["name"] <- "Invalid length for `name`, must be smaller than or equal to 200."
      }

      if (self$`base_experience` > 2147483647) {
        invalid_fields["base_experience"] <- "Invalid value for `base_experience`, must be smaller than or equal to 2147483647."
      }
      if (self$`base_experience` < -2147483648) {
        invalid_fields["base_experience"] <- "Invalid value for `base_experience`, must be bigger than or equal to -2147483648."
      }

      if (self$`height` > 2147483647) {
        invalid_fields["height"] <- "Invalid value for `height`, must be smaller than or equal to 2147483647."
      }
      if (self$`height` < -2147483648) {
        invalid_fields["height"] <- "Invalid value for `height`, must be bigger than or equal to -2147483648."
      }

      if (self$`order` > 2147483647) {
        invalid_fields["order"] <- "Invalid value for `order`, must be smaller than or equal to 2147483647."
      }
      if (self$`order` < -2147483648) {
        invalid_fields["order"] <- "Invalid value for `order`, must be bigger than or equal to -2147483648."
      }

      if (self$`weight` > 2147483647) {
        invalid_fields["weight"] <- "Invalid value for `weight`, must be smaller than or equal to 2147483647."
      }
      if (self$`weight` < -2147483648) {
        invalid_fields["weight"] <- "Invalid value for `weight`, must be bigger than or equal to -2147483648."
      }

      # check if the required `abilities` is null
      if (is.null(self$`abilities`)) {
        invalid_fields["abilities"] <- "Non-nullable required field `abilities` cannot be null."
      }

      # check if the required `past_abilities` is null
      if (is.null(self$`past_abilities`)) {
        invalid_fields["past_abilities"] <- "Non-nullable required field `past_abilities` cannot be null."
      }

      # check if the required `forms` is null
      if (is.null(self$`forms`)) {
        invalid_fields["forms"] <- "Non-nullable required field `forms` cannot be null."
      }

      # check if the required `game_indices` is null
      if (is.null(self$`game_indices`)) {
        invalid_fields["game_indices"] <- "Non-nullable required field `game_indices` cannot be null."
      }

      # check if the required `held_items` is null
      if (is.null(self$`held_items`)) {
        invalid_fields["held_items"] <- "Non-nullable required field `held_items` cannot be null."
      }

      # check if the required `location_area_encounters` is null
      if (is.null(self$`location_area_encounters`)) {
        invalid_fields["location_area_encounters"] <- "Non-nullable required field `location_area_encounters` cannot be null."
      }

      # check if the required `moves` is null
      if (is.null(self$`moves`)) {
        invalid_fields["moves"] <- "Non-nullable required field `moves` cannot be null."
      }

      # check if the required `species` is null
      if (is.null(self$`species`)) {
        invalid_fields["species"] <- "Non-nullable required field `species` cannot be null."
      }

      # check if the required `sprites` is null
      if (is.null(self$`sprites`)) {
        invalid_fields["sprites"] <- "Non-nullable required field `sprites` cannot be null."
      }

      # check if the required `cries` is null
      if (is.null(self$`cries`)) {
        invalid_fields["cries"] <- "Non-nullable required field `cries` cannot be null."
      }

      # check if the required `stats` is null
      if (is.null(self$`stats`)) {
        invalid_fields["stats"] <- "Non-nullable required field `stats` cannot be null."
      }

      # check if the required `past_stats` is null
      if (is.null(self$`past_stats`)) {
        invalid_fields["past_stats"] <- "Non-nullable required field `past_stats` cannot be null."
      }

      # check if the required `types` is null
      if (is.null(self$`types`)) {
        invalid_fields["types"] <- "Non-nullable required field `types` cannot be null."
      }

      # check if the required `past_types` is null
      if (is.null(self$`past_types`)) {
        invalid_fields["past_types"] <- "Non-nullable required field `past_types` cannot be null."
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
# PokemonDetail$unlock()
#
## Below is an example to define the print function
# PokemonDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonDetail$lock()


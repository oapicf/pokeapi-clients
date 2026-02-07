#' Create a new PokemonDetail
#'
#' @description
#' PokemonDetail Class
#'
#' @docType class
#' @title PokemonDetail
#' @description PokemonDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field base_experience  integer [optional]
#' @field height  integer [optional]
#' @field is_default  character [optional]
#' @field order  integer [optional]
#' @field weight  integer [optional]
#' @field abilities  list(\link{PokemonDetailAbilitiesInner})
#' @field past_abilities  list(\link{PokemonDetailPastAbilitiesInner})
#' @field forms  list(\link{PokemonFormSummary})
#' @field game_indices  list(\link{PokemonGameIndex})
#' @field held_items  \link{PokemonDetailHeldItems}
#' @field location_area_encounters  character
#' @field moves  list(\link{PokemonDetailMovesInner})
#' @field species  \link{PokemonSpeciesSummary}
#' @field sprites  \link{PokemonDetailSprites}
#' @field cries  \link{PokemonDetailCries}
#' @field stats  list(\link{PokemonStat})
#' @field types  list(\link{PokemonDetailTypesInner})
#' @field past_types  list(\link{PokemonDetailPastTypesInner})
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
    `types` = NULL,
    `past_types` = NULL,

    #' @description
    #' Initialize a new PokemonDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param abilities abilities
    #' @param past_abilities past_abilities
    #' @param forms forms
    #' @param game_indices game_indices
    #' @param held_items held_items
    #' @param location_area_encounters location_area_encounters
    #' @param moves moves
    #' @param species species
    #' @param sprites sprites
    #' @param cries cries
    #' @param stats stats
    #' @param types types
    #' @param past_types past_types
    #' @param base_experience base_experience
    #' @param height height
    #' @param is_default is_default
    #' @param order order
    #' @param weight weight
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `abilities`, `past_abilities`, `forms`, `game_indices`, `held_items`, `location_area_encounters`, `moves`, `species`, `sprites`, `cries`, `stats`, `types`, `past_types`, `base_experience` = NULL, `height` = NULL, `is_default` = NULL, `order` = NULL, `weight` = NULL, ...) {
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
        stopifnot(R6::is.R6(`held_items`))
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
          lapply(self$`abilities`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`past_abilities`)) {
        PokemonDetailObject[["past_abilities"]] <-
          lapply(self$`past_abilities`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`forms`)) {
        PokemonDetailObject[["forms"]] <-
          lapply(self$`forms`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`game_indices`)) {
        PokemonDetailObject[["game_indices"]] <-
          lapply(self$`game_indices`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`held_items`)) {
        PokemonDetailObject[["held_items"]] <-
          self$`held_items`$toSimpleType()
      }
      if (!is.null(self$`location_area_encounters`)) {
        PokemonDetailObject[["location_area_encounters"]] <-
          self$`location_area_encounters`
      }
      if (!is.null(self$`moves`)) {
        PokemonDetailObject[["moves"]] <-
          lapply(self$`moves`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`species`)) {
        PokemonDetailObject[["species"]] <-
          self$`species`$toSimpleType()
      }
      if (!is.null(self$`sprites`)) {
        PokemonDetailObject[["sprites"]] <-
          self$`sprites`$toSimpleType()
      }
      if (!is.null(self$`cries`)) {
        PokemonDetailObject[["cries"]] <-
          self$`cries`$toSimpleType()
      }
      if (!is.null(self$`stats`)) {
        PokemonDetailObject[["stats"]] <-
          lapply(self$`stats`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`types`)) {
        PokemonDetailObject[["types"]] <-
          lapply(self$`types`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`past_types`)) {
        PokemonDetailObject[["past_types"]] <-
          lapply(self$`past_types`, function(x) x$toSimpleType())
      }
      return(PokemonDetailObject)
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
        self$`abilities` <- ApiClient$new()$deserializeObj(this_object$`abilities`, "array[PokemonDetailAbilitiesInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`past_abilities`)) {
        self$`past_abilities` <- ApiClient$new()$deserializeObj(this_object$`past_abilities`, "array[PokemonDetailPastAbilitiesInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`forms`)) {
        self$`forms` <- ApiClient$new()$deserializeObj(this_object$`forms`, "array[PokemonFormSummary]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`game_indices`)) {
        self$`game_indices` <- ApiClient$new()$deserializeObj(this_object$`game_indices`, "array[PokemonGameIndex]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`held_items`)) {
        `held_items_object` <- PokemonDetailHeldItems$new()
        `held_items_object`$fromJSON(jsonlite::toJSON(this_object$`held_items`, auto_unbox = TRUE, digits = NA))
        self$`held_items` <- `held_items_object`
      }
      if (!is.null(this_object$`location_area_encounters`)) {
        self$`location_area_encounters` <- this_object$`location_area_encounters`
      }
      if (!is.null(this_object$`moves`)) {
        self$`moves` <- ApiClient$new()$deserializeObj(this_object$`moves`, "array[PokemonDetailMovesInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`species`)) {
        `species_object` <- PokemonSpeciesSummary$new()
        `species_object`$fromJSON(jsonlite::toJSON(this_object$`species`, auto_unbox = TRUE, digits = NA))
        self$`species` <- `species_object`
      }
      if (!is.null(this_object$`sprites`)) {
        `sprites_object` <- PokemonDetailSprites$new()
        `sprites_object`$fromJSON(jsonlite::toJSON(this_object$`sprites`, auto_unbox = TRUE, digits = NA))
        self$`sprites` <- `sprites_object`
      }
      if (!is.null(this_object$`cries`)) {
        `cries_object` <- PokemonDetailCries$new()
        `cries_object`$fromJSON(jsonlite::toJSON(this_object$`cries`, auto_unbox = TRUE, digits = NA))
        self$`cries` <- `cries_object`
      }
      if (!is.null(this_object$`stats`)) {
        self$`stats` <- ApiClient$new()$deserializeObj(this_object$`stats`, "array[PokemonStat]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`types`)) {
        self$`types` <- ApiClient$new()$deserializeObj(this_object$`types`, "array[PokemonDetailTypesInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`past_types`)) {
        self$`past_types` <- ApiClient$new()$deserializeObj(this_object$`past_types`, "array[PokemonDetailPastTypesInner]", loadNamespace("openapi"))
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
      self$`abilities` <- ApiClient$new()$deserializeObj(this_object$`abilities`, "array[PokemonDetailAbilitiesInner]", loadNamespace("openapi"))
      self$`past_abilities` <- ApiClient$new()$deserializeObj(this_object$`past_abilities`, "array[PokemonDetailPastAbilitiesInner]", loadNamespace("openapi"))
      self$`forms` <- ApiClient$new()$deserializeObj(this_object$`forms`, "array[PokemonFormSummary]", loadNamespace("openapi"))
      self$`game_indices` <- ApiClient$new()$deserializeObj(this_object$`game_indices`, "array[PokemonGameIndex]", loadNamespace("openapi"))
      self$`held_items` <- PokemonDetailHeldItems$new()$fromJSON(jsonlite::toJSON(this_object$`held_items`, auto_unbox = TRUE, digits = NA))
      self$`location_area_encounters` <- this_object$`location_area_encounters`
      self$`moves` <- ApiClient$new()$deserializeObj(this_object$`moves`, "array[PokemonDetailMovesInner]", loadNamespace("openapi"))
      self$`species` <- PokemonSpeciesSummary$new()$fromJSON(jsonlite::toJSON(this_object$`species`, auto_unbox = TRUE, digits = NA))
      self$`sprites` <- PokemonDetailSprites$new()$fromJSON(jsonlite::toJSON(this_object$`sprites`, auto_unbox = TRUE, digits = NA))
      self$`cries` <- PokemonDetailCries$new()$fromJSON(jsonlite::toJSON(this_object$`cries`, auto_unbox = TRUE, digits = NA))
      self$`stats` <- ApiClient$new()$deserializeObj(this_object$`stats`, "array[PokemonStat]", loadNamespace("openapi"))
      self$`types` <- ApiClient$new()$deserializeObj(this_object$`types`, "array[PokemonDetailTypesInner]", loadNamespace("openapi"))
      self$`past_types` <- ApiClient$new()$deserializeObj(this_object$`past_types`, "array[PokemonDetailPastTypesInner]", loadNamespace("openapi"))
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
        stopifnot(R6::is.R6(input_json$`held_items`))
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

      if (nchar(self$`name`) > 100) {
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

      if (nchar(self$`name`) > 100) {
        invalid_fields["name"] <- "Invalid length for `name`, must be smaller than or equal to 100."
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


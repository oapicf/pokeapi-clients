#' Create a new EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner
#'
#' @description
#' EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner Class
#'
#' @docType class
#' @title EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner
#' @description EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner Class
#' @format An \code{R6Class} generator object
#' @field gender  \link{EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender}
#' @field held_item  \link{EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender}
#' @field item  \link{EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender}
#' @field known_move  object
#' @field known_move_type  object
#' @field location  \link{EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender}
#' @field min_affection  integer
#' @field min_beauty  integer
#' @field min_happiness  integer
#' @field min_level  integer
#' @field needs_overworld_rain  character
#' @field party_species  character
#' @field party_type  character
#' @field relative_physical_stats  character
#' @field time_of_day  character
#' @field trade_species  character
#' @field trigger  \link{AbilityDetailPokemonInnerPokemon}
#' @field turn_upside_down  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner <- R6::R6Class(
  "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner",
  public = list(
    `gender` = NULL,
    `held_item` = NULL,
    `item` = NULL,
    `known_move` = NULL,
    `known_move_type` = NULL,
    `location` = NULL,
    `min_affection` = NULL,
    `min_beauty` = NULL,
    `min_happiness` = NULL,
    `min_level` = NULL,
    `needs_overworld_rain` = NULL,
    `party_species` = NULL,
    `party_type` = NULL,
    `relative_physical_stats` = NULL,
    `time_of_day` = NULL,
    `trade_species` = NULL,
    `trigger` = NULL,
    `turn_upside_down` = NULL,

    #' @description
    #' Initialize a new EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner class.
    #'
    #' @param gender gender
    #' @param held_item held_item
    #' @param item item
    #' @param known_move known_move
    #' @param known_move_type known_move_type
    #' @param location location
    #' @param min_affection min_affection
    #' @param min_beauty min_beauty
    #' @param min_happiness min_happiness
    #' @param min_level min_level
    #' @param needs_overworld_rain needs_overworld_rain
    #' @param party_species party_species
    #' @param party_type party_type
    #' @param relative_physical_stats relative_physical_stats
    #' @param time_of_day time_of_day
    #' @param trade_species trade_species
    #' @param trigger trigger
    #' @param turn_upside_down turn_upside_down
    #' @param ... Other optional arguments.
    initialize = function(`gender`, `held_item`, `item`, `known_move`, `known_move_type`, `location`, `min_affection`, `min_beauty`, `min_happiness`, `min_level`, `needs_overworld_rain`, `party_species`, `party_type`, `relative_physical_stats`, `time_of_day`, `trade_species`, `trigger`, `turn_upside_down`, ...) {
      if (!missing(`gender`)) {
        stopifnot(R6::is.R6(`gender`))
        self$`gender` <- `gender`
      }
      if (!missing(`held_item`)) {
        stopifnot(R6::is.R6(`held_item`))
        self$`held_item` <- `held_item`
      }
      if (!missing(`item`)) {
        stopifnot(R6::is.R6(`item`))
        self$`item` <- `item`
      }
      if (!missing(`known_move`)) {
        self$`known_move` <- `known_move`
      }
      if (!missing(`known_move_type`)) {
        self$`known_move_type` <- `known_move_type`
      }
      if (!missing(`location`)) {
        stopifnot(R6::is.R6(`location`))
        self$`location` <- `location`
      }
      if (!missing(`min_affection`)) {
        if (!(is.numeric(`min_affection`) && length(`min_affection`) == 1)) {
          stop(paste("Error! Invalid data for `min_affection`. Must be an integer:", `min_affection`))
        }
        self$`min_affection` <- `min_affection`
      }
      if (!missing(`min_beauty`)) {
        if (!(is.numeric(`min_beauty`) && length(`min_beauty`) == 1)) {
          stop(paste("Error! Invalid data for `min_beauty`. Must be an integer:", `min_beauty`))
        }
        self$`min_beauty` <- `min_beauty`
      }
      if (!missing(`min_happiness`)) {
        if (!(is.numeric(`min_happiness`) && length(`min_happiness`) == 1)) {
          stop(paste("Error! Invalid data for `min_happiness`. Must be an integer:", `min_happiness`))
        }
        self$`min_happiness` <- `min_happiness`
      }
      if (!missing(`min_level`)) {
        if (!(is.numeric(`min_level`) && length(`min_level`) == 1)) {
          stop(paste("Error! Invalid data for `min_level`. Must be an integer:", `min_level`))
        }
        self$`min_level` <- `min_level`
      }
      if (!missing(`needs_overworld_rain`)) {
        if (!(is.logical(`needs_overworld_rain`) && length(`needs_overworld_rain`) == 1)) {
          stop(paste("Error! Invalid data for `needs_overworld_rain`. Must be a boolean:", `needs_overworld_rain`))
        }
        self$`needs_overworld_rain` <- `needs_overworld_rain`
      }
      if (!missing(`party_species`)) {
        if (!(is.character(`party_species`) && length(`party_species`) == 1)) {
          stop(paste("Error! Invalid data for `party_species`. Must be a string:", `party_species`))
        }
        self$`party_species` <- `party_species`
      }
      if (!missing(`party_type`)) {
        if (!(is.character(`party_type`) && length(`party_type`) == 1)) {
          stop(paste("Error! Invalid data for `party_type`. Must be a string:", `party_type`))
        }
        self$`party_type` <- `party_type`
      }
      if (!missing(`relative_physical_stats`)) {
        if (!(is.character(`relative_physical_stats`) && length(`relative_physical_stats`) == 1)) {
          stop(paste("Error! Invalid data for `relative_physical_stats`. Must be a string:", `relative_physical_stats`))
        }
        self$`relative_physical_stats` <- `relative_physical_stats`
      }
      if (!missing(`time_of_day`)) {
        if (!(is.character(`time_of_day`) && length(`time_of_day`) == 1)) {
          stop(paste("Error! Invalid data for `time_of_day`. Must be a string:", `time_of_day`))
        }
        self$`time_of_day` <- `time_of_day`
      }
      if (!missing(`trade_species`)) {
        if (!(is.character(`trade_species`) && length(`trade_species`) == 1)) {
          stop(paste("Error! Invalid data for `trade_species`. Must be a string:", `trade_species`))
        }
        self$`trade_species` <- `trade_species`
      }
      if (!missing(`trigger`)) {
        stopifnot(R6::is.R6(`trigger`))
        self$`trigger` <- `trigger`
      }
      if (!missing(`turn_upside_down`)) {
        if (!(is.logical(`turn_upside_down`) && length(`turn_upside_down`) == 1)) {
          stop(paste("Error! Invalid data for `turn_upside_down`. Must be a boolean:", `turn_upside_down`))
        }
        self$`turn_upside_down` <- `turn_upside_down`
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
    #' @return EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner as a base R list.
    #' @examples
    #' # convert array of EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner (x) to a data frame
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
    #' Convert EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject <- list()
      if (!is.null(self$`gender`)) {
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject[["gender"]] <-
          self$`gender`$toSimpleType()
      }
      if (!is.null(self$`held_item`)) {
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject[["held_item"]] <-
          self$`held_item`$toSimpleType()
      }
      if (!is.null(self$`item`)) {
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject[["item"]] <-
          self$`item`$toSimpleType()
      }
      if (!is.null(self$`known_move`)) {
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject[["known_move"]] <-
          self$`known_move`
      }
      if (!is.null(self$`known_move_type`)) {
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject[["known_move_type"]] <-
          self$`known_move_type`
      }
      if (!is.null(self$`location`)) {
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject[["location"]] <-
          self$`location`$toSimpleType()
      }
      if (!is.null(self$`min_affection`)) {
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject[["min_affection"]] <-
          self$`min_affection`
      }
      if (!is.null(self$`min_beauty`)) {
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject[["min_beauty"]] <-
          self$`min_beauty`
      }
      if (!is.null(self$`min_happiness`)) {
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject[["min_happiness"]] <-
          self$`min_happiness`
      }
      if (!is.null(self$`min_level`)) {
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject[["min_level"]] <-
          self$`min_level`
      }
      if (!is.null(self$`needs_overworld_rain`)) {
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject[["needs_overworld_rain"]] <-
          self$`needs_overworld_rain`
      }
      if (!is.null(self$`party_species`)) {
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject[["party_species"]] <-
          self$`party_species`
      }
      if (!is.null(self$`party_type`)) {
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject[["party_type"]] <-
          self$`party_type`
      }
      if (!is.null(self$`relative_physical_stats`)) {
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject[["relative_physical_stats"]] <-
          self$`relative_physical_stats`
      }
      if (!is.null(self$`time_of_day`)) {
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject[["time_of_day"]] <-
          self$`time_of_day`
      }
      if (!is.null(self$`trade_species`)) {
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject[["trade_species"]] <-
          self$`trade_species`
      }
      if (!is.null(self$`trigger`)) {
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject[["trigger"]] <-
          self$`trigger`$toSimpleType()
      }
      if (!is.null(self$`turn_upside_down`)) {
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject[["turn_upside_down"]] <-
          self$`turn_upside_down`
      }
      return(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`gender`)) {
        `gender_object` <- EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender$new()
        `gender_object`$fromJSON(jsonlite::toJSON(this_object$`gender`, auto_unbox = TRUE, digits = NA))
        self$`gender` <- `gender_object`
      }
      if (!is.null(this_object$`held_item`)) {
        `held_item_object` <- EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender$new()
        `held_item_object`$fromJSON(jsonlite::toJSON(this_object$`held_item`, auto_unbox = TRUE, digits = NA))
        self$`held_item` <- `held_item_object`
      }
      if (!is.null(this_object$`item`)) {
        `item_object` <- EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender$new()
        `item_object`$fromJSON(jsonlite::toJSON(this_object$`item`, auto_unbox = TRUE, digits = NA))
        self$`item` <- `item_object`
      }
      if (!is.null(this_object$`known_move`)) {
        self$`known_move` <- this_object$`known_move`
      }
      if (!is.null(this_object$`known_move_type`)) {
        self$`known_move_type` <- this_object$`known_move_type`
      }
      if (!is.null(this_object$`location`)) {
        `location_object` <- EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender$new()
        `location_object`$fromJSON(jsonlite::toJSON(this_object$`location`, auto_unbox = TRUE, digits = NA))
        self$`location` <- `location_object`
      }
      if (!is.null(this_object$`min_affection`)) {
        self$`min_affection` <- this_object$`min_affection`
      }
      if (!is.null(this_object$`min_beauty`)) {
        self$`min_beauty` <- this_object$`min_beauty`
      }
      if (!is.null(this_object$`min_happiness`)) {
        self$`min_happiness` <- this_object$`min_happiness`
      }
      if (!is.null(this_object$`min_level`)) {
        self$`min_level` <- this_object$`min_level`
      }
      if (!is.null(this_object$`needs_overworld_rain`)) {
        self$`needs_overworld_rain` <- this_object$`needs_overworld_rain`
      }
      if (!is.null(this_object$`party_species`)) {
        self$`party_species` <- this_object$`party_species`
      }
      if (!is.null(this_object$`party_type`)) {
        self$`party_type` <- this_object$`party_type`
      }
      if (!is.null(this_object$`relative_physical_stats`)) {
        self$`relative_physical_stats` <- this_object$`relative_physical_stats`
      }
      if (!is.null(this_object$`time_of_day`)) {
        self$`time_of_day` <- this_object$`time_of_day`
      }
      if (!is.null(this_object$`trade_species`)) {
        self$`trade_species` <- this_object$`trade_species`
      }
      if (!is.null(this_object$`trigger`)) {
        `trigger_object` <- AbilityDetailPokemonInnerPokemon$new()
        `trigger_object`$fromJSON(jsonlite::toJSON(this_object$`trigger`, auto_unbox = TRUE, digits = NA))
        self$`trigger` <- `trigger_object`
      }
      if (!is.null(this_object$`turn_upside_down`)) {
        self$`turn_upside_down` <- this_object$`turn_upside_down`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`gender` <- EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender$new()$fromJSON(jsonlite::toJSON(this_object$`gender`, auto_unbox = TRUE, digits = NA))
      self$`held_item` <- EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender$new()$fromJSON(jsonlite::toJSON(this_object$`held_item`, auto_unbox = TRUE, digits = NA))
      self$`item` <- EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender$new()$fromJSON(jsonlite::toJSON(this_object$`item`, auto_unbox = TRUE, digits = NA))
      self$`known_move` <- this_object$`known_move`
      self$`known_move_type` <- this_object$`known_move_type`
      self$`location` <- EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender$new()$fromJSON(jsonlite::toJSON(this_object$`location`, auto_unbox = TRUE, digits = NA))
      self$`min_affection` <- this_object$`min_affection`
      self$`min_beauty` <- this_object$`min_beauty`
      self$`min_happiness` <- this_object$`min_happiness`
      self$`min_level` <- this_object$`min_level`
      self$`needs_overworld_rain` <- this_object$`needs_overworld_rain`
      self$`party_species` <- this_object$`party_species`
      self$`party_type` <- this_object$`party_type`
      self$`relative_physical_stats` <- this_object$`relative_physical_stats`
      self$`time_of_day` <- this_object$`time_of_day`
      self$`trade_species` <- this_object$`trade_species`
      self$`trigger` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`trigger`, auto_unbox = TRUE, digits = NA))
      self$`turn_upside_down` <- this_object$`turn_upside_down`
      self
    },

    #' @description
    #' Validate JSON input with respect to EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `gender`
      if (!is.null(input_json$`gender`)) {
        stopifnot(R6::is.R6(input_json$`gender`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: the required field `gender` is missing."))
      }
      # check the required field `held_item`
      if (!is.null(input_json$`held_item`)) {
        stopifnot(R6::is.R6(input_json$`held_item`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: the required field `held_item` is missing."))
      }
      # check the required field `item`
      if (!is.null(input_json$`item`)) {
        stopifnot(R6::is.R6(input_json$`item`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: the required field `item` is missing."))
      }
      # check the required field `known_move`
      if (!is.null(input_json$`known_move`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: the required field `known_move` is missing."))
      }
      # check the required field `known_move_type`
      if (!is.null(input_json$`known_move_type`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: the required field `known_move_type` is missing."))
      }
      # check the required field `location`
      if (!is.null(input_json$`location`)) {
        stopifnot(R6::is.R6(input_json$`location`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: the required field `location` is missing."))
      }
      # check the required field `min_affection`
      if (!is.null(input_json$`min_affection`)) {
        if (!(is.numeric(input_json$`min_affection`) && length(input_json$`min_affection`) == 1)) {
          stop(paste("Error! Invalid data for `min_affection`. Must be an integer:", input_json$`min_affection`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: the required field `min_affection` is missing."))
      }
      # check the required field `min_beauty`
      if (!is.null(input_json$`min_beauty`)) {
        if (!(is.numeric(input_json$`min_beauty`) && length(input_json$`min_beauty`) == 1)) {
          stop(paste("Error! Invalid data for `min_beauty`. Must be an integer:", input_json$`min_beauty`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: the required field `min_beauty` is missing."))
      }
      # check the required field `min_happiness`
      if (!is.null(input_json$`min_happiness`)) {
        if (!(is.numeric(input_json$`min_happiness`) && length(input_json$`min_happiness`) == 1)) {
          stop(paste("Error! Invalid data for `min_happiness`. Must be an integer:", input_json$`min_happiness`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: the required field `min_happiness` is missing."))
      }
      # check the required field `min_level`
      if (!is.null(input_json$`min_level`)) {
        if (!(is.numeric(input_json$`min_level`) && length(input_json$`min_level`) == 1)) {
          stop(paste("Error! Invalid data for `min_level`. Must be an integer:", input_json$`min_level`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: the required field `min_level` is missing."))
      }
      # check the required field `needs_overworld_rain`
      if (!is.null(input_json$`needs_overworld_rain`)) {
        if (!(is.logical(input_json$`needs_overworld_rain`) && length(input_json$`needs_overworld_rain`) == 1)) {
          stop(paste("Error! Invalid data for `needs_overworld_rain`. Must be a boolean:", input_json$`needs_overworld_rain`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: the required field `needs_overworld_rain` is missing."))
      }
      # check the required field `party_species`
      if (!is.null(input_json$`party_species`)) {
        if (!(is.character(input_json$`party_species`) && length(input_json$`party_species`) == 1)) {
          stop(paste("Error! Invalid data for `party_species`. Must be a string:", input_json$`party_species`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: the required field `party_species` is missing."))
      }
      # check the required field `party_type`
      if (!is.null(input_json$`party_type`)) {
        if (!(is.character(input_json$`party_type`) && length(input_json$`party_type`) == 1)) {
          stop(paste("Error! Invalid data for `party_type`. Must be a string:", input_json$`party_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: the required field `party_type` is missing."))
      }
      # check the required field `relative_physical_stats`
      if (!is.null(input_json$`relative_physical_stats`)) {
        if (!(is.character(input_json$`relative_physical_stats`) && length(input_json$`relative_physical_stats`) == 1)) {
          stop(paste("Error! Invalid data for `relative_physical_stats`. Must be a string:", input_json$`relative_physical_stats`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: the required field `relative_physical_stats` is missing."))
      }
      # check the required field `time_of_day`
      if (!is.null(input_json$`time_of_day`)) {
        if (!(is.character(input_json$`time_of_day`) && length(input_json$`time_of_day`) == 1)) {
          stop(paste("Error! Invalid data for `time_of_day`. Must be a string:", input_json$`time_of_day`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: the required field `time_of_day` is missing."))
      }
      # check the required field `trade_species`
      if (!is.null(input_json$`trade_species`)) {
        if (!(is.character(input_json$`trade_species`) && length(input_json$`trade_species`) == 1)) {
          stop(paste("Error! Invalid data for `trade_species`. Must be a string:", input_json$`trade_species`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: the required field `trade_species` is missing."))
      }
      # check the required field `trigger`
      if (!is.null(input_json$`trigger`)) {
        stopifnot(R6::is.R6(input_json$`trigger`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: the required field `trigger` is missing."))
      }
      # check the required field `turn_upside_down`
      if (!is.null(input_json$`turn_upside_down`)) {
        if (!(is.logical(input_json$`turn_upside_down`) && length(input_json$`turn_upside_down`) == 1)) {
          stop(paste("Error! Invalid data for `turn_upside_down`. Must be a boolean:", input_json$`turn_upside_down`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: the required field `turn_upside_down` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `gender` is null
      if (is.null(self$`gender`)) {
        return(FALSE)
      }

      # check if the required `held_item` is null
      if (is.null(self$`held_item`)) {
        return(FALSE)
      }

      # check if the required `item` is null
      if (is.null(self$`item`)) {
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

      # check if the required `location` is null
      if (is.null(self$`location`)) {
        return(FALSE)
      }

      # check if the required `min_affection` is null
      if (is.null(self$`min_affection`)) {
        return(FALSE)
      }

      # check if the required `min_beauty` is null
      if (is.null(self$`min_beauty`)) {
        return(FALSE)
      }

      # check if the required `min_happiness` is null
      if (is.null(self$`min_happiness`)) {
        return(FALSE)
      }

      # check if the required `min_level` is null
      if (is.null(self$`min_level`)) {
        return(FALSE)
      }

      # check if the required `needs_overworld_rain` is null
      if (is.null(self$`needs_overworld_rain`)) {
        return(FALSE)
      }

      # check if the required `party_species` is null
      if (is.null(self$`party_species`)) {
        return(FALSE)
      }

      # check if the required `party_type` is null
      if (is.null(self$`party_type`)) {
        return(FALSE)
      }

      # check if the required `relative_physical_stats` is null
      if (is.null(self$`relative_physical_stats`)) {
        return(FALSE)
      }

      # check if the required `time_of_day` is null
      if (is.null(self$`time_of_day`)) {
        return(FALSE)
      }

      # check if the required `trade_species` is null
      if (is.null(self$`trade_species`)) {
        return(FALSE)
      }

      # check if the required `trigger` is null
      if (is.null(self$`trigger`)) {
        return(FALSE)
      }

      # check if the required `turn_upside_down` is null
      if (is.null(self$`turn_upside_down`)) {
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
      # check if the required `gender` is null
      if (is.null(self$`gender`)) {
        invalid_fields["gender"] <- "Non-nullable required field `gender` cannot be null."
      }

      # check if the required `held_item` is null
      if (is.null(self$`held_item`)) {
        invalid_fields["held_item"] <- "Non-nullable required field `held_item` cannot be null."
      }

      # check if the required `item` is null
      if (is.null(self$`item`)) {
        invalid_fields["item"] <- "Non-nullable required field `item` cannot be null."
      }

      # check if the required `known_move` is null
      if (is.null(self$`known_move`)) {
        invalid_fields["known_move"] <- "Non-nullable required field `known_move` cannot be null."
      }

      # check if the required `known_move_type` is null
      if (is.null(self$`known_move_type`)) {
        invalid_fields["known_move_type"] <- "Non-nullable required field `known_move_type` cannot be null."
      }

      # check if the required `location` is null
      if (is.null(self$`location`)) {
        invalid_fields["location"] <- "Non-nullable required field `location` cannot be null."
      }

      # check if the required `min_affection` is null
      if (is.null(self$`min_affection`)) {
        invalid_fields["min_affection"] <- "Non-nullable required field `min_affection` cannot be null."
      }

      # check if the required `min_beauty` is null
      if (is.null(self$`min_beauty`)) {
        invalid_fields["min_beauty"] <- "Non-nullable required field `min_beauty` cannot be null."
      }

      # check if the required `min_happiness` is null
      if (is.null(self$`min_happiness`)) {
        invalid_fields["min_happiness"] <- "Non-nullable required field `min_happiness` cannot be null."
      }

      # check if the required `min_level` is null
      if (is.null(self$`min_level`)) {
        invalid_fields["min_level"] <- "Non-nullable required field `min_level` cannot be null."
      }

      # check if the required `needs_overworld_rain` is null
      if (is.null(self$`needs_overworld_rain`)) {
        invalid_fields["needs_overworld_rain"] <- "Non-nullable required field `needs_overworld_rain` cannot be null."
      }

      # check if the required `party_species` is null
      if (is.null(self$`party_species`)) {
        invalid_fields["party_species"] <- "Non-nullable required field `party_species` cannot be null."
      }

      # check if the required `party_type` is null
      if (is.null(self$`party_type`)) {
        invalid_fields["party_type"] <- "Non-nullable required field `party_type` cannot be null."
      }

      # check if the required `relative_physical_stats` is null
      if (is.null(self$`relative_physical_stats`)) {
        invalid_fields["relative_physical_stats"] <- "Non-nullable required field `relative_physical_stats` cannot be null."
      }

      # check if the required `time_of_day` is null
      if (is.null(self$`time_of_day`)) {
        invalid_fields["time_of_day"] <- "Non-nullable required field `time_of_day` cannot be null."
      }

      # check if the required `trade_species` is null
      if (is.null(self$`trade_species`)) {
        invalid_fields["trade_species"] <- "Non-nullable required field `trade_species` cannot be null."
      }

      # check if the required `trigger` is null
      if (is.null(self$`trigger`)) {
        invalid_fields["trigger"] <- "Non-nullable required field `trigger` cannot be null."
      }

      # check if the required `turn_upside_down` is null
      if (is.null(self$`turn_upside_down`)) {
        invalid_fields["turn_upside_down"] <- "Non-nullable required field `turn_upside_down` cannot be null."
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
# EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner$unlock()
#
## Below is an example to define the print function
# EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner$lock()


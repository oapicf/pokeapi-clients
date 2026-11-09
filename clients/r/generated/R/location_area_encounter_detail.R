#' Create a new LocationAreaEncounterDetail
#'
#' @description
#' LocationAreaEncounterDetail Class
#'
#' @docType class
#' @title LocationAreaEncounterDetail
#' @description LocationAreaEncounterDetail Class
#' @format An \code{R6Class} generator object
#' @field min_level The lowest level the Pokémon could be encountered at. integer
#' @field max_level The highest level the Pokémon could be encountered at. integer
#' @field chance Percent chance that this encounter will occur. integer [optional]
#' @field method The method by which this encounter happens. \link{EncounterMethodSummary} [optional]
#' @field condition_values A list of condition values that must be in effect for this encounter to occur. list(\link{EncounterConditionValueSummary})
#' @field pokemon_details Additional properties of the encountered Pokémon, or null if unspecified. \link{EncounterPokemonDetail}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LocationAreaEncounterDetail <- R6::R6Class(
  "LocationAreaEncounterDetail",
  public = list(
    `min_level` = NULL,
    `max_level` = NULL,
    `chance` = NULL,
    `method` = NULL,
    `condition_values` = NULL,
    `pokemon_details` = NULL,

    #' @description
    #' Initialize a new LocationAreaEncounterDetail class.
    #'
    #' @param min_level The lowest level the Pokémon could be encountered at.
    #' @param max_level The highest level the Pokémon could be encountered at.
    #' @param condition_values A list of condition values that must be in effect for this encounter to occur.
    #' @param pokemon_details Additional properties of the encountered Pokémon, or null if unspecified.
    #' @param chance Percent chance that this encounter will occur.. Default to 0.
    #' @param method The method by which this encounter happens.
    #' @param ... Other optional arguments.
    initialize = function(`min_level`, `max_level`, `condition_values`, `pokemon_details`, `chance` = 0, `method` = NULL, ...) {
      if (!missing(`min_level`)) {
        if (!(is.numeric(`min_level`) && length(`min_level`) == 1)) {
          stop(paste("Error! Invalid data for `min_level`. Must be an integer:", `min_level`))
        }
        self$`min_level` <- `min_level`
      }
      if (!missing(`max_level`)) {
        if (!(is.numeric(`max_level`) && length(`max_level`) == 1)) {
          stop(paste("Error! Invalid data for `max_level`. Must be an integer:", `max_level`))
        }
        self$`max_level` <- `max_level`
      }
      if (!missing(`condition_values`)) {
        stopifnot(is.vector(`condition_values`), length(`condition_values`) != 0)
        sapply(`condition_values`, function(x) stopifnot(R6::is.R6(x)))
        self$`condition_values` <- `condition_values`
      }
      if (!missing(`pokemon_details`)) {
        stopifnot(R6::is.R6(`pokemon_details`))
        self$`pokemon_details` <- `pokemon_details`
      }
      if (!is.null(`chance`)) {
        if (!(is.numeric(`chance`) && length(`chance`) == 1)) {
          stop(paste("Error! Invalid data for `chance`. Must be an integer:", `chance`))
        }
        self$`chance` <- `chance`
      }
      if (!is.null(`method`)) {
        stopifnot(R6::is.R6(`method`))
        self$`method` <- `method`
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
    #' @return LocationAreaEncounterDetail as a base R list.
    #' @examples
    #' # convert array of LocationAreaEncounterDetail (x) to a data frame
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
    #' Convert LocationAreaEncounterDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LocationAreaEncounterDetailObject <- list()
      if (!is.null(self$`min_level`)) {
        LocationAreaEncounterDetailObject[["min_level"]] <-
          self$`min_level`
      }
      if (!is.null(self$`max_level`)) {
        LocationAreaEncounterDetailObject[["max_level"]] <-
          self$`max_level`
      }
      if (!is.null(self$`chance`)) {
        LocationAreaEncounterDetailObject[["chance"]] <-
          self$`chance`
      }
      if (!is.null(self$`method`)) {
        LocationAreaEncounterDetailObject[["method"]] <-
          self$extractSimpleType(self$`method`)
      }
      if (!is.null(self$`condition_values`)) {
        LocationAreaEncounterDetailObject[["condition_values"]] <-
          self$extractSimpleType(self$`condition_values`)
      }
      if (!is.null(self$`pokemon_details`)) {
        LocationAreaEncounterDetailObject[["pokemon_details"]] <-
          self$extractSimpleType(self$`pokemon_details`)
      }
      return(LocationAreaEncounterDetailObject)
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
    #' Deserialize JSON string into an instance of LocationAreaEncounterDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocationAreaEncounterDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`min_level`)) {
        self$`min_level` <- this_object$`min_level`
      }
      if (!is.null(this_object$`max_level`)) {
        self$`max_level` <- this_object$`max_level`
      }
      if (!is.null(this_object$`chance`)) {
        self$`chance` <- this_object$`chance`
      }
      if (!is.null(this_object$`method`)) {
        `method_object` <- EncounterMethodSummary$new()
        `method_object`$fromJSON(jsonlite::toJSON(this_object$`method`, auto_unbox = TRUE, digits = NA))
        self$`method` <- `method_object`
      }
      if (!is.null(this_object$`condition_values`)) {
        self$`condition_values` <- ApiClient$new()$deserializeObj(this_object$`condition_values`, "array[EncounterConditionValueSummary]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`pokemon_details`)) {
        `pokemon_details_object` <- EncounterPokemonDetail$new()
        `pokemon_details_object`$fromJSON(jsonlite::toJSON(this_object$`pokemon_details`, auto_unbox = TRUE, digits = NA))
        self$`pokemon_details` <- `pokemon_details_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LocationAreaEncounterDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LocationAreaEncounterDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocationAreaEncounterDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`min_level` <- this_object$`min_level`
      self$`max_level` <- this_object$`max_level`
      self$`chance` <- this_object$`chance`
      self$`method` <- EncounterMethodSummary$new()$fromJSON(jsonlite::toJSON(this_object$`method`, auto_unbox = TRUE, digits = NA))
      self$`condition_values` <- ApiClient$new()$deserializeObj(this_object$`condition_values`, "array[EncounterConditionValueSummary]", loadNamespace("openapi"))
      self$`pokemon_details` <- EncounterPokemonDetail$new()$fromJSON(jsonlite::toJSON(this_object$`pokemon_details`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to LocationAreaEncounterDetail and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `min_level`
      if (!is.null(input_json$`min_level`)) {
        if (!(is.numeric(input_json$`min_level`) && length(input_json$`min_level`) == 1)) {
          stop(paste("Error! Invalid data for `min_level`. Must be an integer:", input_json$`min_level`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocationAreaEncounterDetail: the required field `min_level` is missing."))
      }
      # check the required field `max_level`
      if (!is.null(input_json$`max_level`)) {
        if (!(is.numeric(input_json$`max_level`) && length(input_json$`max_level`) == 1)) {
          stop(paste("Error! Invalid data for `max_level`. Must be an integer:", input_json$`max_level`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocationAreaEncounterDetail: the required field `max_level` is missing."))
      }
      # check the required field `condition_values`
      if (!is.null(input_json$`condition_values`)) {
        stopifnot(is.vector(input_json$`condition_values`), length(input_json$`condition_values`) != 0)
        tmp <- sapply(input_json$`condition_values`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocationAreaEncounterDetail: the required field `condition_values` is missing."))
      }
      # check the required field `pokemon_details`
      if (!is.null(input_json$`pokemon_details`)) {
        stopifnot(R6::is.R6(input_json$`pokemon_details`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocationAreaEncounterDetail: the required field `pokemon_details` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LocationAreaEncounterDetail
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `min_level` is null
      if (is.null(self$`min_level`)) {
        return(FALSE)
      }

      # check if the required `max_level` is null
      if (is.null(self$`max_level`)) {
        return(FALSE)
      }

      # check if the required `condition_values` is null
      if (is.null(self$`condition_values`)) {
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
      # check if the required `min_level` is null
      if (is.null(self$`min_level`)) {
        invalid_fields["min_level"] <- "Non-nullable required field `min_level` cannot be null."
      }

      # check if the required `max_level` is null
      if (is.null(self$`max_level`)) {
        invalid_fields["max_level"] <- "Non-nullable required field `max_level` cannot be null."
      }

      # check if the required `condition_values` is null
      if (is.null(self$`condition_values`)) {
        invalid_fields["condition_values"] <- "Non-nullable required field `condition_values` cannot be null."
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
# LocationAreaEncounterDetail$unlock()
#
## Below is an example to define the print function
# LocationAreaEncounterDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LocationAreaEncounterDetail$lock()


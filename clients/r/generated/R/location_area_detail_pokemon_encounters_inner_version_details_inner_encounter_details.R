#' Create a new LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
#'
#' @description
#' LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails Class
#'
#' @docType class
#' @title LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
#' @description LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails Class
#' @format An \code{R6Class} generator object
#' @field min_level  integer
#' @field max_level  integer
#' @field condition_values  \link{AbilityDetailPokemonInnerPokemon} [optional]
#' @field chance  integer
#' @field method  \link{AbilityDetailPokemonInnerPokemon}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails <- R6::R6Class(
  "LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails",
  public = list(
    `min_level` = NULL,
    `max_level` = NULL,
    `condition_values` = NULL,
    `chance` = NULL,
    `method` = NULL,

    #' @description
    #' Initialize a new LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails class.
    #'
    #' @param min_level min_level
    #' @param max_level max_level
    #' @param chance chance
    #' @param method method
    #' @param condition_values condition_values
    #' @param ... Other optional arguments.
    initialize = function(`min_level`, `max_level`, `chance`, `method`, `condition_values` = NULL, ...) {
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
      if (!missing(`chance`)) {
        if (!(is.numeric(`chance`) && length(`chance`) == 1)) {
          stop(paste("Error! Invalid data for `chance`. Must be an integer:", `chance`))
        }
        self$`chance` <- `chance`
      }
      if (!missing(`method`)) {
        stopifnot(R6::is.R6(`method`))
        self$`method` <- `method`
      }
      if (!is.null(`condition_values`)) {
        stopifnot(R6::is.R6(`condition_values`))
        self$`condition_values` <- `condition_values`
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
    #' @return LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails as a base R list.
    #' @examples
    #' # convert array of LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails (x) to a data frame
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
    #' Convert LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsObject <- list()
      if (!is.null(self$`min_level`)) {
        LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsObject[["min_level"]] <-
          self$`min_level`
      }
      if (!is.null(self$`max_level`)) {
        LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsObject[["max_level"]] <-
          self$`max_level`
      }
      if (!is.null(self$`condition_values`)) {
        LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsObject[["condition_values"]] <-
          self$`condition_values`$toSimpleType()
      }
      if (!is.null(self$`chance`)) {
        LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsObject[["chance"]] <-
          self$`chance`
      }
      if (!is.null(self$`method`)) {
        LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsObject[["method"]] <-
          self$`method`$toSimpleType()
      }
      return(LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`min_level`)) {
        self$`min_level` <- this_object$`min_level`
      }
      if (!is.null(this_object$`max_level`)) {
        self$`max_level` <- this_object$`max_level`
      }
      if (!is.null(this_object$`condition_values`)) {
        `condition_values_object` <- AbilityDetailPokemonInnerPokemon$new()
        `condition_values_object`$fromJSON(jsonlite::toJSON(this_object$`condition_values`, auto_unbox = TRUE, digits = NA))
        self$`condition_values` <- `condition_values_object`
      }
      if (!is.null(this_object$`chance`)) {
        self$`chance` <- this_object$`chance`
      }
      if (!is.null(this_object$`method`)) {
        `method_object` <- AbilityDetailPokemonInnerPokemon$new()
        `method_object`$fromJSON(jsonlite::toJSON(this_object$`method`, auto_unbox = TRUE, digits = NA))
        self$`method` <- `method_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`min_level` <- this_object$`min_level`
      self$`max_level` <- this_object$`max_level`
      self$`condition_values` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`condition_values`, auto_unbox = TRUE, digits = NA))
      self$`chance` <- this_object$`chance`
      self$`method` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`method`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails: the required field `min_level` is missing."))
      }
      # check the required field `max_level`
      if (!is.null(input_json$`max_level`)) {
        if (!(is.numeric(input_json$`max_level`) && length(input_json$`max_level`) == 1)) {
          stop(paste("Error! Invalid data for `max_level`. Must be an integer:", input_json$`max_level`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails: the required field `max_level` is missing."))
      }
      # check the required field `chance`
      if (!is.null(input_json$`chance`)) {
        if (!(is.numeric(input_json$`chance`) && length(input_json$`chance`) == 1)) {
          stop(paste("Error! Invalid data for `chance`. Must be an integer:", input_json$`chance`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails: the required field `chance` is missing."))
      }
      # check the required field `method`
      if (!is.null(input_json$`method`)) {
        stopifnot(R6::is.R6(input_json$`method`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails: the required field `method` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
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

      # check if the required `chance` is null
      if (is.null(self$`chance`)) {
        return(FALSE)
      }

      # check if the required `method` is null
      if (is.null(self$`method`)) {
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

      # check if the required `chance` is null
      if (is.null(self$`chance`)) {
        invalid_fields["chance"] <- "Non-nullable required field `chance` cannot be null."
      }

      # check if the required `method` is null
      if (is.null(self$`method`)) {
        invalid_fields["method"] <- "Non-nullable required field `method` cannot be null."
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
# LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails$unlock()
#
## Below is an example to define the print function
# LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails$lock()


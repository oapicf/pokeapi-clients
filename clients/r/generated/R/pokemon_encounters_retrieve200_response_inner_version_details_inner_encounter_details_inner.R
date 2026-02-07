#' Create a new PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
#'
#' @description
#' PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner Class
#'
#' @docType class
#' @title PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
#' @description PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner Class
#' @format An \code{R6Class} generator object
#' @field chance  numeric
#' @field condition_values  list(\link{PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner})
#' @field max_level  numeric
#' @field method  \link{PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod}
#' @field min_level  numeric
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner <- R6::R6Class(
  "PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner",
  public = list(
    `chance` = NULL,
    `condition_values` = NULL,
    `max_level` = NULL,
    `method` = NULL,
    `min_level` = NULL,

    #' @description
    #' Initialize a new PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner class.
    #'
    #' @param chance chance
    #' @param condition_values condition_values
    #' @param max_level max_level
    #' @param method method
    #' @param min_level min_level
    #' @param ... Other optional arguments.
    initialize = function(`chance`, `condition_values`, `max_level`, `method`, `min_level`, ...) {
      if (!missing(`chance`)) {
        self$`chance` <- `chance`
      }
      if (!missing(`condition_values`)) {
        stopifnot(is.vector(`condition_values`), length(`condition_values`) != 0)
        sapply(`condition_values`, function(x) stopifnot(R6::is.R6(x)))
        self$`condition_values` <- `condition_values`
      }
      if (!missing(`max_level`)) {
        self$`max_level` <- `max_level`
      }
      if (!missing(`method`)) {
        stopifnot(R6::is.R6(`method`))
        self$`method` <- `method`
      }
      if (!missing(`min_level`)) {
        self$`min_level` <- `min_level`
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
    #' @return PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner as a base R list.
    #' @examples
    #' # convert array of PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner (x) to a data frame
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
    #' Convert PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerObject <- list()
      if (!is.null(self$`chance`)) {
        PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerObject[["chance"]] <-
          self$`chance`
      }
      if (!is.null(self$`condition_values`)) {
        PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerObject[["condition_values"]] <-
          lapply(self$`condition_values`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`max_level`)) {
        PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerObject[["max_level"]] <-
          self$`max_level`
      }
      if (!is.null(self$`method`)) {
        PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerObject[["method"]] <-
          self$`method`$toSimpleType()
      }
      if (!is.null(self$`min_level`)) {
        PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerObject[["min_level"]] <-
          self$`min_level`
      }
      return(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`chance`)) {
        self$`chance` <- this_object$`chance`
      }
      if (!is.null(this_object$`condition_values`)) {
        self$`condition_values` <- ApiClient$new()$deserializeObj(this_object$`condition_values`, "array[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`max_level`)) {
        self$`max_level` <- this_object$`max_level`
      }
      if (!is.null(this_object$`method`)) {
        `method_object` <- PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod$new()
        `method_object`$fromJSON(jsonlite::toJSON(this_object$`method`, auto_unbox = TRUE, digits = NA))
        self$`method` <- `method_object`
      }
      if (!is.null(this_object$`min_level`)) {
        self$`min_level` <- this_object$`min_level`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`chance` <- this_object$`chance`
      self$`condition_values` <- ApiClient$new()$deserializeObj(this_object$`condition_values`, "array[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner]", loadNamespace("openapi"))
      self$`max_level` <- this_object$`max_level`
      self$`method` <- PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod$new()$fromJSON(jsonlite::toJSON(this_object$`method`, auto_unbox = TRUE, digits = NA))
      self$`min_level` <- this_object$`min_level`
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `chance`
      if (!is.null(input_json$`chance`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner: the required field `chance` is missing."))
      }
      # check the required field `condition_values`
      if (!is.null(input_json$`condition_values`)) {
        stopifnot(is.vector(input_json$`condition_values`), length(input_json$`condition_values`) != 0)
        tmp <- sapply(input_json$`condition_values`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner: the required field `condition_values` is missing."))
      }
      # check the required field `max_level`
      if (!is.null(input_json$`max_level`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner: the required field `max_level` is missing."))
      }
      # check the required field `method`
      if (!is.null(input_json$`method`)) {
        stopifnot(R6::is.R6(input_json$`method`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner: the required field `method` is missing."))
      }
      # check the required field `min_level`
      if (!is.null(input_json$`min_level`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner: the required field `min_level` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `chance` is null
      if (is.null(self$`chance`)) {
        return(FALSE)
      }

      # check if the required `condition_values` is null
      if (is.null(self$`condition_values`)) {
        return(FALSE)
      }

      # check if the required `max_level` is null
      if (is.null(self$`max_level`)) {
        return(FALSE)
      }

      # check if the required `method` is null
      if (is.null(self$`method`)) {
        return(FALSE)
      }

      # check if the required `min_level` is null
      if (is.null(self$`min_level`)) {
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
      # check if the required `chance` is null
      if (is.null(self$`chance`)) {
        invalid_fields["chance"] <- "Non-nullable required field `chance` cannot be null."
      }

      # check if the required `condition_values` is null
      if (is.null(self$`condition_values`)) {
        invalid_fields["condition_values"] <- "Non-nullable required field `condition_values` cannot be null."
      }

      # check if the required `max_level` is null
      if (is.null(self$`max_level`)) {
        invalid_fields["max_level"] <- "Non-nullable required field `max_level` cannot be null."
      }

      # check if the required `method` is null
      if (is.null(self$`method`)) {
        invalid_fields["method"] <- "Non-nullable required field `method` cannot be null."
      }

      # check if the required `min_level` is null
      if (is.null(self$`min_level`)) {
        invalid_fields["min_level"] <- "Non-nullable required field `min_level` cannot be null."
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
# PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner$unlock()
#
## Below is an example to define the print function
# PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner$lock()


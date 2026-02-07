#' Create a new LocationAreaDetailPokemonEncountersInnerVersionDetailsInner
#'
#' @description
#' LocationAreaDetailPokemonEncountersInnerVersionDetailsInner Class
#'
#' @docType class
#' @title LocationAreaDetailPokemonEncountersInnerVersionDetailsInner
#' @description LocationAreaDetailPokemonEncountersInnerVersionDetailsInner Class
#' @format An \code{R6Class} generator object
#' @field version  \link{AbilityDetailPokemonInnerPokemon}
#' @field max_chance  integer
#' @field encounter_details  \link{LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LocationAreaDetailPokemonEncountersInnerVersionDetailsInner <- R6::R6Class(
  "LocationAreaDetailPokemonEncountersInnerVersionDetailsInner",
  public = list(
    `version` = NULL,
    `max_chance` = NULL,
    `encounter_details` = NULL,

    #' @description
    #' Initialize a new LocationAreaDetailPokemonEncountersInnerVersionDetailsInner class.
    #'
    #' @param version version
    #' @param max_chance max_chance
    #' @param encounter_details encounter_details
    #' @param ... Other optional arguments.
    initialize = function(`version`, `max_chance`, `encounter_details`, ...) {
      if (!missing(`version`)) {
        stopifnot(R6::is.R6(`version`))
        self$`version` <- `version`
      }
      if (!missing(`max_chance`)) {
        if (!(is.numeric(`max_chance`) && length(`max_chance`) == 1)) {
          stop(paste("Error! Invalid data for `max_chance`. Must be an integer:", `max_chance`))
        }
        self$`max_chance` <- `max_chance`
      }
      if (!missing(`encounter_details`)) {
        stopifnot(R6::is.R6(`encounter_details`))
        self$`encounter_details` <- `encounter_details`
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
    #' @return LocationAreaDetailPokemonEncountersInnerVersionDetailsInner as a base R list.
    #' @examples
    #' # convert array of LocationAreaDetailPokemonEncountersInnerVersionDetailsInner (x) to a data frame
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
    #' Convert LocationAreaDetailPokemonEncountersInnerVersionDetailsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerObject <- list()
      if (!is.null(self$`version`)) {
        LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerObject[["version"]] <-
          self$`version`$toSimpleType()
      }
      if (!is.null(self$`max_chance`)) {
        LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerObject[["max_chance"]] <-
          self$`max_chance`
      }
      if (!is.null(self$`encounter_details`)) {
        LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerObject[["encounter_details"]] <-
          self$`encounter_details`$toSimpleType()
      }
      return(LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of LocationAreaDetailPokemonEncountersInnerVersionDetailsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocationAreaDetailPokemonEncountersInnerVersionDetailsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`version`)) {
        `version_object` <- AbilityDetailPokemonInnerPokemon$new()
        `version_object`$fromJSON(jsonlite::toJSON(this_object$`version`, auto_unbox = TRUE, digits = NA))
        self$`version` <- `version_object`
      }
      if (!is.null(this_object$`max_chance`)) {
        self$`max_chance` <- this_object$`max_chance`
      }
      if (!is.null(this_object$`encounter_details`)) {
        `encounter_details_object` <- LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails$new()
        `encounter_details_object`$fromJSON(jsonlite::toJSON(this_object$`encounter_details`, auto_unbox = TRUE, digits = NA))
        self$`encounter_details` <- `encounter_details_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LocationAreaDetailPokemonEncountersInnerVersionDetailsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LocationAreaDetailPokemonEncountersInnerVersionDetailsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocationAreaDetailPokemonEncountersInnerVersionDetailsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`version` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`version`, auto_unbox = TRUE, digits = NA))
      self$`max_chance` <- this_object$`max_chance`
      self$`encounter_details` <- LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails$new()$fromJSON(jsonlite::toJSON(this_object$`encounter_details`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to LocationAreaDetailPokemonEncountersInnerVersionDetailsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `version`
      if (!is.null(input_json$`version`)) {
        stopifnot(R6::is.R6(input_json$`version`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocationAreaDetailPokemonEncountersInnerVersionDetailsInner: the required field `version` is missing."))
      }
      # check the required field `max_chance`
      if (!is.null(input_json$`max_chance`)) {
        if (!(is.numeric(input_json$`max_chance`) && length(input_json$`max_chance`) == 1)) {
          stop(paste("Error! Invalid data for `max_chance`. Must be an integer:", input_json$`max_chance`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocationAreaDetailPokemonEncountersInnerVersionDetailsInner: the required field `max_chance` is missing."))
      }
      # check the required field `encounter_details`
      if (!is.null(input_json$`encounter_details`)) {
        stopifnot(R6::is.R6(input_json$`encounter_details`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocationAreaDetailPokemonEncountersInnerVersionDetailsInner: the required field `encounter_details` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LocationAreaDetailPokemonEncountersInnerVersionDetailsInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `version` is null
      if (is.null(self$`version`)) {
        return(FALSE)
      }

      # check if the required `max_chance` is null
      if (is.null(self$`max_chance`)) {
        return(FALSE)
      }

      # check if the required `encounter_details` is null
      if (is.null(self$`encounter_details`)) {
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
      # check if the required `version` is null
      if (is.null(self$`version`)) {
        invalid_fields["version"] <- "Non-nullable required field `version` cannot be null."
      }

      # check if the required `max_chance` is null
      if (is.null(self$`max_chance`)) {
        invalid_fields["max_chance"] <- "Non-nullable required field `max_chance` cannot be null."
      }

      # check if the required `encounter_details` is null
      if (is.null(self$`encounter_details`)) {
        invalid_fields["encounter_details"] <- "Non-nullable required field `encounter_details` cannot be null."
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
# LocationAreaDetailPokemonEncountersInnerVersionDetailsInner$unlock()
#
## Below is an example to define the print function
# LocationAreaDetailPokemonEncountersInnerVersionDetailsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LocationAreaDetailPokemonEncountersInnerVersionDetailsInner$lock()


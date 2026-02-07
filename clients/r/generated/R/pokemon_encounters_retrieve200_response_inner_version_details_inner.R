#' Create a new PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner
#'
#' @description
#' PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner Class
#'
#' @docType class
#' @title PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner
#' @description PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner Class
#' @format An \code{R6Class} generator object
#' @field encounter_details  list(\link{PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner})
#' @field max_chance  numeric
#' @field version  \link{PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner <- R6::R6Class(
  "PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner",
  public = list(
    `encounter_details` = NULL,
    `max_chance` = NULL,
    `version` = NULL,

    #' @description
    #' Initialize a new PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner class.
    #'
    #' @param encounter_details encounter_details
    #' @param max_chance max_chance
    #' @param version version
    #' @param ... Other optional arguments.
    initialize = function(`encounter_details`, `max_chance`, `version`, ...) {
      if (!missing(`encounter_details`)) {
        stopifnot(is.vector(`encounter_details`), length(`encounter_details`) != 0)
        sapply(`encounter_details`, function(x) stopifnot(R6::is.R6(x)))
        self$`encounter_details` <- `encounter_details`
      }
      if (!missing(`max_chance`)) {
        self$`max_chance` <- `max_chance`
      }
      if (!missing(`version`)) {
        stopifnot(R6::is.R6(`version`))
        self$`version` <- `version`
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
    #' @return PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner as a base R list.
    #' @examples
    #' # convert array of PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner (x) to a data frame
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
    #' Convert PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerObject <- list()
      if (!is.null(self$`encounter_details`)) {
        PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerObject[["encounter_details"]] <-
          lapply(self$`encounter_details`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`max_chance`)) {
        PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerObject[["max_chance"]] <-
          self$`max_chance`
      }
      if (!is.null(self$`version`)) {
        PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerObject[["version"]] <-
          self$`version`$toSimpleType()
      }
      return(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`encounter_details`)) {
        self$`encounter_details` <- ApiClient$new()$deserializeObj(this_object$`encounter_details`, "array[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`max_chance`)) {
        self$`max_chance` <- this_object$`max_chance`
      }
      if (!is.null(this_object$`version`)) {
        `version_object` <- PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion$new()
        `version_object`$fromJSON(jsonlite::toJSON(this_object$`version`, auto_unbox = TRUE, digits = NA))
        self$`version` <- `version_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`encounter_details` <- ApiClient$new()$deserializeObj(this_object$`encounter_details`, "array[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner]", loadNamespace("openapi"))
      self$`max_chance` <- this_object$`max_chance`
      self$`version` <- PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion$new()$fromJSON(jsonlite::toJSON(this_object$`version`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `encounter_details`
      if (!is.null(input_json$`encounter_details`)) {
        stopifnot(is.vector(input_json$`encounter_details`), length(input_json$`encounter_details`) != 0)
        tmp <- sapply(input_json$`encounter_details`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner: the required field `encounter_details` is missing."))
      }
      # check the required field `max_chance`
      if (!is.null(input_json$`max_chance`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner: the required field `max_chance` is missing."))
      }
      # check the required field `version`
      if (!is.null(input_json$`version`)) {
        stopifnot(R6::is.R6(input_json$`version`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner: the required field `version` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `encounter_details` is null
      if (is.null(self$`encounter_details`)) {
        return(FALSE)
      }

      # check if the required `max_chance` is null
      if (is.null(self$`max_chance`)) {
        return(FALSE)
      }

      # check if the required `version` is null
      if (is.null(self$`version`)) {
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
      # check if the required `encounter_details` is null
      if (is.null(self$`encounter_details`)) {
        invalid_fields["encounter_details"] <- "Non-nullable required field `encounter_details` cannot be null."
      }

      # check if the required `max_chance` is null
      if (is.null(self$`max_chance`)) {
        invalid_fields["max_chance"] <- "Non-nullable required field `max_chance` cannot be null."
      }

      # check if the required `version` is null
      if (is.null(self$`version`)) {
        invalid_fields["version"] <- "Non-nullable required field `version` cannot be null."
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
# PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner$unlock()
#
## Below is an example to define the print function
# PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner$lock()


#' Create a new PokemonEncounterResponse
#'
#' @description
#' PokemonEncounterResponse Class
#'
#' @docType class
#' @title PokemonEncounterResponse
#' @description PokemonEncounterResponse Class
#' @format An \code{R6Class} generator object
#' @field location_area The location area the referenced Pokémon can be encountered in. \link{LocationAreaSummary}
#' @field version_details A list of versions and encounters with the referenced Pokémon that might happen. list(\link{PokemonEncounterVersionDetailResponse})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonEncounterResponse <- R6::R6Class(
  "PokemonEncounterResponse",
  public = list(
    `location_area` = NULL,
    `version_details` = NULL,

    #' @description
    #' Initialize a new PokemonEncounterResponse class.
    #'
    #' @param location_area The location area the referenced Pokémon can be encountered in.
    #' @param version_details A list of versions and encounters with the referenced Pokémon that might happen.
    #' @param ... Other optional arguments.
    initialize = function(`location_area`, `version_details`, ...) {
      if (!missing(`location_area`)) {
        stopifnot(R6::is.R6(`location_area`))
        self$`location_area` <- `location_area`
      }
      if (!missing(`version_details`)) {
        stopifnot(is.vector(`version_details`), length(`version_details`) != 0)
        sapply(`version_details`, function(x) stopifnot(R6::is.R6(x)))
        self$`version_details` <- `version_details`
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
    #' @return PokemonEncounterResponse as a base R list.
    #' @examples
    #' # convert array of PokemonEncounterResponse (x) to a data frame
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
    #' Convert PokemonEncounterResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonEncounterResponseObject <- list()
      if (!is.null(self$`location_area`)) {
        PokemonEncounterResponseObject[["location_area"]] <-
          self$extractSimpleType(self$`location_area`)
      }
      if (!is.null(self$`version_details`)) {
        PokemonEncounterResponseObject[["version_details"]] <-
          self$extractSimpleType(self$`version_details`)
      }
      return(PokemonEncounterResponseObject)
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
    #' Deserialize JSON string into an instance of PokemonEncounterResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonEncounterResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`location_area`)) {
        `location_area_object` <- LocationAreaSummary$new()
        `location_area_object`$fromJSON(jsonlite::toJSON(this_object$`location_area`, auto_unbox = TRUE, digits = NA))
        self$`location_area` <- `location_area_object`
      }
      if (!is.null(this_object$`version_details`)) {
        self$`version_details` <- ApiClient$new()$deserializeObj(this_object$`version_details`, "array[PokemonEncounterVersionDetailResponse]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonEncounterResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonEncounterResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonEncounterResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`location_area` <- LocationAreaSummary$new()$fromJSON(jsonlite::toJSON(this_object$`location_area`, auto_unbox = TRUE, digits = NA))
      self$`version_details` <- ApiClient$new()$deserializeObj(this_object$`version_details`, "array[PokemonEncounterVersionDetailResponse]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonEncounterResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `location_area`
      if (!is.null(input_json$`location_area`)) {
        stopifnot(R6::is.R6(input_json$`location_area`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEncounterResponse: the required field `location_area` is missing."))
      }
      # check the required field `version_details`
      if (!is.null(input_json$`version_details`)) {
        stopifnot(is.vector(input_json$`version_details`), length(input_json$`version_details`) != 0)
        tmp <- sapply(input_json$`version_details`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonEncounterResponse: the required field `version_details` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonEncounterResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `location_area` is null
      if (is.null(self$`location_area`)) {
        return(FALSE)
      }

      # check if the required `version_details` is null
      if (is.null(self$`version_details`)) {
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
      # check if the required `location_area` is null
      if (is.null(self$`location_area`)) {
        invalid_fields["location_area"] <- "Non-nullable required field `location_area` cannot be null."
      }

      # check if the required `version_details` is null
      if (is.null(self$`version_details`)) {
        invalid_fields["version_details"] <- "Non-nullable required field `version_details` cannot be null."
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
# PokemonEncounterResponse$unlock()
#
## Below is an example to define the print function
# PokemonEncounterResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonEncounterResponse$lock()


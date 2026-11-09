#' Create a new PokemonSpeciesVariety
#'
#' @description
#' PokemonSpeciesVariety Class
#'
#' @docType class
#' @title PokemonSpeciesVariety
#' @description PokemonSpeciesVariety Class
#' @format An \code{R6Class} generator object
#' @field is_default Whether this variety is the default variety. character
#' @field pokemon The Pokémon variety. \link{PokemonSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonSpeciesVariety <- R6::R6Class(
  "PokemonSpeciesVariety",
  public = list(
    `is_default` = NULL,
    `pokemon` = NULL,

    #' @description
    #' Initialize a new PokemonSpeciesVariety class.
    #'
    #' @param is_default Whether this variety is the default variety.
    #' @param pokemon The Pokémon variety.
    #' @param ... Other optional arguments.
    initialize = function(`is_default`, `pokemon`, ...) {
      if (!missing(`is_default`)) {
        if (!(is.logical(`is_default`) && length(`is_default`) == 1)) {
          stop(paste("Error! Invalid data for `is_default`. Must be a boolean:", `is_default`))
        }
        self$`is_default` <- `is_default`
      }
      if (!missing(`pokemon`)) {
        stopifnot(R6::is.R6(`pokemon`))
        self$`pokemon` <- `pokemon`
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
    #' @return PokemonSpeciesVariety as a base R list.
    #' @examples
    #' # convert array of PokemonSpeciesVariety (x) to a data frame
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
    #' Convert PokemonSpeciesVariety to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonSpeciesVarietyObject <- list()
      if (!is.null(self$`is_default`)) {
        PokemonSpeciesVarietyObject[["is_default"]] <-
          self$`is_default`
      }
      if (!is.null(self$`pokemon`)) {
        PokemonSpeciesVarietyObject[["pokemon"]] <-
          self$extractSimpleType(self$`pokemon`)
      }
      return(PokemonSpeciesVarietyObject)
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
    #' Deserialize JSON string into an instance of PokemonSpeciesVariety
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpeciesVariety
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`is_default`)) {
        self$`is_default` <- this_object$`is_default`
      }
      if (!is.null(this_object$`pokemon`)) {
        `pokemon_object` <- PokemonSummary$new()
        `pokemon_object`$fromJSON(jsonlite::toJSON(this_object$`pokemon`, auto_unbox = TRUE, digits = NA))
        self$`pokemon` <- `pokemon_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonSpeciesVariety in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonSpeciesVariety
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpeciesVariety
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`is_default` <- this_object$`is_default`
      self$`pokemon` <- PokemonSummary$new()$fromJSON(jsonlite::toJSON(this_object$`pokemon`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonSpeciesVariety and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `is_default`
      if (!is.null(input_json$`is_default`)) {
        if (!(is.logical(input_json$`is_default`) && length(input_json$`is_default`) == 1)) {
          stop(paste("Error! Invalid data for `is_default`. Must be a boolean:", input_json$`is_default`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesVariety: the required field `is_default` is missing."))
      }
      # check the required field `pokemon`
      if (!is.null(input_json$`pokemon`)) {
        stopifnot(R6::is.R6(input_json$`pokemon`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpeciesVariety: the required field `pokemon` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonSpeciesVariety
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `is_default` is null
      if (is.null(self$`is_default`)) {
        return(FALSE)
      }

      # check if the required `pokemon` is null
      if (is.null(self$`pokemon`)) {
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
      # check if the required `is_default` is null
      if (is.null(self$`is_default`)) {
        invalid_fields["is_default"] <- "Non-nullable required field `is_default` cannot be null."
      }

      # check if the required `pokemon` is null
      if (is.null(self$`pokemon`)) {
        invalid_fields["pokemon"] <- "Non-nullable required field `pokemon` cannot be null."
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
# PokemonSpeciesVariety$unlock()
#
## Below is an example to define the print function
# PokemonSpeciesVariety$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonSpeciesVariety$lock()


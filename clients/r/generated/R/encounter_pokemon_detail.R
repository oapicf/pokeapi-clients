#' Create a new EncounterPokemonDetail
#'
#' @description
#' EncounterPokemonDetail Class
#'
#' @docType class
#' @title EncounterPokemonDetail
#' @description EncounterPokemonDetail Class
#' @format An \code{R6Class} generator object
#' @field min_perfect_ivs The minimum number of perfect IVs, or null if unspecified. integer [optional]
#' @field always_shiny Whether the encountered Pokémon is always shiny. character [optional]
#' @field never_shiny Whether the encountered Pokémon can never be shiny. character [optional]
#' @field is_alpha Whether the encountered Pokémon is an alpha Pokémon. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EncounterPokemonDetail <- R6::R6Class(
  "EncounterPokemonDetail",
  public = list(
    `min_perfect_ivs` = NULL,
    `always_shiny` = NULL,
    `never_shiny` = NULL,
    `is_alpha` = NULL,

    #' @description
    #' Initialize a new EncounterPokemonDetail class.
    #'
    #' @param min_perfect_ivs The minimum number of perfect IVs, or null if unspecified.
    #' @param always_shiny Whether the encountered Pokémon is always shiny.
    #' @param never_shiny Whether the encountered Pokémon can never be shiny.
    #' @param is_alpha Whether the encountered Pokémon is an alpha Pokémon.
    #' @param ... Other optional arguments.
    initialize = function(`min_perfect_ivs` = NULL, `always_shiny` = NULL, `never_shiny` = NULL, `is_alpha` = NULL, ...) {
      if (!is.null(`min_perfect_ivs`)) {
        if (!(is.numeric(`min_perfect_ivs`) && length(`min_perfect_ivs`) == 1)) {
          stop(paste("Error! Invalid data for `min_perfect_ivs`. Must be an integer:", `min_perfect_ivs`))
        }
        self$`min_perfect_ivs` <- `min_perfect_ivs`
      }
      if (!is.null(`always_shiny`)) {
        if (!(is.logical(`always_shiny`) && length(`always_shiny`) == 1)) {
          stop(paste("Error! Invalid data for `always_shiny`. Must be a boolean:", `always_shiny`))
        }
        self$`always_shiny` <- `always_shiny`
      }
      if (!is.null(`never_shiny`)) {
        if (!(is.logical(`never_shiny`) && length(`never_shiny`) == 1)) {
          stop(paste("Error! Invalid data for `never_shiny`. Must be a boolean:", `never_shiny`))
        }
        self$`never_shiny` <- `never_shiny`
      }
      if (!is.null(`is_alpha`)) {
        if (!(is.logical(`is_alpha`) && length(`is_alpha`) == 1)) {
          stop(paste("Error! Invalid data for `is_alpha`. Must be a boolean:", `is_alpha`))
        }
        self$`is_alpha` <- `is_alpha`
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
    #' @return EncounterPokemonDetail as a base R list.
    #' @examples
    #' # convert array of EncounterPokemonDetail (x) to a data frame
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
    #' Convert EncounterPokemonDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      EncounterPokemonDetailObject <- list()
      if (!is.null(self$`min_perfect_ivs`)) {
        EncounterPokemonDetailObject[["min_perfect_ivs"]] <-
          self$`min_perfect_ivs`
      }
      if (!is.null(self$`always_shiny`)) {
        EncounterPokemonDetailObject[["always_shiny"]] <-
          self$`always_shiny`
      }
      if (!is.null(self$`never_shiny`)) {
        EncounterPokemonDetailObject[["never_shiny"]] <-
          self$`never_shiny`
      }
      if (!is.null(self$`is_alpha`)) {
        EncounterPokemonDetailObject[["is_alpha"]] <-
          self$`is_alpha`
      }
      return(EncounterPokemonDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of EncounterPokemonDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of EncounterPokemonDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`min_perfect_ivs`)) {
        self$`min_perfect_ivs` <- this_object$`min_perfect_ivs`
      }
      if (!is.null(this_object$`always_shiny`)) {
        self$`always_shiny` <- this_object$`always_shiny`
      }
      if (!is.null(this_object$`never_shiny`)) {
        self$`never_shiny` <- this_object$`never_shiny`
      }
      if (!is.null(this_object$`is_alpha`)) {
        self$`is_alpha` <- this_object$`is_alpha`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return EncounterPokemonDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of EncounterPokemonDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of EncounterPokemonDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`min_perfect_ivs` <- this_object$`min_perfect_ivs`
      self$`always_shiny` <- this_object$`always_shiny`
      self$`never_shiny` <- this_object$`never_shiny`
      self$`is_alpha` <- this_object$`is_alpha`
      self
    },

    #' @description
    #' Validate JSON input with respect to EncounterPokemonDetail and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of EncounterPokemonDetail
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (self$`min_perfect_ivs` > 2147483647) {
        return(FALSE)
      }
      if (self$`min_perfect_ivs` < -2147483648) {
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
      if (self$`min_perfect_ivs` > 2147483647) {
        invalid_fields["min_perfect_ivs"] <- "Invalid value for `min_perfect_ivs`, must be smaller than or equal to 2147483647."
      }
      if (self$`min_perfect_ivs` < -2147483648) {
        invalid_fields["min_perfect_ivs"] <- "Invalid value for `min_perfect_ivs`, must be bigger than or equal to -2147483648."
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
# EncounterPokemonDetail$unlock()
#
## Below is an example to define the print function
# EncounterPokemonDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# EncounterPokemonDetail$lock()


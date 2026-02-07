#' Create a new GenderDetailPokemonSpeciesDetailsInner
#'
#' @description
#' GenderDetailPokemonSpeciesDetailsInner Class
#'
#' @docType class
#' @title GenderDetailPokemonSpeciesDetailsInner
#' @description GenderDetailPokemonSpeciesDetailsInner Class
#' @format An \code{R6Class} generator object
#' @field rate  integer
#' @field pokemon_species  \link{AbilityDetailPokemonInnerPokemon}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenderDetailPokemonSpeciesDetailsInner <- R6::R6Class(
  "GenderDetailPokemonSpeciesDetailsInner",
  public = list(
    `rate` = NULL,
    `pokemon_species` = NULL,

    #' @description
    #' Initialize a new GenderDetailPokemonSpeciesDetailsInner class.
    #'
    #' @param rate rate
    #' @param pokemon_species pokemon_species
    #' @param ... Other optional arguments.
    initialize = function(`rate`, `pokemon_species`, ...) {
      if (!missing(`rate`)) {
        if (!(is.numeric(`rate`) && length(`rate`) == 1)) {
          stop(paste("Error! Invalid data for `rate`. Must be an integer:", `rate`))
        }
        self$`rate` <- `rate`
      }
      if (!missing(`pokemon_species`)) {
        stopifnot(R6::is.R6(`pokemon_species`))
        self$`pokemon_species` <- `pokemon_species`
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
    #' @return GenderDetailPokemonSpeciesDetailsInner as a base R list.
    #' @examples
    #' # convert array of GenderDetailPokemonSpeciesDetailsInner (x) to a data frame
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
    #' Convert GenderDetailPokemonSpeciesDetailsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      GenderDetailPokemonSpeciesDetailsInnerObject <- list()
      if (!is.null(self$`rate`)) {
        GenderDetailPokemonSpeciesDetailsInnerObject[["rate"]] <-
          self$`rate`
      }
      if (!is.null(self$`pokemon_species`)) {
        GenderDetailPokemonSpeciesDetailsInnerObject[["pokemon_species"]] <-
          self$`pokemon_species`$toSimpleType()
      }
      return(GenderDetailPokemonSpeciesDetailsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of GenderDetailPokemonSpeciesDetailsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenderDetailPokemonSpeciesDetailsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`rate`)) {
        self$`rate` <- this_object$`rate`
      }
      if (!is.null(this_object$`pokemon_species`)) {
        `pokemon_species_object` <- AbilityDetailPokemonInnerPokemon$new()
        `pokemon_species_object`$fromJSON(jsonlite::toJSON(this_object$`pokemon_species`, auto_unbox = TRUE, digits = NA))
        self$`pokemon_species` <- `pokemon_species_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return GenderDetailPokemonSpeciesDetailsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of GenderDetailPokemonSpeciesDetailsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenderDetailPokemonSpeciesDetailsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`rate` <- this_object$`rate`
      self$`pokemon_species` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`pokemon_species`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to GenderDetailPokemonSpeciesDetailsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `rate`
      if (!is.null(input_json$`rate`)) {
        if (!(is.numeric(input_json$`rate`) && length(input_json$`rate`) == 1)) {
          stop(paste("Error! Invalid data for `rate`. Must be an integer:", input_json$`rate`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenderDetailPokemonSpeciesDetailsInner: the required field `rate` is missing."))
      }
      # check the required field `pokemon_species`
      if (!is.null(input_json$`pokemon_species`)) {
        stopifnot(R6::is.R6(input_json$`pokemon_species`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenderDetailPokemonSpeciesDetailsInner: the required field `pokemon_species` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenderDetailPokemonSpeciesDetailsInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `rate` is null
      if (is.null(self$`rate`)) {
        return(FALSE)
      }

      # check if the required `pokemon_species` is null
      if (is.null(self$`pokemon_species`)) {
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
      # check if the required `rate` is null
      if (is.null(self$`rate`)) {
        invalid_fields["rate"] <- "Non-nullable required field `rate` cannot be null."
      }

      # check if the required `pokemon_species` is null
      if (is.null(self$`pokemon_species`)) {
        invalid_fields["pokemon_species"] <- "Non-nullable required field `pokemon_species` cannot be null."
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
# GenderDetailPokemonSpeciesDetailsInner$unlock()
#
## Below is an example to define the print function
# GenderDetailPokemonSpeciesDetailsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenderDetailPokemonSpeciesDetailsInner$lock()


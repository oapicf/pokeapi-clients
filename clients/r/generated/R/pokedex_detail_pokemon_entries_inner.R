#' Create a new PokedexDetailPokemonEntriesInner
#'
#' @description
#' PokedexDetailPokemonEntriesInner Class
#'
#' @docType class
#' @title PokedexDetailPokemonEntriesInner
#' @description PokedexDetailPokemonEntriesInner Class
#' @format An \code{R6Class} generator object
#' @field entry_number  integer
#' @field pokemon_species  \link{AbilityDetailPokemonInnerPokemon}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokedexDetailPokemonEntriesInner <- R6::R6Class(
  "PokedexDetailPokemonEntriesInner",
  public = list(
    `entry_number` = NULL,
    `pokemon_species` = NULL,

    #' @description
    #' Initialize a new PokedexDetailPokemonEntriesInner class.
    #'
    #' @param entry_number entry_number
    #' @param pokemon_species pokemon_species
    #' @param ... Other optional arguments.
    initialize = function(`entry_number`, `pokemon_species`, ...) {
      if (!missing(`entry_number`)) {
        if (!(is.numeric(`entry_number`) && length(`entry_number`) == 1)) {
          stop(paste("Error! Invalid data for `entry_number`. Must be an integer:", `entry_number`))
        }
        self$`entry_number` <- `entry_number`
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
    #' @return PokedexDetailPokemonEntriesInner as a base R list.
    #' @examples
    #' # convert array of PokedexDetailPokemonEntriesInner (x) to a data frame
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
    #' Convert PokedexDetailPokemonEntriesInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokedexDetailPokemonEntriesInnerObject <- list()
      if (!is.null(self$`entry_number`)) {
        PokedexDetailPokemonEntriesInnerObject[["entry_number"]] <-
          self$`entry_number`
      }
      if (!is.null(self$`pokemon_species`)) {
        PokedexDetailPokemonEntriesInnerObject[["pokemon_species"]] <-
          self$`pokemon_species`$toSimpleType()
      }
      return(PokedexDetailPokemonEntriesInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokedexDetailPokemonEntriesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokedexDetailPokemonEntriesInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`entry_number`)) {
        self$`entry_number` <- this_object$`entry_number`
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
    #' @return PokedexDetailPokemonEntriesInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokedexDetailPokemonEntriesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokedexDetailPokemonEntriesInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`entry_number` <- this_object$`entry_number`
      self$`pokemon_species` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`pokemon_species`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokedexDetailPokemonEntriesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `entry_number`
      if (!is.null(input_json$`entry_number`)) {
        if (!(is.numeric(input_json$`entry_number`) && length(input_json$`entry_number`) == 1)) {
          stop(paste("Error! Invalid data for `entry_number`. Must be an integer:", input_json$`entry_number`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokedexDetailPokemonEntriesInner: the required field `entry_number` is missing."))
      }
      # check the required field `pokemon_species`
      if (!is.null(input_json$`pokemon_species`)) {
        stopifnot(R6::is.R6(input_json$`pokemon_species`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokedexDetailPokemonEntriesInner: the required field `pokemon_species` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokedexDetailPokemonEntriesInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `entry_number` is null
      if (is.null(self$`entry_number`)) {
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
      # check if the required `entry_number` is null
      if (is.null(self$`entry_number`)) {
        invalid_fields["entry_number"] <- "Non-nullable required field `entry_number` cannot be null."
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
# PokedexDetailPokemonEntriesInner$unlock()
#
## Below is an example to define the print function
# PokedexDetailPokemonEntriesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokedexDetailPokemonEntriesInner$lock()


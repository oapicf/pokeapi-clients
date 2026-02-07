#' Create a new PokemonDexEntry
#'
#' @description
#' PokemonDexEntry Class
#'
#' @docType class
#' @title PokemonDexEntry
#' @description PokemonDexEntry Class
#' @format An \code{R6Class} generator object
#' @field entry_number  integer
#' @field pokedex  \link{PokedexSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonDexEntry <- R6::R6Class(
  "PokemonDexEntry",
  public = list(
    `entry_number` = NULL,
    `pokedex` = NULL,

    #' @description
    #' Initialize a new PokemonDexEntry class.
    #'
    #' @param entry_number entry_number
    #' @param pokedex pokedex
    #' @param ... Other optional arguments.
    initialize = function(`entry_number`, `pokedex`, ...) {
      if (!missing(`entry_number`)) {
        if (!(is.numeric(`entry_number`) && length(`entry_number`) == 1)) {
          stop(paste("Error! Invalid data for `entry_number`. Must be an integer:", `entry_number`))
        }
        self$`entry_number` <- `entry_number`
      }
      if (!missing(`pokedex`)) {
        stopifnot(R6::is.R6(`pokedex`))
        self$`pokedex` <- `pokedex`
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
    #' @return PokemonDexEntry as a base R list.
    #' @examples
    #' # convert array of PokemonDexEntry (x) to a data frame
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
    #' Convert PokemonDexEntry to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonDexEntryObject <- list()
      if (!is.null(self$`entry_number`)) {
        PokemonDexEntryObject[["entry_number"]] <-
          self$`entry_number`
      }
      if (!is.null(self$`pokedex`)) {
        PokemonDexEntryObject[["pokedex"]] <-
          self$`pokedex`$toSimpleType()
      }
      return(PokemonDexEntryObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDexEntry
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDexEntry
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`entry_number`)) {
        self$`entry_number` <- this_object$`entry_number`
      }
      if (!is.null(this_object$`pokedex`)) {
        `pokedex_object` <- PokedexSummary$new()
        `pokedex_object`$fromJSON(jsonlite::toJSON(this_object$`pokedex`, auto_unbox = TRUE, digits = NA))
        self$`pokedex` <- `pokedex_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonDexEntry in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDexEntry
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDexEntry
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`entry_number` <- this_object$`entry_number`
      self$`pokedex` <- PokedexSummary$new()$fromJSON(jsonlite::toJSON(this_object$`pokedex`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonDexEntry and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for PokemonDexEntry: the required field `entry_number` is missing."))
      }
      # check the required field `pokedex`
      if (!is.null(input_json$`pokedex`)) {
        stopifnot(R6::is.R6(input_json$`pokedex`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDexEntry: the required field `pokedex` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonDexEntry
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

      # check if the required `pokedex` is null
      if (is.null(self$`pokedex`)) {
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

      # check if the required `pokedex` is null
      if (is.null(self$`pokedex`)) {
        invalid_fields["pokedex"] <- "Non-nullable required field `pokedex` cannot be null."
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
# PokemonDexEntry$unlock()
#
## Below is an example to define the print function
# PokemonDexEntry$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonDexEntry$lock()


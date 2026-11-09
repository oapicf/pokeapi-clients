#' Create a new TypePokemon
#'
#' @description
#' TypePokemon Class
#'
#' @docType class
#' @title TypePokemon
#' @description TypePokemon Class
#' @format An \code{R6Class} generator object
#' @field slot The order the Pokémon's types are listed in. integer
#' @field pokemon The Pokémon that has the referenced type. \link{PokemonSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TypePokemon <- R6::R6Class(
  "TypePokemon",
  public = list(
    `slot` = NULL,
    `pokemon` = NULL,

    #' @description
    #' Initialize a new TypePokemon class.
    #'
    #' @param slot The order the Pokémon's types are listed in.
    #' @param pokemon The Pokémon that has the referenced type.
    #' @param ... Other optional arguments.
    initialize = function(`slot`, `pokemon`, ...) {
      if (!missing(`slot`)) {
        if (!(is.numeric(`slot`) && length(`slot`) == 1)) {
          stop(paste("Error! Invalid data for `slot`. Must be an integer:", `slot`))
        }
        self$`slot` <- `slot`
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
    #' @return TypePokemon as a base R list.
    #' @examples
    #' # convert array of TypePokemon (x) to a data frame
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
    #' Convert TypePokemon to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TypePokemonObject <- list()
      if (!is.null(self$`slot`)) {
        TypePokemonObject[["slot"]] <-
          self$`slot`
      }
      if (!is.null(self$`pokemon`)) {
        TypePokemonObject[["pokemon"]] <-
          self$extractSimpleType(self$`pokemon`)
      }
      return(TypePokemonObject)
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
    #' Deserialize JSON string into an instance of TypePokemon
    #'
    #' @param input_json the JSON input
    #' @return the instance of TypePokemon
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`slot`)) {
        self$`slot` <- this_object$`slot`
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
    #' @return TypePokemon in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TypePokemon
    #'
    #' @param input_json the JSON input
    #' @return the instance of TypePokemon
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`slot` <- this_object$`slot`
      self$`pokemon` <- PokemonSummary$new()$fromJSON(jsonlite::toJSON(this_object$`pokemon`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to TypePokemon and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `slot`
      if (!is.null(input_json$`slot`)) {
        if (!(is.numeric(input_json$`slot`) && length(input_json$`slot`) == 1)) {
          stop(paste("Error! Invalid data for `slot`. Must be an integer:", input_json$`slot`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypePokemon: the required field `slot` is missing."))
      }
      # check the required field `pokemon`
      if (!is.null(input_json$`pokemon`)) {
        stopifnot(R6::is.R6(input_json$`pokemon`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypePokemon: the required field `pokemon` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TypePokemon
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `slot` is null
      if (is.null(self$`slot`)) {
        return(FALSE)
      }

      if (self$`slot` > 2147483647) {
        return(FALSE)
      }
      if (self$`slot` < -2147483648) {
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
      # check if the required `slot` is null
      if (is.null(self$`slot`)) {
        invalid_fields["slot"] <- "Non-nullable required field `slot` cannot be null."
      }

      if (self$`slot` > 2147483647) {
        invalid_fields["slot"] <- "Invalid value for `slot`, must be smaller than or equal to 2147483647."
      }
      if (self$`slot` < -2147483648) {
        invalid_fields["slot"] <- "Invalid value for `slot`, must be bigger than or equal to -2147483648."
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
# TypePokemon$unlock()
#
## Below is an example to define the print function
# TypePokemon$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TypePokemon$lock()


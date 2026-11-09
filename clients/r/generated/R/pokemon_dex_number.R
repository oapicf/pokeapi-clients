#' Create a new PokemonDexNumber
#'
#' @description
#' PokemonDexNumber Class
#'
#' @docType class
#' @title PokemonDexNumber
#' @description PokemonDexNumber Class
#' @format An \code{R6Class} generator object
#' @field entry_number The index of this Pokémon species entry within the Pokédex. integer
#' @field pokemon_species The Pokémon species being encountered. \link{PokemonSpeciesSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonDexNumber <- R6::R6Class(
  "PokemonDexNumber",
  public = list(
    `entry_number` = NULL,
    `pokemon_species` = NULL,

    #' @description
    #' Initialize a new PokemonDexNumber class.
    #'
    #' @param entry_number The index of this Pokémon species entry within the Pokédex.
    #' @param pokemon_species The Pokémon species being encountered.
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
    #' @return PokemonDexNumber as a base R list.
    #' @examples
    #' # convert array of PokemonDexNumber (x) to a data frame
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
    #' Convert PokemonDexNumber to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonDexNumberObject <- list()
      if (!is.null(self$`entry_number`)) {
        PokemonDexNumberObject[["entry_number"]] <-
          self$`entry_number`
      }
      if (!is.null(self$`pokemon_species`)) {
        PokemonDexNumberObject[["pokemon_species"]] <-
          self$extractSimpleType(self$`pokemon_species`)
      }
      return(PokemonDexNumberObject)
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
    #' Deserialize JSON string into an instance of PokemonDexNumber
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDexNumber
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`entry_number`)) {
        self$`entry_number` <- this_object$`entry_number`
      }
      if (!is.null(this_object$`pokemon_species`)) {
        `pokemon_species_object` <- PokemonSpeciesSummary$new()
        `pokemon_species_object`$fromJSON(jsonlite::toJSON(this_object$`pokemon_species`, auto_unbox = TRUE, digits = NA))
        self$`pokemon_species` <- `pokemon_species_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonDexNumber in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDexNumber
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDexNumber
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`entry_number` <- this_object$`entry_number`
      self$`pokemon_species` <- PokemonSpeciesSummary$new()$fromJSON(jsonlite::toJSON(this_object$`pokemon_species`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonDexNumber and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for PokemonDexNumber: the required field `entry_number` is missing."))
      }
      # check the required field `pokemon_species`
      if (!is.null(input_json$`pokemon_species`)) {
        stopifnot(R6::is.R6(input_json$`pokemon_species`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDexNumber: the required field `pokemon_species` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonDexNumber
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
# PokemonDexNumber$unlock()
#
## Below is an example to define the print function
# PokemonDexNumber$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonDexNumber$lock()


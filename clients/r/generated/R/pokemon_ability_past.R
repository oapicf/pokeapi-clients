#' Create a new PokemonAbilityPast
#'
#' @description
#' PokemonAbilityPast Class
#'
#' @docType class
#' @title PokemonAbilityPast
#' @description PokemonAbilityPast Class
#' @format An \code{R6Class} generator object
#' @field is_hidden Whether or not this is a hidden ability. character [optional]
#' @field slot The slot this ability occupies in this Pokémon species. integer
#' @field ability The ability the Pokémon may have. \link{AbilitySummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonAbilityPast <- R6::R6Class(
  "PokemonAbilityPast",
  public = list(
    `is_hidden` = NULL,
    `slot` = NULL,
    `ability` = NULL,

    #' @description
    #' Initialize a new PokemonAbilityPast class.
    #'
    #' @param slot The slot this ability occupies in this Pokémon species.
    #' @param ability The ability the Pokémon may have.
    #' @param is_hidden Whether or not this is a hidden ability.
    #' @param ... Other optional arguments.
    initialize = function(`slot`, `ability`, `is_hidden` = NULL, ...) {
      if (!missing(`slot`)) {
        if (!(is.numeric(`slot`) && length(`slot`) == 1)) {
          stop(paste("Error! Invalid data for `slot`. Must be an integer:", `slot`))
        }
        self$`slot` <- `slot`
      }
      if (!missing(`ability`)) {
        stopifnot(R6::is.R6(`ability`))
        self$`ability` <- `ability`
      }
      if (!is.null(`is_hidden`)) {
        if (!(is.logical(`is_hidden`) && length(`is_hidden`) == 1)) {
          stop(paste("Error! Invalid data for `is_hidden`. Must be a boolean:", `is_hidden`))
        }
        self$`is_hidden` <- `is_hidden`
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
    #' @return PokemonAbilityPast as a base R list.
    #' @examples
    #' # convert array of PokemonAbilityPast (x) to a data frame
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
    #' Convert PokemonAbilityPast to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonAbilityPastObject <- list()
      if (!is.null(self$`is_hidden`)) {
        PokemonAbilityPastObject[["is_hidden"]] <-
          self$`is_hidden`
      }
      if (!is.null(self$`slot`)) {
        PokemonAbilityPastObject[["slot"]] <-
          self$`slot`
      }
      if (!is.null(self$`ability`)) {
        PokemonAbilityPastObject[["ability"]] <-
          self$extractSimpleType(self$`ability`)
      }
      return(PokemonAbilityPastObject)
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
    #' Deserialize JSON string into an instance of PokemonAbilityPast
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonAbilityPast
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`is_hidden`)) {
        self$`is_hidden` <- this_object$`is_hidden`
      }
      if (!is.null(this_object$`slot`)) {
        self$`slot` <- this_object$`slot`
      }
      if (!is.null(this_object$`ability`)) {
        `ability_object` <- AbilitySummary$new()
        `ability_object`$fromJSON(jsonlite::toJSON(this_object$`ability`, auto_unbox = TRUE, digits = NA))
        self$`ability` <- `ability_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonAbilityPast in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonAbilityPast
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonAbilityPast
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`is_hidden` <- this_object$`is_hidden`
      self$`slot` <- this_object$`slot`
      self$`ability` <- AbilitySummary$new()$fromJSON(jsonlite::toJSON(this_object$`ability`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonAbilityPast and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for PokemonAbilityPast: the required field `slot` is missing."))
      }
      # check the required field `ability`
      if (!is.null(input_json$`ability`)) {
        stopifnot(R6::is.R6(input_json$`ability`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonAbilityPast: the required field `ability` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonAbilityPast
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
# PokemonAbilityPast$unlock()
#
## Below is an example to define the print function
# PokemonAbilityPast$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonAbilityPast$lock()


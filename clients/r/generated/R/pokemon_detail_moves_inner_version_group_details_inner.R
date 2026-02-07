#' Create a new PokemonDetailMovesInnerVersionGroupDetailsInner
#'
#' @description
#' PokemonDetailMovesInnerVersionGroupDetailsInner Class
#'
#' @docType class
#' @title PokemonDetailMovesInnerVersionGroupDetailsInner
#' @description PokemonDetailMovesInnerVersionGroupDetailsInner Class
#' @format An \code{R6Class} generator object
#' @field level_learned_at  integer
#' @field move_learn_method  \link{AbilityDetailPokemonInnerPokemon}
#' @field version_group  \link{AbilityDetailPokemonInnerPokemon}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonDetailMovesInnerVersionGroupDetailsInner <- R6::R6Class(
  "PokemonDetailMovesInnerVersionGroupDetailsInner",
  public = list(
    `level_learned_at` = NULL,
    `move_learn_method` = NULL,
    `version_group` = NULL,

    #' @description
    #' Initialize a new PokemonDetailMovesInnerVersionGroupDetailsInner class.
    #'
    #' @param level_learned_at level_learned_at
    #' @param move_learn_method move_learn_method
    #' @param version_group version_group
    #' @param ... Other optional arguments.
    initialize = function(`level_learned_at`, `move_learn_method`, `version_group`, ...) {
      if (!missing(`level_learned_at`)) {
        if (!(is.numeric(`level_learned_at`) && length(`level_learned_at`) == 1)) {
          stop(paste("Error! Invalid data for `level_learned_at`. Must be an integer:", `level_learned_at`))
        }
        self$`level_learned_at` <- `level_learned_at`
      }
      if (!missing(`move_learn_method`)) {
        stopifnot(R6::is.R6(`move_learn_method`))
        self$`move_learn_method` <- `move_learn_method`
      }
      if (!missing(`version_group`)) {
        stopifnot(R6::is.R6(`version_group`))
        self$`version_group` <- `version_group`
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
    #' @return PokemonDetailMovesInnerVersionGroupDetailsInner as a base R list.
    #' @examples
    #' # convert array of PokemonDetailMovesInnerVersionGroupDetailsInner (x) to a data frame
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
    #' Convert PokemonDetailMovesInnerVersionGroupDetailsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonDetailMovesInnerVersionGroupDetailsInnerObject <- list()
      if (!is.null(self$`level_learned_at`)) {
        PokemonDetailMovesInnerVersionGroupDetailsInnerObject[["level_learned_at"]] <-
          self$`level_learned_at`
      }
      if (!is.null(self$`move_learn_method`)) {
        PokemonDetailMovesInnerVersionGroupDetailsInnerObject[["move_learn_method"]] <-
          self$`move_learn_method`$toSimpleType()
      }
      if (!is.null(self$`version_group`)) {
        PokemonDetailMovesInnerVersionGroupDetailsInnerObject[["version_group"]] <-
          self$`version_group`$toSimpleType()
      }
      return(PokemonDetailMovesInnerVersionGroupDetailsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDetailMovesInnerVersionGroupDetailsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetailMovesInnerVersionGroupDetailsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`level_learned_at`)) {
        self$`level_learned_at` <- this_object$`level_learned_at`
      }
      if (!is.null(this_object$`move_learn_method`)) {
        `move_learn_method_object` <- AbilityDetailPokemonInnerPokemon$new()
        `move_learn_method_object`$fromJSON(jsonlite::toJSON(this_object$`move_learn_method`, auto_unbox = TRUE, digits = NA))
        self$`move_learn_method` <- `move_learn_method_object`
      }
      if (!is.null(this_object$`version_group`)) {
        `version_group_object` <- AbilityDetailPokemonInnerPokemon$new()
        `version_group_object`$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
        self$`version_group` <- `version_group_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonDetailMovesInnerVersionGroupDetailsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDetailMovesInnerVersionGroupDetailsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetailMovesInnerVersionGroupDetailsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`level_learned_at` <- this_object$`level_learned_at`
      self$`move_learn_method` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`move_learn_method`, auto_unbox = TRUE, digits = NA))
      self$`version_group` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonDetailMovesInnerVersionGroupDetailsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `level_learned_at`
      if (!is.null(input_json$`level_learned_at`)) {
        if (!(is.numeric(input_json$`level_learned_at`) && length(input_json$`level_learned_at`) == 1)) {
          stop(paste("Error! Invalid data for `level_learned_at`. Must be an integer:", input_json$`level_learned_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetailMovesInnerVersionGroupDetailsInner: the required field `level_learned_at` is missing."))
      }
      # check the required field `move_learn_method`
      if (!is.null(input_json$`move_learn_method`)) {
        stopifnot(R6::is.R6(input_json$`move_learn_method`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetailMovesInnerVersionGroupDetailsInner: the required field `move_learn_method` is missing."))
      }
      # check the required field `version_group`
      if (!is.null(input_json$`version_group`)) {
        stopifnot(R6::is.R6(input_json$`version_group`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonDetailMovesInnerVersionGroupDetailsInner: the required field `version_group` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonDetailMovesInnerVersionGroupDetailsInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `level_learned_at` is null
      if (is.null(self$`level_learned_at`)) {
        return(FALSE)
      }

      # check if the required `move_learn_method` is null
      if (is.null(self$`move_learn_method`)) {
        return(FALSE)
      }

      # check if the required `version_group` is null
      if (is.null(self$`version_group`)) {
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
      # check if the required `level_learned_at` is null
      if (is.null(self$`level_learned_at`)) {
        invalid_fields["level_learned_at"] <- "Non-nullable required field `level_learned_at` cannot be null."
      }

      # check if the required `move_learn_method` is null
      if (is.null(self$`move_learn_method`)) {
        invalid_fields["move_learn_method"] <- "Non-nullable required field `move_learn_method` cannot be null."
      }

      # check if the required `version_group` is null
      if (is.null(self$`version_group`)) {
        invalid_fields["version_group"] <- "Non-nullable required field `version_group` cannot be null."
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
# PokemonDetailMovesInnerVersionGroupDetailsInner$unlock()
#
## Below is an example to define the print function
# PokemonDetailMovesInnerVersionGroupDetailsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonDetailMovesInnerVersionGroupDetailsInner$lock()


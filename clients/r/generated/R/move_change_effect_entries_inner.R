#' Create a new MoveChangeEffectEntriesInner
#'
#' @description
#' MoveChangeEffectEntriesInner Class
#'
#' @docType class
#' @title MoveChangeEffectEntriesInner
#' @description MoveChangeEffectEntriesInner Class
#' @format An \code{R6Class} generator object
#' @field effect  character
#' @field short_effect  character
#' @field language  \link{AbilityDetailPokemonInnerPokemon}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MoveChangeEffectEntriesInner <- R6::R6Class(
  "MoveChangeEffectEntriesInner",
  public = list(
    `effect` = NULL,
    `short_effect` = NULL,
    `language` = NULL,

    #' @description
    #' Initialize a new MoveChangeEffectEntriesInner class.
    #'
    #' @param effect effect
    #' @param short_effect short_effect
    #' @param language language
    #' @param ... Other optional arguments.
    initialize = function(`effect`, `short_effect`, `language`, ...) {
      if (!missing(`effect`)) {
        if (!(is.character(`effect`) && length(`effect`) == 1)) {
          stop(paste("Error! Invalid data for `effect`. Must be a string:", `effect`))
        }
        self$`effect` <- `effect`
      }
      if (!missing(`short_effect`)) {
        if (!(is.character(`short_effect`) && length(`short_effect`) == 1)) {
          stop(paste("Error! Invalid data for `short_effect`. Must be a string:", `short_effect`))
        }
        self$`short_effect` <- `short_effect`
      }
      if (!missing(`language`)) {
        stopifnot(R6::is.R6(`language`))
        self$`language` <- `language`
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
    #' @return MoveChangeEffectEntriesInner as a base R list.
    #' @examples
    #' # convert array of MoveChangeEffectEntriesInner (x) to a data frame
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
    #' Convert MoveChangeEffectEntriesInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MoveChangeEffectEntriesInnerObject <- list()
      if (!is.null(self$`effect`)) {
        MoveChangeEffectEntriesInnerObject[["effect"]] <-
          self$`effect`
      }
      if (!is.null(self$`short_effect`)) {
        MoveChangeEffectEntriesInnerObject[["short_effect"]] <-
          self$`short_effect`
      }
      if (!is.null(self$`language`)) {
        MoveChangeEffectEntriesInnerObject[["language"]] <-
          self$`language`$toSimpleType()
      }
      return(MoveChangeEffectEntriesInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of MoveChangeEffectEntriesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveChangeEffectEntriesInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`effect`)) {
        self$`effect` <- this_object$`effect`
      }
      if (!is.null(this_object$`short_effect`)) {
        self$`short_effect` <- this_object$`short_effect`
      }
      if (!is.null(this_object$`language`)) {
        `language_object` <- AbilityDetailPokemonInnerPokemon$new()
        `language_object`$fromJSON(jsonlite::toJSON(this_object$`language`, auto_unbox = TRUE, digits = NA))
        self$`language` <- `language_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MoveChangeEffectEntriesInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MoveChangeEffectEntriesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveChangeEffectEntriesInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`effect` <- this_object$`effect`
      self$`short_effect` <- this_object$`short_effect`
      self$`language` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`language`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to MoveChangeEffectEntriesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `effect`
      if (!is.null(input_json$`effect`)) {
        if (!(is.character(input_json$`effect`) && length(input_json$`effect`) == 1)) {
          stop(paste("Error! Invalid data for `effect`. Must be a string:", input_json$`effect`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveChangeEffectEntriesInner: the required field `effect` is missing."))
      }
      # check the required field `short_effect`
      if (!is.null(input_json$`short_effect`)) {
        if (!(is.character(input_json$`short_effect`) && length(input_json$`short_effect`) == 1)) {
          stop(paste("Error! Invalid data for `short_effect`. Must be a string:", input_json$`short_effect`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveChangeEffectEntriesInner: the required field `short_effect` is missing."))
      }
      # check the required field `language`
      if (!is.null(input_json$`language`)) {
        stopifnot(R6::is.R6(input_json$`language`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveChangeEffectEntriesInner: the required field `language` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MoveChangeEffectEntriesInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `effect` is null
      if (is.null(self$`effect`)) {
        return(FALSE)
      }

      # check if the required `short_effect` is null
      if (is.null(self$`short_effect`)) {
        return(FALSE)
      }

      # check if the required `language` is null
      if (is.null(self$`language`)) {
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
      # check if the required `effect` is null
      if (is.null(self$`effect`)) {
        invalid_fields["effect"] <- "Non-nullable required field `effect` cannot be null."
      }

      # check if the required `short_effect` is null
      if (is.null(self$`short_effect`)) {
        invalid_fields["short_effect"] <- "Non-nullable required field `short_effect` cannot be null."
      }

      # check if the required `language` is null
      if (is.null(self$`language`)) {
        invalid_fields["language"] <- "Non-nullable required field `language` cannot be null."
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
# MoveChangeEffectEntriesInner$unlock()
#
## Below is an example to define the print function
# MoveChangeEffectEntriesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MoveChangeEffectEntriesInner$lock()


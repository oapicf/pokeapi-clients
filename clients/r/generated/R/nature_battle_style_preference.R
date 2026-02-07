#' Create a new NatureBattleStylePreference
#'
#' @description
#' NatureBattleStylePreference Class
#'
#' @docType class
#' @title NatureBattleStylePreference
#' @description NatureBattleStylePreference Class
#' @format An \code{R6Class} generator object
#' @field low_hp_preference  integer
#' @field high_hp_preference  integer
#' @field move_battle_style  \link{MoveBattleStyleSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
NatureBattleStylePreference <- R6::R6Class(
  "NatureBattleStylePreference",
  public = list(
    `low_hp_preference` = NULL,
    `high_hp_preference` = NULL,
    `move_battle_style` = NULL,

    #' @description
    #' Initialize a new NatureBattleStylePreference class.
    #'
    #' @param low_hp_preference low_hp_preference
    #' @param high_hp_preference high_hp_preference
    #' @param move_battle_style move_battle_style
    #' @param ... Other optional arguments.
    initialize = function(`low_hp_preference`, `high_hp_preference`, `move_battle_style`, ...) {
      if (!missing(`low_hp_preference`)) {
        if (!(is.numeric(`low_hp_preference`) && length(`low_hp_preference`) == 1)) {
          stop(paste("Error! Invalid data for `low_hp_preference`. Must be an integer:", `low_hp_preference`))
        }
        self$`low_hp_preference` <- `low_hp_preference`
      }
      if (!missing(`high_hp_preference`)) {
        if (!(is.numeric(`high_hp_preference`) && length(`high_hp_preference`) == 1)) {
          stop(paste("Error! Invalid data for `high_hp_preference`. Must be an integer:", `high_hp_preference`))
        }
        self$`high_hp_preference` <- `high_hp_preference`
      }
      if (!missing(`move_battle_style`)) {
        stopifnot(R6::is.R6(`move_battle_style`))
        self$`move_battle_style` <- `move_battle_style`
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
    #' @return NatureBattleStylePreference as a base R list.
    #' @examples
    #' # convert array of NatureBattleStylePreference (x) to a data frame
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
    #' Convert NatureBattleStylePreference to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      NatureBattleStylePreferenceObject <- list()
      if (!is.null(self$`low_hp_preference`)) {
        NatureBattleStylePreferenceObject[["low_hp_preference"]] <-
          self$`low_hp_preference`
      }
      if (!is.null(self$`high_hp_preference`)) {
        NatureBattleStylePreferenceObject[["high_hp_preference"]] <-
          self$`high_hp_preference`
      }
      if (!is.null(self$`move_battle_style`)) {
        NatureBattleStylePreferenceObject[["move_battle_style"]] <-
          self$`move_battle_style`$toSimpleType()
      }
      return(NatureBattleStylePreferenceObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of NatureBattleStylePreference
    #'
    #' @param input_json the JSON input
    #' @return the instance of NatureBattleStylePreference
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`low_hp_preference`)) {
        self$`low_hp_preference` <- this_object$`low_hp_preference`
      }
      if (!is.null(this_object$`high_hp_preference`)) {
        self$`high_hp_preference` <- this_object$`high_hp_preference`
      }
      if (!is.null(this_object$`move_battle_style`)) {
        `move_battle_style_object` <- MoveBattleStyleSummary$new()
        `move_battle_style_object`$fromJSON(jsonlite::toJSON(this_object$`move_battle_style`, auto_unbox = TRUE, digits = NA))
        self$`move_battle_style` <- `move_battle_style_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return NatureBattleStylePreference in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of NatureBattleStylePreference
    #'
    #' @param input_json the JSON input
    #' @return the instance of NatureBattleStylePreference
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`low_hp_preference` <- this_object$`low_hp_preference`
      self$`high_hp_preference` <- this_object$`high_hp_preference`
      self$`move_battle_style` <- MoveBattleStyleSummary$new()$fromJSON(jsonlite::toJSON(this_object$`move_battle_style`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to NatureBattleStylePreference and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `low_hp_preference`
      if (!is.null(input_json$`low_hp_preference`)) {
        if (!(is.numeric(input_json$`low_hp_preference`) && length(input_json$`low_hp_preference`) == 1)) {
          stop(paste("Error! Invalid data for `low_hp_preference`. Must be an integer:", input_json$`low_hp_preference`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for NatureBattleStylePreference: the required field `low_hp_preference` is missing."))
      }
      # check the required field `high_hp_preference`
      if (!is.null(input_json$`high_hp_preference`)) {
        if (!(is.numeric(input_json$`high_hp_preference`) && length(input_json$`high_hp_preference`) == 1)) {
          stop(paste("Error! Invalid data for `high_hp_preference`. Must be an integer:", input_json$`high_hp_preference`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for NatureBattleStylePreference: the required field `high_hp_preference` is missing."))
      }
      # check the required field `move_battle_style`
      if (!is.null(input_json$`move_battle_style`)) {
        stopifnot(R6::is.R6(input_json$`move_battle_style`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for NatureBattleStylePreference: the required field `move_battle_style` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of NatureBattleStylePreference
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `low_hp_preference` is null
      if (is.null(self$`low_hp_preference`)) {
        return(FALSE)
      }

      # check if the required `high_hp_preference` is null
      if (is.null(self$`high_hp_preference`)) {
        return(FALSE)
      }

      # check if the required `move_battle_style` is null
      if (is.null(self$`move_battle_style`)) {
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
      # check if the required `low_hp_preference` is null
      if (is.null(self$`low_hp_preference`)) {
        invalid_fields["low_hp_preference"] <- "Non-nullable required field `low_hp_preference` cannot be null."
      }

      # check if the required `high_hp_preference` is null
      if (is.null(self$`high_hp_preference`)) {
        invalid_fields["high_hp_preference"] <- "Non-nullable required field `high_hp_preference` cannot be null."
      }

      # check if the required `move_battle_style` is null
      if (is.null(self$`move_battle_style`)) {
        invalid_fields["move_battle_style"] <- "Non-nullable required field `move_battle_style` cannot be null."
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
# NatureBattleStylePreference$unlock()
#
## Below is an example to define the print function
# NatureBattleStylePreference$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# NatureBattleStylePreference$lock()


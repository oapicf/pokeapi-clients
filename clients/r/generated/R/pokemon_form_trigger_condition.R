#' Create a new PokemonFormTriggerCondition
#'
#' @description
#' PokemonFormTriggerCondition Class
#'
#' @docType class
#' @title PokemonFormTriggerCondition
#' @description PokemonFormTriggerCondition Class
#' @format An \code{R6Class} generator object
#' @field trigger The trigger for this form change. character
#' @field name The name of the required item, ability, or move. Only present for a resource-based trigger. character [optional]
#' @field url The URL of the required item, ability, or move. Only present for a resource-based trigger. character [optional]
#' @field base_form The required base form. Only present when the trigger specifies one. \link{PokemonFormSummary} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonFormTriggerCondition <- R6::R6Class(
  "PokemonFormTriggerCondition",
  public = list(
    `trigger` = NULL,
    `name` = NULL,
    `url` = NULL,
    `base_form` = NULL,

    #' @description
    #' Initialize a new PokemonFormTriggerCondition class.
    #'
    #' @param trigger The trigger for this form change.
    #' @param name The name of the required item, ability, or move. Only present for a resource-based trigger.
    #' @param url The URL of the required item, ability, or move. Only present for a resource-based trigger.
    #' @param base_form The required base form. Only present when the trigger specifies one.
    #' @param ... Other optional arguments.
    initialize = function(`trigger`, `name` = NULL, `url` = NULL, `base_form` = NULL, ...) {
      if (!missing(`trigger`)) {
        if (!(is.character(`trigger`) && length(`trigger`) == 1)) {
          stop(paste("Error! Invalid data for `trigger`. Must be a string:", `trigger`))
        }
        self$`trigger` <- `trigger`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(`url`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `url`. Must be a URL:", `url`))
        }
        self$`url` <- `url`
      }
      if (!is.null(`base_form`)) {
        stopifnot(R6::is.R6(`base_form`))
        self$`base_form` <- `base_form`
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
    #' @return PokemonFormTriggerCondition as a base R list.
    #' @examples
    #' # convert array of PokemonFormTriggerCondition (x) to a data frame
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
    #' Convert PokemonFormTriggerCondition to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonFormTriggerConditionObject <- list()
      if (!is.null(self$`trigger`)) {
        PokemonFormTriggerConditionObject[["trigger"]] <-
          self$`trigger`
      }
      if (!is.null(self$`name`)) {
        PokemonFormTriggerConditionObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`url`)) {
        PokemonFormTriggerConditionObject[["url"]] <-
          self$`url`
      }
      if (!is.null(self$`base_form`)) {
        PokemonFormTriggerConditionObject[["base_form"]] <-
          self$extractSimpleType(self$`base_form`)
      }
      return(PokemonFormTriggerConditionObject)
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
    #' Deserialize JSON string into an instance of PokemonFormTriggerCondition
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonFormTriggerCondition
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`trigger`)) {
        self$`trigger` <- this_object$`trigger`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`url`)) {
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(this_object$`url`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `url`. Must be a URL:", this_object$`url`))
        }
        self$`url` <- this_object$`url`
      }
      if (!is.null(this_object$`base_form`)) {
        `base_form_object` <- PokemonFormSummary$new()
        `base_form_object`$fromJSON(jsonlite::toJSON(this_object$`base_form`, auto_unbox = TRUE, digits = NA))
        self$`base_form` <- `base_form_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonFormTriggerCondition in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonFormTriggerCondition
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonFormTriggerCondition
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`trigger` <- this_object$`trigger`
      self$`name` <- this_object$`name`
      # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
      if (!stringr::str_detect(this_object$`url`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
        stop(paste("Error! Invalid data for `url`. Must be a URL:", this_object$`url`))
      }
      self$`url` <- this_object$`url`
      self$`base_form` <- PokemonFormSummary$new()$fromJSON(jsonlite::toJSON(this_object$`base_form`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonFormTriggerCondition and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `trigger`
      if (!is.null(input_json$`trigger`)) {
        if (!(is.character(input_json$`trigger`) && length(input_json$`trigger`) == 1)) {
          stop(paste("Error! Invalid data for `trigger`. Must be a string:", input_json$`trigger`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonFormTriggerCondition: the required field `trigger` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonFormTriggerCondition
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `trigger` is null
      if (is.null(self$`trigger`)) {
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
      # check if the required `trigger` is null
      if (is.null(self$`trigger`)) {
        invalid_fields["trigger"] <- "Non-nullable required field `trigger` cannot be null."
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
# PokemonFormTriggerCondition$unlock()
#
## Below is an example to define the print function
# PokemonFormTriggerCondition$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonFormTriggerCondition$lock()


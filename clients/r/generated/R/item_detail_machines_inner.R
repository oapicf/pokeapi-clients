#' Create a new ItemDetailMachinesInner
#'
#' @description
#' ItemDetailMachinesInner Class
#'
#' @docType class
#' @title ItemDetailMachinesInner
#' @description ItemDetailMachinesInner Class
#' @format An \code{R6Class} generator object
#' @field machine  character
#' @field version_group  \link{AbilityDetailPokemonInnerPokemon}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemDetailMachinesInner <- R6::R6Class(
  "ItemDetailMachinesInner",
  public = list(
    `machine` = NULL,
    `version_group` = NULL,

    #' @description
    #' Initialize a new ItemDetailMachinesInner class.
    #'
    #' @param machine machine
    #' @param version_group version_group
    #' @param ... Other optional arguments.
    initialize = function(`machine`, `version_group`, ...) {
      if (!missing(`machine`)) {
        if (!(is.character(`machine`) && length(`machine`) == 1)) {
          stop(paste("Error! Invalid data for `machine`. Must be a string:", `machine`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(`machine`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `machine`. Must be a URL:", `machine`))
        }
        self$`machine` <- `machine`
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
    #' @return ItemDetailMachinesInner as a base R list.
    #' @examples
    #' # convert array of ItemDetailMachinesInner (x) to a data frame
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
    #' Convert ItemDetailMachinesInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ItemDetailMachinesInnerObject <- list()
      if (!is.null(self$`machine`)) {
        ItemDetailMachinesInnerObject[["machine"]] <-
          self$`machine`
      }
      if (!is.null(self$`version_group`)) {
        ItemDetailMachinesInnerObject[["version_group"]] <-
          self$`version_group`$toSimpleType()
      }
      return(ItemDetailMachinesInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemDetailMachinesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemDetailMachinesInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`machine`)) {
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(this_object$`machine`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `machine`. Must be a URL:", this_object$`machine`))
        }
        self$`machine` <- this_object$`machine`
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
    #' @return ItemDetailMachinesInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemDetailMachinesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemDetailMachinesInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
      if (!stringr::str_detect(this_object$`machine`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
        stop(paste("Error! Invalid data for `machine`. Must be a URL:", this_object$`machine`))
      }
      self$`machine` <- this_object$`machine`
      self$`version_group` <- AbilityDetailPokemonInnerPokemon$new()$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ItemDetailMachinesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `machine`
      if (!is.null(input_json$`machine`)) {
        if (!(is.character(input_json$`machine`) && length(input_json$`machine`) == 1)) {
          stop(paste("Error! Invalid data for `machine`. Must be a string:", input_json$`machine`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(input_json$`machine`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `machine`. Must be a URL:", input_json$`machine`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemDetailMachinesInner: the required field `machine` is missing."))
      }
      # check the required field `version_group`
      if (!is.null(input_json$`version_group`)) {
        stopifnot(R6::is.R6(input_json$`version_group`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemDetailMachinesInner: the required field `version_group` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ItemDetailMachinesInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `machine` is null
      if (is.null(self$`machine`)) {
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
      # check if the required `machine` is null
      if (is.null(self$`machine`)) {
        invalid_fields["machine"] <- "Non-nullable required field `machine` cannot be null."
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
# ItemDetailMachinesInner$unlock()
#
## Below is an example to define the print function
# ItemDetailMachinesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ItemDetailMachinesInner$lock()


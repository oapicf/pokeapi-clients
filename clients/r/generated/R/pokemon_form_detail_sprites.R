#' Create a new PokemonFormDetailSprites
#'
#' @description
#' PokemonFormDetailSprites Class
#'
#' @docType class
#' @title PokemonFormDetailSprites
#' @description PokemonFormDetailSprites Class
#' @format An \code{R6Class} generator object
#' @field default  character [optional]
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonFormDetailSprites <- R6::R6Class(
  "PokemonFormDetailSprites",
  inherit = character,
  public = list(
    `default` = NULL,
    `_field_list` = c("default"),
    `additional_properties` = list(),

    #' @description
    #' Initialize a new PokemonFormDetailSprites class.
    #'
    #' @param default default
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    initialize = function(`default` = NULL, additional_properties = NULL, ...) {
      if (!is.null(`default`)) {
        if (!(is.character(`default`) && length(`default`) == 1)) {
          stop(paste("Error! Invalid data for `default`. Must be a string:", `default`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(`default`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `default`. Must be a URL:", `default`))
        }
        self$`default` <- `default`
      }
      if (!is.null(additional_properties)) {
        for (key in names(additional_properties)) {
          self$additional_properties[[key]] <- additional_properties[[key]]
        }
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
    #' @return PokemonFormDetailSprites as a base R list.
    #' @examples
    #' # convert array of PokemonFormDetailSprites (x) to a data frame
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
    #' Convert PokemonFormDetailSprites to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonFormDetailSpritesObject <- list()
      if (!is.null(self$`default`)) {
        PokemonFormDetailSpritesObject[["default"]] <-
          self$`default`
      }
      for (key in names(self$additional_properties)) {
        PokemonFormDetailSpritesObject[[key]] <- self$additional_properties[[key]]
      }

      return(PokemonFormDetailSpritesObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonFormDetailSprites
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonFormDetailSprites
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`default`)) {
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(this_object$`default`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `default`. Must be a URL:", this_object$`default`))
        }
        self$`default` <- this_object$`default`
      }
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonFormDetailSprites in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      for (key in names(self$additional_properties)) {
        simple[[key]] <- self$additional_properties[[key]]
      }
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonFormDetailSprites
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonFormDetailSprites
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
      if (!stringr::str_detect(this_object$`default`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
        stop(paste("Error! Invalid data for `default`. Must be a URL:", this_object$`default`))
      }
      self$`default` <- this_object$`default`
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonFormDetailSprites and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonFormDetailSprites
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# PokemonFormDetailSprites$unlock()
#
## Below is an example to define the print function
# PokemonFormDetailSprites$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonFormDetailSprites$lock()


#' Create a new PokemonDetailSprites
#'
#' @description
#' PokemonDetailSprites Class
#'
#' @docType class
#' @title PokemonDetailSprites
#' @description PokemonDetailSprites Class
#' @format An \code{R6Class} generator object
#' @field front_default  character [optional]
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonDetailSprites <- R6::R6Class(
  "PokemonDetailSprites",
  inherit = character,
  public = list(
    `front_default` = NULL,
    `_field_list` = c("front_default"),
    `additional_properties` = list(),

    #' @description
    #' Initialize a new PokemonDetailSprites class.
    #'
    #' @param front_default front_default
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    initialize = function(`front_default` = NULL, additional_properties = NULL, ...) {
      if (!is.null(`front_default`)) {
        if (!(is.character(`front_default`) && length(`front_default`) == 1)) {
          stop(paste("Error! Invalid data for `front_default`. Must be a string:", `front_default`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(`front_default`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `front_default`. Must be a URL:", `front_default`))
        }
        self$`front_default` <- `front_default`
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
    #' @return PokemonDetailSprites as a base R list.
    #' @examples
    #' # convert array of PokemonDetailSprites (x) to a data frame
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
    #' Convert PokemonDetailSprites to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonDetailSpritesObject <- list()
      if (!is.null(self$`front_default`)) {
        PokemonDetailSpritesObject[["front_default"]] <-
          self$`front_default`
      }
      for (key in names(self$additional_properties)) {
        PokemonDetailSpritesObject[[key]] <- self$additional_properties[[key]]
      }

      return(PokemonDetailSpritesObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDetailSprites
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetailSprites
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`front_default`)) {
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(this_object$`front_default`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `front_default`. Must be a URL:", this_object$`front_default`))
        }
        self$`front_default` <- this_object$`front_default`
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
    #' @return PokemonDetailSprites in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      for (key in names(self$additional_properties)) {
        simple[[key]] <- self$additional_properties[[key]]
      }
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonDetailSprites
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonDetailSprites
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
      if (!stringr::str_detect(this_object$`front_default`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
        stop(paste("Error! Invalid data for `front_default`. Must be a URL:", this_object$`front_default`))
      }
      self$`front_default` <- this_object$`front_default`
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonDetailSprites and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonDetailSprites
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
# PokemonDetailSprites$unlock()
#
## Below is an example to define the print function
# PokemonDetailSprites$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonDetailSprites$lock()


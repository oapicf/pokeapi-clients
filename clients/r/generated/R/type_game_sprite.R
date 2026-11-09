#' Create a new TypeGameSprite
#'
#' @description
#' TypeGameSprite Class
#'
#' @docType class
#' @title TypeGameSprite
#' @description TypeGameSprite Class
#' @format An \code{R6Class} generator object
#' @field name_icon The URL of the icon displaying the type name in this game, or null if unavailable. character [optional]
#' @field symbol_icon The URL of the type symbol icon in this game, or null if unavailable. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TypeGameSprite <- R6::R6Class(
  "TypeGameSprite",
  public = list(
    `name_icon` = NULL,
    `symbol_icon` = NULL,

    #' @description
    #' Initialize a new TypeGameSprite class.
    #'
    #' @param name_icon The URL of the icon displaying the type name in this game, or null if unavailable.
    #' @param symbol_icon The URL of the type symbol icon in this game, or null if unavailable.
    #' @param ... Other optional arguments.
    initialize = function(`name_icon` = NULL, `symbol_icon` = NULL, ...) {
      if (!is.null(`name_icon`)) {
        if (!(is.character(`name_icon`) && length(`name_icon`) == 1)) {
          stop(paste("Error! Invalid data for `name_icon`. Must be a string:", `name_icon`))
        }
        self$`name_icon` <- `name_icon`
      }
      if (!is.null(`symbol_icon`)) {
        if (!(is.character(`symbol_icon`) && length(`symbol_icon`) == 1)) {
          stop(paste("Error! Invalid data for `symbol_icon`. Must be a string:", `symbol_icon`))
        }
        self$`symbol_icon` <- `symbol_icon`
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
    #' @return TypeGameSprite as a base R list.
    #' @examples
    #' # convert array of TypeGameSprite (x) to a data frame
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
    #' Convert TypeGameSprite to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TypeGameSpriteObject <- list()
      if (!is.null(self$`name_icon`)) {
        TypeGameSpriteObject[["name_icon"]] <-
          self$`name_icon`
      }
      if (!is.null(self$`symbol_icon`)) {
        TypeGameSpriteObject[["symbol_icon"]] <-
          self$`symbol_icon`
      }
      return(TypeGameSpriteObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TypeGameSprite
    #'
    #' @param input_json the JSON input
    #' @return the instance of TypeGameSprite
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name_icon`)) {
        self$`name_icon` <- this_object$`name_icon`
      }
      if (!is.null(this_object$`symbol_icon`)) {
        self$`symbol_icon` <- this_object$`symbol_icon`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TypeGameSprite in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TypeGameSprite
    #'
    #' @param input_json the JSON input
    #' @return the instance of TypeGameSprite
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name_icon` <- this_object$`name_icon`
      self$`symbol_icon` <- this_object$`symbol_icon`
      self
    },

    #' @description
    #' Validate JSON input with respect to TypeGameSprite and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TypeGameSprite
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
# TypeGameSprite$unlock()
#
## Below is an example to define the print function
# TypeGameSprite$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TypeGameSprite$lock()


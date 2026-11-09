#' Create a new PokemonSpritesOtherOfficialArtwork
#'
#' @description
#' PokemonSpritesOtherOfficialArtwork Class
#'
#' @docType class
#' @title PokemonSpritesOtherOfficialArtwork
#' @description PokemonSpritesOtherOfficialArtwork Class
#' @format An \code{R6Class} generator object
#' @field front_default The URL of the default front official artwork, or null if unavailable. character
#' @field front_shiny The URL of the shiny front official artwork, or null if unavailable. character
#' @field versions Additional official artwork grouped by version. Available keys vary by resource. named list(named list(\link{AnyType})) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonSpritesOtherOfficialArtwork <- R6::R6Class(
  "PokemonSpritesOtherOfficialArtwork",
  public = list(
    `front_default` = NULL,
    `front_shiny` = NULL,
    `versions` = NULL,

    #' @description
    #' Initialize a new PokemonSpritesOtherOfficialArtwork class.
    #'
    #' @param front_default The URL of the default front official artwork, or null if unavailable.
    #' @param front_shiny The URL of the shiny front official artwork, or null if unavailable.
    #' @param versions Additional official artwork grouped by version. Available keys vary by resource.
    #' @param ... Other optional arguments.
    initialize = function(`front_default`, `front_shiny`, `versions` = NULL, ...) {
      if (!missing(`front_default`)) {
        if (!(is.character(`front_default`) && length(`front_default`) == 1)) {
          stop(paste("Error! Invalid data for `front_default`. Must be a string:", `front_default`))
        }
        self$`front_default` <- `front_default`
      }
      if (!missing(`front_shiny`)) {
        if (!(is.character(`front_shiny`) && length(`front_shiny`) == 1)) {
          stop(paste("Error! Invalid data for `front_shiny`. Must be a string:", `front_shiny`))
        }
        self$`front_shiny` <- `front_shiny`
      }
      if (!is.null(`versions`)) {
        stopifnot(is.vector(`versions`), length(`versions`) != 0)
        sapply(`versions`, function(x) stopifnot(R6::is.R6(x)))
        self$`versions` <- `versions`
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
    #' @return PokemonSpritesOtherOfficialArtwork as a base R list.
    #' @examples
    #' # convert array of PokemonSpritesOtherOfficialArtwork (x) to a data frame
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
    #' Convert PokemonSpritesOtherOfficialArtwork to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonSpritesOtherOfficialArtworkObject <- list()
      if (!is.null(self$`front_default`)) {
        PokemonSpritesOtherOfficialArtworkObject[["front_default"]] <-
          self$`front_default`
      }
      if (!is.null(self$`front_shiny`)) {
        PokemonSpritesOtherOfficialArtworkObject[["front_shiny"]] <-
          self$`front_shiny`
      }
      if (!is.null(self$`versions`)) {
        PokemonSpritesOtherOfficialArtworkObject[["versions"]] <-
          self$extractSimpleType(self$`versions`)
      }
      return(PokemonSpritesOtherOfficialArtworkObject)
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
    #' Deserialize JSON string into an instance of PokemonSpritesOtherOfficialArtwork
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpritesOtherOfficialArtwork
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`front_default`)) {
        self$`front_default` <- this_object$`front_default`
      }
      if (!is.null(this_object$`front_shiny`)) {
        self$`front_shiny` <- this_object$`front_shiny`
      }
      if (!is.null(this_object$`versions`)) {
        self$`versions` <- ApiClient$new()$deserializeObj(this_object$`versions`, "map(map(AnyType))", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonSpritesOtherOfficialArtwork in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonSpritesOtherOfficialArtwork
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpritesOtherOfficialArtwork
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`front_default` <- this_object$`front_default`
      self$`front_shiny` <- this_object$`front_shiny`
      self$`versions` <- ApiClient$new()$deserializeObj(this_object$`versions`, "map(map(AnyType))", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonSpritesOtherOfficialArtwork and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `front_default`
      if (!is.null(input_json$`front_default`)) {
        if (!(is.character(input_json$`front_default`) && length(input_json$`front_default`) == 1)) {
          stop(paste("Error! Invalid data for `front_default`. Must be a string:", input_json$`front_default`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpritesOtherOfficialArtwork: the required field `front_default` is missing."))
      }
      # check the required field `front_shiny`
      if (!is.null(input_json$`front_shiny`)) {
        if (!(is.character(input_json$`front_shiny`) && length(input_json$`front_shiny`) == 1)) {
          stop(paste("Error! Invalid data for `front_shiny`. Must be a string:", input_json$`front_shiny`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpritesOtherOfficialArtwork: the required field `front_shiny` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonSpritesOtherOfficialArtwork
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
# PokemonSpritesOtherOfficialArtwork$unlock()
#
## Below is an example to define the print function
# PokemonSpritesOtherOfficialArtwork$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonSpritesOtherOfficialArtwork$lock()


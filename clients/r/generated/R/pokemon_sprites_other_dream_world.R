#' Create a new PokemonSpritesOtherDreamWorld
#'
#' @description
#' PokemonSpritesOtherDreamWorld Class
#'
#' @docType class
#' @title PokemonSpritesOtherDreamWorld
#' @description PokemonSpritesOtherDreamWorld Class
#' @format An \code{R6Class} generator object
#' @field front_default The URL of the default Pokémon Dream World front image, or null if unavailable. character
#' @field front_female The URL of the female Pokémon Dream World front image, or null if unavailable. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonSpritesOtherDreamWorld <- R6::R6Class(
  "PokemonSpritesOtherDreamWorld",
  public = list(
    `front_default` = NULL,
    `front_female` = NULL,

    #' @description
    #' Initialize a new PokemonSpritesOtherDreamWorld class.
    #'
    #' @param front_default The URL of the default Pokémon Dream World front image, or null if unavailable.
    #' @param front_female The URL of the female Pokémon Dream World front image, or null if unavailable.
    #' @param ... Other optional arguments.
    initialize = function(`front_default`, `front_female`, ...) {
      if (!missing(`front_default`)) {
        if (!(is.character(`front_default`) && length(`front_default`) == 1)) {
          stop(paste("Error! Invalid data for `front_default`. Must be a string:", `front_default`))
        }
        self$`front_default` <- `front_default`
      }
      if (!missing(`front_female`)) {
        if (!(is.character(`front_female`) && length(`front_female`) == 1)) {
          stop(paste("Error! Invalid data for `front_female`. Must be a string:", `front_female`))
        }
        self$`front_female` <- `front_female`
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
    #' @return PokemonSpritesOtherDreamWorld as a base R list.
    #' @examples
    #' # convert array of PokemonSpritesOtherDreamWorld (x) to a data frame
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
    #' Convert PokemonSpritesOtherDreamWorld to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonSpritesOtherDreamWorldObject <- list()
      if (!is.null(self$`front_default`)) {
        PokemonSpritesOtherDreamWorldObject[["front_default"]] <-
          self$`front_default`
      }
      if (!is.null(self$`front_female`)) {
        PokemonSpritesOtherDreamWorldObject[["front_female"]] <-
          self$`front_female`
      }
      return(PokemonSpritesOtherDreamWorldObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonSpritesOtherDreamWorld
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpritesOtherDreamWorld
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`front_default`)) {
        self$`front_default` <- this_object$`front_default`
      }
      if (!is.null(this_object$`front_female`)) {
        self$`front_female` <- this_object$`front_female`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonSpritesOtherDreamWorld in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonSpritesOtherDreamWorld
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpritesOtherDreamWorld
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`front_default` <- this_object$`front_default`
      self$`front_female` <- this_object$`front_female`
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonSpritesOtherDreamWorld and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpritesOtherDreamWorld: the required field `front_default` is missing."))
      }
      # check the required field `front_female`
      if (!is.null(input_json$`front_female`)) {
        if (!(is.character(input_json$`front_female`) && length(input_json$`front_female`) == 1)) {
          stop(paste("Error! Invalid data for `front_female`. Must be a string:", input_json$`front_female`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpritesOtherDreamWorld: the required field `front_female` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonSpritesOtherDreamWorld
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
# PokemonSpritesOtherDreamWorld$unlock()
#
## Below is an example to define the print function
# PokemonSpritesOtherDreamWorld$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonSpritesOtherDreamWorld$lock()


#' Create a new PokemonSpritesOtherHome
#'
#' @description
#' PokemonSpritesOtherHome Class
#'
#' @docType class
#' @title PokemonSpritesOtherHome
#' @description PokemonSpritesOtherHome Class
#' @format An \code{R6Class} generator object
#' @field front_default The URL of the default Pokémon HOME front image, or null if unavailable. character
#' @field front_female The URL of the female Pokémon HOME front image, or null if unavailable. character
#' @field front_shiny The URL of the shiny Pokémon HOME front image, or null if unavailable. character
#' @field front_shiny_female The URL of the shiny female Pokémon HOME front image, or null if unavailable. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonSpritesOtherHome <- R6::R6Class(
  "PokemonSpritesOtherHome",
  public = list(
    `front_default` = NULL,
    `front_female` = NULL,
    `front_shiny` = NULL,
    `front_shiny_female` = NULL,

    #' @description
    #' Initialize a new PokemonSpritesOtherHome class.
    #'
    #' @param front_default The URL of the default Pokémon HOME front image, or null if unavailable.
    #' @param front_female The URL of the female Pokémon HOME front image, or null if unavailable.
    #' @param front_shiny The URL of the shiny Pokémon HOME front image, or null if unavailable.
    #' @param front_shiny_female The URL of the shiny female Pokémon HOME front image, or null if unavailable.
    #' @param ... Other optional arguments.
    initialize = function(`front_default`, `front_female`, `front_shiny`, `front_shiny_female`, ...) {
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
      if (!missing(`front_shiny`)) {
        if (!(is.character(`front_shiny`) && length(`front_shiny`) == 1)) {
          stop(paste("Error! Invalid data for `front_shiny`. Must be a string:", `front_shiny`))
        }
        self$`front_shiny` <- `front_shiny`
      }
      if (!missing(`front_shiny_female`)) {
        if (!(is.character(`front_shiny_female`) && length(`front_shiny_female`) == 1)) {
          stop(paste("Error! Invalid data for `front_shiny_female`. Must be a string:", `front_shiny_female`))
        }
        self$`front_shiny_female` <- `front_shiny_female`
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
    #' @return PokemonSpritesOtherHome as a base R list.
    #' @examples
    #' # convert array of PokemonSpritesOtherHome (x) to a data frame
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
    #' Convert PokemonSpritesOtherHome to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonSpritesOtherHomeObject <- list()
      if (!is.null(self$`front_default`)) {
        PokemonSpritesOtherHomeObject[["front_default"]] <-
          self$`front_default`
      }
      if (!is.null(self$`front_female`)) {
        PokemonSpritesOtherHomeObject[["front_female"]] <-
          self$`front_female`
      }
      if (!is.null(self$`front_shiny`)) {
        PokemonSpritesOtherHomeObject[["front_shiny"]] <-
          self$`front_shiny`
      }
      if (!is.null(self$`front_shiny_female`)) {
        PokemonSpritesOtherHomeObject[["front_shiny_female"]] <-
          self$`front_shiny_female`
      }
      return(PokemonSpritesOtherHomeObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonSpritesOtherHome
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpritesOtherHome
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`front_default`)) {
        self$`front_default` <- this_object$`front_default`
      }
      if (!is.null(this_object$`front_female`)) {
        self$`front_female` <- this_object$`front_female`
      }
      if (!is.null(this_object$`front_shiny`)) {
        self$`front_shiny` <- this_object$`front_shiny`
      }
      if (!is.null(this_object$`front_shiny_female`)) {
        self$`front_shiny_female` <- this_object$`front_shiny_female`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonSpritesOtherHome in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonSpritesOtherHome
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpritesOtherHome
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`front_default` <- this_object$`front_default`
      self$`front_female` <- this_object$`front_female`
      self$`front_shiny` <- this_object$`front_shiny`
      self$`front_shiny_female` <- this_object$`front_shiny_female`
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonSpritesOtherHome and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpritesOtherHome: the required field `front_default` is missing."))
      }
      # check the required field `front_female`
      if (!is.null(input_json$`front_female`)) {
        if (!(is.character(input_json$`front_female`) && length(input_json$`front_female`) == 1)) {
          stop(paste("Error! Invalid data for `front_female`. Must be a string:", input_json$`front_female`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpritesOtherHome: the required field `front_female` is missing."))
      }
      # check the required field `front_shiny`
      if (!is.null(input_json$`front_shiny`)) {
        if (!(is.character(input_json$`front_shiny`) && length(input_json$`front_shiny`) == 1)) {
          stop(paste("Error! Invalid data for `front_shiny`. Must be a string:", input_json$`front_shiny`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpritesOtherHome: the required field `front_shiny` is missing."))
      }
      # check the required field `front_shiny_female`
      if (!is.null(input_json$`front_shiny_female`)) {
        if (!(is.character(input_json$`front_shiny_female`) && length(input_json$`front_shiny_female`) == 1)) {
          stop(paste("Error! Invalid data for `front_shiny_female`. Must be a string:", input_json$`front_shiny_female`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpritesOtherHome: the required field `front_shiny_female` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonSpritesOtherHome
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
# PokemonSpritesOtherHome$unlock()
#
## Below is an example to define the print function
# PokemonSpritesOtherHome$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonSpritesOtherHome$lock()


#' Create a new PokemonSpritesOtherShowdown
#'
#' @description
#' PokemonSpritesOtherShowdown Class
#'
#' @docType class
#' @title PokemonSpritesOtherShowdown
#' @description PokemonSpritesOtherShowdown Class
#' @format An \code{R6Class} generator object
#' @field front_default The URL of the default Pokémon Showdown front image, or null if unavailable. character
#' @field front_female The URL of the female Pokémon Showdown front image, or null if unavailable. character
#' @field front_shiny The URL of the shiny Pokémon Showdown front image, or null if unavailable. character
#' @field front_shiny_female The URL of the shiny female Pokémon Showdown front image, or null if unavailable. character
#' @field back_default The URL of the default Pokémon Showdown back image, or null if unavailable. character
#' @field back_female The URL of the female Pokémon Showdown back image, or null if unavailable. character
#' @field back_shiny The URL of the shiny Pokémon Showdown back image, or null if unavailable. character
#' @field back_shiny_female The URL of the shiny female Pokémon Showdown back image, or null if unavailable. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonSpritesOtherShowdown <- R6::R6Class(
  "PokemonSpritesOtherShowdown",
  public = list(
    `front_default` = NULL,
    `front_female` = NULL,
    `front_shiny` = NULL,
    `front_shiny_female` = NULL,
    `back_default` = NULL,
    `back_female` = NULL,
    `back_shiny` = NULL,
    `back_shiny_female` = NULL,

    #' @description
    #' Initialize a new PokemonSpritesOtherShowdown class.
    #'
    #' @param front_default The URL of the default Pokémon Showdown front image, or null if unavailable.
    #' @param front_female The URL of the female Pokémon Showdown front image, or null if unavailable.
    #' @param front_shiny The URL of the shiny Pokémon Showdown front image, or null if unavailable.
    #' @param front_shiny_female The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
    #' @param back_default The URL of the default Pokémon Showdown back image, or null if unavailable.
    #' @param back_female The URL of the female Pokémon Showdown back image, or null if unavailable.
    #' @param back_shiny The URL of the shiny Pokémon Showdown back image, or null if unavailable.
    #' @param back_shiny_female The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
    #' @param ... Other optional arguments.
    initialize = function(`front_default`, `front_female`, `front_shiny`, `front_shiny_female`, `back_default`, `back_female`, `back_shiny`, `back_shiny_female`, ...) {
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
      if (!missing(`back_default`)) {
        if (!(is.character(`back_default`) && length(`back_default`) == 1)) {
          stop(paste("Error! Invalid data for `back_default`. Must be a string:", `back_default`))
        }
        self$`back_default` <- `back_default`
      }
      if (!missing(`back_female`)) {
        if (!(is.character(`back_female`) && length(`back_female`) == 1)) {
          stop(paste("Error! Invalid data for `back_female`. Must be a string:", `back_female`))
        }
        self$`back_female` <- `back_female`
      }
      if (!missing(`back_shiny`)) {
        if (!(is.character(`back_shiny`) && length(`back_shiny`) == 1)) {
          stop(paste("Error! Invalid data for `back_shiny`. Must be a string:", `back_shiny`))
        }
        self$`back_shiny` <- `back_shiny`
      }
      if (!missing(`back_shiny_female`)) {
        if (!(is.character(`back_shiny_female`) && length(`back_shiny_female`) == 1)) {
          stop(paste("Error! Invalid data for `back_shiny_female`. Must be a string:", `back_shiny_female`))
        }
        self$`back_shiny_female` <- `back_shiny_female`
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
    #' @return PokemonSpritesOtherShowdown as a base R list.
    #' @examples
    #' # convert array of PokemonSpritesOtherShowdown (x) to a data frame
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
    #' Convert PokemonSpritesOtherShowdown to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonSpritesOtherShowdownObject <- list()
      if (!is.null(self$`front_default`)) {
        PokemonSpritesOtherShowdownObject[["front_default"]] <-
          self$`front_default`
      }
      if (!is.null(self$`front_female`)) {
        PokemonSpritesOtherShowdownObject[["front_female"]] <-
          self$`front_female`
      }
      if (!is.null(self$`front_shiny`)) {
        PokemonSpritesOtherShowdownObject[["front_shiny"]] <-
          self$`front_shiny`
      }
      if (!is.null(self$`front_shiny_female`)) {
        PokemonSpritesOtherShowdownObject[["front_shiny_female"]] <-
          self$`front_shiny_female`
      }
      if (!is.null(self$`back_default`)) {
        PokemonSpritesOtherShowdownObject[["back_default"]] <-
          self$`back_default`
      }
      if (!is.null(self$`back_female`)) {
        PokemonSpritesOtherShowdownObject[["back_female"]] <-
          self$`back_female`
      }
      if (!is.null(self$`back_shiny`)) {
        PokemonSpritesOtherShowdownObject[["back_shiny"]] <-
          self$`back_shiny`
      }
      if (!is.null(self$`back_shiny_female`)) {
        PokemonSpritesOtherShowdownObject[["back_shiny_female"]] <-
          self$`back_shiny_female`
      }
      return(PokemonSpritesOtherShowdownObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonSpritesOtherShowdown
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpritesOtherShowdown
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
      if (!is.null(this_object$`back_default`)) {
        self$`back_default` <- this_object$`back_default`
      }
      if (!is.null(this_object$`back_female`)) {
        self$`back_female` <- this_object$`back_female`
      }
      if (!is.null(this_object$`back_shiny`)) {
        self$`back_shiny` <- this_object$`back_shiny`
      }
      if (!is.null(this_object$`back_shiny_female`)) {
        self$`back_shiny_female` <- this_object$`back_shiny_female`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonSpritesOtherShowdown in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonSpritesOtherShowdown
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpritesOtherShowdown
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`front_default` <- this_object$`front_default`
      self$`front_female` <- this_object$`front_female`
      self$`front_shiny` <- this_object$`front_shiny`
      self$`front_shiny_female` <- this_object$`front_shiny_female`
      self$`back_default` <- this_object$`back_default`
      self$`back_female` <- this_object$`back_female`
      self$`back_shiny` <- this_object$`back_shiny`
      self$`back_shiny_female` <- this_object$`back_shiny_female`
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonSpritesOtherShowdown and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpritesOtherShowdown: the required field `front_default` is missing."))
      }
      # check the required field `front_female`
      if (!is.null(input_json$`front_female`)) {
        if (!(is.character(input_json$`front_female`) && length(input_json$`front_female`) == 1)) {
          stop(paste("Error! Invalid data for `front_female`. Must be a string:", input_json$`front_female`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpritesOtherShowdown: the required field `front_female` is missing."))
      }
      # check the required field `front_shiny`
      if (!is.null(input_json$`front_shiny`)) {
        if (!(is.character(input_json$`front_shiny`) && length(input_json$`front_shiny`) == 1)) {
          stop(paste("Error! Invalid data for `front_shiny`. Must be a string:", input_json$`front_shiny`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpritesOtherShowdown: the required field `front_shiny` is missing."))
      }
      # check the required field `front_shiny_female`
      if (!is.null(input_json$`front_shiny_female`)) {
        if (!(is.character(input_json$`front_shiny_female`) && length(input_json$`front_shiny_female`) == 1)) {
          stop(paste("Error! Invalid data for `front_shiny_female`. Must be a string:", input_json$`front_shiny_female`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpritesOtherShowdown: the required field `front_shiny_female` is missing."))
      }
      # check the required field `back_default`
      if (!is.null(input_json$`back_default`)) {
        if (!(is.character(input_json$`back_default`) && length(input_json$`back_default`) == 1)) {
          stop(paste("Error! Invalid data for `back_default`. Must be a string:", input_json$`back_default`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpritesOtherShowdown: the required field `back_default` is missing."))
      }
      # check the required field `back_female`
      if (!is.null(input_json$`back_female`)) {
        if (!(is.character(input_json$`back_female`) && length(input_json$`back_female`) == 1)) {
          stop(paste("Error! Invalid data for `back_female`. Must be a string:", input_json$`back_female`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpritesOtherShowdown: the required field `back_female` is missing."))
      }
      # check the required field `back_shiny`
      if (!is.null(input_json$`back_shiny`)) {
        if (!(is.character(input_json$`back_shiny`) && length(input_json$`back_shiny`) == 1)) {
          stop(paste("Error! Invalid data for `back_shiny`. Must be a string:", input_json$`back_shiny`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpritesOtherShowdown: the required field `back_shiny` is missing."))
      }
      # check the required field `back_shiny_female`
      if (!is.null(input_json$`back_shiny_female`)) {
        if (!(is.character(input_json$`back_shiny_female`) && length(input_json$`back_shiny_female`) == 1)) {
          stop(paste("Error! Invalid data for `back_shiny_female`. Must be a string:", input_json$`back_shiny_female`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokemonSpritesOtherShowdown: the required field `back_shiny_female` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonSpritesOtherShowdown
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
# PokemonSpritesOtherShowdown$unlock()
#
## Below is an example to define the print function
# PokemonSpritesOtherShowdown$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonSpritesOtherShowdown$lock()


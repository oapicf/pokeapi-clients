#' Create a new PokemonSpritesOther
#'
#' @description
#' PokemonSpritesOther Class
#'
#' @docType class
#' @title PokemonSpritesOther
#' @description PokemonSpritesOther Class
#' @format An \code{R6Class} generator object
#' @field dream_world Pokémon Dream World artwork URLs. \link{PokemonSpritesOtherDreamWorld} [optional]
#' @field home Pokémon HOME sprite URLs. \link{PokemonSpritesOtherHome} [optional]
#' @field showdown Pokémon Showdown sprite URLs. \link{PokemonSpritesOtherShowdown} [optional]
#' @field official-artwork Official Pokémon artwork URLs, including shiny artwork and version-specific variants. \link{PokemonSpritesOtherOfficialArtwork} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokemonSpritesOther <- R6::R6Class(
  "PokemonSpritesOther",
  public = list(
    `dream_world` = NULL,
    `home` = NULL,
    `showdown` = NULL,
    `official-artwork` = NULL,

    #' @description
    #' Initialize a new PokemonSpritesOther class.
    #'
    #' @param dream_world Pokémon Dream World artwork URLs.
    #' @param home Pokémon HOME sprite URLs.
    #' @param showdown Pokémon Showdown sprite URLs.
    #' @param official-artwork Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
    #' @param ... Other optional arguments.
    initialize = function(`dream_world` = NULL, `home` = NULL, `showdown` = NULL, `official-artwork` = NULL, ...) {
      if (!is.null(`dream_world`)) {
        stopifnot(R6::is.R6(`dream_world`))
        self$`dream_world` <- `dream_world`
      }
      if (!is.null(`home`)) {
        stopifnot(R6::is.R6(`home`))
        self$`home` <- `home`
      }
      if (!is.null(`showdown`)) {
        stopifnot(R6::is.R6(`showdown`))
        self$`showdown` <- `showdown`
      }
      if (!is.null(`official-artwork`)) {
        stopifnot(R6::is.R6(`official-artwork`))
        self$`official-artwork` <- `official-artwork`
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
    #' @return PokemonSpritesOther as a base R list.
    #' @examples
    #' # convert array of PokemonSpritesOther (x) to a data frame
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
    #' Convert PokemonSpritesOther to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokemonSpritesOtherObject <- list()
      if (!is.null(self$`dream_world`)) {
        PokemonSpritesOtherObject[["dream_world"]] <-
          self$extractSimpleType(self$`dream_world`)
      }
      if (!is.null(self$`home`)) {
        PokemonSpritesOtherObject[["home"]] <-
          self$extractSimpleType(self$`home`)
      }
      if (!is.null(self$`showdown`)) {
        PokemonSpritesOtherObject[["showdown"]] <-
          self$extractSimpleType(self$`showdown`)
      }
      if (!is.null(self$`official-artwork`)) {
        PokemonSpritesOtherObject[["official-artwork"]] <-
          self$extractSimpleType(self$`official-artwork`)
      }
      return(PokemonSpritesOtherObject)
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
    #' Deserialize JSON string into an instance of PokemonSpritesOther
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpritesOther
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`dream_world`)) {
        `dream_world_object` <- PokemonSpritesOtherDreamWorld$new()
        `dream_world_object`$fromJSON(jsonlite::toJSON(this_object$`dream_world`, auto_unbox = TRUE, digits = NA))
        self$`dream_world` <- `dream_world_object`
      }
      if (!is.null(this_object$`home`)) {
        `home_object` <- PokemonSpritesOtherHome$new()
        `home_object`$fromJSON(jsonlite::toJSON(this_object$`home`, auto_unbox = TRUE, digits = NA))
        self$`home` <- `home_object`
      }
      if (!is.null(this_object$`showdown`)) {
        `showdown_object` <- PokemonSpritesOtherShowdown$new()
        `showdown_object`$fromJSON(jsonlite::toJSON(this_object$`showdown`, auto_unbox = TRUE, digits = NA))
        self$`showdown` <- `showdown_object`
      }
      if (!is.null(this_object$`official-artwork`)) {
        `official-artwork_object` <- PokemonSpritesOtherOfficialArtwork$new()
        `official-artwork_object`$fromJSON(jsonlite::toJSON(this_object$`official-artwork`, auto_unbox = TRUE, digits = NA))
        self$`official-artwork` <- `official-artwork_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokemonSpritesOther in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokemonSpritesOther
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokemonSpritesOther
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`dream_world` <- PokemonSpritesOtherDreamWorld$new()$fromJSON(jsonlite::toJSON(this_object$`dream_world`, auto_unbox = TRUE, digits = NA))
      self$`home` <- PokemonSpritesOtherHome$new()$fromJSON(jsonlite::toJSON(this_object$`home`, auto_unbox = TRUE, digits = NA))
      self$`showdown` <- PokemonSpritesOtherShowdown$new()$fromJSON(jsonlite::toJSON(this_object$`showdown`, auto_unbox = TRUE, digits = NA))
      self$`official-artwork` <- PokemonSpritesOtherOfficialArtwork$new()$fromJSON(jsonlite::toJSON(this_object$`official-artwork`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokemonSpritesOther and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokemonSpritesOther
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
# PokemonSpritesOther$unlock()
#
## Below is an example to define the print function
# PokemonSpritesOther$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokemonSpritesOther$lock()


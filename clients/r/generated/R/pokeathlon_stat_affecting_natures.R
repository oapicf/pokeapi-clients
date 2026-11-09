#' Create a new PokeathlonStatAffectingNatures
#'
#' @description
#' PokeathlonStatAffectingNatures Class
#'
#' @docType class
#' @title PokeathlonStatAffectingNatures
#' @description PokeathlonStatAffectingNatures Class
#' @format An \code{R6Class} generator object
#' @field increase A list of natures and how they change the referenced Pokéathlon stat. list(\link{PokeathlonStatAffectingNature})
#' @field decrease A list of natures and how they change the referenced Pokéathlon stat. list(\link{PokeathlonStatAffectingNature})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokeathlonStatAffectingNatures <- R6::R6Class(
  "PokeathlonStatAffectingNatures",
  public = list(
    `increase` = NULL,
    `decrease` = NULL,

    #' @description
    #' Initialize a new PokeathlonStatAffectingNatures class.
    #'
    #' @param increase A list of natures and how they change the referenced Pokéathlon stat.
    #' @param decrease A list of natures and how they change the referenced Pokéathlon stat.
    #' @param ... Other optional arguments.
    initialize = function(`increase`, `decrease`, ...) {
      if (!missing(`increase`)) {
        stopifnot(is.vector(`increase`), length(`increase`) != 0)
        sapply(`increase`, function(x) stopifnot(R6::is.R6(x)))
        self$`increase` <- `increase`
      }
      if (!missing(`decrease`)) {
        stopifnot(is.vector(`decrease`), length(`decrease`) != 0)
        sapply(`decrease`, function(x) stopifnot(R6::is.R6(x)))
        self$`decrease` <- `decrease`
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
    #' @return PokeathlonStatAffectingNatures as a base R list.
    #' @examples
    #' # convert array of PokeathlonStatAffectingNatures (x) to a data frame
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
    #' Convert PokeathlonStatAffectingNatures to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokeathlonStatAffectingNaturesObject <- list()
      if (!is.null(self$`increase`)) {
        PokeathlonStatAffectingNaturesObject[["increase"]] <-
          self$extractSimpleType(self$`increase`)
      }
      if (!is.null(self$`decrease`)) {
        PokeathlonStatAffectingNaturesObject[["decrease"]] <-
          self$extractSimpleType(self$`decrease`)
      }
      return(PokeathlonStatAffectingNaturesObject)
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
    #' Deserialize JSON string into an instance of PokeathlonStatAffectingNatures
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokeathlonStatAffectingNatures
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`increase`)) {
        self$`increase` <- ApiClient$new()$deserializeObj(this_object$`increase`, "array[PokeathlonStatAffectingNature]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`decrease`)) {
        self$`decrease` <- ApiClient$new()$deserializeObj(this_object$`decrease`, "array[PokeathlonStatAffectingNature]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokeathlonStatAffectingNatures in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokeathlonStatAffectingNatures
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokeathlonStatAffectingNatures
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`increase` <- ApiClient$new()$deserializeObj(this_object$`increase`, "array[PokeathlonStatAffectingNature]", loadNamespace("openapi"))
      self$`decrease` <- ApiClient$new()$deserializeObj(this_object$`decrease`, "array[PokeathlonStatAffectingNature]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokeathlonStatAffectingNatures and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `increase`
      if (!is.null(input_json$`increase`)) {
        stopifnot(is.vector(input_json$`increase`), length(input_json$`increase`) != 0)
        tmp <- sapply(input_json$`increase`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokeathlonStatAffectingNatures: the required field `increase` is missing."))
      }
      # check the required field `decrease`
      if (!is.null(input_json$`decrease`)) {
        stopifnot(is.vector(input_json$`decrease`), length(input_json$`decrease`) != 0)
        tmp <- sapply(input_json$`decrease`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokeathlonStatAffectingNatures: the required field `decrease` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokeathlonStatAffectingNatures
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `increase` is null
      if (is.null(self$`increase`)) {
        return(FALSE)
      }

      # check if the required `decrease` is null
      if (is.null(self$`decrease`)) {
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
      # check if the required `increase` is null
      if (is.null(self$`increase`)) {
        invalid_fields["increase"] <- "Non-nullable required field `increase` cannot be null."
      }

      # check if the required `decrease` is null
      if (is.null(self$`decrease`)) {
        invalid_fields["decrease"] <- "Non-nullable required field `decrease` cannot be null."
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
# PokeathlonStatAffectingNatures$unlock()
#
## Below is an example to define the print function
# PokeathlonStatAffectingNatures$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokeathlonStatAffectingNatures$lock()


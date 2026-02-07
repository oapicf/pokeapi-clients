#' Create a new PokeathlonStatDetailAffectingNatures
#'
#' @description
#' PokeathlonStatDetailAffectingNatures Class
#'
#' @docType class
#' @title PokeathlonStatDetailAffectingNatures
#' @description PokeathlonStatDetailAffectingNatures Class
#' @format An \code{R6Class} generator object
#' @field decrease  list(\link{PokeathlonStatDetailAffectingNaturesDecreaseInner})
#' @field increase  list(\link{PokeathlonStatDetailAffectingNaturesIncreaseInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PokeathlonStatDetailAffectingNatures <- R6::R6Class(
  "PokeathlonStatDetailAffectingNatures",
  public = list(
    `decrease` = NULL,
    `increase` = NULL,

    #' @description
    #' Initialize a new PokeathlonStatDetailAffectingNatures class.
    #'
    #' @param decrease decrease
    #' @param increase increase
    #' @param ... Other optional arguments.
    initialize = function(`decrease`, `increase`, ...) {
      if (!missing(`decrease`)) {
        stopifnot(is.vector(`decrease`), length(`decrease`) != 0)
        sapply(`decrease`, function(x) stopifnot(R6::is.R6(x)))
        self$`decrease` <- `decrease`
      }
      if (!missing(`increase`)) {
        stopifnot(is.vector(`increase`), length(`increase`) != 0)
        sapply(`increase`, function(x) stopifnot(R6::is.R6(x)))
        self$`increase` <- `increase`
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
    #' @return PokeathlonStatDetailAffectingNatures as a base R list.
    #' @examples
    #' # convert array of PokeathlonStatDetailAffectingNatures (x) to a data frame
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
    #' Convert PokeathlonStatDetailAffectingNatures to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PokeathlonStatDetailAffectingNaturesObject <- list()
      if (!is.null(self$`decrease`)) {
        PokeathlonStatDetailAffectingNaturesObject[["decrease"]] <-
          lapply(self$`decrease`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`increase`)) {
        PokeathlonStatDetailAffectingNaturesObject[["increase"]] <-
          lapply(self$`increase`, function(x) x$toSimpleType())
      }
      return(PokeathlonStatDetailAffectingNaturesObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PokeathlonStatDetailAffectingNatures
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokeathlonStatDetailAffectingNatures
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`decrease`)) {
        self$`decrease` <- ApiClient$new()$deserializeObj(this_object$`decrease`, "array[PokeathlonStatDetailAffectingNaturesDecreaseInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`increase`)) {
        self$`increase` <- ApiClient$new()$deserializeObj(this_object$`increase`, "array[PokeathlonStatDetailAffectingNaturesIncreaseInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PokeathlonStatDetailAffectingNatures in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PokeathlonStatDetailAffectingNatures
    #'
    #' @param input_json the JSON input
    #' @return the instance of PokeathlonStatDetailAffectingNatures
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`decrease` <- ApiClient$new()$deserializeObj(this_object$`decrease`, "array[PokeathlonStatDetailAffectingNaturesDecreaseInner]", loadNamespace("openapi"))
      self$`increase` <- ApiClient$new()$deserializeObj(this_object$`increase`, "array[PokeathlonStatDetailAffectingNaturesIncreaseInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PokeathlonStatDetailAffectingNatures and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `decrease`
      if (!is.null(input_json$`decrease`)) {
        stopifnot(is.vector(input_json$`decrease`), length(input_json$`decrease`) != 0)
        tmp <- sapply(input_json$`decrease`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokeathlonStatDetailAffectingNatures: the required field `decrease` is missing."))
      }
      # check the required field `increase`
      if (!is.null(input_json$`increase`)) {
        stopifnot(is.vector(input_json$`increase`), length(input_json$`increase`) != 0)
        tmp <- sapply(input_json$`increase`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for PokeathlonStatDetailAffectingNatures: the required field `increase` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PokeathlonStatDetailAffectingNatures
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `decrease` is null
      if (is.null(self$`decrease`)) {
        return(FALSE)
      }

      # check if the required `increase` is null
      if (is.null(self$`increase`)) {
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
      # check if the required `decrease` is null
      if (is.null(self$`decrease`)) {
        invalid_fields["decrease"] <- "Non-nullable required field `decrease` cannot be null."
      }

      # check if the required `increase` is null
      if (is.null(self$`increase`)) {
        invalid_fields["increase"] <- "Non-nullable required field `increase` cannot be null."
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
# PokeathlonStatDetailAffectingNatures$unlock()
#
## Below is an example to define the print function
# PokeathlonStatDetailAffectingNatures$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PokeathlonStatDetailAffectingNatures$lock()


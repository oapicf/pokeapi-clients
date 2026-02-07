#' Create a new MoveDetailContestCombos
#'
#' @description
#' MoveDetailContestCombos Class
#'
#' @docType class
#' @title MoveDetailContestCombos
#' @description MoveDetailContestCombos Class
#' @format An \code{R6Class} generator object
#' @field normal  \link{MoveDetailContestCombosNormal}
#' @field item_super  \link{MoveDetailContestCombosNormal}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MoveDetailContestCombos <- R6::R6Class(
  "MoveDetailContestCombos",
  public = list(
    `normal` = NULL,
    `item_super` = NULL,

    #' @description
    #' Initialize a new MoveDetailContestCombos class.
    #'
    #' @param normal normal
    #' @param item_super item_super
    #' @param ... Other optional arguments.
    initialize = function(`normal`, `item_super`, ...) {
      if (!missing(`normal`)) {
        stopifnot(R6::is.R6(`normal`))
        self$`normal` <- `normal`
      }
      if (!missing(`item_super`)) {
        stopifnot(R6::is.R6(`item_super`))
        self$`item_super` <- `item_super`
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
    #' @return MoveDetailContestCombos as a base R list.
    #' @examples
    #' # convert array of MoveDetailContestCombos (x) to a data frame
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
    #' Convert MoveDetailContestCombos to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MoveDetailContestCombosObject <- list()
      if (!is.null(self$`normal`)) {
        MoveDetailContestCombosObject[["normal"]] <-
          self$`normal`$toSimpleType()
      }
      if (!is.null(self$`item_super`)) {
        MoveDetailContestCombosObject[["super"]] <-
          self$`item_super`$toSimpleType()
      }
      return(MoveDetailContestCombosObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of MoveDetailContestCombos
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveDetailContestCombos
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`normal`)) {
        `normal_object` <- MoveDetailContestCombosNormal$new()
        `normal_object`$fromJSON(jsonlite::toJSON(this_object$`normal`, auto_unbox = TRUE, digits = NA))
        self$`normal` <- `normal_object`
      }
      if (!is.null(this_object$`super`)) {
        `item_super_object` <- MoveDetailContestCombosNormal$new()
        `item_super_object`$fromJSON(jsonlite::toJSON(this_object$`super`, auto_unbox = TRUE, digits = NA))
        self$`item_super` <- `item_super_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MoveDetailContestCombos in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MoveDetailContestCombos
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveDetailContestCombos
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`normal` <- MoveDetailContestCombosNormal$new()$fromJSON(jsonlite::toJSON(this_object$`normal`, auto_unbox = TRUE, digits = NA))
      self$`item_super` <- MoveDetailContestCombosNormal$new()$fromJSON(jsonlite::toJSON(this_object$`item_super`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to MoveDetailContestCombos and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `normal`
      if (!is.null(input_json$`normal`)) {
        stopifnot(R6::is.R6(input_json$`normal`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetailContestCombos: the required field `normal` is missing."))
      }
      # check the required field `item_super`
      if (!is.null(input_json$`item_super`)) {
        stopifnot(R6::is.R6(input_json$`item_super`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveDetailContestCombos: the required field `item_super` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MoveDetailContestCombos
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `normal` is null
      if (is.null(self$`normal`)) {
        return(FALSE)
      }

      # check if the required `item_super` is null
      if (is.null(self$`item_super`)) {
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
      # check if the required `normal` is null
      if (is.null(self$`normal`)) {
        invalid_fields["normal"] <- "Non-nullable required field `normal` cannot be null."
      }

      # check if the required `item_super` is null
      if (is.null(self$`item_super`)) {
        invalid_fields["item_super"] <- "Non-nullable required field `item_super` cannot be null."
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
# MoveDetailContestCombos$unlock()
#
## Below is an example to define the print function
# MoveDetailContestCombos$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MoveDetailContestCombos$lock()


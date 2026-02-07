#' Create a new ItemGameIndex
#'
#' @description
#' ItemGameIndex Class
#'
#' @docType class
#' @title ItemGameIndex
#' @description ItemGameIndex Class
#' @format An \code{R6Class} generator object
#' @field game_index  integer
#' @field generation  \link{GenerationSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemGameIndex <- R6::R6Class(
  "ItemGameIndex",
  public = list(
    `game_index` = NULL,
    `generation` = NULL,

    #' @description
    #' Initialize a new ItemGameIndex class.
    #'
    #' @param game_index game_index
    #' @param generation generation
    #' @param ... Other optional arguments.
    initialize = function(`game_index`, `generation`, ...) {
      if (!missing(`game_index`)) {
        if (!(is.numeric(`game_index`) && length(`game_index`) == 1)) {
          stop(paste("Error! Invalid data for `game_index`. Must be an integer:", `game_index`))
        }
        self$`game_index` <- `game_index`
      }
      if (!missing(`generation`)) {
        stopifnot(R6::is.R6(`generation`))
        self$`generation` <- `generation`
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
    #' @return ItemGameIndex as a base R list.
    #' @examples
    #' # convert array of ItemGameIndex (x) to a data frame
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
    #' Convert ItemGameIndex to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ItemGameIndexObject <- list()
      if (!is.null(self$`game_index`)) {
        ItemGameIndexObject[["game_index"]] <-
          self$`game_index`
      }
      if (!is.null(self$`generation`)) {
        ItemGameIndexObject[["generation"]] <-
          self$`generation`$toSimpleType()
      }
      return(ItemGameIndexObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemGameIndex
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemGameIndex
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`game_index`)) {
        self$`game_index` <- this_object$`game_index`
      }
      if (!is.null(this_object$`generation`)) {
        `generation_object` <- GenerationSummary$new()
        `generation_object`$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
        self$`generation` <- `generation_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ItemGameIndex in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemGameIndex
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemGameIndex
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`game_index` <- this_object$`game_index`
      self$`generation` <- GenerationSummary$new()$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ItemGameIndex and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `game_index`
      if (!is.null(input_json$`game_index`)) {
        if (!(is.numeric(input_json$`game_index`) && length(input_json$`game_index`) == 1)) {
          stop(paste("Error! Invalid data for `game_index`. Must be an integer:", input_json$`game_index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemGameIndex: the required field `game_index` is missing."))
      }
      # check the required field `generation`
      if (!is.null(input_json$`generation`)) {
        stopifnot(R6::is.R6(input_json$`generation`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemGameIndex: the required field `generation` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ItemGameIndex
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `game_index` is null
      if (is.null(self$`game_index`)) {
        return(FALSE)
      }

      # check if the required `generation` is null
      if (is.null(self$`generation`)) {
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
      # check if the required `game_index` is null
      if (is.null(self$`game_index`)) {
        invalid_fields["game_index"] <- "Non-nullable required field `game_index` cannot be null."
      }

      # check if the required `generation` is null
      if (is.null(self$`generation`)) {
        invalid_fields["generation"] <- "Non-nullable required field `generation` cannot be null."
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
# ItemGameIndex$unlock()
#
## Below is an example to define the print function
# ItemGameIndex$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ItemGameIndex$lock()


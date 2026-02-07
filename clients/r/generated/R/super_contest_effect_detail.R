#' Create a new SuperContestEffectDetail
#'
#' @description
#' SuperContestEffectDetail Class
#'
#' @docType class
#' @title SuperContestEffectDetail
#' @description SuperContestEffectDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field appeal  integer
#' @field flavor_text_entries  list(\link{SuperContestEffectFlavorText})
#' @field moves  list(\link{MoveSummary})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SuperContestEffectDetail <- R6::R6Class(
  "SuperContestEffectDetail",
  public = list(
    `id` = NULL,
    `appeal` = NULL,
    `flavor_text_entries` = NULL,
    `moves` = NULL,

    #' @description
    #' Initialize a new SuperContestEffectDetail class.
    #'
    #' @param id id
    #' @param appeal appeal
    #' @param flavor_text_entries flavor_text_entries
    #' @param moves moves
    #' @param ... Other optional arguments.
    initialize = function(`id`, `appeal`, `flavor_text_entries`, `moves`, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`appeal`)) {
        if (!(is.numeric(`appeal`) && length(`appeal`) == 1)) {
          stop(paste("Error! Invalid data for `appeal`. Must be an integer:", `appeal`))
        }
        self$`appeal` <- `appeal`
      }
      if (!missing(`flavor_text_entries`)) {
        stopifnot(is.vector(`flavor_text_entries`), length(`flavor_text_entries`) != 0)
        sapply(`flavor_text_entries`, function(x) stopifnot(R6::is.R6(x)))
        self$`flavor_text_entries` <- `flavor_text_entries`
      }
      if (!missing(`moves`)) {
        stopifnot(is.vector(`moves`), length(`moves`) != 0)
        sapply(`moves`, function(x) stopifnot(R6::is.R6(x)))
        self$`moves` <- `moves`
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
    #' @return SuperContestEffectDetail as a base R list.
    #' @examples
    #' # convert array of SuperContestEffectDetail (x) to a data frame
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
    #' Convert SuperContestEffectDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SuperContestEffectDetailObject <- list()
      if (!is.null(self$`id`)) {
        SuperContestEffectDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`appeal`)) {
        SuperContestEffectDetailObject[["appeal"]] <-
          self$`appeal`
      }
      if (!is.null(self$`flavor_text_entries`)) {
        SuperContestEffectDetailObject[["flavor_text_entries"]] <-
          lapply(self$`flavor_text_entries`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`moves`)) {
        SuperContestEffectDetailObject[["moves"]] <-
          lapply(self$`moves`, function(x) x$toSimpleType())
      }
      return(SuperContestEffectDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of SuperContestEffectDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of SuperContestEffectDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`appeal`)) {
        self$`appeal` <- this_object$`appeal`
      }
      if (!is.null(this_object$`flavor_text_entries`)) {
        self$`flavor_text_entries` <- ApiClient$new()$deserializeObj(this_object$`flavor_text_entries`, "array[SuperContestEffectFlavorText]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`moves`)) {
        self$`moves` <- ApiClient$new()$deserializeObj(this_object$`moves`, "array[MoveSummary]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return SuperContestEffectDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SuperContestEffectDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of SuperContestEffectDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`appeal` <- this_object$`appeal`
      self$`flavor_text_entries` <- ApiClient$new()$deserializeObj(this_object$`flavor_text_entries`, "array[SuperContestEffectFlavorText]", loadNamespace("openapi"))
      self$`moves` <- ApiClient$new()$deserializeObj(this_object$`moves`, "array[MoveSummary]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to SuperContestEffectDetail and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.numeric(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SuperContestEffectDetail: the required field `id` is missing."))
      }
      # check the required field `appeal`
      if (!is.null(input_json$`appeal`)) {
        if (!(is.numeric(input_json$`appeal`) && length(input_json$`appeal`) == 1)) {
          stop(paste("Error! Invalid data for `appeal`. Must be an integer:", input_json$`appeal`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SuperContestEffectDetail: the required field `appeal` is missing."))
      }
      # check the required field `flavor_text_entries`
      if (!is.null(input_json$`flavor_text_entries`)) {
        stopifnot(is.vector(input_json$`flavor_text_entries`), length(input_json$`flavor_text_entries`) != 0)
        tmp <- sapply(input_json$`flavor_text_entries`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SuperContestEffectDetail: the required field `flavor_text_entries` is missing."))
      }
      # check the required field `moves`
      if (!is.null(input_json$`moves`)) {
        stopifnot(is.vector(input_json$`moves`), length(input_json$`moves`) != 0)
        tmp <- sapply(input_json$`moves`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SuperContestEffectDetail: the required field `moves` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SuperContestEffectDetail
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `appeal` is null
      if (is.null(self$`appeal`)) {
        return(FALSE)
      }

      # check if the required `flavor_text_entries` is null
      if (is.null(self$`flavor_text_entries`)) {
        return(FALSE)
      }

      # check if the required `moves` is null
      if (is.null(self$`moves`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `appeal` is null
      if (is.null(self$`appeal`)) {
        invalid_fields["appeal"] <- "Non-nullable required field `appeal` cannot be null."
      }

      # check if the required `flavor_text_entries` is null
      if (is.null(self$`flavor_text_entries`)) {
        invalid_fields["flavor_text_entries"] <- "Non-nullable required field `flavor_text_entries` cannot be null."
      }

      # check if the required `moves` is null
      if (is.null(self$`moves`)) {
        invalid_fields["moves"] <- "Non-nullable required field `moves` cannot be null."
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
# SuperContestEffectDetail$unlock()
#
## Below is an example to define the print function
# SuperContestEffectDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SuperContestEffectDetail$lock()


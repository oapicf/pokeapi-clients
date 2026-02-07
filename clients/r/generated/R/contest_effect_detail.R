#' Create a new ContestEffectDetail
#'
#' @description
#' ContestEffectDetail Class
#'
#' @docType class
#' @title ContestEffectDetail
#' @description ContestEffectDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field appeal  integer
#' @field jam  integer
#' @field effect_entries  list(\link{ContestEffectEffectText})
#' @field flavor_text_entries  list(\link{ContestEffectFlavorText})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ContestEffectDetail <- R6::R6Class(
  "ContestEffectDetail",
  public = list(
    `id` = NULL,
    `appeal` = NULL,
    `jam` = NULL,
    `effect_entries` = NULL,
    `flavor_text_entries` = NULL,

    #' @description
    #' Initialize a new ContestEffectDetail class.
    #'
    #' @param id id
    #' @param appeal appeal
    #' @param jam jam
    #' @param effect_entries effect_entries
    #' @param flavor_text_entries flavor_text_entries
    #' @param ... Other optional arguments.
    initialize = function(`id`, `appeal`, `jam`, `effect_entries`, `flavor_text_entries`, ...) {
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
      if (!missing(`jam`)) {
        if (!(is.numeric(`jam`) && length(`jam`) == 1)) {
          stop(paste("Error! Invalid data for `jam`. Must be an integer:", `jam`))
        }
        self$`jam` <- `jam`
      }
      if (!missing(`effect_entries`)) {
        stopifnot(is.vector(`effect_entries`), length(`effect_entries`) != 0)
        sapply(`effect_entries`, function(x) stopifnot(R6::is.R6(x)))
        self$`effect_entries` <- `effect_entries`
      }
      if (!missing(`flavor_text_entries`)) {
        stopifnot(is.vector(`flavor_text_entries`), length(`flavor_text_entries`) != 0)
        sapply(`flavor_text_entries`, function(x) stopifnot(R6::is.R6(x)))
        self$`flavor_text_entries` <- `flavor_text_entries`
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
    #' @return ContestEffectDetail as a base R list.
    #' @examples
    #' # convert array of ContestEffectDetail (x) to a data frame
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
    #' Convert ContestEffectDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ContestEffectDetailObject <- list()
      if (!is.null(self$`id`)) {
        ContestEffectDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`appeal`)) {
        ContestEffectDetailObject[["appeal"]] <-
          self$`appeal`
      }
      if (!is.null(self$`jam`)) {
        ContestEffectDetailObject[["jam"]] <-
          self$`jam`
      }
      if (!is.null(self$`effect_entries`)) {
        ContestEffectDetailObject[["effect_entries"]] <-
          lapply(self$`effect_entries`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`flavor_text_entries`)) {
        ContestEffectDetailObject[["flavor_text_entries"]] <-
          lapply(self$`flavor_text_entries`, function(x) x$toSimpleType())
      }
      return(ContestEffectDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ContestEffectDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of ContestEffectDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`appeal`)) {
        self$`appeal` <- this_object$`appeal`
      }
      if (!is.null(this_object$`jam`)) {
        self$`jam` <- this_object$`jam`
      }
      if (!is.null(this_object$`effect_entries`)) {
        self$`effect_entries` <- ApiClient$new()$deserializeObj(this_object$`effect_entries`, "array[ContestEffectEffectText]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`flavor_text_entries`)) {
        self$`flavor_text_entries` <- ApiClient$new()$deserializeObj(this_object$`flavor_text_entries`, "array[ContestEffectFlavorText]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ContestEffectDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ContestEffectDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of ContestEffectDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`appeal` <- this_object$`appeal`
      self$`jam` <- this_object$`jam`
      self$`effect_entries` <- ApiClient$new()$deserializeObj(this_object$`effect_entries`, "array[ContestEffectEffectText]", loadNamespace("openapi"))
      self$`flavor_text_entries` <- ApiClient$new()$deserializeObj(this_object$`flavor_text_entries`, "array[ContestEffectFlavorText]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to ContestEffectDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for ContestEffectDetail: the required field `id` is missing."))
      }
      # check the required field `appeal`
      if (!is.null(input_json$`appeal`)) {
        if (!(is.numeric(input_json$`appeal`) && length(input_json$`appeal`) == 1)) {
          stop(paste("Error! Invalid data for `appeal`. Must be an integer:", input_json$`appeal`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ContestEffectDetail: the required field `appeal` is missing."))
      }
      # check the required field `jam`
      if (!is.null(input_json$`jam`)) {
        if (!(is.numeric(input_json$`jam`) && length(input_json$`jam`) == 1)) {
          stop(paste("Error! Invalid data for `jam`. Must be an integer:", input_json$`jam`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ContestEffectDetail: the required field `jam` is missing."))
      }
      # check the required field `effect_entries`
      if (!is.null(input_json$`effect_entries`)) {
        stopifnot(is.vector(input_json$`effect_entries`), length(input_json$`effect_entries`) != 0)
        tmp <- sapply(input_json$`effect_entries`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ContestEffectDetail: the required field `effect_entries` is missing."))
      }
      # check the required field `flavor_text_entries`
      if (!is.null(input_json$`flavor_text_entries`)) {
        stopifnot(is.vector(input_json$`flavor_text_entries`), length(input_json$`flavor_text_entries`) != 0)
        tmp <- sapply(input_json$`flavor_text_entries`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ContestEffectDetail: the required field `flavor_text_entries` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ContestEffectDetail
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

      # check if the required `jam` is null
      if (is.null(self$`jam`)) {
        return(FALSE)
      }

      # check if the required `effect_entries` is null
      if (is.null(self$`effect_entries`)) {
        return(FALSE)
      }

      # check if the required `flavor_text_entries` is null
      if (is.null(self$`flavor_text_entries`)) {
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

      # check if the required `jam` is null
      if (is.null(self$`jam`)) {
        invalid_fields["jam"] <- "Non-nullable required field `jam` cannot be null."
      }

      # check if the required `effect_entries` is null
      if (is.null(self$`effect_entries`)) {
        invalid_fields["effect_entries"] <- "Non-nullable required field `effect_entries` cannot be null."
      }

      # check if the required `flavor_text_entries` is null
      if (is.null(self$`flavor_text_entries`)) {
        invalid_fields["flavor_text_entries"] <- "Non-nullable required field `flavor_text_entries` cannot be null."
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
# ContestEffectDetail$unlock()
#
## Below is an example to define the print function
# ContestEffectDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ContestEffectDetail$lock()


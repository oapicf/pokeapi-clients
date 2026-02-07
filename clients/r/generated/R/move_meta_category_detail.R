#' Create a new MoveMetaCategoryDetail
#'
#' @description
#' MoveMetaCategoryDetail Class
#'
#' @docType class
#' @title MoveMetaCategoryDetail
#' @description MoveMetaCategoryDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field descriptions  list(\link{MoveMetaCategoryDescription})
#' @field moves  list(\link{AbilityDetailPokemonInnerPokemon})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MoveMetaCategoryDetail <- R6::R6Class(
  "MoveMetaCategoryDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `descriptions` = NULL,
    `moves` = NULL,

    #' @description
    #' Initialize a new MoveMetaCategoryDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param descriptions descriptions
    #' @param moves moves
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `descriptions`, `moves`, ...) {
      if (!missing(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`descriptions`)) {
        stopifnot(is.vector(`descriptions`), length(`descriptions`) != 0)
        sapply(`descriptions`, function(x) stopifnot(R6::is.R6(x)))
        self$`descriptions` <- `descriptions`
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
    #' @return MoveMetaCategoryDetail as a base R list.
    #' @examples
    #' # convert array of MoveMetaCategoryDetail (x) to a data frame
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
    #' Convert MoveMetaCategoryDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MoveMetaCategoryDetailObject <- list()
      if (!is.null(self$`id`)) {
        MoveMetaCategoryDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        MoveMetaCategoryDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`descriptions`)) {
        MoveMetaCategoryDetailObject[["descriptions"]] <-
          lapply(self$`descriptions`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`moves`)) {
        MoveMetaCategoryDetailObject[["moves"]] <-
          lapply(self$`moves`, function(x) x$toSimpleType())
      }
      return(MoveMetaCategoryDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of MoveMetaCategoryDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveMetaCategoryDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`descriptions`)) {
        self$`descriptions` <- ApiClient$new()$deserializeObj(this_object$`descriptions`, "array[MoveMetaCategoryDescription]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`moves`)) {
        self$`moves` <- ApiClient$new()$deserializeObj(this_object$`moves`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MoveMetaCategoryDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MoveMetaCategoryDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of MoveMetaCategoryDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`descriptions` <- ApiClient$new()$deserializeObj(this_object$`descriptions`, "array[MoveMetaCategoryDescription]", loadNamespace("openapi"))
      self$`moves` <- ApiClient$new()$deserializeObj(this_object$`moves`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to MoveMetaCategoryDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for MoveMetaCategoryDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveMetaCategoryDetail: the required field `name` is missing."))
      }
      # check the required field `descriptions`
      if (!is.null(input_json$`descriptions`)) {
        stopifnot(is.vector(input_json$`descriptions`), length(input_json$`descriptions`) != 0)
        tmp <- sapply(input_json$`descriptions`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveMetaCategoryDetail: the required field `descriptions` is missing."))
      }
      # check the required field `moves`
      if (!is.null(input_json$`moves`)) {
        stopifnot(is.vector(input_json$`moves`), length(input_json$`moves`) != 0)
        tmp <- sapply(input_json$`moves`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MoveMetaCategoryDetail: the required field `moves` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MoveMetaCategoryDetail
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

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      if (nchar(self$`name`) > 100) {
        return(FALSE)
      }

      # check if the required `descriptions` is null
      if (is.null(self$`descriptions`)) {
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

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      if (nchar(self$`name`) > 100) {
        invalid_fields["name"] <- "Invalid length for `name`, must be smaller than or equal to 100."
      }

      # check if the required `descriptions` is null
      if (is.null(self$`descriptions`)) {
        invalid_fields["descriptions"] <- "Non-nullable required field `descriptions` cannot be null."
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
# MoveMetaCategoryDetail$unlock()
#
## Below is an example to define the print function
# MoveMetaCategoryDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MoveMetaCategoryDetail$lock()


#' Create a new LocationDetail
#'
#' @description
#' LocationDetail Class
#'
#' @docType class
#' @title LocationDetail
#' @description LocationDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field region  \link{RegionSummary}
#' @field names  list(\link{LocationName})
#' @field game_indices  list(\link{LocationGameIndex})
#' @field areas  list(\link{LocationAreaSummary})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LocationDetail <- R6::R6Class(
  "LocationDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `region` = NULL,
    `names` = NULL,
    `game_indices` = NULL,
    `areas` = NULL,

    #' @description
    #' Initialize a new LocationDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param region region
    #' @param names names
    #' @param game_indices game_indices
    #' @param areas areas
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `region`, `names`, `game_indices`, `areas`, ...) {
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
      if (!missing(`region`)) {
        stopifnot(R6::is.R6(`region`))
        self$`region` <- `region`
      }
      if (!missing(`names`)) {
        stopifnot(is.vector(`names`), length(`names`) != 0)
        sapply(`names`, function(x) stopifnot(R6::is.R6(x)))
        self$`names` <- `names`
      }
      if (!missing(`game_indices`)) {
        stopifnot(is.vector(`game_indices`), length(`game_indices`) != 0)
        sapply(`game_indices`, function(x) stopifnot(R6::is.R6(x)))
        self$`game_indices` <- `game_indices`
      }
      if (!missing(`areas`)) {
        stopifnot(is.vector(`areas`), length(`areas`) != 0)
        sapply(`areas`, function(x) stopifnot(R6::is.R6(x)))
        self$`areas` <- `areas`
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
    #' @return LocationDetail as a base R list.
    #' @examples
    #' # convert array of LocationDetail (x) to a data frame
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
    #' Convert LocationDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LocationDetailObject <- list()
      if (!is.null(self$`id`)) {
        LocationDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        LocationDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`region`)) {
        LocationDetailObject[["region"]] <-
          self$`region`$toSimpleType()
      }
      if (!is.null(self$`names`)) {
        LocationDetailObject[["names"]] <-
          lapply(self$`names`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`game_indices`)) {
        LocationDetailObject[["game_indices"]] <-
          lapply(self$`game_indices`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`areas`)) {
        LocationDetailObject[["areas"]] <-
          lapply(self$`areas`, function(x) x$toSimpleType())
      }
      return(LocationDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of LocationDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocationDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`region`)) {
        `region_object` <- RegionSummary$new()
        `region_object`$fromJSON(jsonlite::toJSON(this_object$`region`, auto_unbox = TRUE, digits = NA))
        self$`region` <- `region_object`
      }
      if (!is.null(this_object$`names`)) {
        self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[LocationName]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`game_indices`)) {
        self$`game_indices` <- ApiClient$new()$deserializeObj(this_object$`game_indices`, "array[LocationGameIndex]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`areas`)) {
        self$`areas` <- ApiClient$new()$deserializeObj(this_object$`areas`, "array[LocationAreaSummary]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LocationDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LocationDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocationDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`region` <- RegionSummary$new()$fromJSON(jsonlite::toJSON(this_object$`region`, auto_unbox = TRUE, digits = NA))
      self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[LocationName]", loadNamespace("openapi"))
      self$`game_indices` <- ApiClient$new()$deserializeObj(this_object$`game_indices`, "array[LocationGameIndex]", loadNamespace("openapi"))
      self$`areas` <- ApiClient$new()$deserializeObj(this_object$`areas`, "array[LocationAreaSummary]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to LocationDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for LocationDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocationDetail: the required field `name` is missing."))
      }
      # check the required field `region`
      if (!is.null(input_json$`region`)) {
        stopifnot(R6::is.R6(input_json$`region`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocationDetail: the required field `region` is missing."))
      }
      # check the required field `names`
      if (!is.null(input_json$`names`)) {
        stopifnot(is.vector(input_json$`names`), length(input_json$`names`) != 0)
        tmp <- sapply(input_json$`names`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocationDetail: the required field `names` is missing."))
      }
      # check the required field `game_indices`
      if (!is.null(input_json$`game_indices`)) {
        stopifnot(is.vector(input_json$`game_indices`), length(input_json$`game_indices`) != 0)
        tmp <- sapply(input_json$`game_indices`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocationDetail: the required field `game_indices` is missing."))
      }
      # check the required field `areas`
      if (!is.null(input_json$`areas`)) {
        stopifnot(is.vector(input_json$`areas`), length(input_json$`areas`) != 0)
        tmp <- sapply(input_json$`areas`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocationDetail: the required field `areas` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LocationDetail
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

      # check if the required `region` is null
      if (is.null(self$`region`)) {
        return(FALSE)
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        return(FALSE)
      }

      # check if the required `game_indices` is null
      if (is.null(self$`game_indices`)) {
        return(FALSE)
      }

      # check if the required `areas` is null
      if (is.null(self$`areas`)) {
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

      # check if the required `region` is null
      if (is.null(self$`region`)) {
        invalid_fields["region"] <- "Non-nullable required field `region` cannot be null."
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        invalid_fields["names"] <- "Non-nullable required field `names` cannot be null."
      }

      # check if the required `game_indices` is null
      if (is.null(self$`game_indices`)) {
        invalid_fields["game_indices"] <- "Non-nullable required field `game_indices` cannot be null."
      }

      # check if the required `areas` is null
      if (is.null(self$`areas`)) {
        invalid_fields["areas"] <- "Non-nullable required field `areas` cannot be null."
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
# LocationDetail$unlock()
#
## Below is an example to define the print function
# LocationDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LocationDetail$lock()


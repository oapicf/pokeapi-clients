#' Create a new VersionGroupDetail
#'
#' @description
#' VersionGroupDetail Class
#'
#' @docType class
#' @title VersionGroupDetail
#' @description VersionGroupDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field order  integer [optional]
#' @field generation  \link{GenerationSummary}
#' @field move_learn_methods  list(\link{AbilityDetailPokemonInnerPokemon})
#' @field pokedexes  list(\link{AbilityDetailPokemonInnerPokemon})
#' @field regions  list(\link{AbilityDetailPokemonInnerPokemon})
#' @field versions  list(\link{VersionSummary})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
VersionGroupDetail <- R6::R6Class(
  "VersionGroupDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `order` = NULL,
    `generation` = NULL,
    `move_learn_methods` = NULL,
    `pokedexes` = NULL,
    `regions` = NULL,
    `versions` = NULL,

    #' @description
    #' Initialize a new VersionGroupDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param generation generation
    #' @param move_learn_methods move_learn_methods
    #' @param pokedexes pokedexes
    #' @param regions regions
    #' @param versions versions
    #' @param order order
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `generation`, `move_learn_methods`, `pokedexes`, `regions`, `versions`, `order` = NULL, ...) {
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
      if (!missing(`generation`)) {
        stopifnot(R6::is.R6(`generation`))
        self$`generation` <- `generation`
      }
      if (!missing(`move_learn_methods`)) {
        stopifnot(is.vector(`move_learn_methods`), length(`move_learn_methods`) != 0)
        sapply(`move_learn_methods`, function(x) stopifnot(R6::is.R6(x)))
        self$`move_learn_methods` <- `move_learn_methods`
      }
      if (!missing(`pokedexes`)) {
        stopifnot(is.vector(`pokedexes`), length(`pokedexes`) != 0)
        sapply(`pokedexes`, function(x) stopifnot(R6::is.R6(x)))
        self$`pokedexes` <- `pokedexes`
      }
      if (!missing(`regions`)) {
        stopifnot(is.vector(`regions`), length(`regions`) != 0)
        sapply(`regions`, function(x) stopifnot(R6::is.R6(x)))
        self$`regions` <- `regions`
      }
      if (!missing(`versions`)) {
        stopifnot(is.vector(`versions`), length(`versions`) != 0)
        sapply(`versions`, function(x) stopifnot(R6::is.R6(x)))
        self$`versions` <- `versions`
      }
      if (!is.null(`order`)) {
        if (!(is.numeric(`order`) && length(`order`) == 1)) {
          stop(paste("Error! Invalid data for `order`. Must be an integer:", `order`))
        }
        self$`order` <- `order`
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
    #' @return VersionGroupDetail as a base R list.
    #' @examples
    #' # convert array of VersionGroupDetail (x) to a data frame
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
    #' Convert VersionGroupDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      VersionGroupDetailObject <- list()
      if (!is.null(self$`id`)) {
        VersionGroupDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        VersionGroupDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`order`)) {
        VersionGroupDetailObject[["order"]] <-
          self$`order`
      }
      if (!is.null(self$`generation`)) {
        VersionGroupDetailObject[["generation"]] <-
          self$`generation`$toSimpleType()
      }
      if (!is.null(self$`move_learn_methods`)) {
        VersionGroupDetailObject[["move_learn_methods"]] <-
          lapply(self$`move_learn_methods`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`pokedexes`)) {
        VersionGroupDetailObject[["pokedexes"]] <-
          lapply(self$`pokedexes`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`regions`)) {
        VersionGroupDetailObject[["regions"]] <-
          lapply(self$`regions`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`versions`)) {
        VersionGroupDetailObject[["versions"]] <-
          lapply(self$`versions`, function(x) x$toSimpleType())
      }
      return(VersionGroupDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of VersionGroupDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of VersionGroupDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`order`)) {
        self$`order` <- this_object$`order`
      }
      if (!is.null(this_object$`generation`)) {
        `generation_object` <- GenerationSummary$new()
        `generation_object`$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
        self$`generation` <- `generation_object`
      }
      if (!is.null(this_object$`move_learn_methods`)) {
        self$`move_learn_methods` <- ApiClient$new()$deserializeObj(this_object$`move_learn_methods`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`pokedexes`)) {
        self$`pokedexes` <- ApiClient$new()$deserializeObj(this_object$`pokedexes`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`regions`)) {
        self$`regions` <- ApiClient$new()$deserializeObj(this_object$`regions`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`versions`)) {
        self$`versions` <- ApiClient$new()$deserializeObj(this_object$`versions`, "array[VersionSummary]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return VersionGroupDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of VersionGroupDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of VersionGroupDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`order` <- this_object$`order`
      self$`generation` <- GenerationSummary$new()$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
      self$`move_learn_methods` <- ApiClient$new()$deserializeObj(this_object$`move_learn_methods`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      self$`pokedexes` <- ApiClient$new()$deserializeObj(this_object$`pokedexes`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      self$`regions` <- ApiClient$new()$deserializeObj(this_object$`regions`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      self$`versions` <- ApiClient$new()$deserializeObj(this_object$`versions`, "array[VersionSummary]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to VersionGroupDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for VersionGroupDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VersionGroupDetail: the required field `name` is missing."))
      }
      # check the required field `generation`
      if (!is.null(input_json$`generation`)) {
        stopifnot(R6::is.R6(input_json$`generation`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VersionGroupDetail: the required field `generation` is missing."))
      }
      # check the required field `move_learn_methods`
      if (!is.null(input_json$`move_learn_methods`)) {
        stopifnot(is.vector(input_json$`move_learn_methods`), length(input_json$`move_learn_methods`) != 0)
        tmp <- sapply(input_json$`move_learn_methods`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VersionGroupDetail: the required field `move_learn_methods` is missing."))
      }
      # check the required field `pokedexes`
      if (!is.null(input_json$`pokedexes`)) {
        stopifnot(is.vector(input_json$`pokedexes`), length(input_json$`pokedexes`) != 0)
        tmp <- sapply(input_json$`pokedexes`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VersionGroupDetail: the required field `pokedexes` is missing."))
      }
      # check the required field `regions`
      if (!is.null(input_json$`regions`)) {
        stopifnot(is.vector(input_json$`regions`), length(input_json$`regions`) != 0)
        tmp <- sapply(input_json$`regions`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VersionGroupDetail: the required field `regions` is missing."))
      }
      # check the required field `versions`
      if (!is.null(input_json$`versions`)) {
        stopifnot(is.vector(input_json$`versions`), length(input_json$`versions`) != 0)
        tmp <- sapply(input_json$`versions`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VersionGroupDetail: the required field `versions` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of VersionGroupDetail
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

      # check if the required `generation` is null
      if (is.null(self$`generation`)) {
        return(FALSE)
      }

      # check if the required `move_learn_methods` is null
      if (is.null(self$`move_learn_methods`)) {
        return(FALSE)
      }

      # check if the required `pokedexes` is null
      if (is.null(self$`pokedexes`)) {
        return(FALSE)
      }

      # check if the required `regions` is null
      if (is.null(self$`regions`)) {
        return(FALSE)
      }

      # check if the required `versions` is null
      if (is.null(self$`versions`)) {
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

      # check if the required `generation` is null
      if (is.null(self$`generation`)) {
        invalid_fields["generation"] <- "Non-nullable required field `generation` cannot be null."
      }

      # check if the required `move_learn_methods` is null
      if (is.null(self$`move_learn_methods`)) {
        invalid_fields["move_learn_methods"] <- "Non-nullable required field `move_learn_methods` cannot be null."
      }

      # check if the required `pokedexes` is null
      if (is.null(self$`pokedexes`)) {
        invalid_fields["pokedexes"] <- "Non-nullable required field `pokedexes` cannot be null."
      }

      # check if the required `regions` is null
      if (is.null(self$`regions`)) {
        invalid_fields["regions"] <- "Non-nullable required field `regions` cannot be null."
      }

      # check if the required `versions` is null
      if (is.null(self$`versions`)) {
        invalid_fields["versions"] <- "Non-nullable required field `versions` cannot be null."
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
# VersionGroupDetail$unlock()
#
## Below is an example to define the print function
# VersionGroupDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# VersionGroupDetail$lock()


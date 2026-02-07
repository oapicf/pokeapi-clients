#' Create a new RegionDetail
#'
#' @description
#' RegionDetail Class
#'
#' @docType class
#' @title RegionDetail
#' @description RegionDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field locations  list(\link{LocationSummary})
#' @field main_generation  \link{GenerationSummary}
#' @field names  list(\link{RegionName})
#' @field pokedexes  list(\link{PokedexSummary})
#' @field version_groups  list(\link{AbilityDetailPokemonInnerPokemon})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RegionDetail <- R6::R6Class(
  "RegionDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `locations` = NULL,
    `main_generation` = NULL,
    `names` = NULL,
    `pokedexes` = NULL,
    `version_groups` = NULL,

    #' @description
    #' Initialize a new RegionDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param locations locations
    #' @param main_generation main_generation
    #' @param names names
    #' @param pokedexes pokedexes
    #' @param version_groups version_groups
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `locations`, `main_generation`, `names`, `pokedexes`, `version_groups`, ...) {
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
      if (!missing(`locations`)) {
        stopifnot(is.vector(`locations`), length(`locations`) != 0)
        sapply(`locations`, function(x) stopifnot(R6::is.R6(x)))
        self$`locations` <- `locations`
      }
      if (!missing(`main_generation`)) {
        stopifnot(R6::is.R6(`main_generation`))
        self$`main_generation` <- `main_generation`
      }
      if (!missing(`names`)) {
        stopifnot(is.vector(`names`), length(`names`) != 0)
        sapply(`names`, function(x) stopifnot(R6::is.R6(x)))
        self$`names` <- `names`
      }
      if (!missing(`pokedexes`)) {
        stopifnot(is.vector(`pokedexes`), length(`pokedexes`) != 0)
        sapply(`pokedexes`, function(x) stopifnot(R6::is.R6(x)))
        self$`pokedexes` <- `pokedexes`
      }
      if (!missing(`version_groups`)) {
        stopifnot(is.vector(`version_groups`), length(`version_groups`) != 0)
        sapply(`version_groups`, function(x) stopifnot(R6::is.R6(x)))
        self$`version_groups` <- `version_groups`
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
    #' @return RegionDetail as a base R list.
    #' @examples
    #' # convert array of RegionDetail (x) to a data frame
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
    #' Convert RegionDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RegionDetailObject <- list()
      if (!is.null(self$`id`)) {
        RegionDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        RegionDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`locations`)) {
        RegionDetailObject[["locations"]] <-
          lapply(self$`locations`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`main_generation`)) {
        RegionDetailObject[["main_generation"]] <-
          self$`main_generation`$toSimpleType()
      }
      if (!is.null(self$`names`)) {
        RegionDetailObject[["names"]] <-
          lapply(self$`names`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`pokedexes`)) {
        RegionDetailObject[["pokedexes"]] <-
          lapply(self$`pokedexes`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`version_groups`)) {
        RegionDetailObject[["version_groups"]] <-
          lapply(self$`version_groups`, function(x) x$toSimpleType())
      }
      return(RegionDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RegionDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of RegionDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`locations`)) {
        self$`locations` <- ApiClient$new()$deserializeObj(this_object$`locations`, "array[LocationSummary]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`main_generation`)) {
        `main_generation_object` <- GenerationSummary$new()
        `main_generation_object`$fromJSON(jsonlite::toJSON(this_object$`main_generation`, auto_unbox = TRUE, digits = NA))
        self$`main_generation` <- `main_generation_object`
      }
      if (!is.null(this_object$`names`)) {
        self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[RegionName]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`pokedexes`)) {
        self$`pokedexes` <- ApiClient$new()$deserializeObj(this_object$`pokedexes`, "array[PokedexSummary]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`version_groups`)) {
        self$`version_groups` <- ApiClient$new()$deserializeObj(this_object$`version_groups`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RegionDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RegionDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of RegionDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`locations` <- ApiClient$new()$deserializeObj(this_object$`locations`, "array[LocationSummary]", loadNamespace("openapi"))
      self$`main_generation` <- GenerationSummary$new()$fromJSON(jsonlite::toJSON(this_object$`main_generation`, auto_unbox = TRUE, digits = NA))
      self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[RegionName]", loadNamespace("openapi"))
      self$`pokedexes` <- ApiClient$new()$deserializeObj(this_object$`pokedexes`, "array[PokedexSummary]", loadNamespace("openapi"))
      self$`version_groups` <- ApiClient$new()$deserializeObj(this_object$`version_groups`, "array[AbilityDetailPokemonInnerPokemon]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to RegionDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RegionDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RegionDetail: the required field `name` is missing."))
      }
      # check the required field `locations`
      if (!is.null(input_json$`locations`)) {
        stopifnot(is.vector(input_json$`locations`), length(input_json$`locations`) != 0)
        tmp <- sapply(input_json$`locations`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RegionDetail: the required field `locations` is missing."))
      }
      # check the required field `main_generation`
      if (!is.null(input_json$`main_generation`)) {
        stopifnot(R6::is.R6(input_json$`main_generation`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RegionDetail: the required field `main_generation` is missing."))
      }
      # check the required field `names`
      if (!is.null(input_json$`names`)) {
        stopifnot(is.vector(input_json$`names`), length(input_json$`names`) != 0)
        tmp <- sapply(input_json$`names`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RegionDetail: the required field `names` is missing."))
      }
      # check the required field `pokedexes`
      if (!is.null(input_json$`pokedexes`)) {
        stopifnot(is.vector(input_json$`pokedexes`), length(input_json$`pokedexes`) != 0)
        tmp <- sapply(input_json$`pokedexes`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RegionDetail: the required field `pokedexes` is missing."))
      }
      # check the required field `version_groups`
      if (!is.null(input_json$`version_groups`)) {
        stopifnot(is.vector(input_json$`version_groups`), length(input_json$`version_groups`) != 0)
        tmp <- sapply(input_json$`version_groups`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RegionDetail: the required field `version_groups` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RegionDetail
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

      # check if the required `locations` is null
      if (is.null(self$`locations`)) {
        return(FALSE)
      }

      # check if the required `main_generation` is null
      if (is.null(self$`main_generation`)) {
        return(FALSE)
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        return(FALSE)
      }

      # check if the required `pokedexes` is null
      if (is.null(self$`pokedexes`)) {
        return(FALSE)
      }

      # check if the required `version_groups` is null
      if (is.null(self$`version_groups`)) {
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

      # check if the required `locations` is null
      if (is.null(self$`locations`)) {
        invalid_fields["locations"] <- "Non-nullable required field `locations` cannot be null."
      }

      # check if the required `main_generation` is null
      if (is.null(self$`main_generation`)) {
        invalid_fields["main_generation"] <- "Non-nullable required field `main_generation` cannot be null."
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        invalid_fields["names"] <- "Non-nullable required field `names` cannot be null."
      }

      # check if the required `pokedexes` is null
      if (is.null(self$`pokedexes`)) {
        invalid_fields["pokedexes"] <- "Non-nullable required field `pokedexes` cannot be null."
      }

      # check if the required `version_groups` is null
      if (is.null(self$`version_groups`)) {
        invalid_fields["version_groups"] <- "Non-nullable required field `version_groups` cannot be null."
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
# RegionDetail$unlock()
#
## Below is an example to define the print function
# RegionDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RegionDetail$lock()


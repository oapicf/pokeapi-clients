#' Create a new GenerationDetail
#'
#' @description
#' GenerationDetail Class
#'
#' @docType class
#' @title GenerationDetail
#' @description GenerationDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field abilities  list(\link{AbilitySummary})
#' @field main_region  \link{RegionSummary}
#' @field moves  list(\link{MoveSummary})
#' @field names  list(\link{GenerationName})
#' @field pokemon_species  list(\link{PokemonSpeciesSummary})
#' @field types  list(\link{TypeSummary})
#' @field version_groups  list(\link{VersionGroupSummary})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenerationDetail <- R6::R6Class(
  "GenerationDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `abilities` = NULL,
    `main_region` = NULL,
    `moves` = NULL,
    `names` = NULL,
    `pokemon_species` = NULL,
    `types` = NULL,
    `version_groups` = NULL,

    #' @description
    #' Initialize a new GenerationDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param abilities abilities
    #' @param main_region main_region
    #' @param moves moves
    #' @param names names
    #' @param pokemon_species pokemon_species
    #' @param types types
    #' @param version_groups version_groups
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `abilities`, `main_region`, `moves`, `names`, `pokemon_species`, `types`, `version_groups`, ...) {
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
      if (!missing(`abilities`)) {
        stopifnot(is.vector(`abilities`), length(`abilities`) != 0)
        sapply(`abilities`, function(x) stopifnot(R6::is.R6(x)))
        self$`abilities` <- `abilities`
      }
      if (!missing(`main_region`)) {
        stopifnot(R6::is.R6(`main_region`))
        self$`main_region` <- `main_region`
      }
      if (!missing(`moves`)) {
        stopifnot(is.vector(`moves`), length(`moves`) != 0)
        sapply(`moves`, function(x) stopifnot(R6::is.R6(x)))
        self$`moves` <- `moves`
      }
      if (!missing(`names`)) {
        stopifnot(is.vector(`names`), length(`names`) != 0)
        sapply(`names`, function(x) stopifnot(R6::is.R6(x)))
        self$`names` <- `names`
      }
      if (!missing(`pokemon_species`)) {
        stopifnot(is.vector(`pokemon_species`), length(`pokemon_species`) != 0)
        sapply(`pokemon_species`, function(x) stopifnot(R6::is.R6(x)))
        self$`pokemon_species` <- `pokemon_species`
      }
      if (!missing(`types`)) {
        stopifnot(is.vector(`types`), length(`types`) != 0)
        sapply(`types`, function(x) stopifnot(R6::is.R6(x)))
        self$`types` <- `types`
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
    #' @return GenerationDetail as a base R list.
    #' @examples
    #' # convert array of GenerationDetail (x) to a data frame
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
    #' Convert GenerationDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      GenerationDetailObject <- list()
      if (!is.null(self$`id`)) {
        GenerationDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        GenerationDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`abilities`)) {
        GenerationDetailObject[["abilities"]] <-
          lapply(self$`abilities`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`main_region`)) {
        GenerationDetailObject[["main_region"]] <-
          self$`main_region`$toSimpleType()
      }
      if (!is.null(self$`moves`)) {
        GenerationDetailObject[["moves"]] <-
          lapply(self$`moves`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`names`)) {
        GenerationDetailObject[["names"]] <-
          lapply(self$`names`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`pokemon_species`)) {
        GenerationDetailObject[["pokemon_species"]] <-
          lapply(self$`pokemon_species`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`types`)) {
        GenerationDetailObject[["types"]] <-
          lapply(self$`types`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`version_groups`)) {
        GenerationDetailObject[["version_groups"]] <-
          lapply(self$`version_groups`, function(x) x$toSimpleType())
      }
      return(GenerationDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of GenerationDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerationDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`abilities`)) {
        self$`abilities` <- ApiClient$new()$deserializeObj(this_object$`abilities`, "array[AbilitySummary]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`main_region`)) {
        `main_region_object` <- RegionSummary$new()
        `main_region_object`$fromJSON(jsonlite::toJSON(this_object$`main_region`, auto_unbox = TRUE, digits = NA))
        self$`main_region` <- `main_region_object`
      }
      if (!is.null(this_object$`moves`)) {
        self$`moves` <- ApiClient$new()$deserializeObj(this_object$`moves`, "array[MoveSummary]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`names`)) {
        self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[GenerationName]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`pokemon_species`)) {
        self$`pokemon_species` <- ApiClient$new()$deserializeObj(this_object$`pokemon_species`, "array[PokemonSpeciesSummary]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`types`)) {
        self$`types` <- ApiClient$new()$deserializeObj(this_object$`types`, "array[TypeSummary]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`version_groups`)) {
        self$`version_groups` <- ApiClient$new()$deserializeObj(this_object$`version_groups`, "array[VersionGroupSummary]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return GenerationDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of GenerationDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenerationDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`abilities` <- ApiClient$new()$deserializeObj(this_object$`abilities`, "array[AbilitySummary]", loadNamespace("openapi"))
      self$`main_region` <- RegionSummary$new()$fromJSON(jsonlite::toJSON(this_object$`main_region`, auto_unbox = TRUE, digits = NA))
      self$`moves` <- ApiClient$new()$deserializeObj(this_object$`moves`, "array[MoveSummary]", loadNamespace("openapi"))
      self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[GenerationName]", loadNamespace("openapi"))
      self$`pokemon_species` <- ApiClient$new()$deserializeObj(this_object$`pokemon_species`, "array[PokemonSpeciesSummary]", loadNamespace("openapi"))
      self$`types` <- ApiClient$new()$deserializeObj(this_object$`types`, "array[TypeSummary]", loadNamespace("openapi"))
      self$`version_groups` <- ApiClient$new()$deserializeObj(this_object$`version_groups`, "array[VersionGroupSummary]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to GenerationDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for GenerationDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerationDetail: the required field `name` is missing."))
      }
      # check the required field `abilities`
      if (!is.null(input_json$`abilities`)) {
        stopifnot(is.vector(input_json$`abilities`), length(input_json$`abilities`) != 0)
        tmp <- sapply(input_json$`abilities`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerationDetail: the required field `abilities` is missing."))
      }
      # check the required field `main_region`
      if (!is.null(input_json$`main_region`)) {
        stopifnot(R6::is.R6(input_json$`main_region`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerationDetail: the required field `main_region` is missing."))
      }
      # check the required field `moves`
      if (!is.null(input_json$`moves`)) {
        stopifnot(is.vector(input_json$`moves`), length(input_json$`moves`) != 0)
        tmp <- sapply(input_json$`moves`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerationDetail: the required field `moves` is missing."))
      }
      # check the required field `names`
      if (!is.null(input_json$`names`)) {
        stopifnot(is.vector(input_json$`names`), length(input_json$`names`) != 0)
        tmp <- sapply(input_json$`names`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerationDetail: the required field `names` is missing."))
      }
      # check the required field `pokemon_species`
      if (!is.null(input_json$`pokemon_species`)) {
        stopifnot(is.vector(input_json$`pokemon_species`), length(input_json$`pokemon_species`) != 0)
        tmp <- sapply(input_json$`pokemon_species`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerationDetail: the required field `pokemon_species` is missing."))
      }
      # check the required field `types`
      if (!is.null(input_json$`types`)) {
        stopifnot(is.vector(input_json$`types`), length(input_json$`types`) != 0)
        tmp <- sapply(input_json$`types`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerationDetail: the required field `types` is missing."))
      }
      # check the required field `version_groups`
      if (!is.null(input_json$`version_groups`)) {
        stopifnot(is.vector(input_json$`version_groups`), length(input_json$`version_groups`) != 0)
        tmp <- sapply(input_json$`version_groups`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenerationDetail: the required field `version_groups` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenerationDetail
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

      # check if the required `abilities` is null
      if (is.null(self$`abilities`)) {
        return(FALSE)
      }

      # check if the required `main_region` is null
      if (is.null(self$`main_region`)) {
        return(FALSE)
      }

      # check if the required `moves` is null
      if (is.null(self$`moves`)) {
        return(FALSE)
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        return(FALSE)
      }

      # check if the required `pokemon_species` is null
      if (is.null(self$`pokemon_species`)) {
        return(FALSE)
      }

      # check if the required `types` is null
      if (is.null(self$`types`)) {
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

      # check if the required `abilities` is null
      if (is.null(self$`abilities`)) {
        invalid_fields["abilities"] <- "Non-nullable required field `abilities` cannot be null."
      }

      # check if the required `main_region` is null
      if (is.null(self$`main_region`)) {
        invalid_fields["main_region"] <- "Non-nullable required field `main_region` cannot be null."
      }

      # check if the required `moves` is null
      if (is.null(self$`moves`)) {
        invalid_fields["moves"] <- "Non-nullable required field `moves` cannot be null."
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        invalid_fields["names"] <- "Non-nullable required field `names` cannot be null."
      }

      # check if the required `pokemon_species` is null
      if (is.null(self$`pokemon_species`)) {
        invalid_fields["pokemon_species"] <- "Non-nullable required field `pokemon_species` cannot be null."
      }

      # check if the required `types` is null
      if (is.null(self$`types`)) {
        invalid_fields["types"] <- "Non-nullable required field `types` cannot be null."
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
# GenerationDetail$unlock()
#
## Below is an example to define the print function
# GenerationDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenerationDetail$lock()


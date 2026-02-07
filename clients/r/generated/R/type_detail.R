#' Create a new TypeDetail
#'
#' @description
#' Serializer for the Type resource
#'
#' @docType class
#' @title TypeDetail
#' @description TypeDetail Class
#' @format An \code{R6Class} generator object
#' @field id  integer
#' @field name  character
#' @field damage_relations  \link{TypeDetailDamageRelations}
#' @field past_damage_relations  list(\link{TypeDetailPastDamageRelationsInner})
#' @field game_indices  list(\link{TypeGameIndex})
#' @field generation  \link{GenerationSummary}
#' @field move_damage_class  \link{MoveDamageClassSummary}
#' @field names  list(\link{AbilityName})
#' @field pokemon  list(\link{TypeDetailPokemonInner})
#' @field moves  list(\link{MoveSummary})
#' @field sprites  named list(named list(\link{TypeDetailSpritesValueValue}))
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TypeDetail <- R6::R6Class(
  "TypeDetail",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `damage_relations` = NULL,
    `past_damage_relations` = NULL,
    `game_indices` = NULL,
    `generation` = NULL,
    `move_damage_class` = NULL,
    `names` = NULL,
    `pokemon` = NULL,
    `moves` = NULL,
    `sprites` = NULL,

    #' @description
    #' Initialize a new TypeDetail class.
    #'
    #' @param id id
    #' @param name name
    #' @param damage_relations damage_relations
    #' @param past_damage_relations past_damage_relations
    #' @param game_indices game_indices
    #' @param generation generation
    #' @param move_damage_class move_damage_class
    #' @param names names
    #' @param pokemon pokemon
    #' @param moves moves
    #' @param sprites sprites
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `damage_relations`, `past_damage_relations`, `game_indices`, `generation`, `move_damage_class`, `names`, `pokemon`, `moves`, `sprites`, ...) {
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
      if (!missing(`damage_relations`)) {
        stopifnot(R6::is.R6(`damage_relations`))
        self$`damage_relations` <- `damage_relations`
      }
      if (!missing(`past_damage_relations`)) {
        stopifnot(is.vector(`past_damage_relations`), length(`past_damage_relations`) != 0)
        sapply(`past_damage_relations`, function(x) stopifnot(R6::is.R6(x)))
        self$`past_damage_relations` <- `past_damage_relations`
      }
      if (!missing(`game_indices`)) {
        stopifnot(is.vector(`game_indices`), length(`game_indices`) != 0)
        sapply(`game_indices`, function(x) stopifnot(R6::is.R6(x)))
        self$`game_indices` <- `game_indices`
      }
      if (!missing(`generation`)) {
        stopifnot(R6::is.R6(`generation`))
        self$`generation` <- `generation`
      }
      if (!missing(`move_damage_class`)) {
        stopifnot(R6::is.R6(`move_damage_class`))
        self$`move_damage_class` <- `move_damage_class`
      }
      if (!missing(`names`)) {
        stopifnot(is.vector(`names`), length(`names`) != 0)
        sapply(`names`, function(x) stopifnot(R6::is.R6(x)))
        self$`names` <- `names`
      }
      if (!missing(`pokemon`)) {
        stopifnot(is.vector(`pokemon`), length(`pokemon`) != 0)
        sapply(`pokemon`, function(x) stopifnot(R6::is.R6(x)))
        self$`pokemon` <- `pokemon`
      }
      if (!missing(`moves`)) {
        stopifnot(is.vector(`moves`), length(`moves`) != 0)
        sapply(`moves`, function(x) stopifnot(R6::is.R6(x)))
        self$`moves` <- `moves`
      }
      if (!missing(`sprites`)) {
        stopifnot(is.vector(`sprites`), length(`sprites`) != 0)
        sapply(`sprites`, function(x) stopifnot(R6::is.R6(x)))
        self$`sprites` <- `sprites`
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
    #' @return TypeDetail as a base R list.
    #' @examples
    #' # convert array of TypeDetail (x) to a data frame
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
    #' Convert TypeDetail to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TypeDetailObject <- list()
      if (!is.null(self$`id`)) {
        TypeDetailObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        TypeDetailObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`damage_relations`)) {
        TypeDetailObject[["damage_relations"]] <-
          self$`damage_relations`$toSimpleType()
      }
      if (!is.null(self$`past_damage_relations`)) {
        TypeDetailObject[["past_damage_relations"]] <-
          lapply(self$`past_damage_relations`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`game_indices`)) {
        TypeDetailObject[["game_indices"]] <-
          lapply(self$`game_indices`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`generation`)) {
        TypeDetailObject[["generation"]] <-
          self$`generation`$toSimpleType()
      }
      if (!is.null(self$`move_damage_class`)) {
        TypeDetailObject[["move_damage_class"]] <-
          self$`move_damage_class`$toSimpleType()
      }
      if (!is.null(self$`names`)) {
        TypeDetailObject[["names"]] <-
          lapply(self$`names`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`pokemon`)) {
        TypeDetailObject[["pokemon"]] <-
          lapply(self$`pokemon`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`moves`)) {
        TypeDetailObject[["moves"]] <-
          lapply(self$`moves`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`sprites`)) {
        TypeDetailObject[["sprites"]] <-
          lapply(self$`sprites`, function(x) x$toSimpleType())
      }
      return(TypeDetailObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TypeDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of TypeDetail
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`damage_relations`)) {
        `damage_relations_object` <- TypeDetailDamageRelations$new()
        `damage_relations_object`$fromJSON(jsonlite::toJSON(this_object$`damage_relations`, auto_unbox = TRUE, digits = NA))
        self$`damage_relations` <- `damage_relations_object`
      }
      if (!is.null(this_object$`past_damage_relations`)) {
        self$`past_damage_relations` <- ApiClient$new()$deserializeObj(this_object$`past_damage_relations`, "array[TypeDetailPastDamageRelationsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`game_indices`)) {
        self$`game_indices` <- ApiClient$new()$deserializeObj(this_object$`game_indices`, "array[TypeGameIndex]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`generation`)) {
        `generation_object` <- GenerationSummary$new()
        `generation_object`$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
        self$`generation` <- `generation_object`
      }
      if (!is.null(this_object$`move_damage_class`)) {
        `move_damage_class_object` <- MoveDamageClassSummary$new()
        `move_damage_class_object`$fromJSON(jsonlite::toJSON(this_object$`move_damage_class`, auto_unbox = TRUE, digits = NA))
        self$`move_damage_class` <- `move_damage_class_object`
      }
      if (!is.null(this_object$`names`)) {
        self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[AbilityName]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`pokemon`)) {
        self$`pokemon` <- ApiClient$new()$deserializeObj(this_object$`pokemon`, "array[TypeDetailPokemonInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`moves`)) {
        self$`moves` <- ApiClient$new()$deserializeObj(this_object$`moves`, "array[MoveSummary]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`sprites`)) {
        self$`sprites` <- ApiClient$new()$deserializeObj(this_object$`sprites`, "map(map(TypeDetailSpritesValueValue))", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TypeDetail in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TypeDetail
    #'
    #' @param input_json the JSON input
    #' @return the instance of TypeDetail
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`damage_relations` <- TypeDetailDamageRelations$new()$fromJSON(jsonlite::toJSON(this_object$`damage_relations`, auto_unbox = TRUE, digits = NA))
      self$`past_damage_relations` <- ApiClient$new()$deserializeObj(this_object$`past_damage_relations`, "array[TypeDetailPastDamageRelationsInner]", loadNamespace("openapi"))
      self$`game_indices` <- ApiClient$new()$deserializeObj(this_object$`game_indices`, "array[TypeGameIndex]", loadNamespace("openapi"))
      self$`generation` <- GenerationSummary$new()$fromJSON(jsonlite::toJSON(this_object$`generation`, auto_unbox = TRUE, digits = NA))
      self$`move_damage_class` <- MoveDamageClassSummary$new()$fromJSON(jsonlite::toJSON(this_object$`move_damage_class`, auto_unbox = TRUE, digits = NA))
      self$`names` <- ApiClient$new()$deserializeObj(this_object$`names`, "array[AbilityName]", loadNamespace("openapi"))
      self$`pokemon` <- ApiClient$new()$deserializeObj(this_object$`pokemon`, "array[TypeDetailPokemonInner]", loadNamespace("openapi"))
      self$`moves` <- ApiClient$new()$deserializeObj(this_object$`moves`, "array[MoveSummary]", loadNamespace("openapi"))
      self$`sprites` <- ApiClient$new()$deserializeObj(this_object$`sprites`, "map(map(TypeDetailSpritesValueValue))", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to TypeDetail and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for TypeDetail: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypeDetail: the required field `name` is missing."))
      }
      # check the required field `damage_relations`
      if (!is.null(input_json$`damage_relations`)) {
        stopifnot(R6::is.R6(input_json$`damage_relations`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypeDetail: the required field `damage_relations` is missing."))
      }
      # check the required field `past_damage_relations`
      if (!is.null(input_json$`past_damage_relations`)) {
        stopifnot(is.vector(input_json$`past_damage_relations`), length(input_json$`past_damage_relations`) != 0)
        tmp <- sapply(input_json$`past_damage_relations`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypeDetail: the required field `past_damage_relations` is missing."))
      }
      # check the required field `game_indices`
      if (!is.null(input_json$`game_indices`)) {
        stopifnot(is.vector(input_json$`game_indices`), length(input_json$`game_indices`) != 0)
        tmp <- sapply(input_json$`game_indices`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypeDetail: the required field `game_indices` is missing."))
      }
      # check the required field `generation`
      if (!is.null(input_json$`generation`)) {
        stopifnot(R6::is.R6(input_json$`generation`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypeDetail: the required field `generation` is missing."))
      }
      # check the required field `move_damage_class`
      if (!is.null(input_json$`move_damage_class`)) {
        stopifnot(R6::is.R6(input_json$`move_damage_class`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypeDetail: the required field `move_damage_class` is missing."))
      }
      # check the required field `names`
      if (!is.null(input_json$`names`)) {
        stopifnot(is.vector(input_json$`names`), length(input_json$`names`) != 0)
        tmp <- sapply(input_json$`names`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypeDetail: the required field `names` is missing."))
      }
      # check the required field `pokemon`
      if (!is.null(input_json$`pokemon`)) {
        stopifnot(is.vector(input_json$`pokemon`), length(input_json$`pokemon`) != 0)
        tmp <- sapply(input_json$`pokemon`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypeDetail: the required field `pokemon` is missing."))
      }
      # check the required field `moves`
      if (!is.null(input_json$`moves`)) {
        stopifnot(is.vector(input_json$`moves`), length(input_json$`moves`) != 0)
        tmp <- sapply(input_json$`moves`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypeDetail: the required field `moves` is missing."))
      }
      # check the required field `sprites`
      if (!is.null(input_json$`sprites`)) {
        stopifnot(is.vector(input_json$`sprites`), length(input_json$`sprites`) != 0)
        tmp <- sapply(input_json$`sprites`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TypeDetail: the required field `sprites` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TypeDetail
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

      # check if the required `damage_relations` is null
      if (is.null(self$`damage_relations`)) {
        return(FALSE)
      }

      # check if the required `past_damage_relations` is null
      if (is.null(self$`past_damage_relations`)) {
        return(FALSE)
      }

      # check if the required `game_indices` is null
      if (is.null(self$`game_indices`)) {
        return(FALSE)
      }

      # check if the required `generation` is null
      if (is.null(self$`generation`)) {
        return(FALSE)
      }

      # check if the required `move_damage_class` is null
      if (is.null(self$`move_damage_class`)) {
        return(FALSE)
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        return(FALSE)
      }

      # check if the required `pokemon` is null
      if (is.null(self$`pokemon`)) {
        return(FALSE)
      }

      # check if the required `moves` is null
      if (is.null(self$`moves`)) {
        return(FALSE)
      }

      # check if the required `sprites` is null
      if (is.null(self$`sprites`)) {
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

      # check if the required `damage_relations` is null
      if (is.null(self$`damage_relations`)) {
        invalid_fields["damage_relations"] <- "Non-nullable required field `damage_relations` cannot be null."
      }

      # check if the required `past_damage_relations` is null
      if (is.null(self$`past_damage_relations`)) {
        invalid_fields["past_damage_relations"] <- "Non-nullable required field `past_damage_relations` cannot be null."
      }

      # check if the required `game_indices` is null
      if (is.null(self$`game_indices`)) {
        invalid_fields["game_indices"] <- "Non-nullable required field `game_indices` cannot be null."
      }

      # check if the required `generation` is null
      if (is.null(self$`generation`)) {
        invalid_fields["generation"] <- "Non-nullable required field `generation` cannot be null."
      }

      # check if the required `move_damage_class` is null
      if (is.null(self$`move_damage_class`)) {
        invalid_fields["move_damage_class"] <- "Non-nullable required field `move_damage_class` cannot be null."
      }

      # check if the required `names` is null
      if (is.null(self$`names`)) {
        invalid_fields["names"] <- "Non-nullable required field `names` cannot be null."
      }

      # check if the required `pokemon` is null
      if (is.null(self$`pokemon`)) {
        invalid_fields["pokemon"] <- "Non-nullable required field `pokemon` cannot be null."
      }

      # check if the required `moves` is null
      if (is.null(self$`moves`)) {
        invalid_fields["moves"] <- "Non-nullable required field `moves` cannot be null."
      }

      # check if the required `sprites` is null
      if (is.null(self$`sprites`)) {
        invalid_fields["sprites"] <- "Non-nullable required field `sprites` cannot be null."
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
# TypeDetail$unlock()
#
## Below is an example to define the print function
# TypeDetail$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TypeDetail$lock()


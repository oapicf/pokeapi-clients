#' Create a new ItemPrice
#'
#' @description
#' ItemPrice Class
#'
#' @docType class
#' @title ItemPrice
#' @description ItemPrice Class
#' @format An \code{R6Class} generator object
#' @field purchase_price The purchase price in this currency and version group, or null if unavailable. integer [optional]
#' @field sell_price The sell price in this currency and version group, or null if unavailable. integer [optional]
#' @field currency The currency used for this price. \link{CurrencySummary}
#' @field version_group The version group to which this price applies. \link{VersionGroupSummary}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemPrice <- R6::R6Class(
  "ItemPrice",
  public = list(
    `purchase_price` = NULL,
    `sell_price` = NULL,
    `currency` = NULL,
    `version_group` = NULL,

    #' @description
    #' Initialize a new ItemPrice class.
    #'
    #' @param currency The currency used for this price.
    #' @param version_group The version group to which this price applies.
    #' @param purchase_price The purchase price in this currency and version group, or null if unavailable.
    #' @param sell_price The sell price in this currency and version group, or null if unavailable.
    #' @param ... Other optional arguments.
    initialize = function(`currency`, `version_group`, `purchase_price` = NULL, `sell_price` = NULL, ...) {
      if (!missing(`currency`)) {
        stopifnot(R6::is.R6(`currency`))
        self$`currency` <- `currency`
      }
      if (!missing(`version_group`)) {
        stopifnot(R6::is.R6(`version_group`))
        self$`version_group` <- `version_group`
      }
      if (!is.null(`purchase_price`)) {
        if (!(is.numeric(`purchase_price`) && length(`purchase_price`) == 1)) {
          stop(paste("Error! Invalid data for `purchase_price`. Must be an integer:", `purchase_price`))
        }
        self$`purchase_price` <- `purchase_price`
      }
      if (!is.null(`sell_price`)) {
        if (!(is.numeric(`sell_price`) && length(`sell_price`) == 1)) {
          stop(paste("Error! Invalid data for `sell_price`. Must be an integer:", `sell_price`))
        }
        self$`sell_price` <- `sell_price`
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
    #' @return ItemPrice as a base R list.
    #' @examples
    #' # convert array of ItemPrice (x) to a data frame
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
    #' Convert ItemPrice to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ItemPriceObject <- list()
      if (!is.null(self$`purchase_price`)) {
        ItemPriceObject[["purchase_price"]] <-
          self$`purchase_price`
      }
      if (!is.null(self$`sell_price`)) {
        ItemPriceObject[["sell_price"]] <-
          self$`sell_price`
      }
      if (!is.null(self$`currency`)) {
        ItemPriceObject[["currency"]] <-
          self$extractSimpleType(self$`currency`)
      }
      if (!is.null(self$`version_group`)) {
        ItemPriceObject[["version_group"]] <-
          self$extractSimpleType(self$`version_group`)
      }
      return(ItemPriceObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemPrice
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemPrice
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`purchase_price`)) {
        self$`purchase_price` <- this_object$`purchase_price`
      }
      if (!is.null(this_object$`sell_price`)) {
        self$`sell_price` <- this_object$`sell_price`
      }
      if (!is.null(this_object$`currency`)) {
        `currency_object` <- CurrencySummary$new()
        `currency_object`$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
        self$`currency` <- `currency_object`
      }
      if (!is.null(this_object$`version_group`)) {
        `version_group_object` <- VersionGroupSummary$new()
        `version_group_object`$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
        self$`version_group` <- `version_group_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ItemPrice in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemPrice
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemPrice
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`purchase_price` <- this_object$`purchase_price`
      self$`sell_price` <- this_object$`sell_price`
      self$`currency` <- CurrencySummary$new()$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
      self$`version_group` <- VersionGroupSummary$new()$fromJSON(jsonlite::toJSON(this_object$`version_group`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ItemPrice and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `currency`
      if (!is.null(input_json$`currency`)) {
        stopifnot(R6::is.R6(input_json$`currency`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemPrice: the required field `currency` is missing."))
      }
      # check the required field `version_group`
      if (!is.null(input_json$`version_group`)) {
        stopifnot(R6::is.R6(input_json$`version_group`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemPrice: the required field `version_group` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ItemPrice
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (self$`purchase_price` > 2147483647) {
        return(FALSE)
      }
      if (self$`purchase_price` < -2147483648) {
        return(FALSE)
      }

      if (self$`sell_price` > 2147483647) {
        return(FALSE)
      }
      if (self$`sell_price` < -2147483648) {
        return(FALSE)
      }

      # check if the required `currency` is null
      if (is.null(self$`currency`)) {
        return(FALSE)
      }

      # check if the required `version_group` is null
      if (is.null(self$`version_group`)) {
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
      if (self$`purchase_price` > 2147483647) {
        invalid_fields["purchase_price"] <- "Invalid value for `purchase_price`, must be smaller than or equal to 2147483647."
      }
      if (self$`purchase_price` < -2147483648) {
        invalid_fields["purchase_price"] <- "Invalid value for `purchase_price`, must be bigger than or equal to -2147483648."
      }

      if (self$`sell_price` > 2147483647) {
        invalid_fields["sell_price"] <- "Invalid value for `sell_price`, must be smaller than or equal to 2147483647."
      }
      if (self$`sell_price` < -2147483648) {
        invalid_fields["sell_price"] <- "Invalid value for `sell_price`, must be bigger than or equal to -2147483648."
      }

      # check if the required `currency` is null
      if (is.null(self$`currency`)) {
        invalid_fields["currency"] <- "Non-nullable required field `currency` cannot be null."
      }

      # check if the required `version_group` is null
      if (is.null(self$`version_group`)) {
        invalid_fields["version_group"] <- "Non-nullable required field `version_group` cannot be null."
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
# ItemPrice$unlock()
#
## Below is an example to define the print function
# ItemPrice$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ItemPrice$lock()


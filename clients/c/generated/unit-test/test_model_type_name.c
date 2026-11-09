#ifndef model_type_name_TEST
#define model_type_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define model_type_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/model_type_name.h"
ModelTypeName_t* instantiate_ModelTypeName(int include_optional);

#include "test_language_summary.c"


ModelTypeName_t* instantiate_ModelTypeName(int include_optional) {
  ModelTypeName_t* ModelTypeName = NULL;
  if (include_optional) {
    ModelTypeName = ModelTypeName_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    ModelTypeName = ModelTypeName_create(
      "0",
      NULL
    );
  }

  return ModelTypeName;
}


#ifdef model_type_name_MAIN

void test_ModelTypeName(int include_optional) {
    ModelTypeName_t* ModelTypeName_1 = instantiate_ModelTypeName(include_optional);

	cJSON* jsonModelTypeName_1 = ModelTypeName_convertToJSON(ModelTypeName_1);
	printf("ModelTypeName :\n%s\n", cJSON_Print(jsonModelTypeName_1));
	ModelTypeName_t* ModelTypeName_2 = ModelTypeName_parseFromJSON(jsonModelTypeName_1);
	cJSON* jsonModelTypeName_2 = ModelTypeName_convertToJSON(ModelTypeName_2);
	printf("repeating ModelTypeName:\n%s\n", cJSON_Print(jsonModelTypeName_2));
}

int main() {
  test_ModelTypeName(1);
  test_ModelTypeName(0);

  printf("Hello world \n");
  return 0;
}

#endif // model_type_name_MAIN
#endif // model_type_name_TEST

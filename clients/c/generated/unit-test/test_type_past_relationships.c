#ifndef type_past_relationships_TEST
#define type_past_relationships_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define type_past_relationships_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/type_past_relationships.h"
type_past_relationships_t* instantiate_type_past_relationships(int include_optional);

#include "test_generation_summary.c"
#include "test_type_relationships.c"


type_past_relationships_t* instantiate_type_past_relationships(int include_optional) {
  type_past_relationships_t* type_past_relationships = NULL;
  if (include_optional) {
    type_past_relationships = type_past_relationships_create(
       // false, not to have infinite recursion
      instantiate_generation_summary(0),
       // false, not to have infinite recursion
      instantiate_type_relationships(0)
    );
  } else {
    type_past_relationships = type_past_relationships_create(
      NULL,
      NULL
    );
  }

  return type_past_relationships;
}


#ifdef type_past_relationships_MAIN

void test_type_past_relationships(int include_optional) {
    type_past_relationships_t* type_past_relationships_1 = instantiate_type_past_relationships(include_optional);

	cJSON* jsontype_past_relationships_1 = type_past_relationships_convertToJSON(type_past_relationships_1);
	printf("type_past_relationships :\n%s\n", cJSON_Print(jsontype_past_relationships_1));
	type_past_relationships_t* type_past_relationships_2 = type_past_relationships_parseFromJSON(jsontype_past_relationships_1);
	cJSON* jsontype_past_relationships_2 = type_past_relationships_convertToJSON(type_past_relationships_2);
	printf("repeating type_past_relationships:\n%s\n", cJSON_Print(jsontype_past_relationships_2));
}

int main() {
  test_type_past_relationships(1);
  test_type_past_relationships(0);

  printf("Hello world \n");
  return 0;
}

#endif // type_past_relationships_MAIN
#endif // type_past_relationships_TEST

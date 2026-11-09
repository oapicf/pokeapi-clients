#ifndef type_relationships_TEST
#define type_relationships_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define type_relationships_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/type_relationships.h"
type_relationships_t* instantiate_type_relationships(int include_optional);



type_relationships_t* instantiate_type_relationships(int include_optional) {
  type_relationships_t* type_relationships = NULL;
  if (include_optional) {
    type_relationships = type_relationships_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    type_relationships = type_relationships_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return type_relationships;
}


#ifdef type_relationships_MAIN

void test_type_relationships(int include_optional) {
    type_relationships_t* type_relationships_1 = instantiate_type_relationships(include_optional);

	cJSON* jsontype_relationships_1 = type_relationships_convertToJSON(type_relationships_1);
	printf("type_relationships :\n%s\n", cJSON_Print(jsontype_relationships_1));
	type_relationships_t* type_relationships_2 = type_relationships_parseFromJSON(jsontype_relationships_1);
	cJSON* jsontype_relationships_2 = type_relationships_convertToJSON(type_relationships_2);
	printf("repeating type_relationships:\n%s\n", cJSON_Print(jsontype_relationships_2));
}

int main() {
  test_type_relationships(1);
  test_type_relationships(0);

  printf("Hello world \n");
  return 0;
}

#endif // type_relationships_MAIN
#endif // type_relationships_TEST

#ifndef type_detail_sprites_value_value_TEST
#define type_detail_sprites_value_value_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define type_detail_sprites_value_value_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/type_detail_sprites_value_value.h"
type_detail_sprites_value_value_t* instantiate_type_detail_sprites_value_value(int include_optional);



type_detail_sprites_value_value_t* instantiate_type_detail_sprites_value_value(int include_optional) {
  type_detail_sprites_value_value_t* type_detail_sprites_value_value = NULL;
  if (include_optional) {
    type_detail_sprites_value_value = type_detail_sprites_value_value_create(
      "0"
    );
  } else {
    type_detail_sprites_value_value = type_detail_sprites_value_value_create(
      "0"
    );
  }

  return type_detail_sprites_value_value;
}


#ifdef type_detail_sprites_value_value_MAIN

void test_type_detail_sprites_value_value(int include_optional) {
    type_detail_sprites_value_value_t* type_detail_sprites_value_value_1 = instantiate_type_detail_sprites_value_value(include_optional);

	cJSON* jsontype_detail_sprites_value_value_1 = type_detail_sprites_value_value_convertToJSON(type_detail_sprites_value_value_1);
	printf("type_detail_sprites_value_value :\n%s\n", cJSON_Print(jsontype_detail_sprites_value_value_1));
	type_detail_sprites_value_value_t* type_detail_sprites_value_value_2 = type_detail_sprites_value_value_parseFromJSON(jsontype_detail_sprites_value_value_1);
	cJSON* jsontype_detail_sprites_value_value_2 = type_detail_sprites_value_value_convertToJSON(type_detail_sprites_value_value_2);
	printf("repeating type_detail_sprites_value_value:\n%s\n", cJSON_Print(jsontype_detail_sprites_value_value_2));
}

int main() {
  test_type_detail_sprites_value_value(1);
  test_type_detail_sprites_value_value(0);

  printf("Hello world \n");
  return 0;
}

#endif // type_detail_sprites_value_value_MAIN
#endif // type_detail_sprites_value_value_TEST

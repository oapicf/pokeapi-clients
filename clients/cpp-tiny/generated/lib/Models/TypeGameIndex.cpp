

#include "TypeGameIndex.h"

using namespace Tiny;

TypeGameIndex::TypeGameIndex()
{
	game_index = int(0);
	generation = GenerationSummary();
}

TypeGameIndex::TypeGameIndex(std::string jsonString)
{
	this->fromJson(jsonString);
}

TypeGameIndex::~TypeGameIndex()
{

}

void
TypeGameIndex::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *game_indexKey = "game_index";

    if(object.has_key(game_indexKey))
    {
        bourne::json value = object[game_indexKey];



        jsonToValue(&game_index, value, "int");


    }

    const char *generationKey = "generation";

    if(object.has_key(generationKey))
    {
        bourne::json value = object[generationKey];




        GenerationSummary* obj = &generation;
		obj->fromJson(value.dump());

    }


}

bourne::json
TypeGameIndex::toJson()
{
    bourne::json object = bourne::json::object();





    object["game_index"] = getGameIndex();







	object["generation"] = getGeneration().toJson();


    return object;

}

int
TypeGameIndex::getGameIndex()
{
	return game_index;
}

void
TypeGameIndex::setGameIndex(int game_index)
{
	this->game_index = game_index;
}

GenerationSummary
TypeGameIndex::getGeneration()
{
	return generation;
}

void
TypeGameIndex::setGeneration(GenerationSummary generation)
{
	this->generation = generation;
}




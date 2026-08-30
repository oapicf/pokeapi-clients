

#include "LocationGameIndex.h"

using namespace Tiny;

LocationGameIndex::LocationGameIndex()
{
	game_index = int(0);
	generation = GenerationSummary();
}

LocationGameIndex::LocationGameIndex(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocationGameIndex::~LocationGameIndex()
{

}

void
LocationGameIndex::fromJson(std::string jsonObj)
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
LocationGameIndex::toJson()
{
    bourne::json object = bourne::json::object();





    object["game_index"] = getGameIndex();







	object["generation"] = getGeneration().toJson();


    return object;

}

int
LocationGameIndex::getGameIndex()
{
	return game_index;
}

void
LocationGameIndex::setGameIndex(int game_index)
{
	this->game_index = game_index;
}

GenerationSummary
LocationGameIndex::getGeneration()
{
	return generation;
}

void
LocationGameIndex::setGeneration(GenerationSummary generation)
{
	this->generation = generation;
}




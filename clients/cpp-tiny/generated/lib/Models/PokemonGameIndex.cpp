

#include "PokemonGameIndex.h"

using namespace Tiny;

PokemonGameIndex::PokemonGameIndex()
{
	game_index = int(0);
	version = VersionSummary();
}

PokemonGameIndex::PokemonGameIndex(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonGameIndex::~PokemonGameIndex()
{

}

void
PokemonGameIndex::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *game_indexKey = "game_index";

    if(object.has_key(game_indexKey))
    {
        bourne::json value = object[game_indexKey];



        jsonToValue(&game_index, value, "int");


    }

    const char *versionKey = "version";

    if(object.has_key(versionKey))
    {
        bourne::json value = object[versionKey];




        VersionSummary* obj = &version;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokemonGameIndex::toJson()
{
    bourne::json object = bourne::json::object();





    object["game_index"] = getGameIndex();







	object["version"] = getVersion().toJson();


    return object;

}

int
PokemonGameIndex::getGameIndex()
{
	return game_index;
}

void
PokemonGameIndex::setGameIndex(int  game_index)
{
	this->game_index = game_index;
}

VersionSummary
PokemonGameIndex::getVersion()
{
	return version;
}

void
PokemonGameIndex::setVersion(VersionSummary  version)
{
	this->version = version;
}




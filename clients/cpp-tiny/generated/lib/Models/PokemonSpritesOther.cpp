

#include "PokemonSpritesOther.h"

using namespace Tiny;

PokemonSpritesOther::PokemonSpritesOther()
{
	dream_world = null;
	home = null;
	showdown = null;
	officialartwork = null;
}

PokemonSpritesOther::PokemonSpritesOther(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonSpritesOther::~PokemonSpritesOther()
{

}

void
PokemonSpritesOther::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dream_worldKey = "dream_world";

    if(object.has_key(dream_worldKey))
    {
        bourne::json value = object[dream_worldKey];




        PokemonSpritesOtherDreamWorld* obj = &dream_world;
		obj->fromJson(value.dump());

    }

    const char *homeKey = "home";

    if(object.has_key(homeKey))
    {
        bourne::json value = object[homeKey];




        PokemonSpritesOtherHome* obj = &home;
		obj->fromJson(value.dump());

    }

    const char *showdownKey = "showdown";

    if(object.has_key(showdownKey))
    {
        bourne::json value = object[showdownKey];




        PokemonSpritesOtherShowdown* obj = &showdown;
		obj->fromJson(value.dump());

    }

    const char *officialartworkKey = "official-artwork";

    if(object.has_key(officialartworkKey))
    {
        bourne::json value = object[officialartworkKey];




        PokemonSpritesOtherOfficialArtwork* obj = &officialartwork;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokemonSpritesOther::toJson()
{
    bourne::json object = bourne::json::object();






	object["dream_world"] = getDreamWorld().toJson();






	object["home"] = getHome().toJson();






	object["showdown"] = getShowdown().toJson();






	object["officialartwork"] = getOfficialartwork().toJson();


    return object;

}

PokemonSpritesOtherDreamWorld
PokemonSpritesOther::getDreamWorld()
{
	return dream_world;
}

void
PokemonSpritesOther::setDreamWorld(PokemonSpritesOtherDreamWorld dream_world)
{
	this->dream_world = dream_world;
}

PokemonSpritesOtherHome
PokemonSpritesOther::getHome()
{
	return home;
}

void
PokemonSpritesOther::setHome(PokemonSpritesOtherHome home)
{
	this->home = home;
}

PokemonSpritesOtherShowdown
PokemonSpritesOther::getShowdown()
{
	return showdown;
}

void
PokemonSpritesOther::setShowdown(PokemonSpritesOtherShowdown showdown)
{
	this->showdown = showdown;
}

PokemonSpritesOtherOfficialArtwork
PokemonSpritesOther::getOfficialartwork()
{
	return officialartwork;
}

void
PokemonSpritesOther::setOfficialartwork(PokemonSpritesOtherOfficialArtwork officialartwork)
{
	this->officialartwork = officialartwork;
}




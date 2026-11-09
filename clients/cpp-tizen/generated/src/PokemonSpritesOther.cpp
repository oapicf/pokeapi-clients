#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonSpritesOther.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonSpritesOther::PokemonSpritesOther()
{
	//__init();
}

PokemonSpritesOther::~PokemonSpritesOther()
{
	//__cleanup();
}

void
PokemonSpritesOther::__init()
{
	//dream_world = null;
	//home = null;
	//showdown = null;
	//officialartwork = null;
}

void
PokemonSpritesOther::__cleanup()
{
	//if(dream_world != NULL) {
	//
	//delete dream_world;
	//dream_world = NULL;
	//}
	//if(home != NULL) {
	//
	//delete home;
	//home = NULL;
	//}
	//if(showdown != NULL) {
	//
	//delete showdown;
	//showdown = NULL;
	//}
	//if(officialartwork != NULL) {
	//
	//delete officialartwork;
	//officialartwork = NULL;
	//}
	//
}

void
PokemonSpritesOther::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dream_worldKey = "dream_world";
	node = json_object_get_member(pJsonObject, dream_worldKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonSpritesOtherDreamWorld")) {
			jsonToValue(&dream_world, node, "PokemonSpritesOtherDreamWorld", "PokemonSpritesOtherDreamWorld");
		} else {
			
			PokemonSpritesOtherDreamWorld* obj = static_cast<PokemonSpritesOtherDreamWorld*> (&dream_world);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *homeKey = "home";
	node = json_object_get_member(pJsonObject, homeKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonSpritesOtherHome")) {
			jsonToValue(&home, node, "PokemonSpritesOtherHome", "PokemonSpritesOtherHome");
		} else {
			
			PokemonSpritesOtherHome* obj = static_cast<PokemonSpritesOtherHome*> (&home);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *showdownKey = "showdown";
	node = json_object_get_member(pJsonObject, showdownKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonSpritesOtherShowdown")) {
			jsonToValue(&showdown, node, "PokemonSpritesOtherShowdown", "PokemonSpritesOtherShowdown");
		} else {
			
			PokemonSpritesOtherShowdown* obj = static_cast<PokemonSpritesOtherShowdown*> (&showdown);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *officialartworkKey = "official-artwork";
	node = json_object_get_member(pJsonObject, officialartworkKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonSpritesOtherOfficialArtwork")) {
			jsonToValue(&officialartwork, node, "PokemonSpritesOtherOfficialArtwork", "PokemonSpritesOtherOfficialArtwork");
		} else {
			
			PokemonSpritesOtherOfficialArtwork* obj = static_cast<PokemonSpritesOtherOfficialArtwork*> (&officialartwork);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PokemonSpritesOther::PokemonSpritesOther(char* json)
{
	this->fromJson(json);
}

char*
PokemonSpritesOther::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("PokemonSpritesOtherDreamWorld")) {
		PokemonSpritesOtherDreamWorld obj = getDreamWorld();
		node = converttoJson(&obj, "PokemonSpritesOtherDreamWorld", "");
	}
	else {
		
		PokemonSpritesOtherDreamWorld obj = static_cast<PokemonSpritesOtherDreamWorld> (getDreamWorld());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dream_worldKey = "dream_world";
	json_object_set_member(pJsonObject, dream_worldKey, node);
	if (isprimitive("PokemonSpritesOtherHome")) {
		PokemonSpritesOtherHome obj = getHome();
		node = converttoJson(&obj, "PokemonSpritesOtherHome", "");
	}
	else {
		
		PokemonSpritesOtherHome obj = static_cast<PokemonSpritesOtherHome> (getHome());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *homeKey = "home";
	json_object_set_member(pJsonObject, homeKey, node);
	if (isprimitive("PokemonSpritesOtherShowdown")) {
		PokemonSpritesOtherShowdown obj = getShowdown();
		node = converttoJson(&obj, "PokemonSpritesOtherShowdown", "");
	}
	else {
		
		PokemonSpritesOtherShowdown obj = static_cast<PokemonSpritesOtherShowdown> (getShowdown());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *showdownKey = "showdown";
	json_object_set_member(pJsonObject, showdownKey, node);
	if (isprimitive("PokemonSpritesOtherOfficialArtwork")) {
		PokemonSpritesOtherOfficialArtwork obj = getOfficialartwork();
		node = converttoJson(&obj, "PokemonSpritesOtherOfficialArtwork", "");
	}
	else {
		
		PokemonSpritesOtherOfficialArtwork obj = static_cast<PokemonSpritesOtherOfficialArtwork> (getOfficialartwork());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *officialartworkKey = "official-artwork";
	json_object_set_member(pJsonObject, officialartworkKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

PokemonSpritesOtherDreamWorld
PokemonSpritesOther::getDreamWorld()
{
	return dream_world;
}

void
PokemonSpritesOther::setDreamWorld(PokemonSpritesOtherDreamWorld  dream_world)
{
	this->dream_world = dream_world;
}

PokemonSpritesOtherHome
PokemonSpritesOther::getHome()
{
	return home;
}

void
PokemonSpritesOther::setHome(PokemonSpritesOtherHome  home)
{
	this->home = home;
}

PokemonSpritesOtherShowdown
PokemonSpritesOther::getShowdown()
{
	return showdown;
}

void
PokemonSpritesOther::setShowdown(PokemonSpritesOtherShowdown  showdown)
{
	this->showdown = showdown;
}

PokemonSpritesOtherOfficialArtwork
PokemonSpritesOther::getOfficialartwork()
{
	return officialartwork;
}

void
PokemonSpritesOther::setOfficialartwork(PokemonSpritesOtherOfficialArtwork  officialartwork)
{
	this->officialartwork = officialartwork;
}



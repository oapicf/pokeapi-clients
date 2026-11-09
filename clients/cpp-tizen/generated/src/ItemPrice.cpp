#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemPrice.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemPrice::ItemPrice()
{
	//__init();
}

ItemPrice::~ItemPrice()
{
	//__cleanup();
}

void
ItemPrice::__init()
{
	//purchase_price = int(0);
	//sell_price = int(0);
	//currency = null;
	//version_group = null;
}

void
ItemPrice::__cleanup()
{
	//if(purchase_price != NULL) {
	//
	//delete purchase_price;
	//purchase_price = NULL;
	//}
	//if(sell_price != NULL) {
	//
	//delete sell_price;
	//sell_price = NULL;
	//}
	//if(currency != NULL) {
	//
	//delete currency;
	//currency = NULL;
	//}
	//if(version_group != NULL) {
	//
	//delete version_group;
	//version_group = NULL;
	//}
	//
}

void
ItemPrice::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *purchase_priceKey = "purchase_price";
	node = json_object_get_member(pJsonObject, purchase_priceKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&purchase_price, node, "int", "");
		} else {
			
		}
	}
	const gchar *sell_priceKey = "sell_price";
	node = json_object_get_member(pJsonObject, sell_priceKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&sell_price, node, "int", "");
		} else {
			
		}
	}
	const gchar *currencyKey = "currency";
	node = json_object_get_member(pJsonObject, currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("CurrencySummary")) {
			jsonToValue(&currency, node, "CurrencySummary", "CurrencySummary");
		} else {
			
			CurrencySummary* obj = static_cast<CurrencySummary*> (&currency);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *version_groupKey = "version_group";
	node = json_object_get_member(pJsonObject, version_groupKey);
	if (node !=NULL) {
	

		if (isprimitive("VersionGroupSummary")) {
			jsonToValue(&version_group, node, "VersionGroupSummary", "VersionGroupSummary");
		} else {
			
			VersionGroupSummary* obj = static_cast<VersionGroupSummary*> (&version_group);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ItemPrice::ItemPrice(char* json)
{
	this->fromJson(json);
}

char*
ItemPrice::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getPurchasePrice();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *purchase_priceKey = "purchase_price";
	json_object_set_member(pJsonObject, purchase_priceKey, node);
	if (isprimitive("int")) {
		int obj = getSellPrice();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sell_priceKey = "sell_price";
	json_object_set_member(pJsonObject, sell_priceKey, node);
	if (isprimitive("CurrencySummary")) {
		CurrencySummary obj = getCurrency();
		node = converttoJson(&obj, "CurrencySummary", "");
	}
	else {
		
		CurrencySummary obj = static_cast<CurrencySummary> (getCurrency());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *currencyKey = "currency";
	json_object_set_member(pJsonObject, currencyKey, node);
	if (isprimitive("VersionGroupSummary")) {
		VersionGroupSummary obj = getVersionGroup();
		node = converttoJson(&obj, "VersionGroupSummary", "");
	}
	else {
		
		VersionGroupSummary obj = static_cast<VersionGroupSummary> (getVersionGroup());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *version_groupKey = "version_group";
	json_object_set_member(pJsonObject, version_groupKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
ItemPrice::getPurchasePrice()
{
	return purchase_price;
}

void
ItemPrice::setPurchasePrice(int  purchase_price)
{
	this->purchase_price = purchase_price;
}

int
ItemPrice::getSellPrice()
{
	return sell_price;
}

void
ItemPrice::setSellPrice(int  sell_price)
{
	this->sell_price = sell_price;
}

CurrencySummary
ItemPrice::getCurrency()
{
	return currency;
}

void
ItemPrice::setCurrency(CurrencySummary  currency)
{
	this->currency = currency;
}

VersionGroupSummary
ItemPrice::getVersionGroup()
{
	return version_group;
}

void
ItemPrice::setVersionGroup(VersionGroupSummary  version_group)
{
	this->version_group = version_group;
}



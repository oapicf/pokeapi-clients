

#include "PaginatedItemAttributeSummaryList.h"

using namespace Tiny;

PaginatedItemAttributeSummaryList::PaginatedItemAttributeSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<ItemAttributeSummary>();
}

PaginatedItemAttributeSummaryList::PaginatedItemAttributeSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedItemAttributeSummaryList::~PaginatedItemAttributeSummaryList()
{

}

void
PaginatedItemAttributeSummaryList::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countKey = "count";

    if(object.has_key(countKey))
    {
        bourne::json value = object[countKey];



        jsonToValue(&count, value, "int");


    }

    const char *nextKey = "next";

    if(object.has_key(nextKey))
    {
        bourne::json value = object[nextKey];



        jsonToValue(&next, value, "std::string");


    }

    const char *previousKey = "previous";

    if(object.has_key(previousKey))
    {
        bourne::json value = object[previousKey];



        jsonToValue(&previous, value, "std::string");


    }

    const char *resultsKey = "results";

    if(object.has_key(resultsKey))
    {
        bourne::json value = object[resultsKey];


        std::list<ItemAttributeSummary> results_list;
        ItemAttributeSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedItemAttributeSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<ItemAttributeSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        ItemAttributeSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedItemAttributeSummaryList::getCount()
{
	return count;
}

void
PaginatedItemAttributeSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedItemAttributeSummaryList::getNext()
{
	return next;
}

void
PaginatedItemAttributeSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedItemAttributeSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedItemAttributeSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<ItemAttributeSummary>
PaginatedItemAttributeSummaryList::getResults()
{
	return results;
}

void
PaginatedItemAttributeSummaryList::setResults(std::list <ItemAttributeSummary> results)
{
	this->results = results;
}




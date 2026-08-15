

#include "PaginatedLanguageSummaryList.h"

using namespace Tiny;

PaginatedLanguageSummaryList::PaginatedLanguageSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<LanguageSummary>();
}

PaginatedLanguageSummaryList::PaginatedLanguageSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedLanguageSummaryList::~PaginatedLanguageSummaryList()
{

}

void
PaginatedLanguageSummaryList::fromJson(std::string jsonObj)
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


        std::list<LanguageSummary> results_list;
        LanguageSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedLanguageSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<LanguageSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        LanguageSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedLanguageSummaryList::getCount()
{
	return count;
}

void
PaginatedLanguageSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedLanguageSummaryList::getNext()
{
	return next;
}

void
PaginatedLanguageSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedLanguageSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedLanguageSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<LanguageSummary>
PaginatedLanguageSummaryList::getResults()
{
	return results;
}

void
PaginatedLanguageSummaryList::setResults(std::list <LanguageSummary> results)
{
	this->results = results;
}




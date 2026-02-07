/*
 * PaginatedPokemonHabitatSummaryList.h
 *
 * 
 */

#ifndef _PaginatedPokemonHabitatSummaryList_H_
#define _PaginatedPokemonHabitatSummaryList_H_


#include <string>
#include "PokemonHabitatSummary.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PaginatedPokemonHabitatSummaryList : public Object {
public:
	/*! \brief Constructor.
	 */
	PaginatedPokemonHabitatSummaryList();
	PaginatedPokemonHabitatSummaryList(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PaginatedPokemonHabitatSummaryList();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getCount();

	/*! \brief Set 
	 */
	void setCount(int  count);
	/*! \brief Get 
	 */
	std::string getNext();

	/*! \brief Set 
	 */
	void setNext(std::string  next);
	/*! \brief Get 
	 */
	std::string getPrevious();

	/*! \brief Set 
	 */
	void setPrevious(std::string  previous);
	/*! \brief Get 
	 */
	std::list<PokemonHabitatSummary> getResults();

	/*! \brief Set 
	 */
	void setResults(std::list <PokemonHabitatSummary> results);

private:
	int count;
	std::string next;
	std::string previous;
	std::list <PokemonHabitatSummary>results;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PaginatedPokemonHabitatSummaryList_H_ */

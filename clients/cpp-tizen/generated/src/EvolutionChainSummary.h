/*
 * EvolutionChainSummary.h
 *
 * 
 */

#ifndef _EvolutionChainSummary_H_
#define _EvolutionChainSummary_H_


#include <string>
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

class EvolutionChainSummary : public Object {
public:
	/*! \brief Constructor.
	 */
	EvolutionChainSummary();
	EvolutionChainSummary(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EvolutionChainSummary();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);

private:
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EvolutionChainSummary_H_ */

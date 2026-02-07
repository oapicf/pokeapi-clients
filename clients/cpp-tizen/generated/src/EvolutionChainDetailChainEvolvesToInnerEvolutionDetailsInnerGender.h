/*
 * EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender.h
 *
 * 
 */

#ifndef _EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender_H_
#define _EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender_H_


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

class EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender : public Object {
public:
	/*! \brief Constructor.
	 */
	EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender();
	EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);

private:
	std::string name;
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender_H_ */

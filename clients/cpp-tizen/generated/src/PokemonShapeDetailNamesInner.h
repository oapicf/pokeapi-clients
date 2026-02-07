/*
 * PokemonShapeDetail_names_inner.h
 *
 * 
 */

#ifndef _PokemonShapeDetail_names_inner_H_
#define _PokemonShapeDetail_names_inner_H_


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

class PokemonShapeDetail_names_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonShapeDetail_names_inner();
	PokemonShapeDetail_names_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonShapeDetail_names_inner();

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
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);

private:
	std::string url;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonShapeDetail_names_inner_H_ */

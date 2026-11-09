
/*
 * MoveMetaCategoryDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveMetaCategoryDetail_H_
#define TINY_CPP_CLIENT_MoveMetaCategoryDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MoveMetaCategoryDescription.h"
#include "MoveSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveMetaCategoryDetail{
public:

    /*! \brief Constructor.
	 */
    MoveMetaCategoryDetail();
    MoveMetaCategoryDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveMetaCategoryDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string name);
	/*! \brief Get The description of this resource listed in different languages.
	 */
	std::list<MoveMetaCategoryDescription> getDescriptions();

	/*! \brief Set The description of this resource listed in different languages.
	 */
	void setDescriptions(std::list<MoveMetaCategoryDescription> descriptions);
	/*! \brief Get A list of moves that fall into this category.
	 */
	std::list<MoveSummary> getMoves();

	/*! \brief Set A list of moves that fall into this category.
	 */
	void setMoves(std::list<MoveSummary> moves);


    private:
    int id{};
    std::string name{};
    std::list<MoveMetaCategoryDescription> descriptions;
    std::list<MoveSummary> moves;
};
}

#endif /* TINY_CPP_CLIENT_MoveMetaCategoryDetail_H_ */

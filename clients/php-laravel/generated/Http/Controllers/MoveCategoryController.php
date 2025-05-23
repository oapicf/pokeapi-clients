<?php declare(strict_types=1);

/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 * PHP version 8.1
 *
 * The version of the OpenAPI document: 20220523
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * Source files are located at:
 *
 * > https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator/src/main/resources/php-laravel/
 */


namespace OpenAPI\Server\Http\Controllers;

use Crell\Serde\SerdeCommon;
use Illuminate\Routing\Controller;
use Illuminate\Http\JsonResponse;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Validator;


use OpenAPI\Server\Api\MoveCategoryApiInterface;

class MoveCategoryController extends Controller
{
    /**
     * Constructor
     */
    public function __construct(
        private readonly MoveCategoryApiInterface $api,
        private readonly SerdeCommon $serde = new SerdeCommon(),
    )
    {
    }

    /**
     * Operation moveCategoryList
     *
     * .
     *
     */
    public function moveCategoryList(Request $request): JsonResponse
    {
        $validator = Validator::make(
            array_merge(
                [
                    
                ],
                $request->all(),
            ),
            [
                'limit' => [
                    'integer',
                ],
                'offset' => [
                    'integer',
                ],
            ],
        );

        if ($validator->fails()) {
            return response()->json(['error' => 'Invalid input'], 400);
        }

        $limit = $request->integer('limit');

        $offset = $request->integer('offset');

        try {
            $apiResult = $this->api->moveCategoryList($limit, $offset);
        } catch (\Exception $exception) {
            // This shouldn't happen
            return response()->json(['error' => $exception->getMessage()], 500);
        }

        if ($apiResult instanceof string) {
            return response()->json($this->serde->serialize($apiResult, format: 'array'), 0);
        }


        // This shouldn't happen
        return response()->abort(500);
    }
    /**
     * Operation moveCategoryRead
     *
     * .
     *
     */
    public function moveCategoryRead(Request $request, int $id): JsonResponse
    {
        $validator = Validator::make(
            array_merge(
                [
                    'id' => $id,
                ],
                $request->all(),
            ),
            [
                'id' => [
                    'required',
                    'integer',
                ],
            ],
        );

        if ($validator->fails()) {
            return response()->json(['error' => 'Invalid input'], 400);
        }


        try {
            $apiResult = $this->api->moveCategoryRead($id);
        } catch (\Exception $exception) {
            // This shouldn't happen
            return response()->json(['error' => $exception->getMessage()], 500);
        }

        if ($apiResult instanceof string) {
            return response()->json($this->serde->serialize($apiResult, format: 'array'), 0);
        }


        // This shouldn't happen
        return response()->abort(500);
    }
}

/*
 * Ravimoshark Piece API
 * This is an API to interact with Ravimoshark piece database. # Introduction This API allow to create, modify and delete pieces, products and sheets. # User Authentication This API does not contain any kind of user validation but It request to have a valid authentication user to interact with it. For more information about user Authentication, please refer to [Ravimoshark User Authentication](https://ravimoshark.com/back/apis/auth/latest). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@ravimoshark.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.ravimoshark.apis.piece.calls;

import com.ravimoshark.apis.piece.ApiException;
import com.ravimoshark.apis.piece.model.Categories;
import com.ravimoshark.apis.piece.model.CustomError;
import com.ravimoshark.apis.piece.model.Deleted;
import com.ravimoshark.apis.piece.model.InlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CategoriesApi
 */
@Ignore
public class CategoriesApiTest {

    private final CategoriesApi api = new CategoriesApi();

    /**
     * Get all categories.
     *
     * Get all categories.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCategoriesTest() throws ApiException {
        Integer skip = null;
        Integer limit = null;
        String orderBy = null;
        String filterBy = null;
        Deleted deleted = null;
        Boolean metadata = null;
        Categories category = null;
        InlineResponse200 response = api.getCategories(skip, limit, orderBy, filterBy, deleted, metadata, category);

        // TODO: test validations
    }
}

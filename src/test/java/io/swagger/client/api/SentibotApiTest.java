/*
 * AimMatic API
 * APIs for Natural Voice and placeNext
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.model.SentibotResponse;
import io.swagger.client.model.TextDocumentResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SentibotApi
 */
@Ignore
public class SentibotApiTest extends BaseTest {

    private final SentibotApi api = new SentibotApi();

    
    /**
     * Sentiment analysis
     *
     * Returns the sentiment analysis for a supplied audio id 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void insightsSentibotGetTest() throws ApiException {
        setup(api.getApiClient());

        ApiResponse<SentibotResponse> res = api.insightsSentibotGetWithHttpInfo(getAudioId());
        Assert.assertEquals("status", 200, res.getStatusCode());
        SentibotResponse body = res.getData();

    }
    
}
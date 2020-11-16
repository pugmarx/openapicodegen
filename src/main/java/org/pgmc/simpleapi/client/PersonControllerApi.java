package org.pgmc.simpleapi.client;

import org.pgmc.simpleapi.client.invoker.ApiClient;

import org.pgmc.simpleapi.client.model.Person;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-16T22:49:30.268046+05:30[Asia/Kolkata]")
@Component("org.pgmc.simpleapi.client.PersonControllerApi")
public class PersonControllerApi {
    private ApiClient apiClient;

    public PersonControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public PersonControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>404</b> - Invalid URL or the person does not exist
     * <p><b>200</b> - Person Found
     * @param id  (required)
     * @return Person
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Person one(Long id) throws RestClientException {
        return oneWithHttpInfo(id).getBody();
    }

    /**
     * 
     * 
     * <p><b>404</b> - Invalid URL or the person does not exist
     * <p><b>200</b> - Person Found
     * @param id  (required)
     * @return ResponseEntity&lt;Person&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Person> oneWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling one");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/person/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Person> returnType = new ParameterizedTypeReference<Person>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>404</b> - default response
     * <p><b>200</b> - default response
     * @param person  (optional)
     * @return Person
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Person person(Person person) throws RestClientException {
        return personWithHttpInfo(person).getBody();
    }

    /**
     * 
     * 
     * <p><b>404</b> - default response
     * <p><b>200</b> - default response
     * @param person  (optional)
     * @return ResponseEntity&lt;Person&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Person> personWithHttpInfo(Person person) throws RestClientException {
        Object postBody = person;
        
        String path = apiClient.expandPath("/person", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Person> returnType = new ParameterizedTypeReference<Person>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}

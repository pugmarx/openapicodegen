# PersonControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**one**](PersonControllerApi.md#one) | **GET** /person/{id} | 
[**person**](PersonControllerApi.md#person) | **POST** /person | 



## one

> Person one(id)



### Example

```java
// Import classes:
import org.pgmc.simpleapi.client.invoker.ApiClient;
import org.pgmc.simpleapi.client.invoker.ApiException;
import org.pgmc.simpleapi.client.invoker.Configuration;
import org.pgmc.simpleapi.client.invoker.models.*;
import org.pgmc.simpleapi.client.PersonControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PersonControllerApi apiInstance = new PersonControllerApi(defaultClient);
        Long id = 56L; // Long | 
        try {
            Person result = apiInstance.one(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PersonControllerApi#one");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**Person**](Person.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Invalid URL or the person does not exist |  -  |
| **200** | Person Found |  -  |


## person

> Person person(person)



### Example

```java
// Import classes:
import org.pgmc.simpleapi.client.invoker.ApiClient;
import org.pgmc.simpleapi.client.invoker.ApiException;
import org.pgmc.simpleapi.client.invoker.Configuration;
import org.pgmc.simpleapi.client.invoker.models.*;
import org.pgmc.simpleapi.client.PersonControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PersonControllerApi apiInstance = new PersonControllerApi(defaultClient);
        Person person = new Person(); // Person | 
        try {
            Person result = apiInstance.person(person);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PersonControllerApi#person");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **person** | [**Person**](Person.md)|  | [optional]

### Return type

[**Person**](Person.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | default response |  -  |
| **200** | default response |  -  |

